package TelaPrincipal;

import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author higor
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public TelaPrincipal() {
        initComponents();
        Color minhaCor = new Color(173, 216, 230);
        getContentPane().setBackground(minhaCor);
    }

    /**
     *
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonClima = new javax.swing.JButton();
        jButtonEnergia = new javax.swing.JButton();
        jButtonPopulacao = new javax.swing.JButton();
        jButtonRelevo = new javax.swing.JButton();
        jButtonTransporte = new javax.swing.JButton();
        jButtonCapital = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Seja Bem-Vindo Ao Quiz de Geografia do Brasil");

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Escolha o tipo de Questões:");

        jButtonClima.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jButtonClima.setText("Clima");
        jButtonClima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClimaActionPerformed(evt);
            }
        });

        jButtonEnergia.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jButtonEnergia.setText("Energia");
        jButtonEnergia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnergiaActionPerformed(evt);
            }
        });

        jButtonPopulacao.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jButtonPopulacao.setText("Polulação");
        jButtonPopulacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPopulacaoActionPerformed(evt);
            }
        });

        jButtonRelevo.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jButtonRelevo.setText("Relevo");
        jButtonRelevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRelevoActionPerformed(evt);
            }
        });

        jButtonTransporte.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jButtonTransporte.setText("Transporte");
        jButtonTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTransporteActionPerformed(evt);
            }
        });

        jButtonCapital.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jButtonCapital.setText("Capital");
        jButtonCapital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCapitalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonClima, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButtonEnergia))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonPopulacao)
                            .addComponent(jButtonTransporte))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCapital)
                            .addComponent(jButtonRelevo))))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonCapital, jButtonClima, jButtonEnergia, jButtonPopulacao, jButtonRelevo, jButtonTransporte});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEnergia)
                    .addComponent(jButtonClima, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRelevo)
                    .addComponent(jButtonPopulacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonTransporte)
                    .addComponent(jButtonCapital))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonCapital, jButtonClima, jButtonEnergia, jButtonPopulacao, jButtonRelevo, jButtonTransporte});

        setSize(new java.awt.Dimension(385, 327));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonClimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClimaActionPerformed
        // TODO add your handling code here:
        String nome = "src/Questoes/clima.txt";
        String questao = "questaoClima0";
        try {
            new TelaQuestoes(nome, questao).setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();

    }//GEN-LAST:event_jButtonClimaActionPerformed

    private void jButtonPopulacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPopulacaoActionPerformed
        // TODO add your handling code here:
        String nome = "src/Questoes/populacao.txt";
        String questao = "questaoPopulacao0";
        try {
            new TelaQuestoes(nome, questao).setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_jButtonPopulacaoActionPerformed

    private void jButtonEnergiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnergiaActionPerformed
        // TODO add your handling code here:
        String nome = "src/Questoes/Energia.txt";
        String questao = "questaoEnergia0";
        try {
            new TelaQuestoes(nome, questao).setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_jButtonEnergiaActionPerformed

    private void jButtonRelevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRelevoActionPerformed
        // TODO add your handling code here:
        String nome = "src/Questoes/Relevo.txt";
        String questao = "questaoRelevo0";
        try {
            new TelaQuestoes(nome, questao).setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_jButtonRelevoActionPerformed

    private void jButtonTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTransporteActionPerformed
        // TODO add your handling code here:
        String nome = "src/Questoes/Transporte.txt";
        String questao = "questaoTransporte0";
        try {
            new TelaQuestoes(nome, questao).setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_jButtonTransporteActionPerformed

    private void jButtonCapitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCapitalActionPerformed
        // TODO add your handling code here:
        String nome= "src/Questoes/capital.txt";
        String questao="questaoCapital0";
        try {
            new TelaQuestoes(nome, questao).setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
        
    }//GEN-LAST:event_jButtonCapitalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCapital;
    private javax.swing.JButton jButtonClima;
    private javax.swing.JButton jButtonEnergia;
    private javax.swing.JButton jButtonPopulacao;
    private javax.swing.JButton jButtonRelevo;
    private javax.swing.JButton jButtonTransporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
