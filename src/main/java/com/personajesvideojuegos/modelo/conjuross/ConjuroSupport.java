package com.personajesvideojuegos.modelo.conjuross;

import com.personajesvideojuegos.modelo.Acciones.Conjuro;

/**
 * @author Alonso J rodríguez Betancor*/

public abstract class ConjuroSupport extends Conjuro {
    TipoConjuroSupport tipoConjuro;

    public ConjuroSupport (int valor, int id, String nombre, String descripcion, TipoConjuroSupport tipoConjuro){

        super(valor, id, nombre, descripcion);
        this.tipoConjuro = tipoConjuro;
    }
}
