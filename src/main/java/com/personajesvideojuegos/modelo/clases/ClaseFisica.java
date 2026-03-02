package com.personajesvideojuegos.modelo.clases;

import com.personajesvideojuegos.modelo.BonoCompetencia;

public abstract class ClaseFisica extends Clase {

  public int aumentarHabilidadFisica(int puntuacion, int bonoCompetencia) {
    return puntuacion + bonoCompetencia;
  }

}
