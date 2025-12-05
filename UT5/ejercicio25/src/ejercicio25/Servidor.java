/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio25;

/**
 *
 * @author Enrique
 */
public class Servidor extends Ordenador{
    // ATRIBUTOS
    private int tamanoMonitor;
    private String modeloTeclado;
    private String modeloRaton;
    
    // CONSTRUCTOR POR DEFECTO
    public Servidor() {
        super();
        this.tamanoMonitor = 0;
        this.modeloTeclado = "";
        this.modeloRaton = "";
    }
    
    // CONSTRUCTOR PARAMETRIZADO
    public Servidor(int tamanoMonitor, String modeloTeclado, String modeloRaton, int memoria, int disco, String modeloProcesador, String modeloTarjeta, int precio) {
        super(memoria, disco, modeloProcesador, modeloTarjeta, precio);
        this.tamanoMonitor = tamanoMonitor;
        this.modeloTeclado = modeloTeclado;
        this.modeloRaton = modeloRaton;
    }
    
    // GETTERS Y SETTERS
    public int getTamanoMonitor() {
        return tamanoMonitor;
    }

    public void setTamanoMonitor(int tamanoMonitor) {
        this.tamanoMonitor = tamanoMonitor;
    }

    public String getModeloTeclado() {
        return modeloTeclado;
    }

    public void setModeloTeclado(String modeloTeclado) {
        this.modeloTeclado = modeloTeclado;
    }

    public String getModeloRaton() {
        return modeloRaton;
    }

    public void setModeloRaton(String modeloRaton) {
        this.modeloRaton = modeloRaton;
    }
    
    // MÉTODOS
    
    // TO STRING

    @Override
    public String toString() {
        return super.toString()+ ", Servidor{" + "tamanoMonitor=" + tamanoMonitor + ", modeloTeclado=" + modeloTeclado + ", modeloRaton=" + modeloRaton + '}';
    }
    
}
