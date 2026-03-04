package com.personajesvideojuegos.modelo.Personajes;

import com.personajesvideojuegos.modelo.Acciones.Ataque;
import com.personajesvideojuegos.modelo.Acciones.Conjuro;
import com.personajesvideojuegos.modelo.Acciones.Ocultacion;
import com.personajesvideojuegos.modelo.Personaje;
import com.personajesvideojuegos.modelo.capacidades.Sigiloso;

public class Picaro extends PersonajeFisico implements Sigiloso {
    int destreza;
    boolean oculto;

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

    public Picaro(String nombre, int salud, int poderBase, String raza, int atributoFisico) {
        super(nombre, salud, poderBase, raza, atributoFisico);
        this.destreza=atributoFisico;
        this.oculto=false;
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
    public Ocultacion Ocultarse() {
        return new Ocultacion(this.destreza, this);
    }
}
