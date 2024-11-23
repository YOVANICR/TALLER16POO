/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller16ejemplos.Correctos;

/**
 *
 * @author yoven
 */
// En esta clase pruebo todo el sistema de pago
// Verifico que puedo agregar nuevos metodos de pago sin modificar el ProcesadorPago
public class PruebaPago {
    public static void main(String[] args) {
        // Creo una instancia del procesador
        ProcesadorPago procesador = new ProcesadorPago();

        // Pruebo con pago con tarjeta de credito
        Pago tarjeta = new TarjetaCredito();
        procesador.realizarPago(tarjeta, 100.50);

        // Pruebo con pago con PayPal
        Pago paypal = new PayPal();
        procesador.realizarPago(paypal, 250.75);
    }
}
