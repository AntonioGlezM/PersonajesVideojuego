package com.personajesvideojuegos.modelo;

/**
 * @author Alonso J rodríguez Betancor
 */
public abstract class Conjuro {

  private int id;
  private String nombre;
  private String descripcion;

  public Conjuro(int ID, String nombre, String descripcion) {
    this.id = ID;
    this.nombre = nombre;
    this.descripcion = descripcion;

  }

}
