package com.personajesvideojuegos.modelo.Pasivass.clases;

import com.personajesvideojuegos.modelo.Pasivass.Pasiva;
/**
 * @author Alonso J rodríguez Betancor*/
public class PaladinPasivas extends Pasiva {
    public PaladinPasivas(){
        super("C", "Maestría del Paladin", "Aquí obtendras las pasivas del Paladin");
        agregarclasePasiva(new Pasiva("C1", "Sentido Divino", "Capacidad de detectar no muertos, infernales, Celestiales"){});

    }

}
