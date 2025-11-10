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
    
}
