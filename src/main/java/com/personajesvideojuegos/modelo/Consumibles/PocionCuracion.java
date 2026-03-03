package com.personajesvideojuegos.modelo.Consumibles;

import com.personajesvideojuegos.modelo.Personaje;

/**
 * @author Antonio González Martel
 */

public class PocionCuracion extends Consumibles {

    private int cantidadCuracion;

    public PocionCuracion(String nombre, int cantidadCuracion) {
        super(nombre);
        this.cantidadCuracion = cantidadCuracion;
    }

    @Override
    public void usar(Personaje personaje) {
        personaje.setSalud(personaje.getSalud() + cantidadCuracion);
        System.out.println(personaje.getNombre() +
                " ha recuperado " + cantidadCuracion + " puntos de salud.");
    }
}