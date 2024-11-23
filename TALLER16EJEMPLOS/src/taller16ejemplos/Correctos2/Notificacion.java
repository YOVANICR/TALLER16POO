/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller16ejemplos.Correctos2;

/**
 *
 * @author yoven
 */
// Esta es la clase base para las notificaciones
// Define un metodo abstracto que cada tipo de notificacion debe implementar
public abstract class Notificacion {
    public abstract void enviar(String mensaje); // Esto asegura que todas las notificaciones puedan enviar un mensaje
}
