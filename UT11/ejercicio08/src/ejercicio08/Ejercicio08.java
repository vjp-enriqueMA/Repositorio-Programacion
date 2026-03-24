/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author alumno
 */
public class Ejercicio08 {

    public static void mostrarMenu() {
        System.out.println("Introduce una opción");
        System.out.println("1. Añadir una ciudad");
        System.out.println("2. Mostrar todas las ciudades junto con sus sedes");
        System.out.println("3. Método que muestre el nombre de las sedes cuyos ingresos anuales son superiores a la media. ");
        System.out.println("4. Buscar por nombre de sede.");
        System.out.println("5. Añadir sede");
        System.out.println("6. Mostrar todas las sedes ordenadas de mayor a menor");
        System.out.println("7. Salir del programa");
    }
    
    public static void añadirCiudad(ArrayList<Ciudad> ciudades) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el nombre de la ciudad");
        String nombre = entrada.nextLine();
        ciudades.add(new Ciudad(nombre));
        
        System.out.println("Introduce el nombre de la sede");
        String nombreSede = entrada.nextLine();
        System.out.println("Introduce los ingresos anuales");
        double ingresos = entrada.nextDouble();
        entrada.nextLine();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Ciudad> ciudades = new ArrayList<>();
        int opcion = 0;
        
        do {
            
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        añadirCiudad(ciudades);
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
                        System.out.println("Gracias por usar el programa.");
                        break;
                    default:
                        System.out.println("Introduce una opción válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error, introduce una opción entre 1 y 7.");
                entrada.nextLine();
            }
        } while (opcion != 7);
    }
    
}
