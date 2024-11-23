/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller16ejemplos.Correctos;

/**
 *
 * @author yoven
 */
// Esta clase representa un pago con tarjeta de credito
// Hereda de la clase Pago y define su propia manera de procesar el pago
public class TarjetaCredito extends Pago {
    @Override
    public void procesarPago(double monto) {
        // Aqui simplemente estoy simulando el procesamiento del pago con tarjeta
        System.out.println("Procesando pago con tarjeta de credito: $" + monto);
    }
}
