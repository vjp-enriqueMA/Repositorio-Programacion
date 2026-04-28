/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio21;

import java.io.Serializable;

/**
 *
 * @author alumno
 */
public class Asignatura implements Serializable {
    // ATRIBUTOS
    private String nombre;
    private float nota;
    
    // CONSTRUCTOR POR DEFECTO
    public Asignatura() {
        this.nombre = "";
        this.nota = 0.0f;
    }
    
    // CONSTRUCTOR PARAMETRIZADO
    public Asignatura(String nombre, float nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    
    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
    
}
