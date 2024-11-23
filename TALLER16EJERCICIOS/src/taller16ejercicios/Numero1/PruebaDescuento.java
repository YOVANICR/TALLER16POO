/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller16ejercicios.Numero1;

/**
 *
 * @author yoven
 */
// Aqui pruebo los descuentos para verificar que se aplican correctamente
public class PruebaDescuento {
    public static void main(String[] args) {
        // Creo un descuento por porcentaje del 20%
        Descuento descuentoPorcentaje = new DescuentoPorcentaje(20);
        double precio = 100;
        System.out.println("Descuento por porcentaje: " + descuentoPorcentaje.calcularDescuento(precio));

        // Creo un descuento fijo de 15
        Descuento descuentoFijo = new DescuentoFijo(15);
        System.out.println("Descuento fijo: " + descuentoFijo.calcularDescuento(precio));
    }
}
