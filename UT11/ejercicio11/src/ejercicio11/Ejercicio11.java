/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
/**
 *
 * @author alumno
 */
public class Ejercicio11 {
    public static void mostrarMenu() {
        System.out.println("INTRODUCE UNA OPCION");
        System.out.println("1. Añadir alumno");
        System.out.println("2. Mostrar alumnos");
        System.out.println("3. Buscar por número de expediente");
        System.out.println("4. Mostrar alumnos por nota");
        System.out.println("5. Salir del programa");
    }

    public static void añadirAlumno(Set<Alumno> alumnos) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el DNI del alumno");
        String nombre = entrada.nextLine();
        System.out.println("Introduce el número de expediente");
        int numero = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Introduce la nota media");
        float nota = entrada.nextFloat();
        entrada.nextLine();
        
        alumnos.add(new Alumno(nombre,numero,nota));
    }
    
    public static void mostrarAlumnosDeMayorAMenor(Set<Alumno> alumnos) {
        TreeSet<Alumno> ordenadas = new TreeSet<>(alumnos);
        
        for (Alumno t : ordenadas) {
                System.out.println(t);
            }
    }
    
    public static void mostrarPorNumeroDeExpediente(Set<Alumno> alumnos) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el número de expediente que quieres buscar");
        int numero = entrada.nextInt();
        entrada.nextLine();
        
        boolean encontrado = false;
        
        for (Alumno a : alumnos) {
            if (a.getNumeroExpediente() == numero) {
                encontrado = true;
                System.out.println(a);
            }
        }
        
        if (!encontrado) {
            System.out.println("No se ha encontrado el expediente");
        }
    }
    
    public static void mostrarAlumnosPorNota(Set<Alumno> alumnos) {
        TreeSet<Alumno> ordenadas = new TreeSet<>((a1, a2) -> Float.compare(a1.getNotaMedia(), a2.getNotaMedia()));

        ordenadas.addAll(alumnos);

        for (Alumno a : ordenadas) {
            System.out.println(a);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        Set<Alumno> alumnos = new LinkedHashSet<>();
        
        do {
            
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        añadirAlumno(alumnos);
                        break;
                    case 2:
                        mostrarAlumnosDeMayorAMenor(alumnos);
                        break;
                    case 3:
                        mostrarPorNumeroDeExpediente(alumnos);
                        break;
                    case 4:
                        mostrarAlumnosPorNota(alumnos);
                        break;
                    case 5:
                        System.out.println("Te has salido del programa.");
                        break;
                    default:
                        System.out.println("Introduce una opción válida");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error, introduce una opción entre 1 y 5");
                entrada.nextLine();
            }
        } while (opcion != 5);
    }
    
}
