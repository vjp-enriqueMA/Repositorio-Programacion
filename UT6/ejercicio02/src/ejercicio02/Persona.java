/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author alumno
 */
public abstract class Persona {
    // ATRIBUTOS
    private String nombre;

    // CONSTRUCTOR POR DEFECTO
    public Persona() {
        this.nombre="";
    }

    // CONSTRUCTOR PARAMETRIZADO
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    // GETTERS Y SETTERS
    public String getNombre() {
        return this.nombre;
    }
    public void setNumero(String nombre) {
        this.nombre=nombre;
    }   
    
    // MÉTODOS
    public abstract String saludar();
    
    //TO STRING
    @Override
    public String toString() {
        return "Nombre: " + nombre +"";
    }
}
