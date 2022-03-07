/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mrojas.hipodromo.controllers;

import com.mrojas.hipodromo.Main;
import com.mrojas.hipodromo.models.Apuesta;
import com.mrojas.hipodromo.models.Hipodromo;
import com.mrojas.hipodromo.util.ListaEnlazada;
import com.mrojas.hipodromo.views.InputResultsFrame;
import com.mrojas.hipodromo.views.NewApuestaFrame;


/**
 *
 * @author manu
 */
public class MainController {
    
    Main frame;
    private Hipodromo hipodromo;
    
    private ListaEnlazada<Apuesta> apuestas;
    
    public MainController(Main frame){
        this.frame = frame;
        this.hipodromo = new Hipodromo();
        apuestas = new ListaEnlazada<>();
        mostrarCompetidores();
        
    }
    
    public void nuevaApuesta(){
        NewApuestaFrame newApuesta = new NewApuestaFrame(apuestas);
        newApuesta.setVisible(true);
    }
    
    public void inputResults(){
        InputResultsFrame results = new InputResultsFrame(apuestas);
        results.setVisible(true);
    }
    

    private void mostrarCompetidores() {
        Object[][] datos = new Object[Hipodromo.COMPETIDORES.length][2];

        for (int i = 0; i < Hipodromo.COMPETIDORES.length; i++) {
            datos[i][0] = Hipodromo.COMPETIDORES[i].getNumero();
            datos[i][1] = Hipodromo.COMPETIDORES[i].getName();
        }

        frame.getTablaCompetidores().setModel(new javax.swing.table.DefaultTableModel(
                datos,
                new String[]{
                    "No.", "Nombre"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        frame.getTablaCompetidores().getColumnModel().getColumn(0).setWidth(20);
        frame.getTablaCompetidores().setRowHeight(30);
    }
    
    
}
