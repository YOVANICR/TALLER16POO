/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller16ejercicios.Numero1;

/**
 *
 * @author yoven
 */
// Esta clase maneja descuentos en porcentaje y extiende la clase base Descuento
public class DescuentoPorcentaje extends Descuento {
    private double porcentaje;

    public DescuentoPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje; // Aqui guardo el porcentaje que voy a usar para calcular
    }

    @Override
    public double calcularDescuento(double precio) {
        // Devuelvo el monto que corresponde al porcentaje del precio
        return precio * (porcentaje / 100);
    }
}
