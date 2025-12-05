/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;
import java.util.Scanner;
/**
 *
 * @author Enrique
 */
public class Ejercicio16 {
    public static void mostrarAlumno(Alumno alumno1) {
        System.out.println(alumno1.getNombre());
        System.out.println(alumno1.getNota());
    }
    
    public static void notaIngresada(Alumno alumno1) {
        switch (alumno1.getNota()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Suspenso");
                break;
            case 5:
            case 6:
                System.out.println("Bien");
                break;
            case 7:
            case 8:
                System.out.println("Notable");
                break;
            case 9:
            case 10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("La nota no es correcta");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Enique", 9);
        mostrarAlumno(alumno1);
        notaIngresada(alumno1);
        
        Alumno alumno2 = new Alumno("Fran", 7);
        mostrarAlumno(alumno2);
        notaIngresada(alumno2);
    }
    
}
