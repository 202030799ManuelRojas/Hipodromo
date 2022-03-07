/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mrojas.hipodromo.models;

import java.util.Arrays;

/**
 *
 * @author manu
 */
public class Apuesta {

    private Apostador apostador;
    private Horse[] horses;
    private double monto;

    /**
     * Constructor para crear una nueva apuesta
     * 
     * @param apostador nombre de la persona que está apostando
     * @param monto     el monto que apostará la persona
     * @param horses    arreglo con los caballos a los que les apostó
     */

    public Apuesta(String apostador, double monto, Horse[] horses) {
        this.apostador = new Apostador(apostador);
        this.horses = alphabeticSort(horses);
        this.monto = monto;
    }

    /**
     * Método que valida si la apuesta es válida o no. Posee un time complexity de
     * O(n)
     * 
     * @return retorna false si existe algún caballo repetido dentro de la apuesta,
     *         de lo contrario es true.
     */

    public boolean isValid() {
        for (int i = 0; i < horses.length - 1; i++) {    //2n+1
            if (horses[i].equals(horses[i + 1])) {       //(n-1)*1
                return false;                           //(n-1)*1
            }
        }
        return true;
    }

    /**
     * Método que calcula el punteo obtenido por el apostador en función de los
     * caballos a los que les apostó. Tiene un time complexity de O(n)
     * 
     * @param ganadores arreglo de los caballos con los cuales se comparará para
     *                  calcular los resultados.
     */
    public void calcularPunteo(Horse[] ganadores) {                     //1
        int punteo = 10;                                                //1

        for (int i = 0; i < ganadores.length; i++) {                    //2n+2
            if (ganadores[i].getLugar() == horses[i].getLugar()) {      //n
                apostador.setPuntaje(punteo);                           //n
            }
            punteo--;                                                   //n
        }

    }

    public Apostador getApostador() {
        return apostador;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    private static Horse[] alphabeticSort(Horse[] array) { // insertion sort
        Horse key;
        int j;
        for (int i = 1; i < array.length; i++) {
            key = array[i];
            j = i - 1;

            while ((j >= 0) && key.getName().compareTo(array[j].getName()) < 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        return array;
    }

    @Override
    public String toString() {
        return "Apuesta [apostador=" + apostador + ", horses=" + Arrays.toString(horses) + ", monto=" + monto + "]";
    }

}