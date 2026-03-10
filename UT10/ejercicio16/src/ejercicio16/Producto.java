/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author alumno
 */
public class Producto {
    // ATRIBUTOS
    private String nombreProducto;
    private float precio;
    private int stock;
    
    // CONSTRUCTOR POR DEFECTO
    public Producto() {
        this.nombreProducto = "";
        this.precio = 0.0f;
        this.stock = 0;
    }
    
    // CONSTRUCTOR PARAMETRIZADO
    public Producto(String nombreProducto, float precio, int stock) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.stock = stock;
    }
    
    // GETTERS Y SETTERS
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
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
        return "Producto{" + "nombreProducto=" + nombreProducto + ", precio=" + precio + ", stock=" + stock + '}';
    }
}
