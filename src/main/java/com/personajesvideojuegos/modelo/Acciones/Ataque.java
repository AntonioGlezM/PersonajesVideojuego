package com.personajesvideojuegos.modelo.Acciones;

import com.personajesvideojuegos.modelo.Personaje;

public class Ataque extends Accion {
    public Ataque(int valor) {
        super(valor);
    }

    @Override
    public void realizarAccion(Personaje objetivo) {
        objetivo.setSalud(objetivo.getSalud() - noCero(this.getValor()));
    }

    public int noCero(int valor){
        return valor >= 0 ? valor : 0;
    }
}
