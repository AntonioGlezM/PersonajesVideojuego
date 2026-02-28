package com.personajesvideojuegos.modelo.clases;

public interface LanzadorConjuros {

  public void anyadirConjuro(Conjuro conjuro);

  public ArrayList<Conjuro> getConjuros();

  public void activarConjuro(int index);

  public void recuperarEspaciosConjuro();
}
