package myThreads;

class MarcoThreads extends Thread {
	public MarcoThreads(String name) {
		super(name);
	}

	@Override
	public void run() {
	for (int i = 0; i < 100; i++) {
		System.out.println(getName()+"Hola Mundo "+ i);
	}
		
	}

}

public class HaciendoHilos {
	public static void main(String[] args) {
MarcoThreads threads1 = new MarcoThreads("Soy el Hilo 1   ");
MarcoThreads threads2 = new MarcoThreads("Soy el Hilo 2   ");
threads1.start();
threads2.start();
	}
}
