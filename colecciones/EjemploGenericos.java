package colecciones;


class BeanGenericos <T>{
	private T valorT;
// definiendo  contructor y getters y setter
	public BeanGenericos(T valorT) {
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
public class EjemploGenericos {
	
public static void main(String[] args) {
//	creando objeto del bean generico
	BeanGenericos <String> bean = new BeanGenericos<>("Marco");
	System.out.println(bean.getValorT());
	bean.setValorT("PEPE");
	System.out.println(bean.getValorT());
	
	
	
	
}
}
