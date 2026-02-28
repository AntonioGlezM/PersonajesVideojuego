package com.personajesvideojuegos.modelo.clases;

import com.personajesvideojuegos.modelo.Rasgo;
import java.util.ArrayList;

public abstract class Clase implements Nivelado {
  private static ArrayList<Rasgo>[] rasgosPorNivel;
  int nivelClase;

  public Rasgo getRasgo(int nivelClase, int indice) {
    return rasgosPorNivel[nivelClase].get(indice);
  }

  public Rasgo getRasgo(int nivelClase) {
    return getRasgo(nivelClase, 0);
  }

  public void subirNivel() {
    nivelClase++;
  }

  public int getNivel() {
    return this.nivelClase;
  }

}
