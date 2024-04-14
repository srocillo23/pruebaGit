package Inmobiliaria;

public class PlazaGaraje extends Superficie implements Alquiler {
	
    public enum TipoGaraje {
        PUBLICO,
        PRIVADO
    }

    private TipoGaraje tipoGaraje;

    public PlazaGaraje(double metrosCuadrados, String ubicacion, double precioMetroCuadrado, TipoGaraje tipoGaraje) {
        super(metrosCuadrados, ubicacion, precioMetroCuadrado);
        this.tipoGaraje = tipoGaraje;
    }

    //Precio de superfixcie plaza garaje
    @Override
    public double precio() {
        return getPrecio(); 
    }

    //Precio alquilar
    @Override
    public double getPrecioAlquiler() {
        return getPrecio();
    }

    // Método toString para mostrar la información de la plaza de garaje
    @Override
    public String toString() {
        return "Plaza de Garaje - " + super.toString() + ", Tipo: " + tipoGaraje;
    }
}
