/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller16ejemplos.Correctos;

/**
 *
 * @author yoven
 */
// Aqui cree una clase abstracta llamada Pago que sirve como base para diferentes tipos de pago
// Lo que hago es definir un metodo abstracto que todas las clases hijas deben implementar
public abstract class Pago {
    public abstract void procesarPago(double monto); // Este metodo se encargara de procesar el pago segun el tipo
}

