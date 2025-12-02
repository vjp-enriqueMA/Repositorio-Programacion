/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author alumno
 */
public class Multiplicacion extends Calculadora{
    // ATRIBUTOS
    private int multiplicador;
    
    // CONSTRUCTOR POR DEFECTO
    public Multiplicacion(){
        super();
        this.multiplicador=0;
    }
    
    // CONSTRUCTOR PARAMETRIZADO
    public Multiplicacion
        (int numero, int multiplicador) {
        super(numero);
        this.multiplicador=multiplicador;
    } 
    
    // GETTERS Y SETTERS
    public int getMultiplicador() {
        return this.multiplicador;
    }
    public void setMultiplicador(int multiplicador) {
        this.multiplicador=multiplicador;
    }
    
    //MÉTODOS
    @Override
    public void realizarOperacion() {
        int resultado;
        resultado=getNumero()*multiplicador;
        System.out.println(resultado);
    }
    
    // TO STRING
    @Override
    public String toString() {
        return super.toString() + ", Multiplicador: " + multiplicador;
    }
}
