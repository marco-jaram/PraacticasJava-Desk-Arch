package WraperEjemplo1;

public class EnvolventeWraper {
	public static void main(String[] args) {
int x=10;
System.out.println(x);
// Pero x no se le puende poner metodos ni nada
Integer x1=20;
System.out.println(x1+" asi ya tengo metodos mi chavo");
//aqui si podemos usar metodos solo se pone x1 y el punto 
x1.floatValue();
System.out.println(x1.floatValue());
String x1SrString = x1.toString();
System.out.println(x1SrString + " parece que soy numero pero me convirtieron a string jijij");

	}
}
