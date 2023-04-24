package conversiones;

class Perro {
	private String nombre;

	public Perro(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}

public class Operadorequals {
	public static void main(String[] args) {
Perro p1 =new Perro("Manchitas");
Perro p2 = new Perro("Luca");
System.out.println(p1==p2);
//	aunque tenga el mismo nombre sale flase entre 1 y 2	
Perro p3 = new Perro("Manchitas");
Perro p4 = new Perro("Manchitas");
System.out.println(p3.equals(p4));
		
	}
}
