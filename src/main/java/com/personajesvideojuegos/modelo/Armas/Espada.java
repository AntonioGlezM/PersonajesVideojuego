package com.personajesvideojuegos.modelo.Armas;

public class Espada extends Armas {

    private CategoriaArma categoria;

    public Espada(String nombre, int danioBase, CategoriaArma categoria) {
        super(nombre, danioBase);
        this.categoria = categoria;
    }

    public CategoriaArma getCategoria() {
        return categoria;
    }

    @Override
    public int calcularDanio() {

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

        return danioBase + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + " | Categoría: " + categoria;
    }
}