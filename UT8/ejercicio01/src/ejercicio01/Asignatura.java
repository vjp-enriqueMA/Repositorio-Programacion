/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author alumno
 */
public class Asignatura {
    // ATRIBUTOS
    private double nota;
    private String asignatura;
    
    // CONSTRUCTOR POR DEFECTO
    public Asignatura() {
        this.nota = 0;
        this.asignatura = "";
    }

    // CONSTRUCTOR PARAMETRIZADO
    public Asignatura(double nota, String asignatura) {
        this.nota = nota;
        this.asignatura = asignatura;
    }
    
    // GETTERS Y SETTERS
    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Asignatura{" + "nota=" + nota + ", asignatura=" + asignatura + '}';
    }
    
}
