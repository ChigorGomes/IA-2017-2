/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasseFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author higor
 */
public class TipoFile {
    private FileReader arq;
    private BufferedReader lerArq;
    private String linha;
    private ArrayList<String> questoes;

    public TipoFile() {
    }

    public FileReader getArq() {
        return arq;
    }

    public void setArq(FileReader arq) {
        this.arq = arq;
    }

    public BufferedReader getLerArq() {
        return lerArq;
    }

    public void setLerArq(BufferedReader lerArq) {
        this.lerArq = lerArq;
    }

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

    public ArrayList<String> getQuestoes() {
        return questoes;
    }

    public void setQuestoes(ArrayList<String> questoes) {
        this.questoes = questoes;
    }

   
    
    
}
