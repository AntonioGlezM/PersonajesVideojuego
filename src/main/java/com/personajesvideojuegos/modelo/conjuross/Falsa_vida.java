package com.personajesvideojuegos.modelo.conjuross;

import com.personajesvideojuegos.modelo.Personaje;

/**
 * @author Alonso J rodríguez Betancor*/

public class Falsa_vida extends ConjuroSupport{

    public Falsa_vida (){
        super(5, 0, "Falsa vida", "Le adjudicas una vida que no existe", TipoConjuroSupport.CURACION);
    }

    @Override
    public void realizarAccion(Personaje objetivo){
        objetivo.setSalud(objetivo.getSalud()+this.getValor());
    }
}
