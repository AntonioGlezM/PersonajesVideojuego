package com.personajesvideojuegos.modelo.conjuross;

import com.personajesvideojuegos.modelo.Conjuro;
/**
 * @author Alonso J rodríguez Betancor*/

public abstract class ConjuroSupport extends Conjuro {
    private int vida;
    private int fuerza;
    private int defensa;

    public ConjuroSupport (int Vida, int Fuerza, int Defensa, int id, String nombre, String descripcion){

        super(id, nombre, descripcion);
        this.vida = Vida;
        this.fuerza= Fuerza;
        this.defensa= Defensa;
    }
}
