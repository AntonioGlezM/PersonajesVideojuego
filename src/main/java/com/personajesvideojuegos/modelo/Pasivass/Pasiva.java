package com.personajesvideojuegos.modelo.Pasivass;

import com.personajesvideojuegos.modelo.Personaje;
import com.personajesvideojuegos.modelo.Rasgo;

import java.util.List;
import java.util.ArrayList;

/**
 * @author Alonso J rodríguez Betancor*/
public abstract class Pasiva implements Rasgo {
    private String ID;
    private String titulo;
    private String descrip;
    private List<Pasiva> clasePasivas = new ArrayList<>();
    public Pasiva(String id, String Titulo, String Descripcion){
        this.ID = id;
        this.titulo = Titulo;
        this.descrip = Descripcion;
    }

    public void agregarclasePasiva(Pasiva p){
        clasePasivas.add(p);
    }

    public List<Pasiva> getClasePasivas() {
        return clasePasivas;
    }


}
