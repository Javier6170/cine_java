/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Exceptions.ProductoYaExisteException;
import modelo.Producto;
import util.LSE;

/**
 *
 * @author USUARIO
 */
public class ControladorCRUDProductos {

    LSE<Producto> listaProductos;

    public ControladorCRUDProductos() {
        listaProductos = new LSE<>();
    }

    public void añadirProductos(Producto producto) {
        Producto auxiliar = buscarPrducto(producto.getNombre());
        if (auxiliar == null) {
            listaProductos.agregar(producto);
        } else {
            throw new ProductoYaExisteException();
        }

    }
    
    

    public Producto buscarPrducto(String nombrePructo) {
        for (int i = 0; i < listaProductos.getSize(); i++) {
            if (listaProductos.obtener(i).getNombre().equals(nombrePructo)) {
                return listaProductos.obtener(i);
            }
        }
        return null;
    }

    public void eliminarProducto(String nombrePructo) {
        for (int i = 0; i < listaProductos.getSize(); i++) {
            if (listaProductos.obtener(i).getNombre().equals(nombrePructo)) {
                listaProductos.eliminar(i);
            }
        }
    }

    public int tamañoLista() {
        return listaProductos.getSize();
    }

    public Producto retornaProducto(int posicion) {
            return listaProductos.obtener(posicion);
    }
    

}
