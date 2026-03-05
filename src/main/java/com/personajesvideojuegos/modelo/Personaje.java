package com.personajesvideojuegos.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import com.personajesvideojuegos.modelo.Acciones.Ataque;
import com.personajesvideojuegos.modelo.Armas.Armas;
import com.personajesvideojuegos.modelo.Armadura.Armadura;
import com.personajesvideojuegos.modelo.Consumibles.Consumibles;
import com.personajesvideojuegos.modelo.Consumibles.PocionCuracion;
import com.personajesvideojuegos.modelo.Consumibles.PocionFuerza;
import com.personajesvideojuegos.modelo.Consumibles.PocionMana;

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

    private final String id;

    private String nombre;

    private int salud;
    protected int saludMaxima;
    private int poderBase;

    private String raza;

    private int valorArmadura;

    private Armas armaEquipada;
    private Armadura armaduraEquipada;

    private List<Consumibles> inventario;

    /**
     * Constructor principal del personaje.
     *
     * @param nombre        Nombre del personaje
     * @param salud         Vida inicial
     * @param poderBase     Daño base del personaje
     * @param raza          Raza del personaje
     * @param claseArmadura Valor de armadura
     */
    public Personaje(String nombre, int salud, int poderBase,
            String raza, int claseArmadura) {

        this.id = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.salud = salud;
        this.saludMaxima = salud;
        this.poderBase = poderBase;
        this.raza = raza;
        this.valorArmadura = claseArmadura;

        // Inicializa el inventario vacío
        this.inventario = new ArrayList<>();
    }

    // GETTERS

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }


    public int getSalud() {
        return salud;
    }

    public int getSaludMaxima() {
        return saludMaxima;
    }

    public int getPoderBase() {
        return poderBase;
    }

    public String getRaza() {
        return raza;
    }

    public int getValorArmadura() {
        
        int defensaTotal = valorArmadura;

        if (armaduraEquipada != null) {
            defensaTotal += armaduraEquipada.calcularDefensa();
        }

        return defensaTotal;
    }

    public Armas getArmaEquipada() {
        return armaEquipada;
    }

    public Armadura getArmaduraEquipada() {
        return armaduraEquipada;
    }

    public List<Consumibles> getInventario() {
        return inventario;
    }

    // SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalud(int salud) {
        if (salud < 0) {
            this.salud = 0;
            return;
        }
        if (salud > this.saludMaxima) {
            this.salud = this.saludMaxima;
            return;
        }
        this.salud = salud;
    }


    public void setSaludMaxima(int saludMaxima) {
        if (saludMaxima < 0) {
            this.saludMaxima = 0;
        } else {
            this.saludMaxima = saludMaxima;
        }
        if (this.salud > this.saludMaxima) {
            this.salud = this.saludMaxima;
        }
    }

    public void setValorArmadura(int valor) {
        this.valorArmadura = valor;
    }

    public void setPoderBase(int poderBase) {
        this.poderBase = poderBase;
    }

    /**
     * Permite equipar un arma al personaje.
     *
     * @param arma Arma que se va a equipar
     */
    public void equiparArma(Armas arma) {
        this.armaEquipada = arma;
        System.out.println(nombre + " ha equipado " + arma.getNombre());
    }

    public void equiparArmadura(Armadura armadura) {
        this.armaduraEquipada = armadura;
        System.out.println(nombre + " ha equipado " + armadura.getNombre());
    }

    /**
     * Reduce la salud del personaje teniendo en cuenta su armadura.
     *
     * @param danio Daño recibido antes de aplicar armadura
     */
    public void recibirDanio(int danio) {

        // Se resta la armadura al daño recibido
        int danioFinal = danio - getValorArmadura();

        // Evita daño negativo
        if (danioFinal < 0)
            danioFinal = 0;

        // Se descuenta la vida
        this.salud -= danioFinal;

        // Evita vida negativa
        if (this.salud < 0)
            this.salud = 0;

        System.out.println(nombre + " recibe " + danioFinal + " de daño.");
    }

    /**
     * Indica si el personaje sigue vivo.
     *
     * @return true si tiene salud mayor que 0
     */
    public boolean estaVivo() {
        return this.salud > 0;
    }


    // Cada personaje define como ataca
    public abstract Ataque atacar();

    /**
     * Carga los consumibles iniciales al comenzar un combate.
     * Cada personaje empieza con:
     * - Poción de curación
     * - Poción de maná
     * - Poción de fuerza
     */
    public void cargarConsumiblesIniciales() {

        inventario.clear();

        inventario.add(new PocionCuracion("Poción de Curación", 30));
        inventario.add(new PocionMana("Poción de Maná", 20));
        inventario.add(new PocionFuerza("Poción de Fuerza", 10));

        System.out.println(nombre + " recibe consumibles iniciales.");
    }

    /**
     * Permite usar un consumible del inventario.
     *
     * @param index    Posición del consumible
     * @param objetivo Personaje que recibirá el efecto
     */
    public void usarConsumible(int index, Personaje objetivo) {

        if (index < 0 || index >= inventario.size()) {
            System.out.println("Consumible inválido.");
            return;
        }

        Consumibles consumible = inventario.get(index);

        // Aplica el efecto
        consumible.usar(objetivo);

        // Se elimina tras usarlo
        inventario.remove(index);
    }

    /**
     * Devuelve el rol del personaje según su clase concreta.
     */
    public String getRol() {
        return this.getClass().getSimpleName();
    }

    /**
     * Representación completa del personaje.
     */
    @Override
    public String toString() {
        return "========== FICHA ==========" +
                "\nID: " + id +
                "\nNombre: " + nombre +
                "\nRaza: " + raza +
                "\nRol: " + getRol() +
                "\nSalud: " + salud + "/" + saludMaxima +
                "\nPoder Base: " + poderBase +
                "\nClase de Armadura: " + valorArmadura +
                "\nArma equipada: " +
                (armaEquipada != null ? armaEquipada.getNombre() : "Ninguna") +
                "\nEstado: " + (estaVivo() ? "VIVO" : "DERROTADO") +
                "\n===========================";
    }

    /**
     * Dos personajes son iguales si comparten el mismo ID.
     */
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
