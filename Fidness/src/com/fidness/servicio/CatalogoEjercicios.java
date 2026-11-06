/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidness.servicio;

/**
 *
 * @author victus
 */
import com.fidness.modelo.Ejercicio;
import com.fidness.modelo.EjercicioFuerza;
import com.fidness.modelo.EjercicioCardio;
import java.util.ArrayList;

 //Esta clase se va encargar de administrar el catálogo de ejercicios
 //que estan disponibles en la aplicación Fidness
public class CatalogoEjercicios {

    //Lo utilizamos para listar donde se guardan los ejercicios
    private ArrayList<Ejercicio> ejercicios;

    //Creamos el constructor de la clase
    public CatalogoEjercicios() {

        //Se crea la lista de los ejercicios
        ejercicios = new ArrayList<>();

        //Se agregan los ejercicios de fuerza de ejemplo
        ejercicios.add(new EjercicioFuerza(
                1,
                "Sentadillas",
                "Fuerza",
                "Ejercicio para fortalecer las piernas.",
                "Flexionar las rodillas y bajar lentamente.",
                "Mantener la espalda recta.",
                "Piernas"
        ));

        ejercicios.add(new EjercicioFuerza(
                2,
                "Flexiones",
                "Fuerza",
                "Ejercicio para fortalecer el tren superior.",
                "Bajar y subir el cuerpo apoyando las manos.",
                "Mantener el cuerpo alineado.",
                "Pecho y brazos"
        ));

        //Lo utilizamos para agregar ejercicios de cardio de ejemplo
        ejercicios.add(new EjercicioCardio(
                3,
                "Caminata",
                "Cardio",
                "Ejercicio cardiovascular de bajo impacto.",
                "Caminar a un ritmo constante.",
                "Utilizar calzado cómodo.",
                30
        ));

        ejercicios.add(new EjercicioCardio(
                4,
                "Bicicleta",
                "Cardio",
                "Ejercicio para mejorar la resistencia.",
                "Pedalear manteniendo un ritmo constante.",
                "Ajustar correctamente el asiento.",
                20
        ));
    }

    //Lo utilizamos para registrar un nuevo ejercicio
    public void registrarEjercicio(Ejercicio ejercicio) {

        if (ejercicio != null) {
            ejercicios.add(ejercicio);
        }
    }

    //Nos permite buscar un ejercicio utilizando un identificador
    public Ejercicio buscarEjercicio(int idEjercicio) {

        for (Ejercicio ejercicio : ejercicios) {

            if (ejercicio.getIdEjercicio() == idEjercicio) {
                return ejercicio;
            }
        }

        //Este nos devuelve null si no encuentra el ejercicio
        return null;
    }

    //Este nos devuelv todos los ejercicios registrados
    public ArrayList<Ejercicio> consultarEjercicios() {
        return ejercicios;
    }

    //Nos permite consultar ejercicios según su categoría
    public ArrayList<Ejercicio> filtrarPorCategoria(
            String categoria) {

        ArrayList<Ejercicio> resultado = new ArrayList<>();

        for (Ejercicio ejercicio : ejercicios) {

            if (ejercicio.getCategoria().equalsIgnoreCase(categoria)) {
                resultado.add(ejercicio);
            }
        }

        return resultado;
    }

    //Nos permite actualizar la información de un ejercicio
    public void actualizarEjercicio(int idEjercicio,
            String descripcion, String instrucciones,
            String recomendaciones) {

        Ejercicio ejercicio = buscarEjercicio(idEjercicio);

        if (ejercicio != null) {
            ejercicio.actualizarInformacion(
                    descripcion, instrucciones, recomendaciones);
        }
    }

    //Nos permite eliminar un ejercicio del catálogo
    public void eliminarEjercicio(int idEjercicio) {

        Ejercicio ejercicio = buscarEjercicio(idEjercicio);

        if (ejercicio != null) {
            ejercicios.remove(ejercicio);
        }
    }
}