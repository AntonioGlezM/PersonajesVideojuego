package com.personajesvideojuegos.modelo.Consumibles;

import com.personajesvideojuegos.modelo.Personaje;

/**
 * @author Antonio González Martel
 */

// Clase para todos los consumibles
public abstract class Consumibles {

    protected String nombre;

    public Consumibles(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Cada consumible hace algo distinto
    public abstract void usar(Personaje personaje);

    @Override
    public String toString() {
        return "Consumible: " + nombre;
    }
}