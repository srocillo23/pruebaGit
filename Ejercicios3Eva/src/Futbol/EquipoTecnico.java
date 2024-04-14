package Futbol;

class EquipoTecnico {
 private Entrenador entrenador;
 private Fisioterapeuta fisioterapeuta;

 public EquipoTecnico(Entrenador entrenador, Fisioterapeuta fisioterapeuta) {
     this.entrenador = entrenador;
     this.fisioterapeuta = fisioterapeuta;
 }

 public void imprimirNombres() {
     System.out.println("Entrenador: " + entrenador.getNombre());
     System.out.println("Fisioterapeuta: " + fisioterapeuta.getNombre());
 }
}
