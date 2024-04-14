package PruebaStringBuilder;

public class PruebaStringBuilder {

	//Documento pagina 15
	
	//length
	//capacity
	//setLength
	//ensureCapacity
	//setCharAt
	//getChars
	//reverse
	//append
	//inserción y eliminación


	public static void main(String[] args) {
		
		//Primero creo un stringubildern cualquiera
		StringBuilder prueba1 = new StringBuilder("Hola mundo");
		System.out.println(prueba1);
		
		
		//length: longitud del StringBuilder
		System.out.println("Longitud StringBuilder: " + prueba1.length());

		
		
		//capacity: capacidad del StringBuilder
		System.out.println("Capacidad StringBuilder: " + prueba1.capacity());

		
		
		//setLength: establecer una  la longitud del StringBuilder
		prueba1.setLength(8);
		System.out.println("setLength(8): " + prueba1.toString());

		
		
		//ensureCapacity: poner un capacidad mínima del StringBuilder
		prueba1.ensureCapacity(20);
		System.out.println("StringBuilder con ensureCapacity(20): " + prueba1.capacity());

		
		
		//setCharAt: sustituir en una posición
		prueba1.setCharAt(3, 'X');
		System.out.println("StringBuilder (3, 'X'): " + prueba1.toString());

		
		
		//getChars: copiar caracteres de un StringBuilder a un array
		StringBuilder prueba2 = new StringBuilder("Hola mundo");
		char[] chars = new char[5];
		prueba2.getChars(0, 5, chars, 0);
		System.out.println("Caracteres obtenidos del StringBuilder: " + new String(chars));

		
		
		//reverse: invertir el contenido del StringBuilder
		StringBuilder prueba3 = new StringBuilder("Hola mundo");
		prueba3.reverse();
		System.out.println("StringBuilder después de reverse(): " + prueba3.toString());

		
		
		//append: un texto al final del StringBuilder
		StringBuilder prueba4 = new StringBuilder("Hola mundo");
		prueba4.append("?");
		System.out.println("StringBuilder después de append ('?'): " + prueba4.toString());

		
		
		//inserción texto
		StringBuilder prueba5 = new StringBuilder("Hola mundo");
		prueba5.insert(5, " que tal ");
		System.out.println("StringBuilder después de insert(5, ' que tal '): " + prueba5.toString());

		
		//eliminar ttexto
		StringBuilder prueba6 = new StringBuilder("Hola mundo");
		prueba6.delete(5, 10);
		System.out.println("StringBuilder después de delete(5, 10): " + prueba6.toString());
		
	}
}







