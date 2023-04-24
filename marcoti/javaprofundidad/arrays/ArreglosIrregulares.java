package marcoti.javaprofundidad.arrays;

public class ArreglosIrregulares {

	
	public static void main(String[] args) {
		int arreglo [][]=new int [4][];
		arreglo[0]=new int [1];
		arreglo[0][0]=10;
		
		arreglo[1]=new int [2];
		arreglo[1][0]=10;
		arreglo[1][1]=20;
		
		arreglo[2]=new int [3];
		arreglo[2][0]=30;
		arreglo[2][1]=40;
		arreglo[2][2]=50;
		
		arreglo[3]=new int [2];
		arreglo[3][0]=50;
		arreglo[3][1]=50;
		
		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < arreglo.length; j++) {
				System.out.print(arreglo[i][j]+"\t");
			}
			System.out.println();
		}
						
	}
}
