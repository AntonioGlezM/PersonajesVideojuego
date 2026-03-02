package com.personajesvideojuegos.modelo.clases;

import java.util.ArrayList;
import com.personajesvideojuegos.modelo.Conjuro;

/**
 * @author Gabriel Francisco Ruíz Bolaños
 */
public abstract class ClaseFullCaster implements LanzadorConjuros {

  int[][] EspaciosConjurosPorNivel = {
      { 2, 0, 0 },
      { 3, 0, 0 },
      { 4, 2, 0 },
      { 4, 2, 0 },
      { 4, 3, 2 }
  };

  ArrayList<Conjuro> ListaConjurosAprendidos = new ArrayList<>();
  int CD;

}
