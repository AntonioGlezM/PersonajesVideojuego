package com.personajesvideojuegos.modelo.Pasivass.clases;
/**
 * @author Alonso J rodríguez Betancor*/
import com.personajesvideojuegos.modelo.Pasivass.Pasiva;

public class GuerreroPasivas extends Pasiva {
    public GuerreroPasivas() {
       super("A", "Maestria del Caballero", "Aquí obtendras las pasivas que necesita un caballero");

       agregarclasePasiva(new Pasiva("A1", "Maestria de armas", "Obtienese la capacidad de ponder usar armas simples y marciales"){});
        agregarclasePasiva(new Pasiva("A2", "Estilo de combate", "Al pasar del tiempo decisidistes a ponerte un estilo de combate"){});
        agregarclasePasiva(new Pasiva("A3", "Segundo aliento", "Al llegar al final de la barra de vida, se recuperas vida para seguir (10 PV)"){});
        agregarclasePasiva(new Pasiva("A4", "Ataque Extra", "Al casi finalalizar el ataque, puedes hacer otro ataque adicional"){});
        agregarclasePasiva(new Pasiva("A5", "Indomable", "tienes mayor resistencia al estar en salvación"){});
    }

}
