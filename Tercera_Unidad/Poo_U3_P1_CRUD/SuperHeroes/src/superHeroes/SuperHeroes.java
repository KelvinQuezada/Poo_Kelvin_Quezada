package superHeroes;

public abstract class SuperHeroes {
	private String nombre;
	private int edad;
	private double estatura;
	public SuperHeroes(String nombre, int edad, double estatura) {
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	//polimorfismo
	public void mostrarInformacion() {
		System.out.println("NOMBRE: "+nombre);
		System.out.println("EDAD: "+edad);
		System.out.println("ESTATURA: "+estatura);
		
	}
	//cramos un metodo abstracto
	public abstract void abilidades();
	

}
