/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio17;

/**
 *
 * @author Enrique
 */
public class Enunciado {
    // ATRIBUTOS
    private String pregunta;
    private String respuesta;
    
    // CONSTRUCTOR POR DEFECTO
    public Enunciado() {
        this.pregunta = "";
        this.respuesta = "";
    }
    
    // CONSTRUCTOR PARAMETRIZADO
    public Enunciado(String pregunta, String respuesta) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }
    
    // GETTERS Y SETTERS
    public String getPregunta() {
        return this.pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return this.respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    
    // MÉTODOS
    
    // TO STRING
    @Override
    public String toString() {
        return "Enunciado{" + "pregunta=" + pregunta + ", respuesta=" + respuesta + '}';
    }
}
