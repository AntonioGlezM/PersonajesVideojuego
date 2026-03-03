package com.personajesvideojuegos.modelo.Pasivass.razas;

import com.personajesvideojuegos.modelo.Pasivass.Pasiva;

public class TieflingPasiva extends Pasiva {
    public TieflingPasiva(){
        super("H","Raza Tiefling","Tus caracteristicas por ser tiefling");
        agregarclasePasiva(new Pasiva("H1", "Vision Oscura", "Obtienese la capacidad de ponder ver en la oscuridad"){});
    }
}
