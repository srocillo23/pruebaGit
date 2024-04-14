package ClaseString;

import java.util.*;
import java.util.ArrayList;


public class MyString {
    private char[] cadena;

    // Inicia un MyString a partir de un array de  char
    
    public MyString(char[] cadena) {
        this.cadena = cadena;
    }

    // Inicia a partir de una lista (arrayklsit)

    
    public MyString(ArrayList<Character> cadena) {
        this.cadena = new char[cadena.size()];
        for (int i = 0; i < cadena.size(); i++) {
            this.cadena[i] = cadena.get(i);
        }
    }

    //Devolver el array
    
    public char[] getCadena() {
        return cadena;
    }

    //Me dice la longitud de la cadena
    
    public int myLength() {
        return cadena.length;
    }

    //Me da el caracter en la posición que pido + excepción de rango
    
    public char myCharAt(int i) throws Exception {
        if (i < 0 || i >= cadena.length) {
            throw new Exception("Índice fuera de rango");
        }
        return cadena[i];
    }
    
    //Comparar dos cadenas y pone primero la más corta

    public int myCompareTo(MyString cadena2) {
        int len1 = this.cadena.length;
        int len2 = cadena2.getCadena().length;
        int lim = Math.min(len1, len2);

        for (int i = 0; i < lim; i++) {
            char c1 = this.cadena[i];
            char c2 = cadena2.getCadena()[i];
            if (c1 != c2) {
                return c1 - c2;
            }
        }
        return len1 - len2;
    }

    //Compara pero ignorando las mayúsculas y minúsculas
    
    public int myCompareToIgnoreCase(MyString cadena2) {
        int len1 = this.cadena.length;
        int len2 = cadena2.getCadena().length;
        int lim = Math.min(len1, len2);

        for (int i = 0; i < lim; i++) {
            char c1 = Character.toLowerCase(this.cadena[i]);
            char c2 = Character.toLowerCase(cadena2.getCadena()[i]);
            if (c1 != c2) {
                return c1 - c2;
            }
        }
        return len1 - len2;
    }

    //Concatena cadenas
    
    public MyString myConcat(MyString cadena2) {
        char[] result = new char[this.cadena.length + cadena2.getCadena().length];
        System.arraycopy(this.cadena, 0, result, 0, this.cadena.length);
        System.arraycopy(cadena2.getCadena(), 0, result, this.cadena.length, cadena2.getCadena().length);
        return new MyString(result);
    }

    //Indice, búsqueda de un caracter
    
    public int myIndexOf(int caracter) {
        for (int i = 0; i < cadena.length; i++) {
            if (cadena[i] == caracter) {
                return i;
            }
        }
        return -1;
    }

    //Busca el ultimo caracter
    
    public int myLastIndexOf(int caracter) {
        for (int i = cadena.length - 1; i >= 0; i--) {
            if (cadena[i] == caracter) {
                return i;
            }
        }
        return -1;
    }

    //Reemplazo de caracteres
    
    public MyString myReplace(char antiguo, char nuevo) {
        char[] result = new char[cadena.length];
        for (int i = 0; i < cadena.length; i++) {
            if (cadena[i] == antiguo) {
                result[i] = nuevo;
            } else {
                result[i] = cadena[i];
            }
        }
        return new MyString(result);
    }

    //Divide la cadena (split)
    
    public MyString[] mySplit(char expresion) {
        ArrayList<MyString> parts = new ArrayList<>();
        int startIndex = 0;
        for (int i = 0; i < cadena.length; i++) {
            if (cadena[i] == expresion) {
                parts.add(new MyString(java.util.Arrays.copyOfRange(cadena, startIndex, i)));
                startIndex = i + 1;
            }
        }
        parts.add(new MyString(java.util.Arrays.copyOfRange(cadena, startIndex, cadena.length)));
        return parts.toArray(new MyString[0]);
    }

    //Devuelve una subcadena que empieza en inicio y termina justo antes de fin. 
    
    public MyString mySubstring(int inicio, int fin) throws Exception {
        if (inicio < 0 || inicio >= cadena.length || fin < 0 || fin > cadena.length || inicio > fin) {
            throw new Exception("Índices de subcadena incorrectos");
        }
        return new MyString(java.util.Arrays.copyOfRange(cadena, inicio, fin));
    }

    //Pasa a minusculas
    
    public MyString myToLowerCase() {
        char[] result = new char[cadena.length];
        for (int i = 0; i < cadena.length; i++) {
            result[i] = Character.toLowerCase(cadena[i]);
        }
        return new MyString(result);
    }

    //Pasa a mayúsculas
    
    public MyString myToUpperCase() {
        char[] result = new char[cadena.length];
        for (int i = 0; i < cadena.length; i++) {
            result[i] = Character.toUpperCase(cadena[i]);
        }
        return new MyString(result);
    }

    //Elimina los espacios en blanco (posible uso antes de comparar cadenas + lowercase para dejarlo legible)
    
    public MyString myTrim() {
        int start = 0;
        int end = cadena.length - 1;
        while (start <= end && Character.isWhitespace(cadena[start])) {
            start++;
        }
        while (end >= start && Character.isWhitespace(cadena[end])) {
            end--;
        }
        return new MyString(java.util.Arrays.copyOfRange(cadena, start, end + 1));
    }

    //Imprimo la caadena
    
    public void imprimir() {
        for (char c : cadena) {
            System.out.print(c);
        }
        System.out.println();
    }

    public MyString myToString() {
        return this;
    }
}
