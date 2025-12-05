/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author alumno
 */
public class Alumno extends Persona{
    // ATRIBUTOS
    private String grupo;
   
    // CONSTRUCTORES
    // Por defecto
    public Alumno() {
        super();
        this.grupo = "";
    }
    // Parametrizado
    public Alumno(String nombre, String grupo) {
        super(nombre);
        this.grupo = grupo;
    }
   
    // GETTERS Y SETTERS
    public String getGrupo() {
        return this.grupo;
    }
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
   
    // MÉTODOS
    @Override
    public String saludar() {
        return "Hola, soy el alumno " + getNombre() + ", y estoy en el grupo de " + grupo;
    }
   
    // TO STRING
    @Override
    public String toString() {
        return super.toString() + ", Grupo: " + grupo;
    }
   
}