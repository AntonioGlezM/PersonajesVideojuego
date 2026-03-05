package com.personajesvideojuegos.modelo.Personajes;

import com.personajesvideojuegos.modelo.Personaje;
import com.personajesvideojuegos.modelo.Acciones.Ataque;
import com.personajesvideojuegos.modelo.Habilidades.Habilidad;

/**
 * Clase Picaro.
 * Personaje rápido con ataques ágiles.
 */
public class Picaro extends PersonajeFisico {

    public Picaro(String nombre,
            int salud,
            int poderBase,
            String raza,
            int agilidad) {

        super(nombre, salud, poderBase, raza, agilidad);

        agregarHabilidad(new Habilidad(
                "Puñalada Rápida",
                20,
                0));

        agregarHabilidad(new Habilidad(
                "Ataque Sombra",
                35,
                0));

        agregarHabilidad(new Habilidad(
                "Golpe Fantasma",
                50,
                0));
    }

    @Override
    public Ataque atacar(Personaje objetivo) {
        return new Ataque(calcularDanioFisico());
    }
}