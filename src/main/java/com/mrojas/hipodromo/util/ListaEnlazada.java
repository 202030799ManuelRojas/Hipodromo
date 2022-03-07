package com.mrojas.hipodromo.util;

import com.mrojas.hipodromo.models.Apuesta;

/**
 *
 * @author manu
 */

public class ListaEnlazada {

    private Nodo<Apuesta> first;
    private Nodo<Apuesta> last;
    private int size = 0;
    /**
     * Constructor de una lista enlazada para apuestas
     */
    public ListaEnlazada(){
        first = null;
        last = null;
    }

    /**
     * Método para ingresar una nueva apuesta. Tiene un tiene un time complexity de O(1).
     * @param value la apuesta que se va a ingresar a la lista.
     */

    public void push(Apuesta value){
        if (first == null){
            last = new Nodo<>(value);
            first = last;
        }else{
            Nodo<Apuesta> newValue = new Nodo<>(value, null, last);
            last.setNext(newValue);
            last = newValue;
        }
        this.size++;
    }

    /**
     * Método para eliminar el ultimo elemento de la lista de apuestas. Tiene un time complexity de O(n).
     * @return retorna el último elemento de la lista de apuestas
     */

    public Apuesta pop(){
        Apuesta value = last.getValue();
        last = last.getBefore();
        if (last != null) {
            last.setNext(null);
        }else{
            first = null;
        }
        size--;
        return value;
    }
    
    /**
     * Métod para ordenar la lista con las apuestas. Es del tipo insertion sort, tiene un time complexity de O(n2)
     * @param isAlfabetic valor que indica si se ordenará de manera alfabetica (true) o por punteo (false).
     */

    public void insertionSort(boolean isAlfabetic) {
        Nodo <Apuesta> anterior = first;
        Nodo <Apuesta> actual;
        Apuesta temporal;
        
        while(anterior != null){
            actual = anterior;
            temporal = anterior.getValue();
            
            while (actual != first 
                    && (isAlfabetic 
                    ? temporal.getApostador().getName().compareTo(actual.getBefore().getValue().getApostador().getName()) < 0 
                    : temporal.getApostador().getPuntaje() > actual.getBefore().getValue().getApostador().getPuntaje())) {                
                actual.setValue(actual.getBefore().getValue());
                actual = actual.getBefore();
            }
            actual.setValue(temporal);
            anterior = anterior.getNext();
        }
        
        
    }

    /**
     * Metodo para saber el tamaño de la lista de apuestas acumuladas
     * @return el tamaño de la lista.
     */

    public int size(){
        return this.size;
    }

    /*
    public String eliminarFinish(){
        String dato= finish.getInfo();
        finish=finish.getAnterior();
        if (finish!=null) {
            finish.setSiguiente(null);
        } else {
            inicio=null;
        }
        return dato;
    }
    */

    /*
    public T[] toArray(boolean isValid){
        T[] array = new T[size];
        Nodo<Apuesta> temp = first;
        for (int i = 0; i < apuestas.length; i++) {
            if(isValid ? temp.getValue().isValid() : !temp.getValue().isValid()){
                apuestas[i] = temp.getValue();
            }

            temp = temp.getNext();
        }
        return apuestas;
    }
    */


}

/**
 * Nodo <T>
 */
class Nodo<T>{

    private T value;
    private Nodo<T> next;
    private Nodo<T> before;
    
    public Nodo(T value, Nodo<T> next, Nodo<T> before){
        this.value = value;
        this.next = next;
        this.before = before;
    }

    public Nodo(T value){
        this(value, null, null);
    }
    
    public T getValue() {
        return value;
    }
    
    public void setValue(T value){
        this.value = value;
    }

    public Nodo<T> getNext() {
        return next;
    }

    public void setNext(Nodo<T> next) {
        this.next = next;
    }

    public Nodo<T> getBefore() {
        return before;
    }

    public void setBefore(Nodo<T> before) {
        this.before = before;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
