/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author Enrique
 */
public class Triangulo extends TrianguloRectangulo{
    // ATRIBUTOS
    private double base;
    private double altura;
    
    // CONSTRUCTOR POR DEFECTO
    public Triangulo() {
        this.base = 0;
        this.altura = 0;
    }
    
    // CONSTRUCTOR PARAMETRIZADO
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    // GETTERS Y SETTERS
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    // MÉTODOS

    @Override
    public double hipotenusa() {
      return Math.hypot(base, altura);
    }

    @Override
    public void tipoTriangulo() {
        if (base == altura && altura == hipotenusa()) {
            System.out.println("El triángulo es equilatero");
        }
        else if (base == altura || base == hipotenusa() || altura == hipotenusa()) {
            System.out.println("El triángulo es isósceles");
        }
        else {
            System.out.println("El triángulo es escaleno");
        }
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
}
