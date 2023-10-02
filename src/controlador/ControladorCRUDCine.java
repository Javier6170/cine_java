/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Exceptions.PersonaYaExisteException;
import modelo.Persona;
import modelo.Silla;
import modelo.ProductoComprados;
import util.LSE;

/**
 *
 * @author USUARIO
 */
public class ControladorCRUDCine {

    Silla sillas[][];

    public ControladorCRUDCine() {
        sillas = new Silla[10][12];
        initPlazas();
    }

    private void initPlazas() {
        for (int i = 0; i < sillas.length; i++) {
            for (int j = 0; j < sillas[i].length; j++) {
                sillas[i][j] = new Silla();
            }
        }
    }

    public void agregarPersona(Persona persona, int fila, int columna) {
        sillas[fila][columna].setPersona(persona);
    }

    public void agregarProductosComprados(int fila, int columna, ProductoComprados productoComprados) {
        sillas[fila][columna].getProductosComprados().agregar(productoComprados);
    }

    public void razonPorDeshabilitacion(int fila, int columna, String razon) {
        sillas[fila][columna].setRazonporDeshabilitacion(razon);
    }

    public Persona retornarPersona(int fila, int columna) {
        return sillas[fila][columna].getPersona();
    }

    public void terminarFuncion(int fila, int columna) {
        while (sillas[fila][columna].getEstado().equals(Silla.OCUPADA)) {
            sillas[fila][columna].setEstado(Silla.DISPONIBLE);
        }
    }

    public ProductoComprados retornarProductoComprado(int fila, int columna, int posicion) {
        return sillas[fila][columna].getProductosComprados().obtener(posicion);
    }

    public int retornarTamaño(int fila, int columna) {
        return sillas[fila][columna].getProductosComprados().getSize();
    }

    public boolean validarExistenciaPersona(int fila, int columna, int documento) {
        while (sillas[fila][columna].getPersona().getDocumento() == documento) {
            return true;
        }
        return false;
    }

    public void estadoDeshabilitada(int fila, int columna) {
        sillas[fila][columna].setEstado(Silla.DESHABILITADA);
    }

    public void estadoOcupada(int fila, int columna) {
        sillas[fila][columna].setEstado(Silla.OCUPADA);
    }

    public void estadoDisponible(int fila, int columna) {
        sillas[fila][columna].setEstado(Silla.DISPONIBLE);
    }

    public Silla obtenerSilla(int fila, int columna) {
        return sillas[fila][columna];
    }

}
