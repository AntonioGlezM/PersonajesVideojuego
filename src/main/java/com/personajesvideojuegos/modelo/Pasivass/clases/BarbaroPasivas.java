package com.personajesvideojuegos.modelo.Pasivass.clases;

import com.personajesvideojuegos.modelo.Pasivass.Pasiva;

/**
 * @author Alonso J rodríguez Betancor*/
public class BarbaroPasivas extends Pasiva {
    public BarbaroPasivas(){
        super("E","Maestria del Barbaro","Obtendras las pasivas de un Barbaro");
        agregarclasePasiva(new Pasiva("E1", "IRA", "Resistencia al daño fisico y daño extra cuerpo a cuerpo"){});
    }
}
