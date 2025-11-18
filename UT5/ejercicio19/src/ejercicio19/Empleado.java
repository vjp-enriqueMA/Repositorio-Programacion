/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio19;

/**
 *
 * @author alumno
 */
public class Empleado {
    // Atributos
    private String nombre;
    private int horasTrabajadas;
    private double tarifaHora;

    // Constructor por defecto
    public Empleado() {
        this.nombre = "";
        this.horasTrabajadas = 0;
        this.tarifaHora = 0.0;
    }

    // Constructor parametrizado
    public Empleado(String nombre, int horasTrabajadas, double tarifaHora) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    // Método para calcular el sueldo bruto
    public double calcularSueldoBruto() {
        if (horasTrabajadas <= 40) {
            return horasTrabajadas * tarifaHora;
        } else {
            int horasExtras = horasTrabajadas - 40;
            return 40 * tarifaHora + horasExtras * tarifaHora * 1.5;
        }
    }

    // toString al estilo de los ejercicios anteriores
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Horas trabajadas: " + horasTrabajadas + ", Tarifa/hora: " + tarifaHora;
    }
}
