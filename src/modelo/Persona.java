/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import util.LSE;

/**
 *
 * @author USUARIO
 */
public class Persona {

    private String nombre;
    private String apellido;
    private int documento;
    private Pelicula pelicula;
    private String telefono;
    private int cantidadComprada;
    private int cuentaPersonal;
    private String nombreProductoComprado;

    public Persona(String nombre, String apellido, int documento, Pelicula pelicula, String telefono, int cantidadComprada, int cuentaPersonal, String nombreProductoComprado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.pelicula = pelicula;
        this.telefono = telefono;
        this.cantidadComprada = cantidadComprada;
        this.cuentaPersonal = cuentaPersonal;
        this.nombreProductoComprado = nombreProductoComprado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getCantidadComprada() {
        return cantidadComprada;
    }

    public void setCantidadComprada(int cantidadComprada) {
        this.cantidadComprada = cantidadComprada;
    }

    public int getCuentaPersonal() {
        return cuentaPersonal;
    }

    public void setCuentaPersonal(int cuentaPersonal) {
        this.cuentaPersonal = cuentaPersonal;
    }

    public String getNombreProductoComprado() {
        return nombreProductoComprado;
    }

    public void setNombreProductoComprado(String nombreProductoComprado) {
        this.nombreProductoComprado = nombreProductoComprado;
    }

  

    
    
}
