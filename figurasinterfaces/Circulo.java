package figurasinterfaces;

public class Circulo extends Figura {
	double radio;

	/**
	 * @param radio
	 */
	public Circulo(String color, double radio) {
		super();
		this.color = color;
		this.radio = radio;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return super.getColor();
	}

	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub
		super.setColor(color);
	}

	@Override
	public double calcularArea() {

		return Math.PI * Math.pow(radio, 2);
	}

}
