package com.personajesvideojuegos.modelo.conjuross;

import com.personajesvideojuegos.modelo.Personaje;

/**
 * @author Alonso J rodríguez Betancor*/

public class Bola_de_fuego extends ConjuroDamage{

    public Bola_de_fuego (){
        super(7, 1, "Bola de fuego", "Canalizas una energia que se hace en una bola de fuego");

    }


    @Override
    public void realizarAccion(Personaje objetivo){
        objetivo.setSalud(objetivo.getSalud()-noCero(this.getValor()));
    }

    public int noCero(int valor){
        return valor >= 0 ? valor : 0;
    }

}
