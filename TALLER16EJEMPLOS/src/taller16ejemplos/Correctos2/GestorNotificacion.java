/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller16ejemplos.Correctos2;

/**
 *
 * @author yoven
 */
// Esta clase se encarga de manejar las notificaciones
// No necesita preocuparse por los detalles de cada tipo de notificacion gracias al polimorfismo
public class GestorNotificacion {
    public void notificar(Notificacion notificacion, String mensaje) {
        // Llamo al metodo de la clase especifica para enviar el mensaje
        notificacion.enviar(mensaje);
    }
}
