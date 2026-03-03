package com.personajesvideojuegos.modelo.Armadura;


/**
 * @author Carlos Perdomo Morales
 */

// Clase guía para la creación de armas
public abstract class Armadura {

    protected String nombre;
    protected int defensaBase;

    public Armadura(String nombre, int defensaBase) {
        this.nombre = nombre;
        this.defensaBase = defensaBase;
    }

    public String getNombre() {
        return nombre;
    }

    public int getdefensaBase() {
        return defensaBase;
    }

    // Cada armadura calcula su propio defensa
    public abstract int calcularDefensa();

    @Override
    public String toString() {
        return "Armadura: " + nombre + " | Defensa base: " + defensaBase;
    }
}