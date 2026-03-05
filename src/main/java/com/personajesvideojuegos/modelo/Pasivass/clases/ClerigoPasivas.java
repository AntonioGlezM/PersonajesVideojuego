package com.personajesvideojuegos.modelo.Pasivass.clases;

import com.personajesvideojuegos.modelo.Pasivass.Pasiva;

/**
 * @author Alonso J rodríguez Betancor*/
public class ClerigoPasivas extends Pasiva {
    public ClerigoPasivas(){
        super("D","Maestria de Clerigo","Aqui obtendras las pasivas deL Clerigo");
        agregarclasePasiva(new Pasiva("A1", "Lanzamiento de conjuros Divinos", "Usas tu sabiduría para poder lanzar conjuros de tu bendición"){});
    }
}
//Esto son pasivas, que debido a no tener más tiempo, se hubiese implementaod