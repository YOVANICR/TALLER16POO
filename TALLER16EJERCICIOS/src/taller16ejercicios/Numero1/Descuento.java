/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller16ejercicios.Numero1;

/**
 *
 * @author yoven
 */
// Aqui defino la clase base Descuento para manejar descuentos por porcentaje
public abstract class Descuento {
    // Este metodo sera implementado por las clases hijas para calcular el descuento
    public abstract double calcularDescuento(double precio);
}
