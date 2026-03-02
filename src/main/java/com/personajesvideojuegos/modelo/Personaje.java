package com.personajesvideojuegos.modelo;

import java.util.Objects;
import java.util.UUID;

public abstract class Personaje {

    // ID único obligatorio
    private final String id;

    // Atributos comunes
    private String nombre;
    private int nivel;
    private int salud;

    // Constructor
    public Personaje(String nombre, int nivel, int salud) {
        // Generamos un id único automáticamente
        this.id = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getSalud() {
        return salud;
    }

    // Setters (no hay setter de id porque no debe cambiar)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    // Método abstracto obligatorio.
    // Cada clase hija tendrá que definir cómo ataca.
    public abstract void atacar(Personaje objetivo);

    // toString para mostrar información del personaje
    @Override
    public String toString() {
        return "ID: " + id +
                " | Nombre: " + nombre +
                " | Nivel: " + nivel +
                " | Salud: " + salud;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Personaje that = (Personaje) obj;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}