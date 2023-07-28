package superHeroes;
import java.util.Scanner;
public class superMan extends SuperHeroes{
	private double velocidad ;
	private boolean visionLacer;

	public superMan(String nombre, int edad, double estatura, double velocidad, boolean visionLacer) {
		super(nombre, edad, estatura);
		this.velocidad = velocidad;
		this.visionLacer = visionLacer;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public boolean isVisionLacer() {
		return visionLacer;
	}

	public void setVisionLacer(boolean visionLacer) {
		this.visionLacer = visionLacer;
	}
	
	public void mostrarInformacion() {
		System.out.println("VISION LACER: "+visionLacer);
		System.out.println("VELOCIDAD: "+velocidad);

		
	}

	public void visionLacerInformacion() {
		if(visionLacer) {
			visionLacer=true;
			System.out.println("ES SUPERMAS TIENE VISION LACER");
		}else {
			visionLacer=false;
			System.out.println("ES SUPERMAS TIENE VISION LACER");
		}
	}
	
	@Override
	public void abilidades() {
		Scanner leer= new Scanner(System.in);
		System.out.println("ingrese cuntas velocidades incremento");
		double velocidad;
			System.out.println("tiene una velocidad de "+getVelocidad());
		
	}

}
