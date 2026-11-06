/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidness.modelo;

/**
 *
 * @author victus
 */

 //Esta clase representa los ejercicios de cardio
 //Tambien hereda los datos generales de ejercicio
public class EjercicioCardio extends Ejercicio {

    //Lo creamos para dar una duración recomendada del ejercicio en minutos
    private int duracionMinutos;

    //Utilizamos un constructor para crear un ejercicio
    public EjercicioCardio(int idEjercicio, String nombre,
            String categoria, String descripcion,
            String instrucciones, String recomendaciones,
            int duracionMinutos) {

        //Lo utilizamos para enviar los datos generales a la clase padre
        super(idEjercicio, nombre, categoria, descripcion,
                instrucciones, recomendaciones);

        this.duracionMinutos = duracionMinutos;
    }

    //Nos permite consultar la duración del ejercicio
    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    //Nos puede muestrar la información del ejercicio
    @Override
    public String mostrarInformacion() {

        return "Ejercicio cardiovascular: " + getNombre()
                + "\nDuración recomendada: " + duracionMinutos + " minutos"
                + "\nDescripción: " + getDescripcion()
                + "\nInstrucciones: " + getInstrucciones()
                + "\nRecomendaciones: " + getRecomendaciones();
    }
}