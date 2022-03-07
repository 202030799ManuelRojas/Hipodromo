/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mrojas.hipodromo.controllers;

import com.mrojas.hipodromo.models.Apuesta;
import com.mrojas.hipodromo.models.Hipodromo;
import com.mrojas.hipodromo.models.Horse;
import com.mrojas.hipodromo.util.ListaEnlazada;
import com.mrojas.hipodromo.views.InputResultsFrame;
import com.mrojas.hipodromo.views.ResultsFrame;
import java.util.Arrays;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author manu
 */
public class InputResultsController {

    private InputResultsFrame frame;
    private DefaultListModel<Horse> model;
    private int cantHorses = 0;
    private ListaEnlazada<Apuesta> apuestas;

    public InputResultsController(InputResultsFrame frame, ListaEnlazada<Apuesta> apuestas) {
        this.frame = frame;
        this.apuestas = apuestas;
        listarCompetidores();
        model = new DefaultListModel<>();
        
    }

    private void listarCompetidores() {
        for (int i = 0; i < Hipodromo.COMPETIDORES.length; i++) {
            frame.getListaCompetidores().addItem(Hipodromo.COMPETIDORES[i]);
        }
    }
    
    public void clear(){
        cantHorses = 0;
        model.removeAllElements();
        actualizarBoton();
        listarCompetidores();
    }
    
    public void agregarResultado(){
        System.out.println(Arrays.toString(Hipodromo.COMPETIDORES));
        clear();
        JOptionPane.showMessageDialog(frame, "¡Resultados ingresados!", "Resultados ingresados", JOptionPane.PLAIN_MESSAGE);
        System.out.println("Apuestas antes de validar " + apuestas.size());
        apuestas = getValidApuestas(apuestas);
        System.out.println("Apuestas luego de validar " + apuestas.size());
        ResultsFrame resultados = new ResultsFrame(apuestas);
        resultados.setVisible(true);
        frame.dispose();
    }
    
    public ListaEnlazada<Apuesta> getValidApuestas(ListaEnlazada<Apuesta> todas){
        ListaEnlazada<Apuesta> validas = new ListaEnlazada<>();
        while (todas.size() > 0) {            
            Apuesta apuesta = todas.pop();
            if (apuesta.isValid()) {
                apuesta.calcularPunteo(Hipodromo.COMPETIDORES);
                validas.push(apuesta);
            }else{
                System.out.println("Apuesta no valida de: " + apuesta.getApostador());
            }
        }
        return validas;
    }

    public void agregarCaballo() {
        Horse select = (Horse) frame.getListaCompetidores().getSelectedItem();
        select.setLugar(cantHorses + 1);
        model.addElement(select);
        frame.getListaCaballos().setModel(model);
        frame.getListaCompetidores().removeItem(select);
        cantHorses++;
        actualizarBoton();
    }
    
        private void actualizarBoton(){
        if (cantHorses >= Hipodromo.COMPETIDORES.length) {
            frame.getBtmAgregarCaballo().setEnabled(false);
            frame.getBtmAgregarResultados().setEnabled(true);
        }else{
            frame.getBtmAgregarCaballo().setText("Agregar " + (cantHorses+1) + "° Lugar" );
            frame.getBtmAgregarResultados().setEnabled(false);
            frame.getBtmAgregarCaballo().setEnabled(true);
        }
        
        
    }

}
