/*package com.personajesvideojuegos.modelo.Personajes;

import com.personajesvideojuegos.excepciones.LimiteConjurosAlcanzadoException;
import com.personajesvideojuegos.modelo.Personaje;
import com.personajesvideojuegos.modelo.Acciones.Ataque;
import com.personajesvideojuegos.modelo.Acciones.Conjuro;
import com.personajesvideojuegos.modelo.capacidades.LanzadorConjuros;
import com.personajesvideojuegos.modelo.conjuross.Bola_de_fuego;
import com.personajesvideojuegos.modelo.conjuross.Falsa_vida;

import java.util.ArrayList;
/***
 * @author Gabriel Francisco Ruíz Bolaños
 */
/*public class Mago extends PersonajeMagico implements LanzadorConjuros {
    private int inteligencia;
    private int maestriaMagica;
    private ArrayList<Conjuro> conjuros;

    public Mago(String nombre, int salud, int poderBase, String raza, int mana, int inteligencia, int maestriaMagica) {
        super(nombre, salud, poderBase, raza, mana, inteligencia);
        this.inteligencia = inteligencia;
        this.maestriaMagica = maestriaMagica;
    }
    /**
     * El constructor recomendado para personajes nuevos es este,
     *  ya que establece la maestría mágica desde el inicio así como algunos conjuros iniciales
     * */
    /*public Mago(String nombre, int salud, int poderBase, String raza, int mana, int inteligencia) {
        this(nombre, salud, poderBase, raza, mana, inteligencia, 3);
        this.aprenderConjuro(new Bola_de_fuego());
        this.aprenderConjuro(new Falsa_vida());
    }

    @Override
    public Ataque atacar() {
        return new Ataque(1);
    }

    @Override
    public Conjuro LanzarConjuro(int index) {
        return this.conjuros.get(index);
    }

    @Override
    public Conjuro[] getConjuros() {
        return new Conjuro[0];
    }

    @Override
    public void resetMana() {
        this.setMana(this.getMaximoMana());
    }

    public void aprenderConjuro(Conjuro conjuro) {
        if (this.conjuros.contains(conjuro) || this.conjuros.size() >= maestriaMagica) {
            throw new LimiteConjurosAlcanzadoException();
        } else{
            this.setMana(this.getMana() - 1);
            this.conjuros.add(conjuro);
        }
    }

    public Conjuro sobrecargaConjuro(int index){
        Conjuro conjuro = this.conjuros.get(index);
        conjuro.setValor(conjuro.getValor() + this.inteligencia + this.maestriaMagica);
        return conjuro;
    }

    public int getMaestriaMagica() {
        return maestriaMagica;
    }
    public void setMaestriaMagica(int maestriaMagica) {
        this.maestriaMagica = maestriaMagica;
    }
    public int getInteligencia() {
        return inteligencia;
    }
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }
    @Override
    public Ataque atacar(Personaje objetivo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atacar'");
    }

}*/

