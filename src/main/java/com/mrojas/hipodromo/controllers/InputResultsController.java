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
    private ListaEnlazada apuestas;

    /**
     * Constructor para el controlador de la ventana para ingresar los resultados
     * @param frame ventana correspondiente al ingreso de resultados.
     * @param apuestas listado de apuestas de la app.
     */

    public InputResultsController(InputResultsFrame frame, ListaEnlazada apuestas) {
        this.frame = frame;
        this.apuestas = apuestas;
        listarCompetidores();
        model = new DefaultListModel<>();
        
    }

    /**
     * Metodo para limpiar los campos del frame.
     */
    public void clear(){
        cantHorses = 0;
        model.removeAllElements();
        actualizarBoton();
        listarCompetidores();
    }

    /**
     * Metodo para agregar los resultados de las posiciones de los caballos.
     */
    
    public void agregarResultado(){
        clear();
        JOptionPane.showMessageDialog(frame, "¡Resultados ingresados y procesados!", "Resultados ingresados", JOptionPane.PLAIN_MESSAGE);
        apuestas = getValidApuestas(apuestas);
        ResultsFrame resultados = new ResultsFrame(apuestas);
        resultados.setVisible(true);
        frame.dispose();
    }

    /**
     * Metodo para obtener las apuestas validas de todas las que se han ingresado.
     * Tiene un time complexity de O(n)
     * @param todas listado de las apuestas acumuladas.
     * @return Retorna una lista con las apuestas validas.
     */
    
    public ListaEnlazada getValidApuestas(ListaEnlazada todas){
        ListaEnlazada validas = new ListaEnlazada();
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

    /**
     * Metodo para agregar la posicion de llegada de un caballo desde la interfaz grafica.
     */

    public void agregarCaballo() {
        Horse select = (Horse) frame.getListaCompetidores().getSelectedItem();
        select.setLugar(cantHorses + 1);
        model.addElement(select);
        frame.getListaCaballos().setModel(model);
        frame.getListaCompetidores().removeItem(select);
        cantHorses++;
        actualizarBoton();
    }

    /**
     * Metodo para listas los competidores en la lista de seleccion.
     */

    private void listarCompetidores() {
        for (int i = 0; i < Hipodromo.COMPETIDORES.length; i++) {
            frame.getListaCompetidores().addItem(Hipodromo.COMPETIDORES[i]);
        }
    }

    /**
     * Metodo para actualizar el boton para hacerlo interactivo con el usuario.
     */
    
    private void actualizarBoton() {
        if (cantHorses >= Hipodromo.COMPETIDORES.length) {
            frame.getBtmAgregarCaballo().setEnabled(false);
            frame.getBtmAgregarResultados().setEnabled(true);
        } else {
            frame.getBtmAgregarCaballo().setText("Agregar " + (cantHorses + 1) + "° Lugar");
            frame.getBtmAgregarResultados().setEnabled(false);
            frame.getBtmAgregarCaballo().setEnabled(true);
        }

    }

}
