/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author alumno
 */
public class Alumno {
    // ATRIBUTOS
    private String nombre;
    private int nota;
    
    // CONSTRUCTORES
    // POR DEFECTO
    public Alumno() {
        this.nombre="";
        this.nota=0;
    }
    
    // PARAMETRIZADO
    public Alumno(String nombre, int nota) {
        this.nombre=nombre;
        this.nota=nota;
    }
    
    // GETTERS Y SETTERS
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNotas(int nota) {
        this.nota=nota;
    }
    public int getNota() {
        return this.nota;
    }
    
    // MÉTODOS
    public String getCalificacion() {
        if (nota <0 || nota>10) {
            return "La nota no está entre 0 y 10";
        }
        else if (nota>0 && nota<=4) {
            return "Suspenso";
        }
        else if (nota>=5 && nota<=6) {
            return "Bien";
        }
        else if (nota>=7 && nota<=8) {
            return "Notable";
        }
        else {
            return "Sobresaliente";
        }
    }
    // TO STRING
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Nota: " + nota;
    }
}
