package com.personajesvideojuegos.modelo.Consumibles;

import com.personajesvideojuegos.modelo.Personajes.Personaje;

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
        int saludAntes = personaje.getSalud();
        personaje.setSalud(personaje.getSalud() + cantidadCuracion);
        int saludDespues = personaje.getSalud();
        System.out.println(personaje.getNombre() +
                " consume " + getNombre() +
                " | Salud: " + saludAntes + " -> " + saludDespues + ".");
    }
}
