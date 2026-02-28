package com.personajesvideojuegos.modelo.clases;

public abstract class ClaseHalfCaster {

  static final int[][] espaciosConjurosPorNivel = {
      { 0, 0, 0, 0 },
      { 2, 0, 0, 0 },
      { 3, 0, 0, 0 },
      { 3, 0, 0, 0 },
      { 3, 2, 0, 0 }
  };

  ArrayList<Conjuro> listaConjurosConocidos = new ArrayList<>();

  int[] conjurosConocidosPorNivel;
  int CD;

  public void aprenderConjuro(Conjuro conjuroAAPrender) {
    this.listaConjurosConocidos.add(conjuroAAPrender);
  }
}
