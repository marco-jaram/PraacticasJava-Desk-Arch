package figurasclasesabstractas1;

public abstract class Figura {
	String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	

// metodo sin cuerpo tengo que agregar palabra abstrac
	public abstract double calcularArea();
	

}
