package com.personajesvideojuegos.modelo.clases;

import java.util.ArrayList;

import com.personajesvideojuegos.modelo.*;

/**
 * @author Gabriel Francisco Ruíz Bolaños
 */
public interface LanzadorConjuros {

  public void anyadirConjuro(Conjuro conjuro);

  public ArrayList<Conjuro> getConjuros();

  public void activarConjuro(int index);

  public void recuperarEspaciosConjuro();

  public int calcularCD();

}
