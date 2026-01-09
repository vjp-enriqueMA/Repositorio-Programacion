/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author Enrique
 */
public class Rectangulo extends FiguraGeometrica{
    // ATRIBUTOS
    private double base;
    private double altura;
    
    // CONSTRUCTOR POR DEFECTO
    public Rectangulo() {
        super();
        this.base = 0;
        this.altura = 0;
    }
    
    // CONSTRUCTOR PARAMETRIZADO
    public Rectangulo(double base, double altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }
    
    // GETTERS Y SETTERS
    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // MÉTODOS
    @Override
    public void calcularArea() {
        System.out.println(base*altura);
    }

    @Override
    public void calcularPerimetro() {
        System.out.println(2*(base+altura));
    }
    
    // TO STRING
    @Override
    public String toString() {
        return super.toString()+ ", Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    
    
}
