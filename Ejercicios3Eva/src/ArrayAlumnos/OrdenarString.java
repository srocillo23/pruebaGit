package ArrayAlumnos;

import java.util.Arrays;

//Prueba para ordenar un array de Stringss

public class OrdenarString {
	
    public static void main(String[] args) {
    	
        // Arrasys, prueba, uno nombres y ootro edades
        String[] nombres = {"Sergio", "Pedro", "Marcos", "Alex", "Carlos"};
 

        //Ordena
        Arrays.sort(nombres);

        // Imprimir el array ordenado
        System.out.println("Array ordenado:");
        for (String nombreOrd : nombres) {
            System.out.println(nombreOrd);
            
        }
    }
}
