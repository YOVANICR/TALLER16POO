/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller16ejemplos.Incorrectos;

/**
 *
 * @author yoven
 */
// Otro ejemplo de violacion del OCP
// Aqui mezclo todos los canales de notificacion en una sola clase
public class NotificacionIncorrecta {
    public void enviar(String canal, String mensaje) {
        if (canal.equals("Email")) {
            System.out.println("Enviando email: " + mensaje);
        } else if (canal.equals("SMS")) {
            System.out.println("Enviando SMS: " + mensaje);
        }
        // Si quiero agregar otro canal, debo modificar este codigo
    }
}
