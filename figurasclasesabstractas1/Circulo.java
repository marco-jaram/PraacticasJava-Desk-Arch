package figurasclasesabstractas1;

import figurasinterfaces.Dibujable;

/*
 * Otras clases que no sean figuras que yo las pueda dibujar
 *
  */
 
public class Circulo extends Figura implements Dibujable{
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
@Override
	public void dibujar() {
System.out.println("Dibujando un circulo");
	}
}
