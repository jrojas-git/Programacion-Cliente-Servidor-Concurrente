/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidness.modelo;

/**
 *
 * @author victus
 */

 //Esta clase representa los ejercicios de fuerza
 //Tambien hereda los datos generales de la clase ejercicio
public class EjercicioFuerza extends Ejercicio {

    //Esto nos indica el grupo muscular que se trabaja
    private String grupoMuscular;

    //Utilizamos un constructor para crear un ejercicio de fuerza
    public EjercicioFuerza(int idEjercicio, String nombre,
            String categoria, String descripcion,
            String instrucciones, String recomendaciones,
            String grupoMuscular) {

        //Lo utilizamos para enviar los datos generales a la clase padre
        super(idEjercicio, nombre, categoria, descripcion,
                instrucciones, recomendaciones);

        this.grupoMuscular = grupoMuscular;
    }

    //Lo utilizamos para consultar el grupo muscular
    public String getGrupoMuscular() {
        return grupoMuscular;
    }

    //Esto nos muestra la información del ejercicio de fuerza
    @Override
    public String mostrarInformacion() {

        return "Ejercicio de fuerza: " + getNombre()
                + "\nGrupo muscular: " + grupoMuscular
                + "\nDescripción: " + getDescripcion()
                + "\nInstrucciones: " + getInstrucciones()
                + "\nRecomendaciones: " + getRecomendaciones();
    }
}