/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mrojas.hipodromo.controllers;

import com.mrojas.hipodromo.models.Apuesta;
import com.mrojas.hipodromo.models.Hipodromo;
import com.mrojas.hipodromo.util.ListaEnlazada;
import com.mrojas.hipodromo.views.ResultsFrame;

/**
 *
 * @author manu
 */
public class ResultsController {

    private ResultsFrame frame;
    private ListaEnlazada<Apuesta> apuestas;

    public ResultsController(ResultsFrame frame, ListaEnlazada<Apuesta> apuestas) {
        this.frame = frame;
        this.apuestas = apuestas;
        actualizarTabla();
    }

    public void actualizarTabla() {
        Object[][] datos = new Object[apuestas.size()][2];
        int i = apuestas.size()-1;

        while (apuestas.size() > 0) {
            Apuesta agregar = apuestas.pop();
            datos[i][0] = agregar.getApostador().getName();
            datos[i][1] = agregar.getApostador().getPuntaje();
            i--;
        }

        frame.getTablaResultados().setModel(new javax.swing.table.DefaultTableModel(
                datos,
                new String[]{
                    "Nombre", "Punteo"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        });
    }

}
