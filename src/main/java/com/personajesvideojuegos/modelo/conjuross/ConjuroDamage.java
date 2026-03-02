package com.personajesvideojuegos.modelo.conjuross;

import com.personajesvideojuegos.modelo.Conjuros;
/**
 * @author Alonso J rodríguez Betancor*/

public abstract class ConjuroDamage extends Conjuros {

    private int damage;

    public ConjuroDamage (int Damage, int id, String nombre, String descripcion){
        super(id,nombre,descripcion);
        this.damage = Damage;

    }

}
