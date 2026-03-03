package com.personajesvideojuegos.modelo.conjuross;

import com.personajesvideojuegos.modelo.Conjuro;
/**
 * @author Alonso J rodríguez Betancor*/

public abstract class ConjuroDamage extends Conjuro {

    private int damage;

    public ConjuroDamage (int Damage, int id, String nombre, String descripcion){
        super(id,nombre,descripcion);
        this.damage = Damage;

    }

}
