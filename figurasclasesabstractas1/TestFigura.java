package figurasclasesabstractas1;

import figurasinterfaces.Dibujable;
import figurasinterfaces.Imagen;

public class TestFigura {
	/*
	 * Aqui esta el uso del polimorfismo por que no le importa el tipo de objeto que
	 * llegue por que sabe que si o si es una figura y tiene color y area ya
	 * calculada y asinadas en los metodo de cada clase Debo saber que metodos vana
	 * a ir en la clase padre Figura por que luego si creo un nuevo metodo en la
	 * case hija no va a funcionar getColor es para obtener el color set es para
	 * asignar un color CLASE ABSTRACTA Ddebe ser implementada por hijas si tengo un
	 * metodo en padrees obligatorio implementarlo en hijas
	
	 */
	private void imprimirArea(Figura figura) {
		System.out.println(
				"El color de la figura es " + figura.getColor() + " y tiene un area de " + figura.calcularArea());

	}
	
/*
 LAS INTERFACES me sirven para definir comportamientos sin que exista una
	 * relacion de herencia. Entonces con la interfaz pudeo implementar en multiples
	 * clases, como si fuera miltiherenica
 
 */
	void probarDibujar(Dibujable dibujable) {
		dibujable.dibujar();
	}

	public static void main(String[] args) {
		TestFigura p = new TestFigura();
		p.imprimirArea(new Circulo("Rojo", 10));
		p.imprimirArea(new Cuadrado("Verde", 125.2));
		p.probarDibujar(new Rectangulo("Azul", 10, 20));
		p.probarDibujar(new Imagen());
	}
}
