/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author alumno
 */
public abstract class Animal {
    // ATRIBUTOS
    private String nombre;
    private int edad;
    private int peso;
    
    // CONSTRUCTORES
    //Por defecto
    public Animal() {
        this.nombre="";
        this.edad=0;
        this.peso=0;
    }
    
    // Parametrizado
    public Animal(String nombre, int edad, int peso) {
        this.nombre=nombre;
        this.edad=edad;
        this.peso=peso;
    }
    
    // GETTERS Y SETTERS
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    
    public int getEdad() {
        return this.edad;
    }
    public void setEdad(int edad) {
        this.edad=edad;
    }
    
    public int getPeso() {
        return this.peso;
    }
    public void setPeso(int peso) {
        this.peso=peso;
    }
    
    // MÉTODOS
    public abstract String sonido();
    public abstract String alimentacion();
    public abstract String habitat();
    public abstract String nombreCientifico();
    
    //TO STRING
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Peso: " + peso;
    }
}
