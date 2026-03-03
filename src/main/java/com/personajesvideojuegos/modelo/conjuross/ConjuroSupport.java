package com.personajesvideojuegos.modelo.conjuross;

/**
 * @author Alonso J rodríguez Betancor*/

public abstract class ConjuroSupport extends Conjuro {
    TipoConjuroSupport tipoConjuro;

    public ConjuroSupport (int valor, int id, String nombre, String descripcion, TipoConjuroSupport tipoConjuro){

        super(valor, id, nombre, descripcion);
        this.tipoConjuro = tipoConjuro;
    }
}
