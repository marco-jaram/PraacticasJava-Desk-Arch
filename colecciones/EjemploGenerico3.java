package colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// creando un metodo que sume valores y recibir  una lista

public class EjemploGenerico3 {
	static double sumarValores(List<Double> Valores) {
		double suma = 0;

		for (Double valor : Valores) {
			suma += valor;
		}

		return suma;
	}	

	public static void main(String[] args) {
double sumarValores = sumarValores(Arrays.asList(10.45,11.45,3.10));
		System.out.println("Suma "+sumarValores);
		ArrayList<Integer> array=new ArrayList<Integer>();
		array.add(1);
		System.out.println(array);
		

		
	}

}
