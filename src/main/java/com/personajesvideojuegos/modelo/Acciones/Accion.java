package com.personajesvideojuegos.modelo.Acciones;

import com.personajesvideojuegos.modelo.Personajes.Personaje;

/**
 * @author Gabriel Francisco Ruiz Bolaños*/
public abstract class Accion {
    private int valor;

    public Accion(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public abstract void realizarAccion(Personaje objetivo);
}
