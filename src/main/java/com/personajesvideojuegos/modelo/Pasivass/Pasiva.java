package com.personajesvideojuegos.modelo.Pasivass;

import com.personajesvideojuegos.modelo.Rasgo;
/**
 * @author Alonso J rodríguez Betancor*/
public abstract class Pasiva implements Rasgo {
    private String ID;
    private String titulo;
    private String descrip;
    public Pasiva(String id, String Titulo, String Descripcion){
        this.ID = id;
        this.titulo = Titulo;
        this.descrip = Descripcion;
    }
}
