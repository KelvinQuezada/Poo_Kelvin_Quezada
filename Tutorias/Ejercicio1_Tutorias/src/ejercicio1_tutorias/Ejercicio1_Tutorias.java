/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1_tutorias;

import java.util.Scanner;

/**
 *
 * @author antho
 */
public class Ejercicio1_Tutorias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int numero1 = leer.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int numero2 = leer.nextInt();
        if (numero1 > numero2) {
            System.out.println("El primer numero (" + numero1 + ") es mayor que el segundo numero (" + numero2 + ")");
            System.out.println("El segundo numero (" + numero2 + ") es menor que el primer numero (" + numero1 + ")");
        } else if (numero1 < numero2) {
            System.out.println("El segundo numero (" + numero2 + ") es mayor que el primer numero (" + numero1 + ")");
            System.out.println("El primer numero (" + numero1 + ") es menor que el segundo numero (" + numero2 + ")");
        }
    }
    
}
