package com.personajesvideojuegos.main;

import com.personajesvideojuegos.modelo.Acciones.Accion;
import com.personajesvideojuegos.modelo.Personajes.Personaje;
import com.personajesvideojuegos.modelo.Personajes.Clerigo;
import com.personajesvideojuegos.modelo.Personajes.Barbaro;
import com.personajesvideojuegos.modelo.Personajes.Guerrero;
import com.personajesvideojuegos.modelo.Personajes.Mago;
import com.personajesvideojuegos.modelo.Personajes.Paladin;
import com.personajesvideojuegos.modelo.Personajes.Picaro;
import com.personajesvideojuegos.modelo.capacidades.Atacante;
import com.personajesvideojuegos.modelo.capacidades.Defensor;
import com.personajesvideojuegos.modelo.capacidades.LanzadorConjuros;
import com.personajesvideojuegos.modelo.capacidades.Medico;
import com.personajesvideojuegos.modelo.capacidades.Sigiloso;
import com.personajesvideojuegos.modelo.Armas.Arco;
import com.personajesvideojuegos.modelo.Armas.BastonMagico;
import com.personajesvideojuegos.modelo.Armas.CategoriaArma;
import com.personajesvideojuegos.modelo.Armas.Espada;
import com.personajesvideojuegos.modelo.Armas.Hacha;
import com.personajesvideojuegos.modelo.Armas.Martillo;
import com.personajesvideojuegos.modelo.Armas.Vendas;
import com.personajesvideojuegos.modelo.Consumibles.PocionCuracion;
import com.personajesvideojuegos.modelo.Consumibles.PocionFuerza;
import com.personajesvideojuegos.modelo.Consumibles.PocionMana;

import java.util.ArrayList;

/**
 * Punto de entrada del programa.
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Personaje> personajes = new ArrayList<>();
        ArrayList<Accion> acciones = new ArrayList<>();

        Barbaro barbaro = new Barbaro("Vor", 10, 5, "Humano", 6);
        Guerrero guerrero = new Guerrero("Thorin", 11, 5, "Enano", 6, 4);
        Paladin paladin = new Paladin("Aldric", 12, 4, "Humano", 5, 6);
        Picaro picaro = new Picaro("Nyx", 9, 4, "Elfo", 7);
        Mago mago = new Mago("Merik", 8, 3, "Tiefling", 8, 7);
        Clerigo clerigo = new Clerigo("Iria", 10, 3, "Humano", 7, 6, 6);

        barbaro.equiparArma(new Hacha("Hacha de guerra", 6,  CategoriaArma.RARA));
        guerrero.equiparArma(new Espada("Espada larga", 5, CategoriaArma.RARA));
        paladin.equiparArma(new Martillo("Martillo sagrado", 5, CategoriaArma.EPICA));
        picaro.equiparArma(new Arco("Arco corto", 4, CategoriaArma.COMUN));
        mago.equiparArma(new BastonMagico("Baston arcano", 5, CategoriaArma.RARA));
        clerigo.equiparArma(new Vendas("Vendas benditas", 4, CategoriaArma.COMUN));

        personajes.add(barbaro);
        personajes.add(guerrero);
        personajes.add(paladin);
        personajes.add(picaro);
        personajes.add(mago);
        personajes.add(clerigo);

        barbaro.getInventario().add(new PocionFuerza("Tonico Berserker", 3));
        guerrero.getInventario().add(new PocionFuerza("Elixir Marcial", 2));
        paladin.getInventario().add(new PocionCuracion("Infusion Sagrada", 4));
        picaro.getInventario().add(new PocionCuracion("Cataplasma de Sombras", 3));
        mago.getInventario().add(new PocionMana("Esencia Arcana", 3));
        clerigo.getInventario().add(new PocionMana("Agua Bendita de Mana", 2));

        for (Personaje personaje : personajes) {
            personaje.usarConsumible(0, personaje);
        }

        for (Personaje personaje : personajes) {
            Accion accion;
            if (personaje instanceof Medico medico) {
                accion = medico.curar();
            } else if (personaje instanceof LanzadorConjuros lanzadorConjuros) {
                accion = lanzadorConjuros.LanzarConjuro(0);
            } else if (personaje instanceof Atacante atacante) {
                accion = atacante.ataquePoderoso();
            } else if (personaje instanceof Defensor defensor) {
                accion = defensor.defender();
            } else if (personaje instanceof Sigiloso sigiloso) {
                accion = sigiloso.ocultarse();
            } else {
                accion = personaje.atacar();
            }
            acciones.add(accion);
        }

        for (int i = 0; i < acciones.size(); i++) {
            acciones.get(i).realizarAccion(personajes.get(i));
        }
    }
}
