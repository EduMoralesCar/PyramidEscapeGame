// GestorPreguntas.java
package logica;

import java.util.ArrayList;
import java.util.List;

public class GestorPreguntas {
    private static final List<Pregunta> preguntas = new ArrayList<>();

    static {
        preguntas.add(new Pregunta("¿Cuál es la pirámide más alta de Egipto?", "Keops"));
        preguntas.add(new Pregunta("¿En qué ciudad se encuentran las pirámides de Giza?", "El Cairo"));
        preguntas.add(new Pregunta("¿Qué forma tiene la base de una pirámide egipcia?", "Cuadrada"));
    }

    public static Pregunta obtenerPregunta(int nivel) {
        return preguntas.get(nivel - 1);
    }
}
