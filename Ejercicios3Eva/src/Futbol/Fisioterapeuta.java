package Futbol;

import java.util.Arrays;


class Fisioterapeuta extends Persona {
    private int anosExperiencia;

    public Fisioterapeuta(String nombre, String apellidos, int edad, String dni, int anosExperiencia) {
        super(nombre, apellidos, edad, dni);
        this.anosExperiencia = anosExperiencia;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }
    
    public String getNombre() {
        return nombre;
    }
    
}