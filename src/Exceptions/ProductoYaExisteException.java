/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author USUARIO
 */
public class ProductoYaExisteException extends RuntimeException{

    public ProductoYaExisteException() {
    super("Ya tienes un producto con ese nombre, deberias modificarlo");
    }
    
}
