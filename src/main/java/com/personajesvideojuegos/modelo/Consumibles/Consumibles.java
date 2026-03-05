package com.personajesvideojuegos.modelo.Consumibles;

import com.personajesvideojuegos.modelo.Personajes.Personaje;
import com.personajesvideojuegos.modelo.Interfaces.Usable;

/**
 * @author Antonio González Martel
 */

// Clase para todos los consumibles
public abstract class Consumibles implements Usable{

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