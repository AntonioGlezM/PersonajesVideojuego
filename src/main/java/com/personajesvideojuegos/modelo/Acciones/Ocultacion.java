package com.personajesvideojuegos.modelo.Acciones;

import com.personajesvideojuegos.modelo.Personajes.Personaje;
import com.personajesvideojuegos.modelo.Personajes.Picaro;
/**
 * @author Gabriel Francisco Ruiz Bolaños
 */
public class Ocultacion extends Accion {
    Personaje personaje;
    public Ocultacion(int destreza, Personaje personaje) {
        super(destreza);
        this.personaje = personaje;
    }
    @Override
    public void realizarAccion(Personaje personaje) {
        System.out.println("Se ejecuta Accion: Ocultacion sobre " + personaje.getNombre() + ".");
        Picaro obj = (Picaro)personaje;
        obj.setValorArmadura(obj.getValorArmadura() + obj.getDestreza());
        obj.setOculto(true);
    }

    public void realizarAccion() {
        this.realizarAccion(this.personaje);
    }
}
