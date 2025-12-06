/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author Enrique
 */
public class Cuadrado extends FiguraGeometrica{
    // ATRIBUTOS
    private double longitud;
    
    // CONSTRUCTOR POR DEFECTO
    public Cuadrado() {
        super();
        this.longitud = 0;
    }
    
    // CONSTRUCTOR PARAMETRIZADO
    public Cuadrado(double longitud) {
        this.longitud = longitud;
    }

    // GETTERS Y SETTERS
    public Cuadrado(double longitud, String color) {
        super(color);
        this.longitud = longitud;
    }

    public double getLongitud() {
        return this.longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    // MÉTODOS
    @Override
    public void calcularArea() {
        System.out.println(longitud*longitud);
    }

    @Override
    public void calcularPerimetro() {
        System.out.println(longitud*longitud*longitud*longitud);
    }
    
    // TO STRING

    @Override
    public String toString() {
        return super.toString()+ ", Cuadrado{" + "longitud=" + longitud + '}';
    }
    
    
}
