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

    // CONSTRUCTOR POR DEFECTO
    public Alumno(){
        super();
        this.grupo="";
    }
    
    // CONSTRUCTOR PARAMETRIZADO
    public Alumno(String nombre, String grupo) {
        super(nombre);
        this.grupo=grupo;
    }
    
    
    @Override
    public String saludar() {
        return "Hola, soy el alumno "+getAlumno+" y estoy en el grupo de "+grupo+"";
    }
    
}
