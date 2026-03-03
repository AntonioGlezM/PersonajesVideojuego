package com.personajesvideojuegos.modelo.Personajes;

import com.personajesvideojuegos.modelo.Personaje;
/**
 * @author Gabriel Francisco Ruiz Bolanos
 * */
public abstract class PersonajeMagico extends Personaje {

    private int mana;
    private int inteligencia;

    public PersonajeMagico(String nombre, int nivel, int salud, int poderBase,
                           String raza,
                           int mana, int inteligencia) {

        super(nombre, nivel, salud, poderBase, raza, 0);
        this.mana = mana;
        this.inteligencia = inteligencia;
    }

    public int getMana() {
        return mana;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }

    public int calcularDanioMagico(){
        return this.getPoderBase() + inteligencia;
    }
}
