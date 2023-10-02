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
public class Silla {

    public static final String DISPONIBLE = "Disponible";
    public static final String DESHABILITADA = "Deshabilitada";
    public static final String OCUPADA = "Ocupada";

    private String estado;
    private Persona persona;
    private String razonporDeshabilitacion;
    private LSE<ProductoComprados> productosComprados;

    public Silla() {
        this.estado = DISPONIBLE;
        this.persona = null;
        this.razonporDeshabilitacion = null;
        productosComprados = new LSE<>();

    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getRazonporDeshabilitacion() {
        return razonporDeshabilitacion;
    }

    public void setRazonporDeshabilitacion(String razonporDeshabilitacion) {
        this.razonporDeshabilitacion = razonporDeshabilitacion;
    }

    public LSE<ProductoComprados> getProductosComprados() {
        return productosComprados;
    }

    public void setProductosComprados(LSE<ProductoComprados> productosComprados) {
        this.productosComprados = productosComprados;
    }

}
