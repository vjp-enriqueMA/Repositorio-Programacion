/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio25;

/**
 *
 * @author Enrique
 */
public class Ordenador {
    // ATRIBUTOS
    private int memoria;
    private int disco;
    private String modeloProcesador;
    private String modeloTarjeta;
    private int precio; 
    
    // CONSTRUCTOR POR DEFECTO
    public Ordenador() {
        this.memoria = 0;
        this.disco = 0;
        this.modeloProcesador = "";
        this.modeloTarjeta = "";
        this.precio = 0;
    }
    
    // CONSTRUCTOR PARAMETRIZADO
    public Ordenador(int memoria, int disco, String modeloProcesador, String modeloTarjeta, int precio) {
        this.memoria = memoria;
        this.disco = disco;
        this.modeloProcesador = modeloProcesador;
        this.modeloTarjeta = modeloTarjeta;
        this.precio = precio;
    }
    
    // GETTERS Y SETTERS
    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getDisco() {
        return disco;
    }

    public void setDisco(int disco) {
        this.disco = disco;
    }

    public String getModeloProcesador() {
        return modeloProcesador;
    }

    public void setModeloProcesador(String modeloProcesador) {
        this.modeloProcesador = modeloProcesador;
    }

    public String getModeloTarjeta() {
        return modeloTarjeta;
    }

    public void setModeloTarjeta(String modeloTarjeta) {
        this.modeloTarjeta = modeloTarjeta;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    // MÉTOODOS
    public void controlarCapacidad() {
        if (precio<0) {
            System.out.println("Error, introduce una capacidad mayor a 0");
        }
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Ordenador{" + "memoria=" + memoria + ", disco=" + disco + ", modeloProcesador=" + modeloProcesador + ", modeloTarjeta=" + modeloTarjeta + ", precio=" + precio + '}';
    }
    
    
    
}
