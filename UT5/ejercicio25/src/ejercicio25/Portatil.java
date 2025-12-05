/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio25;

/**
 *
 * @author Enrique
 */
public class Portatil extends Ordenador{
    // ATRIBUTOS
    private String marca;
    private int tamanoPantalla;
    private int peso;
    
    // CONSTRUCTOR POR DEFECTO
    public Portatil() {
        super();
        this.marca = "";
        this.tamanoPantalla = 0;
        this.peso = 0;
    }
    
    // CONSTRUCTOR PARAMETRIZADO
    public Portatil(String marca, int tamanoPantalla, int peso, int memoria, int disco, String modeloProcesador, String modeloTarjeta, int precio) {
        super(memoria, disco, modeloProcesador, modeloTarjeta, precio);
        this.marca = marca;
        this.tamanoPantalla = tamanoPantalla;
        this.peso = peso;
    }
    
    // GETTERS Y SETTERS
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setTamanoPantalla(int tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    // MÉTODOS
    
    
    // TO STRING
    @Override
    public String toString() {
        return super.toString()+ ", Portatil{" + "marca=" + marca + ", tamanoPantalla=" + tamanoPantalla + ", peso=" + peso + '}';
    }
    
}
