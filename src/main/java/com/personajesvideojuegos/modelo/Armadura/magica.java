package com.personajesvideojuegos.modelo.Armadura;

/**
 * @author Carlos Perdomo Morales
 */

public class magica extends Armadura {

    private CategoriaArmadura categoria;

    public magica(String nombre, int defensaBase, CategoriaArmadura categoria) {
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

    public int reducirDanioExtra() {
        return 2;
    }
}
