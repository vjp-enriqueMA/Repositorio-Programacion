/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author Enrique
 */
public class Circulo extends FiguraGeometrica{
    // ATRIBUTOS
    private double radio;
    
    // CONSTRUCTOR POR DEFECTO
    public Circulo() {
        super();
        this.radio = 0;
    }
    
    // CONSTRUCTOR PARAMETRIZADO
    public Circulo(double radio, String color) {
        super(color);
        this.radio = radio;
    }
    
    // GETTERS Y SETTERS
    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // MÉTODOS
    @Override
    public void calcularArea() {
        System.out.println(radio*radio*Math.PI);
    }

    @Override
    public void calcularPerimetro() {
        System.out.println(2*radio*Math.PI);
    }
    
    // TO STRING
    @Override
    public String toString() {
        return super.toString()+ ", Circulo{" + "radio=" + radio + '}';
    }
    
}
