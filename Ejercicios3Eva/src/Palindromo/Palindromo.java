package Palindromo;

import java.util.Scanner;

public class Palindromo {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe una palabra o frase para ver si es palíndromaan:");
        
        String sc = scanner.nextLine();

        if (esPalindromo(sc)) {
        	
            System.out.println("Es un palíndromo.");
        } else {
            System.out.println("No es un palíndromo.");
        }

        scanner.close();
    }

    // Metodo espalindromo
    
    private static boolean esPalindromo(String str) {
    
        // Eliminar espacios y pasar a minusculas
    	
        String cadenaLimpia = str.replaceAll("\\s", "").toLowerCase();
        

        // Comparamos con equals si las cadenas son las mismas
        
        return cadenaLimpia.equals(new StringBuilder(cadenaLimpia).reverse().toString());
    }
}
