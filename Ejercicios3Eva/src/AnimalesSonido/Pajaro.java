package AnimalesSonido;

public class Pajaro extends Animal implements Sonido{

	public Pajaro(int numeroPatas, boolean tienePelo) {
		super(numeroPatas, tienePelo);

	}

	public void hacerSonido() {
		System.out.println("Piopio");
	}
}
