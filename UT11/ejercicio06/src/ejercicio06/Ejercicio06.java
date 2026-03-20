/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author alumno
 */
public class Ejercicio06 {

    public static void mostrarMenu() {
        System.out.println("=== INTRODUCE UNA OPCIÓN=== ");
        System.out.println("1. Añadir donación");
        System.out.println("2. Mostrar donaciones");
        System.out.println("3. Mostrar donaciones por nombre de donante");
        System.out.println("4. Mostrar números de donaciones");
        System.out.println("5. Mostrar total dinero recaudado");
        System.out.println("6. Ordenar donaciones de mayor a menor");
        System.out.println("7. Salir");
    }
    
    public static void añadirDonacion(Donacion[] donaciones) {
        Scanner entrada = new Scanner(System.in);
        int cantidadDonaciones;
        System.out.println("Introduce la cantidad de donaciones");
        cantidadDonaciones = entrada.nextInt();
        
        for (int i = 0; i < cantidadDonaciones; i++) {
            System.out.println("Introduce el nombre del donante");
            String nombre = entrada.nextLine();
            System.out.println("Introduce la cantidad a donar");
            double cantidad = entrada.nextDouble();
            
            donaciones[i] = new Donacion(nombre,cantidad);
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        Donacion[] donaciones = null;
        
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
