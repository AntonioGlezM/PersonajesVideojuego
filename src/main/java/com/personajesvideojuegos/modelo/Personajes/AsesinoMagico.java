package com.personajesvideojuegos.modelo.Personajes;

import com.personajesvideojuegos.modelo.Armas.ArmaMagica;
import com.personajesvideojuegos.modelo.Personaje;

/**
 * Personaje cuerpo a cuerpo mágico.
 * Consume maná al atacar y recupera maná cuando recibe daño.
 */
public class AsesinoMagico extends PersonajeMagico {

    private ArmaMagica armaEquipada;
    private int costeManaAtaque = 10; // coste fijo por ataque
    private int manaRecuperadoAlSerAtacado = 5; // recuperación por turno enemigo

    public AsesinoMagico(String nombre, int nivel, int salud, int poderBase,
            String raza, int mana, int inteligencia) {

        super(nombre, nivel, salud, poderBase, raza, mana, inteligencia);
    }

    public void equiparArma(ArmaMagica arma) {
        this.armaEquipada = arma;
        System.out.println(getNombre() + " equipa " + arma.getNombre());
    }

    @Override
    public void atacar(Personaje objetivo) {

        if (armaEquipada == null) {
            System.out.println("No hay arma equipada.");
            return;
        }

        if (getMana() < costeManaAtaque) {
            System.out.println(getNombre() + " no tiene suficiente maná para atacar.");
            return;
        }

        // Consumir maná
        setMana(getMana() - costeManaAtaque);

        int danioTotal = calcularDanioMagico() + armaEquipada.calcularDanio();

        objetivo.setSalud(objetivo.getSalud() - danioTotal);

        System.out.println(getNombre() + " golpea a "
                + objetivo.getNombre() +
                " causando " + danioTotal + " de daño mágico.");

        System.out.println("Maná restante: " + getMana());
    }

    /**
     * Método que se llama cuando el personaje recibe daño.
     * Recupera maná automáticamente.
     */
    public void recibirDanio(int cantidad) {

        setSalud(getSalud() - cantidad);

        // Recupera maná al ser golpeado
        setMana(getMana() + manaRecuperadoAlSerAtacado);

        System.out.println(getNombre() + " recibe " + cantidad + " de daño.");
        System.out.println(getNombre() + " recupera "
                + manaRecuperadoAlSerAtacado + " de maná al ser atacado.");
    }
}