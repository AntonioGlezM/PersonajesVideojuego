package com.personajesvideojuegos.modelo.conjuross;

import com.personajesvideojuegos.modelo.Personajes.Personaje;
/**
 * @author Alonso J rodríguez Betancor*/


public class Paralisis extends ConjuroSupport{
    public Paralisis(){
        super(1,8,"Paralisis","Sientes como puedes crear una bloqueo fisico, lo tiras al enemigo",TipoConjuroSupport.ESTADO);
    }
    @Override
    public void realizarAccion(Personaje objetivo){
        System.out.println("Se ejecuta Accion: Paralisis sobre " + objetivo.getNombre() + ".");
        objetivo.setSalud(objetivo.getSalud()+this.getValor());
    }
}
