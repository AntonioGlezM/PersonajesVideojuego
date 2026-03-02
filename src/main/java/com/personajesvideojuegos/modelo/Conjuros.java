package com.personajesvideojuegos.modelo;
/**
 * @author Alonso J rodríguez Betancor*/
public abstract class Conjuros {

    private int id;
    private String nombre;
    private String descripcion;

    public Conjuros(int ID, String nombre, String descripcion){
        this.id = ID;
        this.nombre = nombre;
        this.descripcion = descripcion;

    }

}
