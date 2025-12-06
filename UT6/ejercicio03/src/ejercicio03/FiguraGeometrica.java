/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author Enrique
 */
public abstract class FiguraGeometrica {
    // ATRIBUTOS
    private String color;

    // CONSTRUCTOR POR DEFECTO
    public FiguraGeometrica() {
        this.color = "";
    }

    // CONSTRUCTOR PARAMETRIZADO
    public FiguraGeometrica(String color) {
        this.color = color;
    }
    
    // GETTERS Y SETTERS
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    // MÉTODOS
    public abstract void calcularArea();
    public abstract void calcularPerimetro();
    
    // TO STRING
    @Override
    public String toString() {
        return "FiguraGeometrica{" + "color=" + color + '}';
    }
    
    
    
}
