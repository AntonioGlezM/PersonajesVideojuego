package com.personajesvideojuegos.modelo;

import com.personajesvideojuegos.modelo.Rasgo;
import java.util.ArrayList;

public abstract class Clase {
  static ArrayList<Rasgo>[] rasgosPorNivel;
  int nivelClase;

  public Rasgo getRasgo(int nivelClase, int indice) {
    return rasgosPorNivel[nivelClase].get(indice);
  }

  public Rasgo getRasgo(int nivelClase) {
    return getRasgo(nivelClase, 0);
  }
}
