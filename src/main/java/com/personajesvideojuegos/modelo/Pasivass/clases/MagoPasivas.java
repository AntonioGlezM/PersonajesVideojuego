package com.personajesvideojuegos.modelo.Pasivass.clases;

import com.personajesvideojuegos.modelo.Pasivass.Pasiva;

/**
 * @author Alonso J rodríguez Betancor*/
public class MagoPasivas extends Pasiva {
    public MagoPasivas (){
        super("B","Maestria de Mago","Aqui obtendras las pasivas de un mago");
        agregarclasePasiva(new Pasiva("B1", "Lanzamientos de conjuros", "Utilizas tu inteligencias para poder lanzar hechizos arcanos"){});
        agregarclasePasiva(new Pasiva("B2", "Recuperación arcana", "Rescuperas espacios de hechizos para poder ser lanzados otra vez despues de un descanso"){});
        agregarclasePasiva(new Pasiva("B3", "Ritualista", "Puedes lanzar conjuros sin perder espacios de hechizos"){});
        agregarclasePasiva(new Pasiva("B4", "Mejora de Caracteristicas", "Aumenta tus estadisticas de inteligencia y obtienes la capacidad arcana (+5 de bono de inteligencia)"){});
        agregarclasePasiva(new Pasiva("B5", "Dominio de Conjuros", "Obtienes la capacidad de lanzar conjuros de bajo nivel sin gastar espacios"){});
    }
}
