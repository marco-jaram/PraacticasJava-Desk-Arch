package colecciones;

import java.util.LinkedList;
import java.util.ListIterator;


public class EjemploLinkedList {

	public static void main(String[] args) {
		// los linkedist

		LinkedList<String> paises = new LinkedList<String>();
		paises.add("Espania");
		paises.add("Colombia");
		paises.add("Mexico");
		paises.add("Peru");

		LinkedList<String> capitales = new LinkedList<String>();
		capitales.add("Madrid");
		capitales.add("Bogota");
		capitales.add("Edo Mexico");
		capitales.add("Lima");
		
		System.out.println(paises);
		System.out.println(capitales);
		
//		agregando las capitales a los paises (juntando)
		ListIterator<String> iterA=paises.listIterator();
		ListIterator<String> iterB=capitales.listIterator();
		while (iterB.hasNext()) {
			if (iterA.hasNext()) {
				iterA.next();
				
			}
			iterA.add(iterB.next());
		}
		System.out.println(paises);
		

	}

}
