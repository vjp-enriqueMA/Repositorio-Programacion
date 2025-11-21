/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio25;

/**
 *
 * @author alumno
 */
public class Ordenador {
    // ATRIBUTOS
    private int memoriaRAM;
    private int capacidadDisco;
    private String modeloProcesador;
    private String modeloTarjetaGrafica;
    private double precio;

    // CONSTRUCTORES
    // POR DEFECTO
    public Ordenador() {
        this.memoriaRAM = 0;
        this.capacidadDisco = 0;
        this.modeloProcesador = "";
        this.modeloTarjetaGrafica = "";
        this.precio = 0.0;
    }

    // PARAMETRIZADO
    public Ordenador(int memoriaRAM, int capacidadDisco, String modeloProcesador, String modeloTarjetaGrafica, double precio) {
        this.memoriaRAM = memoriaRAM;
        this.capacidadDisco = capacidadDisco;
        this.modeloProcesador = modeloProcesador;
        this.modeloTarjetaGrafica = modeloTarjetaGrafica;
        this.precio = precio;
    }

    // GETTERS Y SETTERS
    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public int getCapacidadDisco() {
        return capacidadDisco;
    }

    public void setCapacidadDisco(int capacidadDisco) {
        this.capacidadDisco = capacidadDisco;
    }

    public String getModeloProcesador() {
        return modeloProcesador;
    }

    public void setModeloProcesador(String modeloProcesador) {
        this.modeloProcesador = modeloProcesador;
    }

    public String getModeloTarjetaGrafica() {
        return modeloTarjetaGrafica;
    }

    public void setModeloTarjetaGrafica(String modeloTarjetaGrafica) {
        this.modeloTarjetaGrafica = modeloTarjetaGrafica;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // TO STRING
    @Override
    public String toString() {
        return "Memoria RAM: " + memoriaRAM + " GB, Capacidad Disco: " + capacidadDisco + " GB, Procesador: " + modeloProcesador
                + ", Tarjeta Gráfica: " + modeloTarjetaGrafica + ", Precio: " + precio + " €";
    }
}
