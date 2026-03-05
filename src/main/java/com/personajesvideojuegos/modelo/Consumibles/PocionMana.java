package com.personajesvideojuegos.modelo.Consumibles;

import com.personajesvideojuegos.modelo.Personajes.Personaje;
import com.personajesvideojuegos.modelo.capacidades.LanzadorConjuros;

/**
 * @author Antonio González Martel
 */

public class PocionMana extends Consumibles {

    private int cantidadMana;

    public PocionMana(String nombre, int cantidadMana) {
        super(nombre);
        this.cantidadMana = cantidadMana;
    }

    @Override
    public void usar(Personaje personaje) {

        if (personaje instanceof LanzadorConjuros lanzadorConjuros) {

            int manaAntes = lanzadorConjuros.getMana();
            int manaDespues = manaAntes + cantidadMana;
            if (manaDespues > lanzadorConjuros.getMaximoMana()) {
                manaDespues = lanzadorConjuros.getMaximoMana();
            }
            lanzadorConjuros.setMana(manaDespues);

            System.out.println(personaje.getNombre()
                    + " consume " + getNombre()
                    + " | Mana: " + manaAntes + " -> " + manaDespues + ".");

        } else {

            System.out.println(personaje.getNombre()
                    + " no usa mana. " + getNombre() + " no tiene efecto.");
        }
    }
}
