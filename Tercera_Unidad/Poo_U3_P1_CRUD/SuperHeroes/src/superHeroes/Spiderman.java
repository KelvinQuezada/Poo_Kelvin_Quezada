package superHeroes;

import java.util.Scanner;

public class Spiderman extends SuperHeroes {
	private boolean telaraña;
	private int velocidadSaltos;
	public Spiderman(String nombre, int edad, double estatura, boolean telaraña, int velocidadSaltos) {
		super(nombre, edad, estatura);
		this.telaraña = telaraña;
		this.velocidadSaltos = velocidadSaltos;
	}
	
	
	public boolean isTelaraña() {
		return telaraña;
	}


	public void setTelaraña(boolean telaraña) {
		this.telaraña = telaraña;
	}


	public int getVelocidadSaltos() {
		return velocidadSaltos;
	}


	public void setVelocidadSaltos(int velocidadSaltos) {
		this.velocidadSaltos = velocidadSaltos;
	}


	//polimorfismo 
	public void mostrarInformacion() {
		System.out.println("Telaraña: "+telaraña);
		System.out.println("Velocidad de Saltos: "+velocidadSaltos);

		
	}
	public void visionTelarañaInformacion() {
		if(telaraña) {
			telaraña=true;
			System.out.println("Spiderman tiene telarañas resistente");
		}else {
			telaraña=false;
			System.out.println("Spiderman no tiene telarañas resistente");
		}
	}
	
	@Override
	public void abilidades() {
		Scanner leer= new Scanner(System.in);
		System.out.println("ingrese cuntas velocidades incremento");
		int velocidadSaltos;
			System.out.println("tiene una velocidad de "+getVelocidadSaltos());
			
		
	}
	
	

}
