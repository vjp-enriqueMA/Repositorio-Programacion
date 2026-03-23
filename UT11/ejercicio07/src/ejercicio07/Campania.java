/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio07;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author alumno
 */
public class Campania {
    // ATRIBUTOS
    private Set<Donacion> donaciones;
    private String nombre;
    
    // CONSTRUCTOR POR DEFECTO
    public Campania() {
        this.donaciones = new LinkedHashSet<>();
        this.nombre = "";
    }
    
    // CONSTRUCTOR PARAMETRIZADO
    public Campania(Set<Donacion> donaciones, String nombre) {
        this.donaciones = donaciones;
        this.nombre = nombre;
    }
    public Campania(String nombre) {
        this.donaciones = new LinkedHashSet<>();;
        this.nombre = nombre;
    }
    // GETTERS Y SETTERS
    public Set<Donacion> getDonaciones() {
        return donaciones;
    }

    public void setDonaciones(Set<Donacion> donaciones) {
        this.donaciones = donaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Campania{" + "donaciones=" + donaciones + ", nombre=" + nombre + '}';
    }
}
