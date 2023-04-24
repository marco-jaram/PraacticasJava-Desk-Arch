package POO;


	
	public class ContructoresPersona {

        //Atributos
        String nombre;
        int edad;
        char genero;
      // Definiendo un constructor
        
    ContructoresPersona(){
        System.out.println("Definiendo contructor jiji");
    }
    
    
public ContructoresPersona(String nombre, int edad, char genero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}


        //Metodo
        void jugar( ContructoresPersona p){
            System.out.println(nombre + " esta con "+ p.nombre);
        }

        void imprimirInformacion() {
            System.out.println("nombre = " + nombre);
            System.out.println("edad = " + edad);
            System.out.println("genero = " + genero);
        }

        public static void main(String[] args) {
            //nombre de clase y un identificador

           ContructoresPersona p = new ContructoresPersona("Marco", 46, 'M');
            p.imprimirInformacion();
            ContructoresPersona p1 = new ContructoresPersona("Dulce", 29, 'F');
            p1.imprimirInformacion();

            p.jugar(p1);

        }
    }

	


