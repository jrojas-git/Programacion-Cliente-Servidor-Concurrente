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
import java.time.LocalDate;
import java.util.ArrayList;


 //Lo utilizamos para representar una rutina de entrenamiento creada
public class Rutina implements Serializable {

    private static final long serialVersionUID = 1L;

    //Creamos los atributos de la rutina
    private int idRutina;
    private String nombre;
    private LocalDate fechaCreacion;
    private Usuario usuarioPropietario;
    private ArrayList<Ejercicio> ejercicios;

    //Creamos el constructor de la clase
    public Rutina(int idRutina, String nombre,
            Usuario usuarioPropietario) {

        this.idRutina = idRutina;
        this.nombre = nombre;
        this.usuarioPropietario = usuarioPropietario;

        //Se utiliza para establecer la fecha actual de creación
        this.fechaCreacion = LocalDate.now();

        //Lo utilizamos para crear la lista donde se guardarán los ejercicios
        this.ejercicios = new ArrayList<>();
    }

    //Nos permite agregar un ejercicio a la rutina
    public void agregarEjercicio(Ejercicio ejercicio) {
        if (ejercicio != null) {
            ejercicios.add(ejercicio);
        }
    }

    //Nos permite eliminar un ejercicio de la rutina
    public void eliminarEjercicio(Ejercicio ejercicio) {
        ejercicios.remove(ejercicio);
    }

    //Nos permite consultar los ejercicios de la rutina
    public ArrayList<Ejercicio> obtenerEjercicios() {
        return ejercicios;
    }

    //Creamos los métodos para consultar los atributos
    public int getIdRutina() {
        return idRutina;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public Usuario getUsuarioPropietario() {
        return usuarioPropietario;
    }

    //Lo utilizamos para poder modificar el nombre de la rutina
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}