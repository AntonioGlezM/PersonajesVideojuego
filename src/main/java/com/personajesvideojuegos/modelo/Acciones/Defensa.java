package com.personajesvideojuegos.modelo.Acciones;

import com.personajesvideojuegos.modelo.Personaje;


/**
 * @author Gabriel Francisco Ruiz Bolaños
 *
 * La clase es una accion que eleva la armadura del personaje que la realiza o al que defienden*/
public class Defensa extends Accion {
    public Defensa(int valor) {
        super(valor);
    }

    @Override
    public void realizarAccion(Personaje objetivo) {
        objetivo.setValorArmadura(objetivo.getValorArmadura() + this.getValor());

    }
}
