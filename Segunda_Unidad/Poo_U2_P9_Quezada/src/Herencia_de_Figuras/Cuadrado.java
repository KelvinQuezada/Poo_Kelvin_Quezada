/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia_de_Figuras;

import java.util.Scanner;

/**
 *
 * @author antho
 */
public class Cuadrado {

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public void calcularArea() {
        double area = Math.pow(lado, 2);
        System.out.println("El area del cuadrado es: " + area);
    }

    public void calcularPerimetro() {
        double perimetro = 4 * lado;
        System.out.println("El perimetro del cuadrado es: " + perimetro);
    }

    public static void menuCuadrado(Scanner leer) {
        System.out.print("Ingrese la cantidad de cuadrados a realizar: ");
        int cantidadCuadrados = leer.nextInt();
        Cuadrado[] cuadrados = new Cuadrado[cantidadCuadrados];

        for (int i = 0; i < cantidadCuadrados; i++) {
            System.out.print("Ingrese el lado del cuadrado " + (i + 1) + ": ");
            double lado = leer.nextDouble();
            cuadrados[i] = new Cuadrado(lado);
            cuadrados[i].calcularArea();
            cuadrados[i].calcularPerimetro();
        }
    }
}
