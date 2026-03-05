package com.personajesvideojuegos.modelo.conjuross;

import com.personajesvideojuegos.modelo.Personajes.Personaje;
/**
 * @author Alonso J rodríguez Betancor*/


public class BarreraArcana extends ConjuroSupport{
    public BarreraArcana(){
        super(3,7,"Barrera Arcana","Con esa sensación deseas proteger a un aliado, haciendo una protección",TipoConjuroSupport.DEFENSA);
    }
    @Override
    public void realizarAccion(Personaje objetivo){
        System.out.println("Se ejecuta Accion: BarreraArcana sobre " + objetivo.getNombre() + ".");
        objetivo.setSalud(objetivo.getSalud()+this.getValor());
    }
}
