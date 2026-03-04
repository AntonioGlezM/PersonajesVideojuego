package com.personajesvideojuegos.modelo.Armas;

public abstract class ArmaMagica extends Armas {

    public ArmaMagica(String nombre, int danioBase, CategoriaArma categoria) {
        super(nombre, danioBase, categoria);
    }

    @Override
    public int calcularDanio() {
        return danioBase + calcularBonusCategoria();
    }
}