package com.personajesvideojuegos.modelo.Pasivass.clases;

import com.personajesvideojuegos.modelo.Pasivass.Pasiva;
/**
 * @author Alonso J rodríguez Betancor*/
public class PaladinPasivas extends Pasiva {
    public PaladinPasivas(){
        super("C", "Maestría del Paladin", "Aquí obtendras las pasivas del Paladin");
        agregarclasePasiva(new Pasiva("C1", "Sentido Divino", "Capacidad de detectar no muertos, infernales, Celestiales"){});
        agregarclasePasiva(new Pasiva("C2", "Imposición de manos", "Reserva de curación para ti como aliados"){});
        //agregarclasePasiva(new Pasiva("C3", "Maestria de armas", "Obtienese la capacidad de ponder usar armas simples y marciales"){});
        //agregarclasePasiva(new Pasiva("C4", "Maestria de armas", "Obtienese la capacidad de ponder usar armas simples y marciales"){});
        //agregarclasePasiva(new Pasiva("C5", "Maestria de armas", "Obtienese la capacidad de ponder usar armas simples y marciales"){});
    }

}
