/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author Enrique
 */
public class Empleado {
    // ATRIBUTOS
    private String nombre;
    private int salario;
    private Direccion direccion;
    
    // CONSTRUCTOR POR DEFECTO
    public Empleado() {
        this.nombre = "";
        this.salario = 0;
        this.direccion = new Direccion();
    }
    
    // CONSTRUCTOR PARAMETRIZADO
    public Empleado(String nombre, int salario, Direccion direccion) {
        this.nombre = nombre;
        this.salario = salario;
        this.direccion = direccion;
    }
    
    // GETTERS Y SETTERS
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return this.salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public Direccion getDireccion() {
        return this.direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    // MÉTODOS
    
    // TO STRING
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", salario=" + salario + ", direccion=" + direccion + '}';
    }
    
}
