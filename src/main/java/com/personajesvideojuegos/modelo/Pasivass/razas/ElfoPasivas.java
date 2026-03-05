package com.personajesvideojuegos.modelo.Pasivass.razas;

import com.personajesvideojuegos.modelo.Pasivass.Pasiva;
/**
 * @author Alonso J rodríguez Betancor*/


public class ElfoPasivas extends Pasiva {
    public ElfoPasivas(){
        super("P","Raza Elfo","Tus ventajas/Caracteristicas que te hace elfo ");
        agregarclasePasiva(new Pasiva("P1", "Ascendecncia Feerica", "Tienes ventajas en salvacion contra hechizos"){});
    }
}
//Esto son pasivas, que debido a no tener más tiempo, se hubiese implementaod