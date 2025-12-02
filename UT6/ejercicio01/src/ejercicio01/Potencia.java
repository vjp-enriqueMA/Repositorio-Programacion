/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author alumno
 */
public class Potencia extends Calculadora{
    // ATRIBUTOS
    private int exponente;
    
    // CONSTRUCTOR POR DEFECTO
    public Potencia(){
        super();
        this.exponente=0;
    }
    
    // CONSTRUCTOR PARAMETRIZADO
    public Potencia
        (int numero, int exponente) {
        super(numero);
        this.exponente=exponente;
    }
    
    // GETTERS Y SETTERS
    public int getExponente() {
        return this.exponente;
    }
    public void setExponente(int exponente) {
        this.exponente=exponente;
    }

    @Override
    public void realizarOperacion() {
        double resultado;
        resultado=Math.pow(exponente, getNumero());
        System.out.println(resultado);
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Elevando: " + exponente;
    }
    
}
