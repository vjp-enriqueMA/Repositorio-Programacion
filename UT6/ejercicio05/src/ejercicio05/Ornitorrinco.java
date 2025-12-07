/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05;

/**
 *
 * @author Enrique
 */
public class Ornitorrinco extends Mamifero implements Oviparo{
    // ATRIBUTOS
    private int numeroHuevosOrnitorrinco;
    
    // CONSTRUCTOR POR DEFECTO
    public Ornitorrinco() {
        super();
        this.numeroHuevosOrnitorrinco = 0;
    }
    
    // CONSTRUCTOR PARAMETRIZADO
    public Ornitorrinco(int numeroHuevosOrnitorrinco, String nombre, String sexo, String color, int edad) {
        super(nombre, sexo, color, edad);
        this.numeroHuevosOrnitorrinco = numeroHuevosOrnitorrinco;
    }
    
    // GETTERS Y SETTERS
    public int getNumeroHuevosOrnitorrinco() {
        return this.numeroHuevosOrnitorrinco;
    }

    public void setNumeroHuevosOrnitorrinco(int numeroHuevosOrnitorrinco) {
        this.numeroHuevosOrnitorrinco = numeroHuevosOrnitorrinco;
    }
    
    // MÉTODOS
    
    // TO STRING
    @Override
    public String toString() {
        return  super.toString()+ ", Ornitorrinco{" + "numeroHuevosOrnitorrinco=" + numeroHuevosOrnitorrinco + '}';
    }

    @Override
    public String obtenerMensajeOviparo() {
        return "El ornitorrinco es un mamífero ovíparo";
    }

    @Override
    public void ponerHuevo() {
        numeroHuevosOrnitorrinco++;
    }

    @Override
    public void incubarHuevo() {
        numeroHuevosOrnitorrinco--;
    }

    @Override
    public void mostrarNumHuevos() {
        System.out.println(numeroHuevosOrnitorrinco);
    }
    
}
