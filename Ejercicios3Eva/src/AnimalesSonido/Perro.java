package AnimalesSonido;

public class Perro extends Animal implements Sonido{
	
	public Perro(int numeroPatas, boolean tienePelo) {
		super(numeroPatas, tienePelo);
	}

		public void hacerSonido() {
	        System.out.println("Guau guau");
	    }
	
}