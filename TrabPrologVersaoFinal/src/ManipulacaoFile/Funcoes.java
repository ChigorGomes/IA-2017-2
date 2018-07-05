/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManipulacaoFile;

import ClasseFile.TipoFile;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.jpl7.Atom;
import org.jpl7.PrologException;
import org.jpl7.Query;
import org.jpl7.Term;
import org.jpl7.Variable;

/**
 *
 * @author higor
 */
public class Funcoes extends ClasseFile.TipoFile {
    TipoFile file = new TipoFile();
    
    public ArrayList<String> manipulaArquivo(String nomeArquivo) throws IOException {
        ArrayList<String> string = new ArrayList<>();
        try {
            file.setArq(new FileReader(nomeArquivo));
            file.setLerArq(new BufferedReader(file.getArq()));
            file.setLinha(file.getLerArq().readLine());
            String aux = "";
            while (file.getLinha() != null) {
                aux += file.getLinha() + "\n";

                if (aux.contains("./")) {
                    aux = aux.replace("./", ".");
                    string.add(aux);
                    aux = "";
                }
                file.setLinha(file.getLerArq().readLine());
            }
            file.getArq().close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Funcoes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return string;
    }

    public boolean AvaliaQuestao(String questao, String alternativa, int i) {
        Query query = new Query("consult", new Term[]{new Atom("src/Questoes/questao.pl")});
        //src/
        try {
            query.hasSolution();
            Variable X = new Variable("X");
            Query consulta = new Query(questao + i, new Term[]{X});
            while (consulta.hasMoreSolutions()) {
                Hashtable tabela = new Hashtable(consulta.nextSolution());
                if (String.valueOf(tabela.get(X.name)).equals(alternativa)) {

                    JOptionPane.showMessageDialog(null, "Parabéns, você Acertou! :)");
                    return true;

                } else {
                    JOptionPane.showMessageDialog(null, "Você Errou, que pena! :(");
                    return false;
                }
            }
        } catch (PrologException e) {
            System.out.println("Erro");
            e.printStackTrace();
        }
        return true;
    }
}
