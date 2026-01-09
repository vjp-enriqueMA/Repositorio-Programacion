/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06;

/**
 *
 * @author Enrique
 */
public class Persona implements Transformable{
    // ATRIBUTOS
    private String nombre;
    private String apellidos;
    private String alias;
    
    // CONSTRUCTOR POR DEFECTO
    public Persona() {
        this.nombre = "";
        this.apellidos = "";
        this.alias = "";
    }
    
    // CONSTRUCTOR PARAMETRIZADO
    public Persona(String nombre, String apellidos, String alias) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.alias = alias;
    }
    
    // GETTERS Y SETTERS
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getAlias() {
        return this.alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
    
    // MÉTODOS
    @Override
    public String concatenarTodo() {
        return nombre + "#" + apellidos + "#" + alias + "#";
    }

    @Override
    public String obtenerIniciales() {
        return "" + nombre.charAt(0) + apellidos.charAt(0) + alias.charAt(0);
    }

    @Override
    public void contarVocales() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String obtenerCadenaMasLarga() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean buscarCadena() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", alias=" + alias + '}';
    }
}
