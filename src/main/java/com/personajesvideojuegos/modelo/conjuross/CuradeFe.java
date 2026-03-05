package com.personajesvideojuegos.modelo.conjuross;

import com.personajesvideojuegos.modelo.Personaje;
/**
 * @author Alonso J rodríguez Betancor*/


public class CuradeFe extends ConjuroSupport {
    public CuradeFe(){
        super(9,5,"Cura de tu Fe", "Gracias a tu fe, pudes realizar una ayuda a tus aliados",TipoConjuroSupport.CURACION);
    }
    @Override
    public void realizarAccion(Personaje objetivo){
        objetivo.setSalud(objetivo.getSalud()+this.getValor());
    }

}
