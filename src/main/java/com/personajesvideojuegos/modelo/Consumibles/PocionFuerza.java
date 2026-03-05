package com.personajesvideojuegos.modelo.Consumibles;

import com.personajesvideojuegos.modelo.Personajes.Personaje;

/**
 * @author Antonio González Martel
 */

public class PocionFuerza extends Consumibles {

    private int cantidadFuerza;

    public PocionFuerza(String nombre, int cantidadFuerza) {
        super(nombre);
        this.cantidadFuerza = cantidadFuerza;
    }

    @Override
    public void usar(Personaje personaje) {
        int poderAntes = personaje.getPoderBase();
        personaje.setPoderBase(personaje.getPoderBase() + cantidadFuerza);
        int poderDespues = personaje.getPoderBase();
        System.out.println(personaje.getNombre() + 
            " consume " + getNombre() +
            " | Poder Base: " + poderAntes + " -> " + poderDespues + ".");
    }
}
