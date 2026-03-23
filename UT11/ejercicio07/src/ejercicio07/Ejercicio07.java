/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author alumno
 */
public class Ejercicio07 {
    public static void mostrarMenu() {
        System.out.println("=== INTRODUCE UNA OPCIÓN=== ");
        System.out.println("1. Añadir campaña");
        System.out.println("2. Añadir donacion");
        System.out.println("3. Mostrar campañas y donaciones");
        System.out.println("4. Mostrar campaña por nombre");
        System.out.println("5. Mostrar total dinero recaudado");
        System.out.println("6. Mostrar mayor donacion");
        System.out.println("7. Salir");
    }

    public static void añadirCampaña(ArrayList<Campania> campania) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el nombre de la campaña");
        String nombre = entrada.nextLine();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Campania> campania = new ArrayList<>();
        int opcion = 0;
        
        do {
            
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:

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

                        break;
                    case 7:
                        System.out.println("Te has salido del programa");
                        break;
                    default:
                        System.out.println("Introduce una opción válida");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error, introduce una opción entre 1 y 7");
                entrada.nextLine();
            }
        } while (opcion != 7);
    }
}
