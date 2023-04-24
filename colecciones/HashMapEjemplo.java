package colecciones;

import java.util.HashMap;
import java.util.Map;

public class HashMapEjemplo {
	public static void main(String[] args) {
		
		Map<String, String> diccionario=new HashMap<>();
		diccionario.put("Manchitas", "Perro de Marco");
		diccionario.put("Cristi", "Perra de Paco");
		diccionario.put("Chato", "Perro de Lucha");
		
		System.out.println(diccionario);
		
		
	}
	

}
