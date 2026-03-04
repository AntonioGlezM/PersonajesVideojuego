package com.personajesvideojuegos.modelo.Personajes;

import com.personajesvideojuegos.modelo.Acciones.Conjuro;
import com.personajesvideojuegos.modelo.Personaje;
import com.personajesvideojuegos.modelo.capacidades.LanzadorConjuros;

/**
 * @author Gabriel Francisco Ruiz Bolanos
 * */
public abstract class PersonajeMagico extends Personaje implements LanzadorConjuros {

    private int mana;
    private int atributoMagico;


    public PersonajeMagico(String nombre, int salud, int poderBase,
                           String raza,
                           int mana, int atributoMagico) {

        super(nombre, salud, poderBase, raza, 0);
        this.mana = mana;
        this.atributoMagico = atributoMagico;
    }



    public int getMana() {
        return mana;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }

    public int calcularDanioMagico(){
        return this.getPoderBase() + atributoMagico;
    }
}
