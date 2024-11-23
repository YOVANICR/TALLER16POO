/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller16ejercicios.Numero3;

/**
 *
 * @author yoven
 */
// Aqui pruebo el sistema de mensajeria para verificar que soporta diferentes canales
public class PruebaMensajero {
    public static void main(String[] args) {
        // Envio un mensaje por email
        Mensajero email = new MensajeroEmail();
        email.enviarMensaje("correo@ejemplo.com", "Hola, este es un email!");

        // Envio un mensaje por SMS
        Mensajero sms = new MensajeroSMS();
        sms.enviarMensaje("1234567890", "Hola, este es un SMS!");
    }
}
