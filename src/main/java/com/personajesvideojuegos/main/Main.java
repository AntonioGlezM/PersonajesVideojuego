package com.personajesvideojuegos.main;

import com.personajesvideojuegos.modelo.Acciones.Accion;
import com.personajesvideojuegos.modelo.Personaje;
import com.personajesvideojuegos.modelo.Personajes.Barbaro;

import java.util.ArrayList;

/**
 * Punto de entrada del programa.
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Personaje> personajes = new ArrayList<>();
        ArrayList<Accion> acciones = new ArrayList<>();

        personajes.add(new Barbaro("Vor", 10, 5, "Humano"))
    }
}