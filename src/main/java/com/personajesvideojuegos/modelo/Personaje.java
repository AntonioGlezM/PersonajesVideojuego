package com.personajesvideojuegos.modelo;

import java.util.Objects;
import java.util.UUID;

import com.personajesvideojuegos.modelo.Armadura.Armadura;
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
    private int nivel;
    private int salud;
    private int poderBase;
    private String raza;
    private int claseArmadura;

    private Armas armaEquipada;
    private Armadura armaduraEquipada;

    public Personaje(String nombre, int nivel, int salud, int poderBase,
            String raza, int claseArmadura) {

        this.id = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
        this.poderBase = poderBase;
        this.raza = raza;
        this.claseArmadura = claseArmadura;
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

    public int getPoderBase() {
        return poderBase;
    }

    public String getRaza() {
        return raza;
    }

    public int getClaseArmadura() {
        return claseArmadura;
    }

    public Armas getArmaEquipada() {
        return armaEquipada;
    }

    public Armas getArmaduraEquipada() {
        return armaduraEquipada;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public void setPoderBase(int poderBase) {
        this.poderBase = poderBase;
    }

    public void equiparArma(Armas arma) {
        this.armaEquipada = arma;
        System.out.println(nombre + " ha equipado " + arma.getNombre());
    }

    public void equiparArmadura(Armadura armadura){
        this.armaduraEquipada = armadura;
        System.out.println(nombre + " ha equipado " + armadura.getNombre());
    }

    public void recibirDanio(int danio) {

        int danioFinal = danio - claseArmadura;
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

    public void subirNivel() {
        nivel++;
        poderBase += 2;
        salud += 10;

        System.out.println(nombre + " sube a nivel " + nivel);
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
                "\nNivel: " + nivel +
                "\nSalud: " + salud +
                "\nPoder Base: " + poderBase +
                "\nClase de Armadura: " + claseArmadura +
                "\nArma equipada: " +
                (armaEquipada != null ? armaEquipada.getNombre() : "Ninguna") +
                "\nArmadura equipada: " +
                (armaduraEquipada != null ? armaduraEquipada.getNombre() : "Ninguna") +
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