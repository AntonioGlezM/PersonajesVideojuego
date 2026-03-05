package com.personajesvideojuegos.modelo.conjuross;

import com.personajesvideojuegos.modelo.Personajes.Personaje;
/**
 * @author Alonso J rodríguez Betancor*/


public class ManosArdientes extends ConjuroDamage{
    public ManosArdientes(){
        super(6,3,"Manos Ardientes","Sientes que esa canalizacion de fuegom se reparte por tus manos, y puedes extenderlos, lanzando a corta distancia en grupo");
    }
    @Override
    public void realizarAccion(Personaje objetivo){
        System.out.println("Se ejecuta Accion: ManosArdientes sobre " + objetivo.getNombre() + ".");
        objetivo.setSalud(objetivo.getSalud()-noCero(this.getValor()));
    }

    public int noCero(int valor){
        return valor >= 0 ? valor : 0;
    }
}
