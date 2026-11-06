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


 //Esta sera la clase que representa un ejercicio
 //Es la sera la clase padre de los diferentes tipos de ejercicios
public abstract class Ejercicio implements Serializable {

    private static final long serialVersionUID = 1L;

    //Creamos los atributos ejercicio
    private int idEjercicio;
    private String nombre;
    private String categoria;
    private String descripcion;
    private String instrucciones;
    private String recomendaciones;

    //Creamos el constructor
    public Ejercicio(int idEjercicio, String nombre, String categoria,
            String descripcion, String instrucciones,
            String recomendaciones) {

        this.idEjercicio = idEjercicio;
        this.nombre = nombre;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.instrucciones = instrucciones;
        this.recomendaciones = recomendaciones;
    }

    //Creamos los métodos para consultar los diferentes atributos
    public int getIdEjercicio() {
        return idEjercicio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public String getRecomendaciones() {
        return recomendaciones;
    }

    //Creamos los metodo para actualizar la información
    public void actualizarInformacion(String descripcion,
            String instrucciones, String recomendaciones) {

        this.descripcion = descripcion;
        this.instrucciones = instrucciones;
        this.recomendaciones = recomendaciones;
    }

    //Con esto, cada uno de los ejercicios presentará su información
    public abstract String mostrarInformacion();
}