/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author USUARIO
 */
public class Nodo<T> {
     private T dato;
    private Nodo nodoSiguiente;

    public Nodo(T dato) {
        this.dato = dato;
        this.nodoSiguiente = null;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo getNodoSiguiente() {
        return nodoSiguiente;
    }

    public void setNodoSiguiente(Nodo nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }
    
    public void enlazarSiguiente(Nodo x){
    nodoSiguiente = x;
    }
    
    
}
