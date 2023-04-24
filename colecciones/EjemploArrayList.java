package colecciones;

import java.util.ArrayList;

public class EjemploArrayList {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<>();
		array.add("Manchitas");
		array.add("Guero");
		array.add("Mia");
		array.add("Chato");
		
		System.out.println(array);

		System.out.println(array.size());
// tiene una capacidad e 10  cuando agrego un elemento en posicion intermedia
//		se hace un cagadero de redimensiones es ineficientes
		
	}
}
