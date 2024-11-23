/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller16ejemplos.Correctos2;

/**
 *
 * @author yoven
 */
// Esta clase representa notificaciones por email
// Implementa el metodo enviar especifico para correos electronicos
public class NotificacionEmail extends Notificacion {
    @Override
    public void enviar(String mensaje) {
        // Simulo el envio de un email con este mensaje
        System.out.println("Enviando email: " + mensaje);
    }
}
