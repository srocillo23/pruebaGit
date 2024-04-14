package AnimalesSonido;

public class Gato extends Animal implements Sonido{
	
	public Gato(int numeroPatas, boolean tienePelo) {
		super(numeroPatas, tienePelo);
	}

	public void hacerSonido() {
		System.out.println("Miau");
	}
}