/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio07;

/**
 *
 * @author Enrique
 */
public class Televisor implements ControlRemoto{
    // ATRIBUTOS
    private boolean encendido;
    private int canal;
    private int volumen;
    
    // CONSTRUCTOR POR DEFECTO
    public Televisor() {
        this.encendido = false;
        this.canal = 1;
        this.volumen = 10;
    }
    
    // CONSTRUCTOR PARAMETRIZADO
    public Televisor(boolean encendido, int canal, int volumen) {
        this.encendido = encendido;
        this.canal = canal;
        this.volumen = volumen;
    }
    
    // GETTERS Y SETTERS
    public int getCanal() {
        return this.canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolumen() {
        return this.volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    
    // MÉTODOS
    @Override
    public void apagar() {
        if (encendido == true) {
            System.out.println("La TV se apagará en 10s");
        }
    }

    @Override
    public void encender() {
        if (encendido == false) {
            encendido = true;
            System.out.println(canal);
        }
    }

    @Override
    public void bajarVolumen() {
        if (encendido == true) {
            volumen--;
            System.out.println(volumen);
        }
    }

    @Override
    public void subirVolumen() {
        if (encendido == true) {
            volumen++;
            System.out.println(volumen);
        }
    }

    @Override
    public void cambiarCanal(float canal) {
        if (encendido == true) {
            this.canal = (int) canal;
            System.out.println(this.canal);
        }
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Televisor{" + "encendido=" + encendido + ", canal=" + canal + ", volumen=" + volumen + '}';
    }
    
}
