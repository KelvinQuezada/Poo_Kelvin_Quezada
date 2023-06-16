
package Herencia_de_Figuras;

import java.util.Scanner;

/**
 *
 * @author antho
 */
public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void calcularArea() {
        double area = base * altura;
        System.out.println("El area del rectangulo es: " + area);
    }

    public void calcularPerimetro() {
        double perimetro = 2 * (base + altura);
        System.out.println("El perimetro del rectangulo es: " + perimetro);
    }

    public static void menuRectangulo(Scanner leer) {
        System.out.print("Ingrese la cantidad de rectangulos a realizar: ");
        int cantidadRectangulos = leer.nextInt();

        Rectangulo[] rectangulos = new Rectangulo[cantidadRectangulos];

        for (int i = 0; i < cantidadRectangulos; i++) {
            System.out.print("Ingrese la base del rectangulo " + (i + 1) + ": ");
            double base = leer.nextDouble();

            System.out.print("Ingrese la altura del rectangulo " + (i + 1) + ": ");
            double altura = leer.nextDouble();

            rectangulos[i] = new Rectangulo(base, altura);
            rectangulos[i].calcularArea();
            rectangulos[i].calcularPerimetro();
        }
    }
}

