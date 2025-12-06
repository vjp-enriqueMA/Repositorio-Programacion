/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author Enrique
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo circulo = new Circulo(8, "Rojo");
        circulo.calcularArea();
        circulo.calcularPerimetro();
        
        Rectangulo rectangulo = new Rectangulo(10, 9, "Verde");
        rectangulo.calcularArea();
        rectangulo.calcularPerimetro();
        
        Cuadrado cuadrado = new Cuadrado(10, "Azul");
        cuadrado.calcularArea();
        cuadrado.calcularPerimetro();
        
        Triangulo triangulo = new Triangulo(10, 8);
        System.out.println(triangulo.hipotenusa());
        triangulo.tipoTriangulo();
        
        // POLIMORFISMO
        FiguraGeometrica figurageometrica = new Circulo(8, "Rojo");
        figurageometrica.calcularArea();
        figurageometrica.calcularPerimetro();
        
        FiguraGeometrica figurageometrica1 = new Rectangulo(10, 9, "Verde");
        figurageometrica1.calcularArea();
        figurageometrica1.calcularPerimetro();
        
        FiguraGeometrica figurageometrica2 = new Cuadrado(10, "Azul");
        figurageometrica2.calcularArea();
        figurageometrica2.calcularPerimetro();
        
        // TODO code application logic here
    }
    
}
