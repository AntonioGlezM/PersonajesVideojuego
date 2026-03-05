package com.personajesvideojuegos.modelo.Personajes;

import com.personajesvideojuegos.modelo.Personaje;
import com.personajesvideojuegos.modelo.Acciones.Ataque;
import com.personajesvideojuegos.modelo.Habilidades.Habilidad;

/**
 * Clase Barbaro.
 * Personaje físico con muchísimo daño.
 */
public class Barbaro extends PersonajeFisico {

    public Barbaro(String nombre,
            int salud,
            int poderBase,
            String raza,
            int fuerza) {

        super(nombre, salud, poderBase, raza, fuerza);

        agregarHabilidad(new Habilidad(
                "Golpe Salvaje",
                25,
                0));

        agregarHabilidad(new Habilidad(
                "Hachazo Brutal",
                40,
                0));

        agregarHabilidad(new Habilidad(
                "Furia del Bárbaro",
                60,
                0));
    }

    @Override
    public Ataque atacar(Personaje objetivo) {
        return new Ataque(calcularDanioFisico());
    }
}