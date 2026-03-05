/*package com.personajesvideojuegos.modelo.Personajes;

import com.personajesvideojuegos.modelo.Acciones.Ataque;
import com.personajesvideojuegos.modelo.Acciones.Defensa;
import com.personajesvideojuegos.modelo.capacidades.Atacante;
import com.personajesvideojuegos.modelo.capacidades.Defensor;

public class Guerrero extends PersonajeFisico implements Atacante, Defensor {
    int fuerza;
    int maestriaCombate;
    public Guerrero(String nombre, int salud, int poderBase,
                    String raza,
                    int fuerza, int maestriaCombate){
        super(nombre, salud, poderBase, raza, fuerza);
        this.fuerza = fuerza;
        this.maestriaCombate = maestriaCombate;

    }

    @Override
    public Ataque atacar() {
        return new Ataque(this.calcularDanioFisico());
    }

    @Override
    public Ataque ataquePoderoso() {
        return new Ataque(this.calcularDanioFisico() + fuerza + maestriaCombate);
    }

    public Ataque ataqueCritico(Ataque ataque) {
        ataque.setValor(ataque.getValor()*2);
        return ataque;
    }

    @Override
    public Defensa defender() {
        return new Defensa(this.maestriaCombate);
    }
}*/
