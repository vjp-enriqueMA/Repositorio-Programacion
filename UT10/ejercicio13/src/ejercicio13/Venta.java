/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author alumno
 */
public class Venta {
    // ATRIBUTOS
    private String nombre;
    private int ventas;
    
    // CONSTRUCTOR POR DEFECTO
    public Venta() {
        this.nombre = "";
        this.ventas = 0;
    }
    
    // CONSTRUCTOR PARAMETRIZADO
    public Venta(String nombre, int ventas) {
        this.nombre = nombre;
        this.ventas = ventas;
    }
    
    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Venta{" + "nombre=" + nombre + ", ventas=" + ventas + '}';
    }
    
    
}
