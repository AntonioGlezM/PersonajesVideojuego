package com.personajesvideojuegos.modelo.conjuross;

import com.personajesvideojuegos.modelo.Personaje;
/**
 * @author Alonso J rodríguez Betancor*/


public class Bendecir extends ConjuroSupport{
    public Bendecir(){
        super(3,6,"Bendecir","Con tu Fe puedes bendecir el arma de un aliado aumentando su daño",TipoConjuroSupport.FUERZA);
    }
    @Override
    public void realizarAccion(Personaje objetivo){
        objetivo.setSalud(objetivo.getSalud()+this.getValor());
    }
}
