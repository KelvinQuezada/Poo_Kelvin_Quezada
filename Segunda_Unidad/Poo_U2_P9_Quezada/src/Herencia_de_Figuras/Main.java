/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Herencia_de_Figuras;

/**
 *
 * @author antho
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Cuadrado");
            System.out.println("2. Triangulo");
            System.out.println("3. Rectangulo");
            System.out.println("4. Paralelogramo");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    Cuadrado.menuCuadrado(leer);
                    break;
                case 2:
                    Triangulo.menuTriangulo(leer);
                    break;
                case 3:
                    Rectangulo.menuRectangulo(leer);
                    break;
                case 4:
                    Paralelogramo.menuParalelogramo(leer);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida. Intente nuevamente.");
                    break;
            }

            System.out.println();
        } while (opcion != 5);
    }
}
