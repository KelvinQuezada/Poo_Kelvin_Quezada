/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_tutorias;

import java.util.Scanner;

/**
 *
 * @author antho
 */
public class Ejercicio_2_Tutorias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner numero=new Scanner(System.in);
        //ingreso los atributos de numeros enteros
        String nombre;
        int n1,n2,n3;
        System.out.println("Ingrese el nombre: ");
        nombre = numero.nextLine();
        System.out.println("Ingrese el numero uno: ");
        n1 = numero.nextInt();
        System.out.println("ingrese el segundo numero: ");
        n2=numero.nextInt();
        System.out.println("ingrese el tercer numero: ");
        n3=numero.nextInt();    
        
        int mayor = n1;
        int menor = n1;

        // Verificar si num2 es mayor que el número actualmente considerado como mayor
        if (n2 > mayor) {
            mayor = n2;
        }
        // Verificar si num2 es menor que el número actualmente considerado como menor
        if (n2 < menor) {
            menor = n2;
        }
        // Verificar si num3 es mayor que el número actualmente considerado como mayor
        if (n3 > mayor) {
            mayor = n3;
        }
        // Verificar si num3 es menor que el número actualmente considerado como menor
        if (n3 < menor) {
            menor = n3;
        }
        System.out.println("El nombre es: " + nombre);
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
    }
}