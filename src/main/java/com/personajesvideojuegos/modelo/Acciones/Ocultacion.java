package com.personajesvideojuegos.modelo.Acciones;

import com.personajesvideojuegos.modelo.Personaje;
import com.personajesvideojuegos.modelo.Personajes.Picaro;

public class Ocultacion extends Accion {
    public Ocultacion(int destreza) {
        super(destreza);
    }
    @Override
    public void realizarAccion(Personaje objetivo) {
        Picaro obj = (Picaro)objetivo;
        obj.setValorArmadura(obj.getValorArmadura + obj.getDestreza());
    }
}
