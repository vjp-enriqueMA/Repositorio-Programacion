/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06;

/**
 *
 * @author alumno
 */
public class Empleados {
    // ATRIBUTOS
    private String nombre;
    private int horas;
    private int tarifa;
   
    // CONSTRUCTORES
    // Por defecto
    public Empleados() {
        this.nombre = "";
        this.horas = 0;
        this.tarifa = 0;
    }
    // Parametrizado
    public Empleados(String nombre, int horas, int tarifa) {
        this.nombre = nombre;
        this.horas = horas;
        this.tarifa = tarifa;
    }
   
    // GETTERS Y SETTERS
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return this.horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getTarifa() {
        return this.tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }
   
    // TO STRING
    @Override
    public String toString() {
        return "Empleados{" + "nombre=" + nombre + ", horas=" + horas + ", tarifa=" + tarifa + '}';
    }
   
   
   
}