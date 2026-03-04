package com.personajesvideojuegos.Controlador;

import java.util.Random;
import java.util.Scanner;

import com.personajesvideojuegos.modelo.Personaje;
import com.personajesvideojuegos.modelo.Acciones.Defensa;

/**
 * Clase que controla la lógica del combate entre dos jugadores
 * @author Antonio Gonzalez Martel
 */
public class Combate {

    private Personaje jugador1;
    private Personaje jugador2;

    private Random random;
    private Scanner scanner;

    private int turnosJugador1 = 0;
    private int turnosJugador2 = 0;

    // Último turno en el que cada jugador usó Defender
    private int ultimoTurnoDefensaJ1 = -3;
    private int ultimoTurnoDefensaJ2 = -3;

    public Combate(Personaje jugador1, Personaje jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.random = new Random();
        this.scanner = new Scanner(System.in);
    }

    /**
     * Método principal que inicia el combate.
     */
    public void iniciarCombate() {

        System.out.println("=================================");
        System.out.println("        COMBATE ENTRE JUGADORES  ");
        System.out.println("=================================");

        // Cada personaje recibe sus consumibles iniciales
        jugador1.cargarConsumiblesIniciales();
        jugador2.cargarConsumiblesIniciales();

        // Se tira iniciativa para decidir quién empieza
        Personaje atacante = tirarIniciativa();
        Personaje defensor = (atacante == jugador1) ? jugador2 : jugador1;

        System.out.println("\nEmpieza atacando: " + atacante.getNombre());

        // Bucle principal del combate
        while (jugador1.estaVivo() && jugador2.estaVivo()) {

            System.out.println("\n=================================");
            System.out.println("Turno de: " + atacante.getNombre());
            System.out.println("Salud actual: " + atacante.getSalud());
            System.out.println("=================================");

            // Incrementamos el contador de turno del jugador que actúa
            if (atacante == jugador1) {
                turnosJugador1++;
            } else {
                turnosJugador2++;
            }

            ejecutarTurno(atacante, defensor);

            // Comprobamos si el defensor ha muerto
            if (!defensor.estaVivo()) {
                System.out.println("\n" + defensor.getNombre() + " ha sido derrotado.");
                break;
            }

            // Intercambio de roles
            Personaje temp = atacante;
            atacante = defensor;
            defensor = temp;
        }

        System.out.println("\n=================================");
        System.out.println("        FIN DEL COMBATE          ");
        System.out.println("=================================");
    }

    /**
     * Ejecuta el turno de un jugador.
     */
    private void ejecutarTurno(Personaje atacante, Personaje defensor) {

        System.out.println("1 - Atacar");
        System.out.println("2 - Defender");
        System.out.println("3 - Usar consumible");
        System.out.println("4 - Pasar turno");

        System.out.print("Elige opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {

            case 1:
                realizarAtaque(atacante, defensor);
                break;

            case 2:
                usarDefensa(atacante);
                break;

            case 3:
                usarConsumible(atacante);
                break;

            case 4:
                System.out.println(atacante.getNombre() + " decide pasar el turno.");
                break;

            default:
                System.out.println("Opción inválida. Pierdes el turno.");
        }
    }

    /**
     * Sistema de ataque con dado de 0 a 5:
     * 0-1 = fallo
     * 2-4 = golpe normal
     * 5 = crítico
     */
    private void realizarAtaque(Personaje atacante, Personaje defensor) {

        int dado = random.nextInt(6); // número entre 0 y 5

        System.out.println("Se lanza el dado... Resultado: " + dado);

        if (dado == 0 || dado == 1) {

            System.out.println("¡ATAQUE FALLIDO!");

        } else if (dado >= 2 && dado <= 4) {

            System.out.println("¡Golpe exitoso!");
            atacante.atacar(defensor);

        } else if (dado == 5) {

            System.out.println("¡¡IMPACTO CRÍTICO!!");

            int saludAntes = defensor.getSalud();

            // Ataque normal
            atacante.atacar(defensor);

            // Calculamos daño hecho
            int danioHecho = saludAntes - defensor.getSalud();

            // Aplicamos daño extra (doble daño)
            defensor.recibirDanio(danioHecho);

            System.out.println("Daño crítico aplicado.");
        }
    }

    /**
     * Sistema de defensa con cooldown de 3 turnos propios.
     */
    private void usarDefensa(Personaje atacante) {

        int turnoActual;
        int ultimoTurno;

        if (atacante == jugador1) {
            turnoActual = turnosJugador1;
            ultimoTurno = ultimoTurnoDefensaJ1;
        } else {
            turnoActual = turnosJugador2;
            ultimoTurno = ultimoTurnoDefensaJ2;
        }

        // Comprobamos si puede usar defender
        if (turnoActual - ultimoTurno < 3) {
            System.out.println("No puedes defender todavía. Debes esperar "
                    + (3 - (turnoActual - ultimoTurno)) + " turno(s).");
            return;
        }

        // Verificamos que el personaje tenga capacidad de defensa
        if (atacante instanceof com.personajesvideojuegos.modelo.capacidades.Defensor) {

            Defensa defensa = ((com.personajesvideojuegos.modelo.capacidades.Defensor) atacante)
                    .Defender();

            defensa.realizarAccion(atacante);

            System.out.println(atacante.getNombre() + " aumenta su armadura.");

            // Guardamos turno en que defendió
            if (atacante == jugador1) {
                ultimoTurnoDefensaJ1 = turnosJugador1;
            } else {
                ultimoTurnoDefensaJ2 = turnosJugador2;
            }

        } else {
            System.out.println("Este personaje no puede defender.");
        }
    }

    /**
     * Permite usar un consumible del inventario.
     */
    private void usarConsumible(Personaje personaje) {

        if (personaje.getInventario().isEmpty()) {
            System.out.println("No tienes consumibles.");
            return;
        }

        System.out.println("Inventario:");

        for (int i = 0; i < personaje.getInventario().size(); i++) {
            System.out.println(i + " - "
                    + personaje.getInventario().get(i).getNombre());
        }

        System.out.print("Elige consumible: ");
        int index = scanner.nextInt();

        personaje.usarConsumible(index, personaje);
    }

    /**
     * Sistema de iniciativa con dado de 20.
     * Si empatan, vuelven a tirar.
     */
    private Personaje tirarIniciativa() {

        int dado1;
        int dado2;

        do {
            dado1 = random.nextInt(20) + 1;
            dado2 = random.nextInt(20) + 1;

            System.out.println(jugador1.getNombre() + " tira iniciativa: " + dado1);
            System.out.println(jugador2.getNombre() + " tira iniciativa: " + dado2);

            if (dado1 == dado2)
                System.out.println("Empate. Se vuelve a tirar...\n");

        } while (dado1 == dado2);

        return (dado1 > dado2) ? jugador1 : jugador2;
    }
}