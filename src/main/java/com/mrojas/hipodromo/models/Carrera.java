/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mrojas.hipodromo.models;

import java.util.Random;

/**
 *
 * @author manu
 */
public class Carrera {

    private static final Random random = new Random();
    private Horse[] horses;


    public Carrera(Horse[] horses){
        //crearCaballos();
        this.horses = horses;
    }

    public void start() {
        revolver(horses);
        for (int i = 0; i < horses.length; i++) {
            horses[i].setLugar(i + 1);
        }
    }

    public Horse[] getHorses() {
        return horses;
    }

    /*
    private void crearCaballos(){
        horses = new Horse[10];
        for (int i = 0; i < horses.length; i++) {
            horses[i] = new Horse(NOMBRES_CABALLOS[i], i);
        }
    }
*/

    private void revolver (Horse[] array) {
        int n = array.length;
        while (n > 1) {
            int k = random.nextInt(n--);
            Horse temp = array[n];
            array[n] = array[k];
            array[k] = temp;
        }
    }
}
