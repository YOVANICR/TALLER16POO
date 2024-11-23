/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller16ejemplos.Correctos;

/**
 *
 * @author yoven
 */
// Esta clase representa un pago con PayPal
// Igual que TarjetaCredito, hereda de Pago pero procesa el pago de manera diferente
public class PayPal extends Pago {
    @Override
    public void procesarPago(double monto) {
        // Aqui simulo el procesamiento del pago con PayPal
        System.out.println("Procesando pago con PayPal: $" + monto);
    }
}
