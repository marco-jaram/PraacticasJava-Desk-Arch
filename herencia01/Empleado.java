package herencia01;

public class Empleado extends Persona {
	float sueldo;

	

	public Empleado(String nombre,float sueldo) {
		super();
		this.nombre = nombre;
		this.sueldo=sueldo;
	}

	void trabajo() {
		System.out.println("Mi nombre es " + nombre + " y soy un trabajador");
	}

	void cobrar() {
		System.out.println(" Mi nombre es " + nombre + " y cobro " + sueldo + " cada semana");
	}
	
}
