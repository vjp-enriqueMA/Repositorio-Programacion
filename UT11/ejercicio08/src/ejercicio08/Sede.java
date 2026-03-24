/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio08;

/**
 *
 * @author alumno
 */
public class Sede {
    // ATRIBUTOS
    private String nombreSede;
    private double ingresosAnuales;
    
    // CONSTRUCTOR POR DEFECTO
    public Sede() {
        this.nombreSede = "";
        this.ingresosAnuales = 0.0;
    }
    
    // CONSTRUCTOR PARAMETRIZADO
    public Sede(String nombreSede, double ingresosAnuales) {
        this.nombreSede = nombreSede;
        this.ingresosAnuales = ingresosAnuales;
    }
    
    // GETTERS Y SETTERS
    public String getNombreSede() {
        return nombreSede;
    }

    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }

    public double getIngresosAnuales() {
        return ingresosAnuales;
    }

    public void setIngresosAnuales(double ingresosAnuales) {
        this.ingresosAnuales = ingresosAnuales;
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Sede{" + "nombreSede=" + nombreSede + ", ingresosAnuales=" + ingresosAnuales + '}';
    }
    
}
