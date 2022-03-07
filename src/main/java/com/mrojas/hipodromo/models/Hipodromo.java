/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mrojas.hipodromo.models;

import com.mrojas.hipodromo.util.ListaEnlazada;

/**
 *
 * @author manu
 */
public class Hipodromo {

    public static final String[] NAME_HORSES = { "Affirmed","Assault","Citation", "Gallant Fox","Justify", "Omaha", "Secretariat", "Sir Barton",  "War Admiral", "Whirlaway"};
    
    public static Horse[] COMPETIDORES = new Horse[10];

    private ListaEnlazada  apuestas = new ListaEnlazada();
    private Carrera carrera = new Carrera(COMPETIDORES);;

    public Hipodromo(){
        crearCompetidores();
        COMPETIDORES[9].setLugar(8);
    }

    public void calcularResultados(){
        
        while (apuestas.size() > 0) {
            Apuesta aux = apuestas.pop();
            aux.calcularPunteo(COMPETIDORES);
        }
    }

    private void crearCompetidores(){
        for (int i = 0; i < NAME_HORSES.length; i++) {
            COMPETIDORES[i] = new Horse(NAME_HORSES[i], i+1);
        }
    }

    public ListaEnlazada getApuestas() {
        return apuestas;
    }

    public void setApuestas(ListaEnlazada apuestas) {
        this.apuestas = apuestas;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
    
    

}