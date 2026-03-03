package com.personajesvideojuegos.modelo.Acciones;

import com.personajesvideojuegos.modelo.Personaje;

/**
 * @author Gabriel Francisco Ruíz Bolaños
 * */
public class Curacion extends Accion {

    public Curacion(int valor) {
        super(valor);
    }

    @Override
    public void realizarAccion(Personaje objetivo) {
        objetivo.setSalud(objetivo.getSalud() + this.getValor());
    }
}
