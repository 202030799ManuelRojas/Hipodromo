/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mrojas.hipodromo;

import com.mrojas.hipodromo.controllers.MainController;
import com.mrojas.hipodromo.models.Hipodromo;
import com.mrojas.hipodromo.util.FrameUtil;
import com.mrojas.hipodromo.views.NewApuestaFrame;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author manu
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    private MainController controller;
    
    public Main() {
        initComponents();
        FrameUtil.personalizar(this);
        controller = new MainController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCompetidores = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btmPushApuesta = new javax.swing.JButton();
        btmPushResult = new javax.swing.JButton();
        btmResult = new javax.swing.JButton();
        btmReport = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 450));

        tablaCompetidores.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        tablaCompetidores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "No.", "Nombre"
            }
        ));
        jScrollPane1.setViewportView(tablaCompetidores);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CABALLOS COMPETIDORES");
        getContentPane().add(jLabel1, java.awt.BorderLayout.NORTH);

        jPanel1.setPreferredSize(new java.awt.Dimension(200, 476));
        jPanel1.setLayout(new java.awt.GridLayout(5, 0));

        btmPushApuesta.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        btmPushApuesta.setText("Ingresar Apuestas");
        btmPushApuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmPushApuestaActionPerformed(evt);
            }
        });
        jPanel1.add(btmPushApuesta);

        btmPushResult.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        btmPushResult.setText("Ingresar Resultados");
        btmPushResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmPushResultActionPerformed(evt);
            }
        });
        jPanel1.add(btmPushResult);

        btmResult.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        btmResult.setText("Ver Resultados");
        btmResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmResultActionPerformed(evt);
            }
        });
        jPanel1.add(btmResult);

        btmReport.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        btmReport.setText("Reportes");
        jPanel1.add(btmReport);

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_END);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btmPushApuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmPushApuestaActionPerformed
        controller.nuevaApuesta();
    }//GEN-LAST:event_btmPushApuestaActionPerformed

    private void btmPushResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmPushResultActionPerformed
        controller.inputResults();
    }//GEN-LAST:event_btmPushResultActionPerformed

    private void btmResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmResultActionPerformed
        controller.showResults();
    }//GEN-LAST:event_btmResultActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JTable getTablaCompetidores() {
        return tablaCompetidores;
    }

    public void setTablaCompetidores(JTable tablaCompetidores) {
        this.tablaCompetidores = tablaCompetidores;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmPushApuesta;
    private javax.swing.JButton btmPushResult;
    private javax.swing.JButton btmReport;
    private javax.swing.JButton btmResult;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaCompetidores;
    // End of variables declaration//GEN-END:variables
}
