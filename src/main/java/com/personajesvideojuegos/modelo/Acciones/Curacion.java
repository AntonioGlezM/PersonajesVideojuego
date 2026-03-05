package com.personajesvideojuegos.modelo.Acciones;

import com.personajesvideojuegos.modelo.Personajes.Personaje;

/**
 * @author Gabriel Francisco Ruíz Bolaños
 * */
public class Curacion extends Accion {

    public Curacion(int valor) {
        super(valor);
    }

    @Override
    public void realizarAccion(Personaje objetivo) {
        System.out.println("Se ejecuta Accion: Curacion sobre " + objetivo.getNombre() + ".");
        objetivo.setSalud(objetivo.getSalud() + this.getValor());
    }
}
