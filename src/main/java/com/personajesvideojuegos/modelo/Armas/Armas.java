package com.personajesvideojuegos.modelo.Armas;

/**
 * @author Antonio González Martel
 */

// Clase guía para la creación de armas
public abstract class Armas {

    protected String nombre;
    protected int danioBase;

    public Armas(String nombre, int danioBase) {
        this.nombre = nombre;
        this.danioBase = danioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDanioBase() {
        return danioBase;
    }

    // Cada arma calculará su propio daño
    public abstract int calcularDanio();

    @Override
    public String toString() {
        return "Arma: " + nombre + " | Daño base: " + danioBase;
    }
}