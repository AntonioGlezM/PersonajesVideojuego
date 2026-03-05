/*package com.personajesvideojuegos.modelo.Personajes;

import com.personajesvideojuegos.modelo.Acciones.Ataque;
import com.personajesvideojuegos.modelo.capacidades.Atacante;

public class Barbaro extends PersonajeFisico implements Atacante {
    private int fuerza;
    private int ira;
    public Barbaro(String nombre, int salud, int poderBase,
                   String raza,
                   int fuerza) {
        super(nombre, salud*2, poderBase, raza, fuerza*2);
        this.fuerza = fuerza*2;
        this.ira = 0;
    }
    @Override
    public void setSalud(int salud) {

        super.setSalud(salud);
        if (salud < saludMaxima/2){
            this.ira = 10;
        } else {
            this.ira = 0;
        }
    }

    @Override
    public Ataque atacar() {
        return new Ataque(this.fuerza);
    }


    @Override
    public Ataque ataquePoderoso() {
        return new Ataque(this.fuerza + this.ira);
    }

    public void enojarse(){
        this.ira = 5;
    }
}*/
