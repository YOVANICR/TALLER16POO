/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller16ejemplos.Incorrectos;

/**
 *
 * @author yoven
 */
// Este es un ejemplo donde se viola el principio OCP
// Cada vez que quiero agregar un nuevo metodo de pago, tengo que modificar esta clase
public class ProcesadorPagoIncorrecto {
    public void realizarPago(String metodo, double monto) {
        if (metodo.equals("TarjetaCredito")) {
            System.out.println("Procesando pago con tarjeta de credito: $" + monto);
        } else if (metodo.equals("PayPal")) {
            System.out.println("Procesando pago con PayPal: $" + monto);
        }
        // Si quiero agregar Bitcoin, tendria que modificar este codigo
    }
}
