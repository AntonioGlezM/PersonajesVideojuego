package com.personajesvideojuegos.modelo.Personajes;

import com.personajesvideojuegos.modelo.Personaje;
import com.personajesvideojuegos.modelo.Armas.Armas;

/**
 * Clase abstracta intermedia para personajes físicos.
 * 
 * Hereda de Personaje y añade características propias
 * de luchadores cuerpo a cuerpo o usuarios de armas físicas.
 */

/**
 * @author Antonio González Martel
 */
public abstract class PersonajeFisico extends Personaje {

    private int fuerza;

    public PersonajeFisico(String nombre, int nivel, int salud, int poderBase,
            String raza, int claseArmadura,
            int fuerza) {

        super(nombre, nivel, salud, poderBase, raza, claseArmadura);
        this.fuerza = fuerza;
    }

    // Getter
    public int getFuerza() {
        return fuerza;
    }

    // Setter
    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    /**
     * Método común para ataques físicos básicos.
     * Puede ser usado por las clases hijas.
     */
    public int calcularDanioFisico() {

        int danio = getPoderBase() + fuerza;

        Armas arma = getArmaEquipada();

        if (arma != null) {
            danio += arma.calcularDanio();
        }

        return danio;
    }
}