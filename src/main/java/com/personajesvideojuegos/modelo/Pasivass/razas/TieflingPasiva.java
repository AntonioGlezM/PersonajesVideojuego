package com.personajesvideojuegos.modelo.Pasivass.razas;

import com.personajesvideojuegos.modelo.Pasivass.Pasiva;
/**
 * @author Alonso J rodríguez Betancor*/


public class TieflingPasiva extends Pasiva {
    public TieflingPasiva(){
        super("H","Raza Tiefling","Tus caracteristicas por ser tiefling");
        agregarclasePasiva(new Pasiva("H1", "Vision Oscura", "Obtienese la capacidad de ponder ver en la oscuridad"){});
    }
}
//Esto son pasivas, que debido a no tener más tiempo, se hubiese implementaod