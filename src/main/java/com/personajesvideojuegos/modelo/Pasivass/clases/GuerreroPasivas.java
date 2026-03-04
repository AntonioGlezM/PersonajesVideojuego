package com.personajesvideojuegos.modelo.Pasivass.clases;
/**
 * @author Alonso J rodríguez Betancor*/
import com.personajesvideojuegos.modelo.Pasivass.Pasiva;

public class GuerreroPasivas extends Pasiva {
    public GuerreroPasivas() {
       super("A", "Maestria del Caballero", "Aquí obtendras las pasivas que necesita un caballero");

       agregarclasePasiva(new Pasiva("A1", "Maestria de armas", "Obtienese la capacidad de ponder usar armas simples y marciales"){});

    }

}
