package Futbol;

import java.util.Arrays;


class Entrenador extends Persona {
    private String titulacionEspecial;

    public Entrenador(String nombre, String apellidos, int edad, String dni, String titulacionEspecial) {
        super(nombre, apellidos, edad, dni);
        this.titulacionEspecial = titulacionEspecial;
    }

    public String getTitulacionEspecial() {
        return titulacionEspecial;
    }
   
    public String getNombre() {
        return nombre;
    }
    
}