/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3_tutorias;

import java.util.Scanner;

/**
 *
 * @author antho
 */
public class Ejercicio3_Tutorias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int cantidadNotas = 5;
        int notaMaxima = 0;
        int notaMinima = 20;
        int notaReprobacion = 13;
        int nota;

        for (int i = 1; i <= cantidadNotas; i++) {
            System.out.print("Ingrese la nota del estudiante " + i + ": ");
            nota = sc.nextInt();

            if (nota > notaMaxima) {
                notaMaxima = nota;
            }

            if (nota < notaMinima) {
                notaMinima = nota;
            }
        }

        System.out.println("La nota maxima es: " + notaMaxima);
        System.out.println("La nota minima es: " + notaMinima);

        if (notaMinima < notaReprobacion) {
            System.out.println("Hay estudiantes que han reprobado.");
        } else {
            System.out.println("Todos los estudiantes han aprobado.");
        }
    }
    
}
