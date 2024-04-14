package ArrayAlumnos;
import java.util.Comparator;

public class Alumno implements Comparable<Alumno>{

	//Atribs
	private String nombre;
	private int edad;

	//Setters y getters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	//Constructor
	public Alumno(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	//COMPARATTOR de EDAD

	@Override
	public int compareTo(Alumno ComparaEdades) {

		if (this.getEdad()>ComparaEdades.getEdad()) {

			return 1;
		}else if (this.getEdad()<ComparaEdades.getEdad()) {
			return -1;
		}else {
			return 0;
		}
	}

	//Comparator para posibles futuras opciones

	public static Comparator<Alumno> comparadorPorNombre = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno alumno1, Alumno alumno2) {
            return alumno1.getNombre().compareTo(alumno2.getNombre());
        }
    };
	

}
