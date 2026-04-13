/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author alumno
 */
public class Contacto implements Comparable<Contacto>{
    // ATRIBUTOS
    private String nombre;
    private int edad;
    private String numeroMovil;
    
    // CONSTRUCTOR POR DEFECTO
    public Contacto() {
        this.nombre = "";
        this.edad = 0;
        this.numeroMovil = "";
    }
    
    // CONSTRUCTOR PARAMETRIZADO
    public Contacto(String nombre, int edad, String numeroMovil) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroMovil = numeroMovil;
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

    public String getNumeroMovil() {
        return numeroMovil;
    }

    public void setNumeroMovil(String numeroMovil) {
        this.numeroMovil = numeroMovil;
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Contacto{" + "nombre=" + nombre + ", edad=" + edad + ", numeroMovil=" + numeroMovil + '}';
    }

    @Override
        public int compareTo(Contacto o) {
           return (int) (o.getEdad() - this.getEdad());
    }
    
}
