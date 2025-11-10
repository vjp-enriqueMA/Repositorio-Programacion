/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author alumno
 */
public class Coche {
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;
    private boolean motorEncendido;
    
    public Coche() {
        this.marca="";
        this.modelo="";
        this.color="";
        this.velocidad=0;
        this.motorEncendido=false;
    }
    public Coche(String marca, String modelo, String color, int velocidad, boolean motorEncendido) {
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
        this.velocidad=velocidad;
        this.motorEncendido=motorEncendido;
    }
    public String getEstablecerMarca() {
        return this.marca;
    }
    public void setEstablecerMarca() {
        this.marca=marca;
    }
    
}
