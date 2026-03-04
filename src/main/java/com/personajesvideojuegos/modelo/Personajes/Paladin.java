package com.personajesvideojuegos.modelo.Personajes;

import com.personajesvideojuegos.modelo.Acciones.Ataque;
import com.personajesvideojuegos.modelo.Acciones.Defensa;
import com.personajesvideojuegos.modelo.Pasivass.Pasiva;
import com.personajesvideojuegos.modelo.Pasivass.clases.PaladinPasivas;
import com.personajesvideojuegos.modelo.capacidades.Atacante;
import com.personajesvideojuegos.modelo.capacidades.Defensor;
import com.personajesvideojuegos.modelo.capacidades.Sacerdotal;

/**
 * @author Gabriel Francisco Ruíz Bolaños*/
public class Paladin extends PersonajeFisico implements Defensor, Sacerdotal {
    int fuerza;
    int fe;
    private Pasiva pasivas;
    public Paladin(String nombre, int salud, int poderBase, String raza, int fuerza, int fe) {
        super(nombre, salud, poderBase, raza, fuerza);
        this.fuerza = fuerza;
        this.fe = fe;
        this.pasivas = new PaladinPasivas();
    }


    @Override
    public Ataque atacar() {
        return new Ataque(calcularDanioFisico());
    }

    @Override
    public Defensa defender() {
        return new Defensa(this.fe);
    }

    public Defensa defensaDeLosDioses(){
        return new Defensa((this.fe + this.getPoderBase())*2);
    }

    @Override
    public void setFe(int fe) {
        this.fe = fe;
    }

    @Override
    public int getFe() {
        return this.fe;
    }
}
