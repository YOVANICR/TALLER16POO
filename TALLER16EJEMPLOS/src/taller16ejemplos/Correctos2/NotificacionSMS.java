/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller16ejemplos.Correctos2;

/**
 *
 * @author yoven
 */
// Esta clase representa notificaciones por SMS
// Igual que NotificacionEmail, implementa su propia manera de enviar mensajes
public class NotificacionSMS extends Notificacion {
    @Override
    public void enviar(String mensaje) {
        // Simulo el envio de un SMS con este mensaje
        System.out.println("Enviando SMS: " + mensaje);
    }
}
