/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mrojas.hipodromo.views;

import com.mrojas.hipodromo.controllers.InputResultsController;
import com.mrojas.hipodromo.models.Apuesta;
import com.mrojas.hipodromo.models.Horse;
import com.mrojas.hipodromo.util.FrameUtil;
import com.mrojas.hipodromo.util.ListaEnlazada;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JTable;

/**
 *
 * @author manu
 */

public class InputResultsFrame extends javax.swing.JFrame {
    
    private InputResultsController controller;
    /**
     * Creates new form InputResultsFrame
     * @param apuestas
     */
    public InputResultsFrame(ListaEnlazada apuestas) {
        initComponents();
        FrameUtil.personalizar(this);
        controller = new InputResultsController(this, apuestas);
    }

    public JList<Horse> getListaCaballos() {
        return listaCaballos;
    }

    public void setListaCaballos(JList<Horse> listaCaballos) {
        this.listaCaballos = listaCaballos;
    }

    public JComboBox<Horse> getListaCompetidores() {
        return listaCompetidores;
    }

    public void setListaCompetidores(JComboBox<Horse> listaCompetidores) {
        this.listaCompetidores = listaCompetidores;
    }

    public JButton getBtmAgregarCaballo() {
        return btmAgregarCaballo;
    }

    public JButton getBtmAgregarResultados() {
        return btmAgregarResultados;
    }

    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        listaCompetidores = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaCaballos = new javax.swing.JList<>();
        btmAgregarCaballo = new javax.swing.JButton();
        btmAgregarResultados = new javax.swing.JButton();
        btmClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingreso de resultados");
        getContentPane().add(jLabel1, java.awt.BorderLayout.NORTH);

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel2.setText("Seleccione un caballo:");

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel3.setText("Caballos ingresados:");

        listaCompetidores.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N

        listaCaballos.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(listaCaballos);

        btmAgregarCaballo.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        btmAgregarCaballo.setText("Agregar Caballo");
        btmAgregarCaballo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmAgregarCaballoActionPerformed(evt);
            }
        });

        btmAgregarResultados.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        btmAgregarResultados.setText("Agregar Resultados");
        btmAgregarResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmAgregarResultadosActionPerformed(evt);
            }
        });

        btmClear.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        btmClear.setText("Limpiar lista");
        btmClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(listaCompetidores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btmAgregarResultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btmAgregarCaballo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btmClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listaCompetidores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btmAgregarCaballo))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btmClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btmAgregarResultados)))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btmAgregarCaballoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmAgregarCaballoActionPerformed
        controller.agregarCaballo();
    }//GEN-LAST:event_btmAgregarCaballoActionPerformed

    private void btmAgregarResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmAgregarResultadosActionPerformed
        controller.agregarResultado();
    }//GEN-LAST:event_btmAgregarResultadosActionPerformed

    private void btmClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmClearActionPerformed
        controller.clear();
    }//GEN-LAST:event_btmClearActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmAgregarCaballo;
    private javax.swing.JButton btmAgregarResultados;
    private javax.swing.JButton btmClear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Horse> listaCaballos;
    private javax.swing.JComboBox<Horse> listaCompetidores;
    // End of variables declaration//GEN-END:variables
}
