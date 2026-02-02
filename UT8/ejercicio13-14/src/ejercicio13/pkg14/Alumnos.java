/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13.pkg14;

/**
 *
 * @author alumno
 */
public class Alumnos {
    // ATRIBUTOS
    private String nombre;
    private int edad;
    private double notaMedia;
    
    // CONSTRUCTOR POR DEFECTO
    public Alumnos() {
        this.nombre = "";
        this.edad = 0;
        this.notaMedia = 0;
    }
    
    // CONSTRUCTOR PARAMETRIZADO
    public Alumnos(String nombre, int edad, double notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }
    
    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Alumnos{" + "nombre=" + nombre + ", edad=" + edad + ", notaMedia=" + notaMedia + '}';
    }
    
}
