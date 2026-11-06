/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fidness;

/**
 *
 * @author victus
 */
public class Fidness {

    /**
     * @param args the command line arguments
     */

public static void main(String[] args) {

    //Lo utilizamos para poder iniciar la interfaz gráfica de Fidness
    java.awt.EventQueue.invokeLater(() -> {

        //Se crea la ventana de inicio de sesión
        com.fidness.cliente.VentanaInicioSesion ventana =
                new com.fidness.cliente.VentanaInicioSesion();

        //Se centra la ventana en la pantalla
        ventana.setLocationRelativeTo(null);

        //Se muestra la ventana
        ventana.setVisible(true);
    });
}
    
}
