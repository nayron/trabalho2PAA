/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mochila;

import java.awt.FlowLayout;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author nayron
 */
public class MochilaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MochilaPrincipal
     */
    public MochilaPrincipal() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaResultado = new javax.swing.JTextArea();
        Executar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(122, 154, 230));

        jPanel2.setBackground(new java.awt.Color(137, 154, 193));
        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel3.setFont(new java.awt.Font("DejaVu Serif", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(20, 18, 18));
        jLabel3.setText("Algoritmo Guloso");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(137, 154, 193));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Problea da Mochila", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DejaVu Serif", 1, 14))); // NOI18N

        jTextAreaResultado.setColumns(20);
        jTextAreaResultado.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jTextAreaResultado.setForeground(new java.awt.Color(44, 27, 27));
        jTextAreaResultado.setRows(5);
        jScrollPane1.setViewportView(jTextAreaResultado);

        Executar.setText("Executar");
        Executar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExecutarActionPerformed(evt);
            }
        });

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Executar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Executar, jButtonLimpar, jButtonSair});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Executar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonSair)))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Executar, jButtonLimpar, jButtonSair});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void ExecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExecutarActionPerformed

       


        int elementos = Integer.parseInt(JOptionPane.showInputDialog("MOCHILA-01\n"
                + "Informe A quantidade de Elementos?"));

        int CapMax = Integer.parseInt(JOptionPane.showInputDialog("MOCHILA-01\n\n"
                + "Informe agora a Capacidade da Mochila"));
        jTextAreaResultado.append("\n| Elementos = "+elementos+-1 +"    | Capacidade = "+CapMax+" |");

        int[] Item = new int[elementos + 1]; // vetor de indices de element5os
        int[] valor = new int[elementos + 1];// vetor de peso de elementos
       
        jTextAreaResultado.append("\n\n| Item:  ");
        for (int i = 1; i < elementos; i++) {
            Item[i] = Integer.parseInt(JOptionPane.showInputDialog("MOCHILA-01\n"
                    + "Informe o PESO do item " + i + " (EM KG):"));
           jTextAreaResultado.append(Item[i]+"  |  ");
        }

        jTextAreaResultado.append("\n| Valor: ");
        for (int i = 1; i < elementos; i++) {
           
            valor[i] = Integer.parseInt(JOptionPane.showInputDialog("\tMOCHILA-01\n"
                    + "Informe o VALOR do item " + i + ":"));
            jTextAreaResultado.append(valor[i]+"  | ");

        }

        InicializaMochila(Item, valor, CapMax, elementos);

        //Item[1] = 10;
        //Item[2] = 20;
        //Item[3] = 30;
        //valor[1] = 60;
        //valor[2] = 100;
        //valor[3] = 120;

    }//GEN-LAST:event_ExecutarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        jTextAreaResultado.setText("");
      //  jTextFieldCapMax.setText("");
       // jTextFieldElementos.setText("");
       // jTextFieldItens.setText("");
       // jTextFieldValor.setText("");
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

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
            java.util.logging.Logger.getLogger(MochilaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MochilaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MochilaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MochilaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MochilaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Executar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaResultado;
    // End of variables declaration//GEN-END:variables

    public void InicializaMochila(int[] Item, int[] valor, int CapMax, int elementos) {

        int NEGATIVE_INFINITY = Integer.MIN_VALUE;
        int[][] m = new int[elementos + 1][CapMax + 1];
        int[][] sol = new int[elementos + 1][CapMax + 1];

        /**
         * Cria vetor solucao e auxiliar *
         */
        for (int i = 1; i <= elementos; i++) {
            for (int j = 0; j <= CapMax; j++) {
                int m1 = m[i - 1][j];
                int m2 = NEGATIVE_INFINITY;
                if (j >= Item[i]) {
                    m2 = m[i - 1][j - Item[i]] + valor[i];
                }
                /**
                 * seleciona max de m1, m2 *
                 */
                m[i][j] = Math.max(m1, m2);
                sol[i][j] = m2 > m1 ? 1 : 0;
            }
        }
        /**
         * Cria lista de todos os items para selecionar *
         */
        int[] selected = new int[elementos + 1];
        for (int n = elementos, w = CapMax; n > 0; n--) {
            if (sol[n][w] != 0) {
                /**
                 * item selecionado vetor recebe 1 else vetor recebe 0 *
                 */
                selected[n] = 1;
                w = w - Item[n];
            } else {
                selected[n] = 0;
            }
        }

        /**
         * Imprime Item selecionados *
         */
        System.out.println("\n\nItems selecionados : ");
        jTextAreaResultado.append("\n\n\nItems selecionados :\n");

        int peso = 0, valorr = 0;
        for (int i = 1; i < elementos + 1; i++) {
            if (selected[i] == 1) {
                System.out.println("Item " + i + "|" + "Peso " + Item[i] + "|" + "valor " + valor[i]);
                jTextAreaResultado.append("Item " + i + " | " + "Peso " + Item[i] + " | " + "valor " + valor[i] + "\n");
                peso += Item[i];
                valorr += valor[i];
            }
        }
        System.out.println("Peso da mochila " + peso + " ,com valor de " + valorr);
        jTextAreaResultado.append("Peso da mochila " + peso + " ,com valor de " + valorr + "\n");
        System.out.println();

    }

}
