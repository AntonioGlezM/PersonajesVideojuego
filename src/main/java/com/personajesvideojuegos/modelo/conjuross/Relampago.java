package com.personajesvideojuegos.modelo.conjuross;

import com.personajesvideojuegos.modelo.Personajes.Personaje;
/**
 * @author Alonso J rodríguez Betancor*/


public class Relampago extends ConjuroDamage{
    public Relampago(){
        super(9,2,"Relampago","Tienes la sensacion de estatica alrededor de tu cuerpo, y lo canalizas y los lanzas");
    }
    @Override
    public void realizarAccion(Personaje objetivo){
        System.out.println("Se ejecuta Accion: Relampago sobre " + objetivo.getNombre() + ".");
        objetivo.setSalud(objetivo.getSalud()-noCero(this.getValor()));
    }

    public int noCero(int valor){
        return valor >= 0 ? valor : 0;
    }
}
