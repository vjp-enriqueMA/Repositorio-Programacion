/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;

/**
 *
 * @author Enrique
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // INSTANCIAS
        Libro libro = new Libro("Cien años de soledad", "Gabriel García Márquez", "Realismo mágico");
        System.out.println(libro.toString());
        System.out.println(libro.concatenarTodo());
        System.out.println(libro.obtenerIniciales());
        
        Persona persona = new Persona("Enrique", "Montero Acosta", "Enri");
        System.out.println(persona.toString());
        System.out.println(persona.concatenarTodo());
        System.out.println(persona.obtenerIniciales());
        
        // POLIMORFISMO
        Transformable t1 = new Libro("Cien años de soledad", "Gabriel García Márquez", "Realismo mágico");
        System.out.println(t1.toString());
        System.out.println(t1.concatenarTodo());
        System.out.println(t1.obtenerIniciales());
        
        Transformable t2 = new Persona("Enrique", "Montero Acosta", "Enri");
        System.out.println(t1.toString());
        System.out.println(t1.concatenarTodo());
        System.out.println(t1.obtenerIniciales());
    }
    
}
