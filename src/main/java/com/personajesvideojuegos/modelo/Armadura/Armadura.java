package com.personajesvideojuegos.modelo.Armadura;

/**
 * @author Carlos Perdomo Morales
 */

// Clase guía para la creación de armas
public abstract class Armadura {

    protected String nombre;
    protected int defensaBase;
    protected CategoriaArmadura categoria;

    public Armadura(String nombre, int defensaBase) {
        this.nombre = nombre;
        this.defensaBase = defensaBase;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public int getdefensaBase() {
        return defensaBase;
    }

    public CategoriaArmadura getCategoria() {
        return categoria;
    }

    // Cada armadura calcula la defensa segun su armadura
    protected int calcularBonusCategoria(){

        switch (categoria) {
            case RARA:
                return 3;
            case EPICA:
                return 5;
            case LEGENDARIA:
                return 10;
            case COMUN:
                return 0;
                default:
                    return 0;
        }
    }

    public abstract int calcularDefensa();

    @Override
    public String toString() {
        return "Armadura: " + nombre +
                " | Defensa base: " + defensaBase+
                " | Categoria: " + categoria+
                " | Defensa total: " + calcularDefensa();
    }
}