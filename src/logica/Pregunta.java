// Pregunta.java
package logica;

public class Pregunta {
    private String pregunta;
    private String respuesta;

    public Pregunta(String pregunta, String respuesta) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public boolean verificarRespuesta(String respuestaUsuario) {
        return this.respuesta.equalsIgnoreCase(respuestaUsuario.trim());
    }
}

