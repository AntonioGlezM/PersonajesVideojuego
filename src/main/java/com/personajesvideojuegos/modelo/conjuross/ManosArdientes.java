package com.personajesvideojuegos.modelo.conjuross;

import com.personajesvideojuegos.modelo.Personaje;

public class ManosArdiantes extends ConjuroDamage{
    public ManosArdiantes(){
        super(6,3,"Manos Ardientes","Sientes que esa canalizacion de fuegom se reparte por tus manos, y puedes extenderlos, lanzando a corta distancia en grupo");
    }
    @Override
    public void realizarAccion(Personaje objetivo){
        objetivo.setSalud(objetivo.getSalud()-noCero(this.getValor()));
    }

    public int noCero(int valor){
        return valor >= 0 ? valor : 0;
    }
}
