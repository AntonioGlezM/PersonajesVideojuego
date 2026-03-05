package com.personajesvideojuegos.modelo.Personajes;

import com.personajesvideojuegos.modelo.Personaje;
import com.personajesvideojuegos.modelo.Acciones.Ataque;
import com.personajesvideojuegos.modelo.Habilidades.Habilidad;

/**
 * Clase Guerrero.
 * Personaje físico equilibrado entre daño y resistencia.
 */
public class Guerrero extends PersonajeFisico {

    public Guerrero(String nombre,
            int salud,
            int poderBase,
            String raza,
            int fuerza,
            int defensa) {

        super(nombre, salud, poderBase, raza, fuerza);

        agregarHabilidad(new Habilidad(
                "Corte Poderoso",
                20,
                0));

        agregarHabilidad(new Habilidad(
                "Golpe de Escudo",
                30,
                0));

        agregarHabilidad(new Habilidad(
                "Espadazo Brutal",
                45,
                0));
    }

    @Override
    public Ataque atacar(Personaje objetivo) {
        return new Ataque(calcularDanioFisico());
    }
}