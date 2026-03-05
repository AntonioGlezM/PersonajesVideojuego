package com.personajesvideojuegos.modelo.conjuross;

import com.personajesvideojuegos.modelo.Personajes.Personaje;
/**
 * @author Alonso J rodríguez Betancor*/


public class CuradeFe extends ConjuroSupport {
    public CuradeFe(){
        super(9,5,"Cura de tu Fe", "Gracias a tu fe, pudes realizar una ayuda a tus aliados",TipoConjuroSupport.CURACION);
    }
    @Override
    public void realizarAccion(Personaje objetivo){
        System.out.println("Se ejecuta Accion: CuradeFe sobre " + objetivo.getNombre() + ".");
        objetivo.setSalud(objetivo.getSalud()+this.getValor());
    }

}
