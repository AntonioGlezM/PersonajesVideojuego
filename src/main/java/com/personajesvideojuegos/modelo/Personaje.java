package com.personajesvideojuegos.modelo;

import java.util.Objects;
import java.util.UUID;

import com.personajesvideojuegos.modelo.Armas.Armas;

/**
 * Clase abstracta inspirada en Dungeons & Dragons.
 * Define atributos comunes a TODOS los personajes.
 * 
 * El rol del personaje no se guarda como atributo,
 * sino que lo determina la clase hija (Guerrero, Mago, etc.).
 */

/**
 * @author Antonio González Martel
 */

public abstract class Personaje {

    // ID único
    private final String id;

    private String nombre;
    private int salud;
    private int poderBase;
    private String raza;
    private int valorArmadura;

    private Armas armaEquipada;

    public Personaje(String nombre, int nivel, int salud, int poderBase,
            String raza, int claseArmadura) {

        this.id = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.salud = salud;
        this.poderBase = poderBase;
        this.raza = raza;
        this.valorArmadura = claseArmadura;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }


    public int getSalud() {
        return salud;
    }

    public int getPoderBase() {
        return poderBase;
    }

    public String getRaza() {
        return raza;
    }

    public int getValorArmadura() {
        return valorArmadura;
    }

    public Armas getArmaEquipada() {
        return armaEquipada;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public void setValorArmadura(int valor){
        this.valorArmadura = valor;
    }

    public void setPoderBase(int poderBase) {
        this.poderBase = poderBase;
    }

    public void equiparArma(Armas arma) {
        this.armaEquipada = arma;
        System.out.println(nombre + " ha equipado " + arma.getNombre());
    }

    public void recibirDanio(int danio) {

        int danioFinal = danio - valorArmadura;
        if (danioFinal < 0)
            danioFinal = 0;

        this.salud -= danioFinal;
        if (this.salud < 0)
            this.salud = 0;

        System.out.println(nombre + " recibe " + danioFinal + " de daño.");
    }

    public boolean estaVivo() {
        return salud > 0;
    }


    // Cada personaje define como ataca
    public abstract void atacar(Personaje objetivo);

    // Devuelve el rol según la clase hija.

    public String getRol() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return "========== FICHA ==========" +
                "\nID: " + id +
                "\nNombre: " + nombre +
                "\nRaza: " + raza +
                "\nRol: " + getRol() +
                "\nSalud: " + salud +
                "\nPoder Base: " + poderBase +
                "\nClase de Armadura: " + valorArmadura +
                "\nArma equipada: " +
                (armaEquipada != null ? armaEquipada.getNombre() : "Ninguna") +
                "\nEstado: " + (estaVivo() ? "VIVO" : "DERROTADO") +
                "\n===========================";
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
