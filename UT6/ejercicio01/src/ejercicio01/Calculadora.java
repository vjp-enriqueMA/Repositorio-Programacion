/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author alumno
 */
public abstract class Calculadora {
    // ATRIBUTOS
    private int numero;
    
    // CONSTRUCTOR POR DEFECTO
    public Calculadora() {
        this.numero=0;
    }
    
    // CONSTRUCTOR PARAMETRIZADO
    public Calculadora(int numero) {
        this.numero=numero;
    }
    
    // GETTERS Y SETTERS
    public int getNumero() {
        return this.numero;
    }
    public void setNumero(int numero) {
        this.numero=numero;
    }
    
    // MÉTODOS
    public abstract void realizarOperacion();
    
    //TO STRING
    @Override
    public String toString() {
        return "Número: " + numero +"";
    }
}
