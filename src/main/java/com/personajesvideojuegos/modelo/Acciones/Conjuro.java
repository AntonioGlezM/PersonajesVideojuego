package com.personajesvideojuegos.modelo.Acciones;

/**
 * @author Alonso J rodríguez Betancor
 */
public abstract class Conjuro extends Accion {

  private int id;
  private String nombre;
  private String descripcion;

  public Conjuro(int valor, int ID, String nombre, String descripcion) {
    super(valor);
    this.id = ID;
    this.nombre = nombre;
    this.descripcion = descripcion;
  }

}
