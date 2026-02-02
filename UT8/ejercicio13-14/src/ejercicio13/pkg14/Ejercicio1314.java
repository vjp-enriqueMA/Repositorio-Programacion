/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13.pkg14;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author alumno
 */
public class Ejercicio1314 {
    public static void mostrarMenu() {
        System.out.println("INTRODUCE UNA OPCIÍON");
        System.out.println("1. Rellenar un alumno");
        System.out.println("2. Mostrar alumnos");
        System.out.println("3. Mostrar alumnos con nota media por encima de una nota dada");
        System.out.println("4. Mostrar alumnos con la nota media suspensa");
        System.out.println("5. Buscar alumnos");
        System.out.println("6. Salir");
    }
    
    public static Alumnos[] rellenarArray() {
        Scanner entrada = new Scanner(System.in);
        Alumnos[] alumnos = new Alumnos [5];
        int i;
        for (i = 0; i < alumnos.length; i++) {
            System.out.println("Introduce un nombre");
            String nombre = entrada.nextLine();
            System.out.println("Introduce una edad");
            int edad = entrada.nextInt();
            System.out.println("Introduce una nota media");
            double notaMedia = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("Introduce la posicion del alumno que quieres crear");
            int posicion = entrada.nextInt();
            entrada.nextLine();
            alumnos[posicion] = new Alumnos(nombre,edad,notaMedia);
        }
        return alumnos;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 0;
        Alumnos[] alumnos = new Alumnos [5];
        Scanner entrada = new Scanner(System.in);
        
        do {
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        alumnos = rellenarArray();
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        
                        break;
                    case 4:
                        
                        break;
                    case 5:
                        
                        break;
                    case 6:
                        System.out.println("Te has salido del programa");
                        break;
                    default:
                        System.out.println("Introduce una opción válida");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error, introduce un número");
            }
        } while (opcion != 6);
    }
    
}
