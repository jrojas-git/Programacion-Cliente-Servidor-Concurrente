/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidness.excepciones;

/**
 *
 * @author victus
 */

 //Esta clase permite mostrar un error cuando
 //los datos del usuario no son los correctos
public class ExcepcionUsuario extends Exception {

    //Creamos el constructor que recibe el mensaje de error
    public ExcepcionUsuario(String mensaje) {
        super(mensaje);
    }
}