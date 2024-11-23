/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller16ejemplos.Correctos2;

/**
 *
 * @author yoven
 */
// Aqui pruebo que el sistema de notificaciones funciona correctamente
// Tambien demuestro que se pueden agregar nuevos tipos sin modificar el GestorNotificacion
public class PruebaNotificacion {
    public static void main(String[] args) {
        // Creo un gestor de notificaciones
        GestorNotificacion gestor = new GestorNotificacion();

        // Pruebo con notificaciones por email
        Notificacion email = new NotificacionEmail();
        gestor.notificar(email, "Este es un mensaje de prueba por email.");

        // Pruebo con notificaciones por SMS
        Notificacion sms = new NotificacionSMS();
        gestor.notificar(sms, "Este es un mensaje de prueba por SMS.");
    }
}
