package AnimalesSonido;

public class Test {

	public class Main {
		
	    public static void main(String[] args) {
	    	
	        Perro p1 = new Perro(4, true);
	        Gato g1 = new Gato(4, true);
	        Pajaro pj1 = new Pajaro(2, false);

			p1.hacerSonido();
			System.out.println("");  
			g1.hacerSonido();
			System.out.println("");
			pj1.hacerSonido();

		}
	}
}