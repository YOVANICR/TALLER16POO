/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller16ejemplos.Correctos;

/**
 *
 * @author yoven
 */
// Esta clase es como un intermediario que usa polimorfismo para manejar diferentes tipos de pago
// En lugar de preocuparse por los detalles de cada metodo, simplemente llama al metodo procesarPago
public class ProcesadorPago {
    public void realizarPago(Pago metodoPago, double monto) {
        // Aqui llamo al metodo de la clase especifica sin modificar este codigo
        metodoPago.procesarPago(monto);
    }
}
