/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio26;

import java.io.Serializable;

/**
 *
 * @author alumno
 */
public class Bebida implements Serializable {
    // ATRIBUTOS
    private String nombreBebida;
    private float precio;
    private int stock;
    
    // CONSTRUCTOR POR DEFECTO
    public Bebida() {
        this.nombreBebida = "";
        this.precio = 0.0f;
        this.stock = 0;
    }
    
    // CONSTRUCTOR PARAMETRIZADO
    public Bebida(String nombreBebida, float precio, int stock) {
        this.nombreBebida = nombreBebida;
        this.precio = precio;
        this.stock = stock;
    }
    
    // GETTERS Y SETTERS
    public String getNombreBebida() {
        return nombreBebida;
    }

    public void setNombreBebida(String nombreBebida) {
        this.nombreBebida = nombreBebida;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Bebidas{" + "nombreBebida=" + nombreBebida + ", precio=" + precio + ", stock=" + stock + '}';
    }
    
}
