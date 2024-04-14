package Futbol;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
    	
    	
    	
        // Crear miembros de la junta directiva
    	
        MiembroJuntaDirectiva[] juntaDirectiva1 = {
                new MiembroJuntaDirectiva("Juan", "Pérez", 45, "12345678A"),
                new MiembroJuntaDirectiva("Ana", "Gómez", 50, "87654321B"),
                new MiembroJuntaDirectiva("Carlos", "Ruiz", 55, "56789012C")
        };

        MiembroJuntaDirectiva[] juntaDirectiva2 = {
                new MiembroJuntaDirectiva("Laura", "Fernández", 42, "34567890D"),
                new MiembroJuntaDirectiva("Miguel", "Sánchez", 48, "90123456E"),
                new MiembroJuntaDirectiva("María", "López", 60, "23456789F")
        };

        
        
        // Crear equipo técnico
        
        EquipoTecnico equipoTecnico1 = new EquipoTecnico(
                new Entrenador("Raul", "Martínez", 40, "11112222X", "Licencia UEFA Pro"),
                
                new Fisioterapeuta("Eduarzo", "Zurdo", 23, "33334444Y", 1)
        );

        EquipoTecnico equipoTecnico2 = new EquipoTecnico(
                new Entrenador("David", "Hernández", 38, "55556666Z", "Licencia UEFA A"),
                new Fisioterapeuta("Sandra", "Rodríguez", 33, "77778888W", 7)
        );

        
        
        // Crear jugadores
        
        Jugador[][] jugadores1 = {
                {new Jugador("Luis", "Suárez", 32, "99990000A", "Delantero"),
                 new Jugador("Sergio", "Ramos", 34, "11112222B", "Defensa")},
                {new Jugador("Andrés", "Iniesta", 36, "33334444C", "Centrocampista"),
                 new Jugador("Iker", "Casillas", 40, "55556666D", "Portero")}
        };

        Jugador[][] jugadores2 = {
                {new Jugador("Leo", "Messi", 33, "77778888E", "Delantero"),
                 new Jugador("Gerard", "Piqué", 34, "99990000F", "Defensa")},
                {new Jugador("Xavi", "Hernández", 41, "11112222G", "Centrocampista"),
                 new Jugador("David", "De Gea", 31, "33334444H", "Portero")}
        };

        
        
        // Crear equipos de fútbol
        
        EquipoFutbol equipo1 = new EquipoFutbol("Equipo 1", juntaDirectiva1, equipoTecnico1, jugadores1);
        EquipoFutbol equipo2 = new EquipoFutbol("Equipo 2", juntaDirectiva2, equipoTecnico2, jugadores2);

        
        
        // Imprimir información de los equipos
        
        System.out.println("Información del Equipo 1:");
        equipo1.imprimirInfoEquipo();

        System.out.println("\nInformación del Equipo 2:");
        equipo2.imprimirInfoEquipo();
    }
}