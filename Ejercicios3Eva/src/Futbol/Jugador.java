package Futbol;

import java.util.Arrays;


class Jugador extends Persona {
    private String demarcacion;

    public Jugador(String nombre, String apellidos, int edad, String dni, String demarcacion) {
        super(nombre, apellidos, edad, dni);
        this.demarcacion = demarcacion;
    }

    public String getDemarcacion() {
        return demarcacion;
    }
}