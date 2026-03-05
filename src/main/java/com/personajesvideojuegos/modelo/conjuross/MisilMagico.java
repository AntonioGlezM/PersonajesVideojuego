package com.personajesvideojuegos.modelo.conjuross;

import com.personajesvideojuegos.modelo.Personajes.Personaje;
/**
 * @author Alonso J rodríguez Betancor*/


public class MisilMagico extends ConjuroDamage{
    public MisilMagico(){
        super(4,4,"Misil Magico","Canalizas tu magia dividiendola en varias bolas haciendo que puedas lanzarlos");
    }
    @Override
    public void realizarAccion(Personaje objetivo){
        System.out.println("Se ejecuta Accion: MisilMagico sobre " + objetivo.getNombre() + ".");
        objetivo.setSalud(objetivo.getSalud()-noCero(this.getValor()));
    }

    public int noCero(int valor){
        return valor >= 0 ? valor : 0;
    }
}
