package com.personajesvideojuegos;

import com.personajesvideojuegos.Vista.Consola;

/**
 * Punto de entrada del programa.
 */
public class Main {

    public static void main(String[] args) {

        // Crear la vista
        Consola vista = new Consola();

        // Mostrar el menú principal
        vista.mostrarMenu();
    }
}