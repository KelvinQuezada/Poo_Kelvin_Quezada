/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica_Herencia;


public class Vehiculo {
    //atributos
    String Placa;
    int numRueda;
    boolean encendido;
    String estado;
   //creamos los metodos set 
public void setNumeroRuedas(int rueda){
    numRueda=rueda;
}
//creamos los pubic void de la clase encendido donde le diremos que si el vehiculo esta encendido sea tru
public void encendido(){
    encendido=true;
    estado="Vehiculo encendido";
}
//creamos los pubic void de la clase apagado donde le diremos que si el vehiculo esta apagado sea false 
public void apagado(){
    encendido=false;
    estado="Vehiclo apagado";
}

}

