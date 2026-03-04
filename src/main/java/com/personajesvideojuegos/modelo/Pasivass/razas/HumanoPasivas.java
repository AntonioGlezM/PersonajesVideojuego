package com.personajesvideojuegos.modelo.Pasivass.razas;

import com.personajesvideojuegos.modelo.Pasivass.Pasiva;

public class HumanoPasivas extends Pasiva {
    public HumanoPasivas(){
        super("G","Raza Humana","Aqui tienes tus ventajas por ser humano");
        agregarclasePasiva(new Pasiva("G1", "Aumento", "A la hora de hacer daño, tienes un daño extra"){});
    }
}
