/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller16ejercicios.Numero3;

/**
 *
 * @author yoven
 */
// Clase para enviar mensajes por SMS
public class MensajeroSMS extends Mensajero {
    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println("Enviando SMS a: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
    }
}
