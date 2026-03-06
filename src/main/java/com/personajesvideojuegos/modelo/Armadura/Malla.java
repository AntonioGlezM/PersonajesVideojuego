package com.personajesvideojuegos.modelo.Armadura;


/**
 * @author Carlos Perdomo Morales
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
        return defensaBase + calcularBonusCategoria();
    }

    @Override
    public String toString() {
        return super.toString() + " | Categoría: " + categoria;
    }
}