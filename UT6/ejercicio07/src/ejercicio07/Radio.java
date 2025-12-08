/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio07;

/**
 *
 * @author Enrique
 */
public class Radio implements ControlRemoto{
    // ATRIBUTOS
    private boolean encendido;
    private float emisora;
    private int volumen;
    
    // CONSTRUCTOR POR DEFECTO
    public Radio() {
        this.encendido = false;
        this.emisora = 80;
        this.volumen = 15;
    }
    
    // CONSTRUCTOR PARAMETRIZADO
    public Radio(boolean encendido, float emisora, int volumen) {
        this.encendido = encendido;
        this.emisora = emisora;
        this.volumen = volumen;
    }
    
    // GETTERS Y SETTERS
    public float getEmisora() {
        return emisora;
    }

    public void setEmisora(float emisora) {
        this.emisora = emisora;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    
    // MÉTODOS
    @Override
    public void apagar() {
        if (encendido == true) {
            encendido = false;
        }
    }

    @Override
    public void encender() {
        if (encendido == false) {
            encendido = true;
        }
    }

    @Override
    public void bajarVolumen() {
        if (encendido == true) {
            volumen = volumen - 5;
        }
    }

    @Override
    public void subirVolumen() {
        if (encendido == true) {
            volumen = volumen + 5;
        }
    }

    @Override
    public void cambiarCanal(float canal) {
        if (encendido == true) {
            this.emisora = canal;
        }
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Radio{" + "encendido=" + encendido + ", emisora=" + emisora + ", volumen=" + volumen + '}';
    }
    
    
}
