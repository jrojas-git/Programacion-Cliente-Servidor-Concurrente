/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidness.modelo;

/**
 *
 * @author victus
 */
import java.io.Serializable;

 //Lo utilizamos para representar a un usuario en la aplicación 
public class Usuario implements Serializable {

    //Este representa el identificador de la serialización
    private static final long serialVersionUID = 1L;

    //Creamos los atributos del usuario
    private int idUsuario;
    private String nombreUsuario;
    private String correo;
    private String contrasena;
    private String rol;

    //Creamos el constructor de la clase
    public Usuario(int idUsuario, String nombreUsuario,
            String correo, String contrasena, String rol) {

        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
        this.contrasena = contrasena;
        this.rol = rol;
    }

    //Utilizamos métodos para consultar atributos

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getRol() {
        return rol;
    }

    //Utilizamos métodos para modificar atributos

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}