package conversiones;

public class MetodoConversion1 {
	public static void main(String[] args) {

		Integer x=10;
		float f=x.floatValue();
		System.out.println(f);
//convirtiendo un String a un primitivo
		String valorString= "10";
		int val= Integer.parseInt(valorString);
		System.out.println(val+ " asi es mi chavo ya soy primitivo jijij");
		
		Double valueOf = Double.valueOf("55");
		System.out.println(valueOf);
	
	
	}
}
