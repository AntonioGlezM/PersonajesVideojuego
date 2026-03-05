package com.personajesvideojuegos.modelo.conjuross;

import com.personajesvideojuegos.modelo.Personajes.Personaje;
/**
 * @author Alonso J rodríguez Betancor*/


public class Bendecir extends ConjuroSupport{
    public Bendecir(){
        super(3,6,"Bendecir","Con tu Fe puedes bendecir el arma de un aliado aumentando su daño",TipoConjuroSupport.FUERZA);
    }
    @Override
    public void realizarAccion(Personaje objetivo){
        System.out.println("Se ejecuta Accion: Bendecir sobre " + objetivo.getNombre() + ".");
        objetivo.setSalud(objetivo.getSalud()+this.getValor());
    }
}
