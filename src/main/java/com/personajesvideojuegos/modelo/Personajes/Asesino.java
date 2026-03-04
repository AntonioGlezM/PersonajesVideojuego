package com.personajesvideojuegos.modelo.Personajes;

import com.personajesvideojuegos.modelo.Personaje;
import com.personajesvideojuegos.modelo.Acciones.Ataque;
import com.personajesvideojuegos.modelo.Habilidades.Habilidad;

/**
 * Clase Asesino.
 *
 * Personaje físico especializado en daño alto
 * y ataques rápidos.
 *
 * No usa mana.
 */
public class Asesino extends PersonajeFisico {

    /**
     * Constructor del Asesino.
     *
     * @param nombre Nombre del personaje
     * @param salud Vida inicial
     * @param poderBase Daño base
     * @param raza Raza del personaje
     * @param agilidad Atributo físico principal
     */
    public Asesino(String nombre,
                   int salud,
                   int poderBase,
                   String raza,
                   int agilidad) {

        super(nombre, salud, poderBase, raza, agilidad);

        // ==========================
        // HABILIDADES DEL ASESINO
        // ==========================

        agregarHabilidad(new Habilidad(
                "Golpe Silencioso",
                18,
                0
        ));

        agregarHabilidad(new Habilidad(
                "Ataque Letal",
                30,
                0
        ));

        agregarHabilidad(new Habilidad(
                "Asesinato Crítico",
                45,
                0
        ));
    }

    /**
     * Ataque básico del Asesino.
     * Usa el cálculo físico heredado.
     */
    @Override
    public Ataque atacar(Personaje objetivo) {

        return new Ataque(calcularDanioFisico());
    }
}