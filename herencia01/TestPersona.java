package herencia01;

public class TestPersona {
	public static void main(String[] args) {
		Estudiante est1 = new Estudiante("Marco", 274838, "Dicembre 9");
		est1.aprobar();
		est1.reprobar();
		est1.matricula();
		est1.nacimiento();
		Empleado emp1 = new Empleado("Duelce", 8000);
		emp1.cobrar();
		emp1.trabajo();
		
	}
	
}
