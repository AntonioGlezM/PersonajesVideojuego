package com.personajesvideojuegos.modelo.Personajes;

import com.personajesvideojuegos.modelo.Acciones.Ataque;
import com.personajesvideojuegos.modelo.Acciones.Conjuro;
import com.personajesvideojuegos.modelo.Acciones.Ocultacion;
import com.personajesvideojuegos.modelo.Pasivass.Pasiva;
import com.personajesvideojuegos.modelo.Pasivass.clases.PicaroPasivas;
import com.personajesvideojuegos.modelo.Personaje;
import com.personajesvideojuegos.modelo.capacidades.Sigiloso;

/**
 * @author Gabriel Francisco Ruíz Bolaños*/
public class Picaro extends PersonajeFisico implements Sigiloso {
    int destreza;
    boolean oculto;
    private Pasiva pasiva;

    public Picaro(String nombre, int salud, int poderBase, String raza, int atributoFisico) {
        super(nombre, salud, poderBase, raza, atributoFisico);
        this.destreza=atributoFisico;
        this.oculto=false;
        this.pasiva = new PicaroPasivas();
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public boolean isOculto() {
        return oculto;
    }

    public void setOculto(boolean oculto) {
        this.oculto = oculto;
    }



    @Override
    public Ataque atacar() {
        if (this.oculto){
            return ataqueFurtivo();
        }else {
            this.oculto=false;
            int potencia = this.getArmaEquipada().calcularDanio() + this.getPoderBase();
            return new Ataque(potencia);
        }

    }

    private Ataque ataqueFurtivo(){
        this.oculto=false;
        int potencia = (this.getArmaEquipada().calcularDanio() + this.getPoderBase())*2;
        return new Ataque(potencia);
    }


    @Override
    public Ocultacion ocultarse() {
        return new Ocultacion(this.destreza, this);
    }
}
