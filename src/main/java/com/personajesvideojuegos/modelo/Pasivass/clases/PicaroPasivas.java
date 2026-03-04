package com.personajesvideojuegos.modelo.Pasivass.clases;

import com.personajesvideojuegos.modelo.Pasivass.Pasiva;

public class PicaroPasivas extends Pasiva {
    public PicaroPasivas(){
        super("F","Maestría de Picaro","Aquí obtendras las pasivas del Picaro");
        agregarclasePasiva(new Pasiva("F1", "Ataque furtivo", "Obtienes un daño adicional al hacer ataques furtivos, con ventaja"){});
    }
}
