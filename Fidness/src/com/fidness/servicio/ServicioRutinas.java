/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidness.servicio;

/**
 *
 * @author victus
 */
import com.fidness.modelo.Usuario;
import com.fidness.modelo.Rutina;
import java.util.ArrayList;

 //Esta clase se encargara de administrar las rutinas
 //de entrenamiento de los usuarios
public class ServicioRutinas {

    //Creamos la lista donde se guardan las rutinas creadas
    private ArrayList<Rutina> rutinas;

    //Nos permite asignar un identificador a la rutina
    private int siguienteId;

    //Creamos el constructor de la clase
    public ServicioRutinas() {

        //Procedemos a crear la lista de rutinas
        rutinas = new ArrayList<>();

        //Lo utilizamos para asignar el primer identificador que será el 1
        siguienteId = 1;
    }

    //Nos permite crear una rutina para un usuario
    public Rutina crearRutina(Usuario usuario, String nombre) {

        //Lo utilizamos para poder verificar que los datos sean válidos
        if (usuario == null || nombre == null
                || nombre.trim().isEmpty()) {
            return null;
        }

        //Nos permite crear una nueva rutina
        Rutina nuevaRutina = new Rutina(
                siguienteId, nombre, usuario);

        //Nos permite guardar la rutina en la lista
        rutinas.add(nuevaRutina);

        //Lo utilizamos para aumentar el identificador para la siguiente rutina
        siguienteId++;

        //Nos devuelve la rutina creada
        return nuevaRutina;
    }

    //Lo utilizamos para consultar las rutinas de un usuario
    public ArrayList<Rutina> consultarRutinas(Usuario usuario) {

        //Creamos la lista para guardar las rutinas encontradas
        ArrayList<Rutina> resultado = new ArrayList<>();

        if (usuario == null) {
            return resultado;
        }

        //Procedemos a revisar las rutinas registradas
        for (Rutina rutina : rutinas) {

            //Se utiliza para compruebar a qué usuario pertenece cada rutina
            if (rutina.getUsuarioPropietario().getIdUsuario()
                    == usuario.getIdUsuario()) {

                resultado.add(rutina);
            }
        }

        return resultado;
    }

    //Nos permite guardar una rutina en la lista
    public void guardarRutina(Rutina rutina) {

        if (rutina != null && !rutinas.contains(rutina)) {
            rutinas.add(rutina);
        }
    }

    //Nos permite buscar una rutina por su identificador
    public Rutina buscarRutina(int idRutina) {

        for (Rutina rutina : rutinas) {

            if (rutina.getIdRutina() == idRutina) {
                return rutina;
            }
        }

        //En caso de no encuentrar la rutina, devuelve null.
        return null;
    }
}