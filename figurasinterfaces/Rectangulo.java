package figurasinterfaces;

public  class Rectangulo extends Figura {
	private double base;
	private double altura;

	/**
	 * @param base
	 * @param altura
	 */
	public Rectangulo(String color, double base, double altura) {
		super();
		this.color = color;
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return base * altura;
	}

}
