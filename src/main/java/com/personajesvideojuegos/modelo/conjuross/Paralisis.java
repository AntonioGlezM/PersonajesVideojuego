package com.personajesvideojuegos.modelo.conjuross;

import com.personajesvideojuegos.modelo.Personaje;
/**
 * @author Alonso J rodríguez Betancor*/


public class Paralisis extends ConjuroSupport{
    public Paralisis(){
        super(1,8,"Paralisis","Sientes como puedes crear una bloqueo fisico, lo tiras al enemigo",TipoConjuroSupport.ESTADO);
    }
    @Override
    public void realizarAccion(Personaje objetivo){
        objetivo.setSalud(objetivo.getSalud()+this.getValor());
    }
}
