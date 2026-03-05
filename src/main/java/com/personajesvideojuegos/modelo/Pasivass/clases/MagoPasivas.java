package com.personajesvideojuegos.modelo.Pasivass.clases;

import com.personajesvideojuegos.modelo.Pasivass.Pasiva;

/**
 * @author Alonso J rodríguez Betancor*/
public class MagoPasivas extends Pasiva {
    public MagoPasivas (){
        super("B","Maestria de Mago","Aqui obtendras las pasivas de un mago");
        agregarclasePasiva(new Pasiva("B1", "Lanzamientos de conjuros", "Utilizas tu inteligencias para poder lanzar hechizos arcanos"){});

    }
}
//Esto son pasivas, que debido a no tener más tiempo, se hubiese implementaod