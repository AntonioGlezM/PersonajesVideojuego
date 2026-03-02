package com.personajesvideojuegos.modelo;

/**
 * @author Gabriel Francisco Ruíz Bolaños
 */
public class BonoCompetencia {

  public static int calcularBonoCompetencia(int nivel) {
    int numero = (int) (nivel / 5) + 2;
    return numero;
  }

}
