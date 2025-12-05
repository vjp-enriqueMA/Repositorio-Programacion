/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author alumno
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CREACIÓN DE OBJETOS DE DIFERENTES TIPOS
        Profesor profesor = new Profesor("María", "Programación");
        Alumno alumno = new Alumno("Javier","2ºDAM");

        System.out.println(profesor.saludar());
        System.out.println(alumno.saludar());

        // DEMOSTRACIÓN DE POLIMORFISMO
        Persona p1 = new Profesor("Lucía", "Entornos de Desarrollo");
        Persona p2 = new Alumno("Carlos", "1ºASIR");

        System.out.println(p1.saludar());
        System.out.println(p2.saludar());
    }
   
}
