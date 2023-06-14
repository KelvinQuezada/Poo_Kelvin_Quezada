
package Herencia_Prueba_Escrita;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
       //utilizamos el Scanner para el ingreso de datos
        Scanner leer = new Scanner(System.in);
        
        System.out.println("-------:");
        //utilizamos el double para almacenar numeros decimales de la variable (a) donde daremos a conocer el ingreso de datos donde llamaremos el nextDouble donde almacena numeros enteros 
        System.out.println("Ingrese el valor de a:");
        double a = leer.nextDouble();
        //llamaremos el calculo de de la Area (a)
        double area = calcularArea(a);
        //llamamos el calculo de la pendiente de de la area donde se realizo la operacion de 4*a
        double pendiente = calcularPendiente(a);
        
        System.out.println("El Area del cuadrado es: " + area);
        System.out.println("La pendiente es: " + pendiente);
    }
    //realizamos la operacion de a*a donde realizara la operacion de la area 
    public static double calcularArea(double a) {
        return a * a;
    }
    //realizaremos el calculo de la pendiente donde la se multiplicara el valos de 4 por la area 
    public static double calcularPendiente(double a) {
        return 4 * a;
    }
    
}
