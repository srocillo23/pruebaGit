package Inmobiliaria;

public class Solar extends Superficie implements Venta {

	public Solar(double metrosCuadrados, String ubicacion, double precioMetroCuadrado) {
		super(metrosCuadrados, ubicacion, precioMetroCuadrado);

	}

	@Override
	public double precio() {
		return getPrecio();
	}

	//El metodo de la interfaz venta
	@Override
	public double getPrecioVenta() {
		return getPrecio();
	}


}
