package com.personajesvideojuegos.modelo.Pasivass.razas;

import com.personajesvideojuegos.modelo.Pasivass.Pasiva;

public class ElfoPasivas extends Pasiva {
    public ElfoPasivas(){
        super("P","Raza Elfo","Tus ventajas/Caracteristicas que te hace elfo ");
        agregarclasePasiva(new Pasiva("P1", "Ascendecncia Feerica", "Tienes ventajas en salvacion contra hechizos"){});
    }
}
