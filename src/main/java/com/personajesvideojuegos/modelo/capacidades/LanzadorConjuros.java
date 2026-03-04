package com.personajesvideojuegos.modelo.capacidades;

import com.personajesvideojuegos.modelo.Acciones.Ataque;
import com.personajesvideojuegos.modelo.Acciones.Conjuro;

/**
 * @author Gabriel Francisco Ruiz Bolaños*/
public interface LanzadorConjuros {
    public Conjuro LanzarConjuro(int index);
    public Conjuro[] getConjuros();
    public int getMana();
    public int getMaximoMana();
    public void setMana(int mana);
    public void resetMana();
    Ataque atacar();
}
