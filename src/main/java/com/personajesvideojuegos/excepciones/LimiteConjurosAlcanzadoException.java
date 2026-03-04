package com.personajesvideojuegos.excepciones;

public class LimiteConjurosAlcanzadoException extends RuntimeException {
    public LimiteConjurosAlcanzadoException() {
        super("Se ha alcanzado el límite de conjuros de su mago. Aumente la maestría si desea añadir más conjuros");
    }
}
