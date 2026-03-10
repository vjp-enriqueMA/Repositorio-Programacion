/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author alumno
 */
public class Ejercicio16 {
    public static void mostrarMenu() {
        System.out.println("INTRODUCE UNA OPCIÓN");
        System.out.println("1. MENÚ DE ADMINISTRACIÓN");
        System.out.println("2. MENÚ DE COMPRA");
        System.out.println("3. Salir");
    }
    
    public static int menuAdministracion() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Introducir productos en la lista");
        System.out.println("2. Visualizar la lista de productos");
        System.out.println("3. Eliminar productos de la lista");
        System.out.println("4. Volver al menú principal");
        
        int opcion2 = entrada.nextInt();
        return opcion2;
    }
    
    public static int menuCompra() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Comprar productos");
        System.out.println("2. Volver al menú principal");
        
        int opcion3 = entrada.nextInt();
        return opcion3;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        
        do {
            
            try {
                mostrarMenu();
                    opcion = entrada.nextInt();
                    switch (opcion) {
                        case 1:
                            int opcion2 = 0;
                            do {
                                
                                try {
                                    opcion2 = menuAdministracion();
                                    switch (opcion2) {
                                        case 1:
                                            
                                            break;
                                        case 2:
                                            
                                            break;
                                        case 3:
                                            
                                            break;
                                        case 4:
                                            mostrarMenu();
                                            opcion = entrada.nextInt();
                                            break;
                                        default:
                                            System.out.println("Introduce una opción válida");
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("Error, introduce una opción entre 1 y 4");
                                }
                            } while (opcion != 4);
                            break;
                        case 2:
                            int opcion3 = 0;
                            do {
                                
                                try {
                                    opcion3 = menuCompra();
                                    switch (opcion3) {
                                        case 1:
                                            
                                            break;
                                        case 2:
                                            mostrarMenu();
                                            opcion = entrada.nextInt();
                                            break;
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("Error, introduce una opción entre 1 y 2");

                                }
                            } while (opcion != 2);
                            break;
                        case 3:
                            System.out.println("Te has salido del programa");
                            break;
                        default:
                            System.out.println("Introduce una opción válida");
                    }
            } catch (InputMismatchException e) {
                System.out.println("Error, introduce una opción entre 1 y 3");
                entrada.nextLine();
            }
        } while (opcion != 3);
    }
    
}
