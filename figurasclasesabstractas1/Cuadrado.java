package figurasclasesabstractas1;

public class Cuadrado extends Figura {
	private double lado;

	public Cuadrado(String color,double lado) {
		super();
		this.color=color;
		this.lado = lado;
	}
	

	@Override
	public double calcularArea() {
		return lado*lado;
	}







}
