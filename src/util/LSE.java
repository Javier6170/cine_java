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
public class LSE<S> {

    private Nodo<S> primero;
    private int size;

    public LSE() {
        this.primero = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void agregar(S dato) {
        Nodo<S> nuevo = new Nodo<>(dato);

        if (primero == null) {
            primero = nuevo;
        } else {
            Nodo<S> auxiliar = primero;
            while (auxiliar.getNodoSiguiente() != null) {
                auxiliar = auxiliar.getNodoSiguiente();
            }
            auxiliar.setNodoSiguiente(nuevo);
        }
        size++;
    }

    public boolean esVacia() {
        return primero == null;
    }

    public void insertarPorPosicion(int indice, S dato) {
        if (indice >= 0 && indice <= size) {
            Nodo<S> nuevo = new Nodo<>(dato);
            nuevo.setDato(dato);
            if (indice == 0) {
                nuevo.setNodoSiguiente(primero);
                primero = nuevo;
            } else {

                Nodo auxiliar = primero;
                int contador = 0;
                while (contador < indice - 1) {
                    auxiliar = auxiliar.getNodoSiguiente();
                    contador++;
                }
                Nodo siguiente = auxiliar.getNodoSiguiente();
                auxiliar.setNodoSiguiente(nuevo);
                nuevo.setNodoSiguiente(siguiente);

            }
            size++;
        }
    }

    public void listar() {
        // Verifica si la lista contiene elementoa.
        if (!esVacia()) {
            // Crea una copia de la lista.
            Nodo auxiliar = primero;
            // Posicion de los elementos de la lista.
            int i = 0;
            // Recorre la lista hasta el final.
            while (auxiliar != null) {
                // Imprime en pantalla el valor del nodo.
                System.out.print(i + ".[ " + auxiliar.getDato() + " ]" + " ->  ");
                // Avanza al siguiente nodo.
                auxiliar = auxiliar.getNodoSiguiente();
                // Incrementa el contador de la posión.
                i++;
            }
        }
    }

    public void eliminar(int indice) {
        if (indice != 0) {
            int contador = 0;
            Nodo<S> auxiliar = primero;
            while (contador < indice - 1) {
                auxiliar = auxiliar.getNodoSiguiente();
                contador++;
            }
            auxiliar.enlazarSiguiente(auxiliar.getNodoSiguiente().getNodoSiguiente());
        } else {
            primero = primero.getNodoSiguiente();
        }
        size--;
    }

    public S obtener(int indice) {
        Nodo<S> auxiliar = null;
        if (indice >= size || indice < 0) {
            throw new ArrayIndexOutOfBoundsException(indice + " Indice fuera de rango ");
        } else {
            if (indice == 0) {
                return primero.getDato();
            } else {
                int contador = 0;
                auxiliar = primero;

                while (contador < indice) {
                    auxiliar = auxiliar.getNodoSiguiente();
                    contador++;
                }
                return auxiliar.getDato();
            }
        }
    }

}
