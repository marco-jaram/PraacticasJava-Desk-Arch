package colecciones;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// todos los metodos de collections son estaticos
public class EjemploCollections {
	public static void main(String[] args) {
List<String> nombres= new ArrayList <>();
nombres.add("D Manchitas");
nombres.add("C Mia");
nombres.add("B Chato");	
nombres.add("A Cristi");
Collections.sort(nombres);
		System.out.println(nombres);
		int index = Collections.binarySearch(nombres, "D Manchitas");
		System.out.println(nombres.get(index));
		
		
	}

}
