
package Practica_Herencia;


public class Menu_Principal {

    public static void main(String[] args) {
        //instanciamos llamamos
        Automovil automo=new Automovil();
        Vehiculo vehiculo=new Vehiculo();
        Motocicleta motocicleta=new Motocicleta();
        
        //llamamos a los metodos 
        automo.encendido();
        vehiculo.apagado();
        motocicleta.encendido();
        System.out.println("Damos a conocetr el encendido: "+automo.estado);
        System.out.println("Damos a conocetr el encendido: "+vehiculo.estado);
        System.out.println("Damos a conocetr el encendido: "+motocicleta.estado);
        
        
        
    }
    
}
