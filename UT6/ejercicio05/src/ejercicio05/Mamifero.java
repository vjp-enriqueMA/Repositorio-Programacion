/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05;

/**
 *
 * @author Enrique
 */
public class Mamifero {
    // ATRIBUTOS
    private String nombre;
    private String sexo;
    private String color;
    private int edad;
    
    // CONSTRUCTOR POR DEFECTO
    public Mamifero() {
        this.nombre = "";
        this.sexo = "";
        this.color = "";
        this.edad = 0;    
    }
    
    // CONSTRUCTOR PARAMETRIZADO
    public Mamifero(String nombre, String sexo, String color, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.color = color;
        this.edad = edad;
    }
    
    // GETTERS Y SETTERS
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    // MÉTODOS
    
    // TO STRING
    @Override
    public String toString() {
        return "Mamifero{" + "nombre=" + nombre + ", sexo=" + sexo + ", color=" + color + ", edad=" + edad + '}';
    }
    
}
