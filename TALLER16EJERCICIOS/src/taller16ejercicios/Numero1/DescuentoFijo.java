/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller16ejercicios.Numero1;

/**
 *
 * @author yoven
 */
// Esta clase maneja descuentos fijos y tambien extiende la clase base Descuento
public class DescuentoFijo extends Descuento {
    private double montoFijo;

    public DescuentoFijo(double montoFijo) {
        this.montoFijo = montoFijo; // Aqui guardo el monto fijo que voy a usar
    }

    @Override
    public double calcularDescuento(double precio) {
        // Si el descuento fijo es mayor al precio, lo limito al precio total
        return Math.min(montoFijo, precio);
    }
}
