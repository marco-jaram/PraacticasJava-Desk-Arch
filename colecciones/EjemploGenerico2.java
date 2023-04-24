package colecciones;

class Trasporte {
}

class Coche extends Trasporte {
}

class Deportivo extends Coche {
}

// definiendo que T solo erede de trasporte
// limitaremos los pbjetos que vasmoa a estar creando

class BeanGenericos2<T> extends Trasporte {
	private T valorT;

// definiendo  contructor y getters y setter
	public BeanGenericos2(T valorT) {
		super();
		this.valorT = valorT;
	}

	public T getValorT() {
		return valorT;
	}

	public void setValorT(T valorT) {
		this.valorT = valorT;
	}
}

public class EjemploGenerico2 {

	public static void main(String[] args) {
//	creando objeto del bean generico. Ya solo puedo poner objetos de tipoi transporte
//		osea que puedo usar Trasorte, ciche y deportivo por que
//		todos pasan la regle del es un (is )
		BeanGenericos2<Trasporte> bean = new BeanGenericos2<>(new Trasporte());
System.out.println(bean);
	}
}
