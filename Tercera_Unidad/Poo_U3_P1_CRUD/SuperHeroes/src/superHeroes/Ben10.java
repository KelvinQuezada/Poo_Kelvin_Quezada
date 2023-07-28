package superHeroes;

import java.util.Scanner;

public class Ben10 extends SuperHeroes{
	private boolean trasformaciones;
	private int habilidades;
	
	
	public Ben10(String nombre, int edad, double estatura, boolean trasformaciones, int habilidades) {
		super(nombre, edad, estatura);
		this.trasformaciones = trasformaciones;
		this.habilidades = habilidades;
	}

	public boolean isTrasformaciones() {
		return trasformaciones;
	}

	public void setTrasformaciones(boolean trasformaciones) {
		this.trasformaciones = trasformaciones;
	}

	public int getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(int habilidades) {
		this.habilidades = habilidades;
	}

	public void trasformacionBen10() {
		if(trasformaciones) {
			trasformaciones=true;
			System.out.println("BEN 10 TIENE MUCHAS TRASFORMACIONES ");
			
		}else {
			trasformaciones=false;
			System.out.println("BEN 10 NO TIENE MUCHAS TRASFORMACIONES ");
		}
	}
	//polimorfismo
	public void mostrarInformacion() {
		System.out.println("Trasformaciones: "+trasformaciones);
		System.out.println("Habilidades: "+habilidades);
	}
	
	@Override
	public void abilidades() {
		
		Scanner leer= new Scanner(System.in);
		System.out.println("ingrese cuntas velocidades incremento");
		int habilidades;
			System.out.println("tiene una velocidad de "+getHabilidades() );
			
		
	}
}
