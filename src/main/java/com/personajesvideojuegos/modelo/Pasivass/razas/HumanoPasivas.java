package com.personajesvideojuegos.modelo.Pasivass.razas;

import com.personajesvideojuegos.modelo.Pasivass.Pasiva;
/**
 * @author Alonso J rodríguez Betancor*/

public class HumanoPasivas extends Pasiva {
    public HumanoPasivas(){
        super("G","Raza Humana","Aqui tienes tus ventajas por ser humano");
        agregarclasePasiva(new Pasiva("G1", "Aumento", "A la hora de hacer daño, tienes un daño extra"){});
    }
}
//Esto son pasivas, que debido a no tener más tiempo, se hubiese implementaod