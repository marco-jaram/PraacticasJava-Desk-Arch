package herencia01;

public class Estudiante extends Persona {
	int numeroMatricula;

	public Estudiante(String nombre ,int numeroMatricula, String fechaNacimiento) {
		super();
		this. nombre=nombre;
		this.numeroMatricula = numeroMatricula;
		this.fechaNacimiento= fechaNacimiento;
	}
@Override
void nacimiento() {
	System.out.println("Mi nombre es "+nombre+ " soy estudiante "+" y  naci "+fechaNacimiento);
}
	void aprobar() {
		System.out.println("Mi nombre es " + nombre + " y  aprobe el examen");
	}

	void reprobar() {
		System.out.println("Mi nombre es " + nombre + " y reprobe el examen");
	}

	void matricula() {
		System.out.println("mi nombre es " + nombre + " , soy estudiante y mi matricula es " + numeroMatricula);
	}

	
}
