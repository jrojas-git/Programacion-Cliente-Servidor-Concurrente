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
import com.fidness.excepciones.ExcepcionUsuario;
import java.util.ArrayList;

 //Esta clase se encarga de verificar el inicio de la sesión
 //de los usuarios
public class ServicioAutenticacion {

    //Creamos la lista donde se guardan los usuarios registrados
    private ArrayList<Usuario> usuarios;

    //Creamos el constructor de la clase
    public ServicioAutenticacion() {

        //Procedemos a crear la lista de usuarios
        usuarios = new ArrayList<>();

        //Se agregan usuarios de prueba para iniciar sesión
        usuarios.add(new Usuario(1, "admin",
                "admin@fidness.com", "1234", "Administrador"));

        usuarios.add(new Usuario(2, "usuario",
                "usuario@fidness.com", "1234", "Cliente"));
    }

    //Lo utilizamos para verifica si el usuario y la contraseña son correctos
    public Usuario autenticar(String nombreUsuario,
            String contrasena) throws ExcepcionUsuario {

        //Se utiliza para comprobar que los campos no estén vacíos
        if (nombreUsuario == null || nombreUsuario.trim().isEmpty()
                || contrasena == null || contrasena.isEmpty()) {

            throw new ExcepcionUsuario(
                    "Debe ingresar el usuario y la contraseña.");
        }

        //Se utiliza para  revisar los usuarios registrados
        for (Usuario usuario : usuarios) {

            if (usuario.getNombreUsuario().equals(nombreUsuario)
                    && usuario.getContrasena().equals(contrasena)) {

                //Nos devuelve el usuario si los datos coinciden
                return usuario;
            }
        }

        //Nos muestra un error si los datos son incorrectos
        throw new ExcepcionUsuario(
                "Usuario o contraseña incorrectos.");
    }

    //Verifica si el usuario tiene permisos de administrador
    public boolean verificarPermisos(Usuario usuario) {

        if (usuario != null) {
            return usuario.getRol().equals("Administrador");
        }

        return false;
    }
}