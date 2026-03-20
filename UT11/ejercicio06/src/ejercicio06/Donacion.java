/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06;

/**
 *
 * @author alumno
 */
public class Donacion {
    // ATRIBUTOS
    private String nombre;
    private double cantidadDonada;
    
    // CONSTRUCTOR POR DEFECTO
    public Donacion() {
        this.nombre = "";
        this.cantidadDonada = 0.0;
    }
    
    // CONSTRUCTOR PARAMETRIZADO
    public Donacion(String nombre, double cantidadDonada) {
        this.nombre = nombre;
        this.cantidadDonada = cantidadDonada;
    }
    
    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCantidadDonada() {
        return cantidadDonada;
    }

    public void setCantidadDonada(double cantidadDonada) {
        this.cantidadDonada = cantidadDonada;
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Donacion{" + "nombre=" + nombre + ", cantidadDonada=" + cantidadDonada + '}';
    }
    
}
