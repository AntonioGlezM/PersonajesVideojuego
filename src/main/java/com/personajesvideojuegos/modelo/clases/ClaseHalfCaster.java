package com.personajesvideojuegos.modelo.clases;

import java.util.ArrayList;

public abstract class ClaseHalfCaster implements LanzadorConjuros {

  static final int[][] espaciosConjurosPorNivel = {
      { 0, 0 },
      { 2, 0 },
      { 3, 0 },
      { 3, 0 },
      { 3, 2 }
  };

  ArrayList<Conjuro> listaConjurosConocidos = new ArrayList<>();

  int[] conjurosConocidosPorNivel;
  int CD;

}
