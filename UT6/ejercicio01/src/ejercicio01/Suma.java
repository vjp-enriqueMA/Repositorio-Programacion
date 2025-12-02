/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author alumno
 */
public class Suma extends Calculadora{
    // ATRIBUTOS
    private int sumando;
    
    // CONSTRUCTOR POR DEFECTO
    public Suma(){
        super();
        this.sumando=0;
    }
    
    // CONSTRUCTOR PARAMETRIZADO
    public Suma(int numero, int sumando) {
        super(numero);
        this.sumando=sumando;
    }

    // GETTERS Y SETTERS
    public int getSuma() {
        return this.sumando;
    }
    public void setSuma(int sumando) {
        this.sumando=sumando;
    }
    
    // MÉTODOS
    @Override
    public void realizarOperacion() {
        System.out.println(sumando+getNumero());
    }

    @Override
    public String toString() {
        return super.toString() + ", Sumando: " + sumando;
    }   
}
