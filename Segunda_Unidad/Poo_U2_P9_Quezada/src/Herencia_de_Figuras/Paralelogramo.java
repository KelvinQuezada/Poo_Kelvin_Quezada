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
public class Paralelogramo {
    private double base;
    private double altura;

    public Paralelogramo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void calcularArea() {
        double area = base * altura;
        System.out.println("El area del paralelogramo es: " + area);
    }

    public void calcularPerimetro() {
        double perimetro = 2 * (base + altura);
        System.out.println("El perimetro del paralelogramo es: " + perimetro);
    }

    public static void menuParalelogramo(Scanner leer) {
        System.out.print("Ingrese la cantidad de paralelogramos a realizar: ");
        int cantidadParalelogramos = leer.nextInt();

        Paralelogramo[] paralelogramos = new Paralelogramo[cantidadParalelogramos];

        for (int i = 0; i < cantidadParalelogramos; i++) {
            System.out.print("Ingrese la base del paralelogramo " + (i + 1) + ": ");
            double base = leer.nextDouble();

            System.out.print("Ingrese la altura del paralelogramo " + (i + 1) + ": ");
            double altura = leer.nextDouble();

            paralelogramos[i] = new Paralelogramo(base, altura);
            paralelogramos[i].calcularArea();
            paralelogramos[i].calcularPerimetro();
        }
    }
}

