/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Herencia_2;


public class Poo_U2_P8_Quezada {

    public static void main(String[] args) {
        //instanciamos el nombre de la clase principal
    Persona persona = new Persona("Juan");
        System.out.println("Nombre de la persona: " + persona.getNombre());
        //instanciamos el nombre de la clase hija llamada deportista
        Deportista deportista = new Deportista("Maria", "Futbol");
        //imprimimos los nombres del deportista
        System.out.println("Nombre del deportista: " + deportista.getNombre());
        System.out.println("Deporte del deportista: " + deportista.getDeporte());
        deportista.setNombre("Luisa");
        deportista.setDeporte("Tenis");
        System.out.println("Nombre del deportista modificado: " + deportista.getNombre());
        System.out.println("Deporte del deportista modificado: " + deportista.getDeporte());
    }
}