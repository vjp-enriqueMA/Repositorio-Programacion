/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author alumno
 */
public class Conductor {
    // ATRIBUTOS
    private String dni;
    private String nombre;
    
    // CONSTRUCTOR POR DEFECTO
    public Conductor() {
        this.dni = "";
        this.nombre = "";
    }
    
    // CONSTRUCTOR PARAMETRIZADO
    public Conductor(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
    
    // GETTERS Y SETTERS
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Conductor{" + "dni=" + dni + ", nombre=" + nombre + '}';
    }
    
}
