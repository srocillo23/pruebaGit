package AnimalesSonido;

public class Animal implements Sonido{

	public String nombre;
	public int numeroPatas;
	public boolean tienePelo;

	public Animal(int numeroPatas, boolean tienePelo) {

		this.numeroPatas = numeroPatas;
		this.tienePelo = tienePelo;

	}

	@Override
	public void hacerSonido() {
	}


}
