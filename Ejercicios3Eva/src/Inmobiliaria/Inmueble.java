package Inmobiliaria;

public abstract class Inmueble {
	
	//Asignar IDs automáticamente
	
    private static int nextID = 1;
    private int id;
    private double metrosCuadrados;
    private String ubicacion;
    private double precio;

    //ccosntructor
    public Inmueble(double metrosCuadrados, String ubicacion, double precio) {
        this.id = nextID++;
        this.metrosCuadrados = metrosCuadrados;
        this.ubicacion = ubicacion;
        this.precio = precio;
    }

    //setterys getters
    
    public int getId() {
        return id;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Ubicación: " + ubicacion + ", Metros cuadrados: " + metrosCuadrados + " m^2, Precio: " + precio + "€";
    }
}
