package com.personajesvideojuegos.modelo.Personajes;


import com.personajesvideojuegos.modelo.capacidades.LanzadorConjuros;

/**
 * @author Gabriel Francisco Ruiz Bolanos
 */
public abstract class PersonajeMagico extends Personaje implements LanzadorConjuros {

    private int mana;
    private int maximoMana;
    private int atributoMagico;

    public PersonajeMagico(String nombre, int salud,
            int poderBase, String raza,
            int mana, int atributoMagico) {

        super(nombre, salud, poderBase, raza, 0);
        this.mana = mana;
        this.maximoMana = mana;
        this.atributoMagico = atributoMagico;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getMaximoMana() {
        return this.maximoMana;
    }

    public int calcularDanioMagico() {
        return this.getPoderBase() + atributoMagico;
    }

     /**
     * Intenta usar mana.
     *
     * @param coste cantidad de mana requerida
     * @return true si hay suficiente mana
     */
    public boolean usarMana(int coste) {

        if (coste > mana) {
            return false; // No hay suficiente mana
        }

        
        mana -= coste;

        return true;
    }

    /**
     * Regenera mana (para futuro uso).
     */
    public void regenerarMana(int cantidad) {

        mana += cantidad;

        if (mana > maximoMana) {
            mana = maximoMana;
        }
    }
}
