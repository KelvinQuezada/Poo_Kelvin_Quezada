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
public class Triangulo {
    //Atributos privados de la clase Triangulo
    private double base;
    private double altura;
//constructor de la clase de los atributos
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
//realisaremos un public void ya que no retorna nada pero almacena informacion 
    //donde realizaremos la operacion de la area= donde base se multiplica por la altura y se divide para dos y tendremos el resultado de la rea
    public void calcularArea() {
        double area = base * altura / 2;
        System.out.println("El area del triangulo es: " + area);
    }

    public void calcularPerimetro() {
        // En este ejemplo, se asume que se ingresan los tres lados del triángulo.
        // Si se desea calcular el perímetro a partir de la base y la altura, se debe conocer el tercer lado.
        // Aquí se asume que se ingresan los tres lados del triángulo.
        System.out.print("Ingrese el primer lado del triangulo: ");
        double lado1 = new Scanner(System.in).nextDouble();

        System.out.print("Ingrese el segundo lado del triangulo: ");
        double lado2 = new Scanner(System.in).nextDouble();

        double perimetro = base + lado1 + lado2;
        System.out.println("El perimetro del triangulo es: " + perimetro);
    }

    public static void menuTriangulo(Scanner leer) {
        //cremos una variable llamada cantidadTriangulos para ingresar los valores despues 
        //llamaremos a la clase Triangulo donde le piremos que seba a realizar por arreglos donde el Triangulo sera la cantida del valor que va a ingresar
        System.out.print("Ingrese la cantidad de triangulos a realizar: ");
        int cantidadTriangulos = leer.nextInt();
        
        Triangulo[] triangulos = new Triangulo[cantidadTriangulos];

        for (int i = 0; i < cantidadTriangulos; i++) {
            System.out.print("Ingrese la base del triangulo " + (i + 1) + ": ");
            double base = leer.nextDouble();

            System.out.print("Ingrese la altura del triangulo " + (i + 1) + ": ");
            double altura = leer.nextDouble();
            
            triangulos[i] = new Triangulo(base, altura);
            triangulos[i].calcularArea();
            triangulos[i].calcularPerimetro();
        }
    }
}

