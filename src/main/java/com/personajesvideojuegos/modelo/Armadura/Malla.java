package com.personajesvideojuegos.modelo.Armadura;


/**
 * @author Antonio González Martel
 */

public class Malla extends Armadura {

    private CategoriaArmadura categoria;

    public Malla(String nombre, int defensaBase, CategoriaArmadura categoria) {
        super(nombre, defensaBase);
        this.categoria = categoria;
    }

    public CategoriaArmadura getCategoria() {
        return categoria;
    }

    @Override
    public int calcularDefensa() {

        int bonus = 0;

        switch (categoria) {

            case RARA:
                bonus = 3;
                break;

            case EPICA:
                bonus = 5;
                break;

            case LEGENDARIA:
                bonus = 10;
                break;

            case COMUN:
            default:
                bonus = 0;
                break;
        }

        return defensaBase + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + " | Categoría: " + categoria;
    }
}