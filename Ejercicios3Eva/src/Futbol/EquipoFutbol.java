package Futbol;

import java.util.Arrays;


class EquipoFutbol {
    private String nombre;
    private MiembroJuntaDirectiva[] juntaDirectiva;
    private EquipoTecnico equipoTecnico;
    private Jugador[][] jugadores;

    public EquipoFutbol(String nombre, MiembroJuntaDirectiva[] juntaDirectiva, EquipoTecnico equipoTecnico, Jugador[][] jugadores) {
        this.nombre = nombre;
        this.juntaDirectiva = juntaDirectiva;
        this.equipoTecnico = equipoTecnico;
        this.jugadores = jugadores;
    }

    public void imprimirInfoEquipo() {
        System.out.println("Nombre del equipo: " + nombre);
        System.out.println("Junta Directiva:");
        for (MiembroJuntaDirectiva miembro : juntaDirectiva) {
            System.out.println(" - DNI: " + miembro.dni);
        }

        System.out.println("Equipo Técnico:");
        equipoTecnico.imprimirNombres();

        System.out.println("Jugadores:");
        for (Jugador[] fila : jugadores) {
            for (Jugador jugador : fila) {
                System.out.println(" - Nombre: " + jugador.nombre + ", Demarcación: " + jugador.getDemarcacion());
            }
        }
    }
}