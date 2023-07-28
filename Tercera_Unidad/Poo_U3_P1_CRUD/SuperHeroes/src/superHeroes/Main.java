package superHeroes;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner leer=new Scanner(System.in);
		int opcion;
		
		do {
		System.out.println("1. Superman");
		System.out.println("2. Spiderman");
		System.out.println("3. Ben 10");
		opcion=leer.nextInt();
		switch (opcion) {
		case 1: 
			System.out.println("Ingrese el nombre");
			String nombre=leer.next();
			System.out.println("ingrese la edad");
			int edad=leer.nextInt();
			System.out.println("Ingrese la estatura");
			double estatura=leer.nextDouble();
			System.out.println("ingrese la velocidad");
			double velocidad =leer.nextDouble();
			System.out.println("Tiene vision laser (true/false)");
			boolean visionLaser=leer.nextBoolean();
			superMan superman = new superMan(nombre, edad, estatura, velocidad, visionLaser);
			
			System.out.println("Informacion de Super Man");
			System.out.println("Nombre: "+superman.getNombre());
			System.out.println("Edad: "+superman.getEdad());
			System.out.println("Estatura: "+superman.getEstatura());
			superman.abilidades();
			superman.visionLacerInformacion();
			superman.mostrarInformacion();
			
			break;
		case 2:
			System.out.println("Ingrese el nombre");
			String nombre2=leer.next();
			System.out.println("ingrese la edad");
			int edad2=leer.nextInt();
			System.out.println("Ingrese la estatura");
			double estatura3=leer.nextDouble();
			System.out.println("tiene telarañas (true/false)");
			boolean telaraña=leer.nextBoolean();
			System.out.println("ingrese la velocidad");
			int velocidadRecorrida=leer.nextInt();
		
			Spiderman spiderman = new Spiderman(nombre2, edad2, estatura3, telaraña, velocidadRecorrida);
			
			System.out.println("Informacion de Super Man");
			System.out.println("Nombre: "+spiderman.getNombre());
			System.out.println("edad: "+spiderman.getEdad());
			System.out.println("Estatura: "+spiderman.getEdad());
			System.out.println("Velocidad recorrida: "+spiderman.getVelocidadSaltos());
			spiderman.abilidades();
			spiderman.visionTelarañaInformacion();
			spiderman.mostrarInformacion();
			break;
			
		case 3:
			
			break;
		default:
			
		}
			
		}while(opcion!=4);
	}

}
