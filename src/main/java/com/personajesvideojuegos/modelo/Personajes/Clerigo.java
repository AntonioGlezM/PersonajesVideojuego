package com.personajesvideojuegos.modelo.Personajes;

import com.personajesvideojuegos.modelo.Acciones.Ataque;
import com.personajesvideojuegos.modelo.Acciones.Conjuro;
import com.personajesvideojuegos.modelo.Acciones.Curacion;

import com.personajesvideojuegos.modelo.Pasivass.Pasiva;
import com.personajesvideojuegos.modelo.Pasivass.clases.ClerigoPasivas;
import com.personajesvideojuegos.modelo.capacidades.LanzadorConjuros;
import com.personajesvideojuegos.modelo.capacidades.Medico;
import com.personajesvideojuegos.modelo.capacidades.Sacerdotal;
import com.personajesvideojuegos.modelo.conjuross.Bola_de_fuego;
import com.personajesvideojuegos.modelo.conjuross.Falsa_vida;

/**
 * @author Gabriel Francisco Ruíz Bolaños
 * */
public class Clerigo extends PersonajeMagico implements Medico, LanzadorConjuros, Sacerdotal {
    private int bendicion;
    private int fe;
    private Conjuro[] conjuros;
    private Pasiva pasivas;

    public Clerigo(String nombre, int salud, int poderBase, String raza, int mana, int atributoMagico, int fe) {
        super(nombre, salud, poderBase, raza, mana, atributoMagico);
        this.bendicion = atributoMagico;
        this.fe = fe;
        this.conjuros = new Conjuro[]{new Falsa_vida(), new Bola_de_fuego()};
        this.pasivas = new ClerigoPasivas();
    }

    @Override
    public Ataque atacar() {
        return new Ataque(1);
    }

    public Curacion medicoDeLosDioses(){
        return new Curacion(this.fe + this.bendicion);
    }

    @Override
    public Conjuro LanzarConjuro(int index) {
        this.setMana(super.getMana() - 1);
        return this.conjuros[index];
    }

    @Override
    public Conjuro[] getConjuros() {
        return this.conjuros;
    }

    @Override
    public void resetMana() {
        this.setMana(this.getMaximoMana());
    }

    @Override
    public Curacion curar() {
       return new Curacion(this.fe);
    }

    @Override
    public void setFe(int fe) {
        this.fe = fe;
    }

    @Override
    public int getFe() {
        return this.fe;
    }

    public int getBendicion() {
        return bendicion;
    }

    public void setBendicion(int bendicion) {
        this.bendicion = bendicion;
    }




}
