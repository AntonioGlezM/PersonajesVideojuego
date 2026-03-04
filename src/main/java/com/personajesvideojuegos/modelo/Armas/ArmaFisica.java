package com.personajesvideojuegos.modelo.Armas;

public abstract class ArmaFisica extends Armas {

    public ArmaFisica(String nombre, int danioBase, CategoriaArma categoria) {
        super(nombre, danioBase, categoria);
    }

    @Override
    public int calcularDanio() {
        return danioBase + calcularBonusCategoria();
    }
}