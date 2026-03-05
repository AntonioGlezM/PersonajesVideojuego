package com.personajesvideojuegos.modelo.conjuross;

import com.personajesvideojuegos.modelo.Personaje;

/**
 * @author Alonso J rodríguez Betancor*/

public class FalsaVida extends ConjuroSupport{

    public FalsaVida(){
        super(5, 0, "Falsa vida", "Le adjudicas una vida que no existe", TipoConjuroSupport.CURACION);
    }

    @Override
    public void realizarAccion(Personaje objetivo){
        objetivo.setSalud(objetivo.getSalud()+this.getValor());
    }
}
