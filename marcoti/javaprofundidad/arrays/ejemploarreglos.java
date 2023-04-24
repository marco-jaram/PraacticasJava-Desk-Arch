package marcoti.javaprofundidad.arrays;
public class ejemploarreglos {
	public static void main(String[] args) {
		int array[] = new int[5];
		array[0] = 25;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		System.out.println("Imprimiendo normalito a mano jijij");
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		
		System.out.println("Ahora con un FOR: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("Ahora con un WHILE: ");

		int i=0;
		while (i<array.length) {
			System.out.println(array[i]);
			i++;
		}
		System.out.println("Ahora (poniendo fore) con un FOR ECH: ");
		for (int temp: array) {
			System.out.println(temp);
		}

		
	}
}
