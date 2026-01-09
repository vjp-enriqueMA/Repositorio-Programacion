/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05;

/**
 *
 * @author Enrique
 */
public class Murcielago extends Mamifero implements Volador{
    // ATRIBUTOS
    private double alturaVuelo;
    
    // CONSTRUCTOR POR DEFECTO
    public Murcielago() {
        super();
        this.alturaVuelo = 0;
    }
    
    // CONSTRUCTOR PARAMETRIZADO
    public Murcielago(double alturaVuelo, String nombre, String sexo, String color, int edad) {
        super(nombre, sexo, color, edad);
        this.alturaVuelo = alturaVuelo;
    }
  
    // GETTERS Y SETTERS
    public double getAlturaVuelo() {
        return this.alturaVuelo;
    }

    public void setAlturaVuelo(double alturaVuelo) {
        this.alturaVuelo = alturaVuelo;
    }
    
    // MÉTODOS
    @Override
    public String obtenerMensajeVolador() {
        return "El ornitorrinco es un mamífero ovíparo";
    }

    @Override
    public void aumentarAlturaVuelo() {
        alturaVuelo = alturaVuelo + 5;
    }

    @Override
    public void bajarAlturaVuelo() {
        alturaVuelo = alturaVuelo - 5;
    }

    @Override
    public void mostrarAlturaVuelo() {
        System.out.println(alturaVuelo);
    }
    
    // TO STRING
    @Override
    public String toString() {
        return super.toString()+ ", Murcielago{" + "alturaVuelo=" + alturaVuelo + '}';
    }
}
