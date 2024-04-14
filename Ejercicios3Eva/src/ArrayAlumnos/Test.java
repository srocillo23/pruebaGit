package ArrayAlumnos;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	
  public static void main(String[] args) {
  
	//Generar alumnos y sus edades  
	  
    Alumno a1= new Alumno ("Pedro",23);
    Alumno a2= new Alumno ("Juan",24);
    Alumno a3= new Alumno ("Marcos",27);
    Alumno a4= new Alumno ("Daniel",19);
    
    ArrayList<Alumno> lista= new ArrayList<Alumno>();
    
    lista.add(a1);
    lista.add(a2);
    lista.add(a3);
    lista.add(a4);
    
    Collections.sort(lista);
    
    //Imprimir por pantalla
    
    System.out.println("Alumnos ordenados por edad: ");
    System.out.println("----------------------------");
    
    for (Alumno p :lista) {
      System.out.print(p.getNombre()+ " ");
      System.out.println(p.getEdad());
      System.out.println("");
      
    }
    
  }
}
