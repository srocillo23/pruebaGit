package Inmobiliaria;

public abstract class Superficie extends Inmueble {
	
    public void setPrecioMetroCuadrado(double precioMetroCuadrado) {
		this.precioMetroCuadrado = precioMetroCuadrado;
	}

	private double precioMetroCuadrado;

	//constuctores
    public Superficie(double metrosCuadrados, String ubicacion, double precioMetroCuadrado) {
        super(metrosCuadrados, ubicacion, metrosCuadrados * precioMetroCuadrado); // Calculamos el precio total
        this.precioMetroCuadrado = precioMetroCuadrado;
    }

    //Metodo para precio
    public abstract double precio();

    //Metodo del precio por metro cuadrado
    public double getPrecioMetroCuadrado() {
        return precioMetroCuadrado;
    }
}
