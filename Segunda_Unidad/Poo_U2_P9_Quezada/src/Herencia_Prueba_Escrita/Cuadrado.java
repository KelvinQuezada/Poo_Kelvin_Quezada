/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia_Prueba_Escrita;

/**
 *
 * @author antho
 */
public class Cuadrado {
    //atributo
    private double a;
    //constructor
    public Cuadrado(double a) {
        this.a = a;
    }
// daremos a conocer 
    public double calcularArea() {
        return a * a;
    }

    public double calcularPendiente() {
        return 4 * a;
    }
}
