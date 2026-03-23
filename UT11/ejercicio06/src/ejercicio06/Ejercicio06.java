/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.LinkedHashSet;
import java.util.TreeSet;
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
    
    public static void añadirDonacion(Campania campania) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el nombre de la persona");
        String nombre = entrada.nextLine();
        System.out.println("Introduce la cantidad que quieres donar");
        double cantidad = entrada.nextDouble();
        campania.getDonaciones().add(new Donacion(nombre,cantidad));
        
    }
    
    public static void mostrarDonaciones(Campania campania) {
        if (campania.getDonaciones().isEmpty()) {
            System.out.println("No hay donaciones");
        }
        else {
            for (Donacion d : campania.getDonaciones()) {
                System.out.println("Donante: " + d.getNombre() + " | Cantidad: " + d.getCantidadDonada() + "");
            }
        }
    }
    
    public static void mostrarDonacionesPorNombre(Campania campania) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el nombre a buscar");
        String nombre = entrada.nextLine();
        boolean encontrado = false;
        
        for (Donacion d : campania.getDonaciones()) {
            if (d.getNombre().equalsIgnoreCase(nombre)) {
                encontrado = true;
                System.out.println(d.getCantidadDonada());
            }
        }
        if (!encontrado) {
            System.out.println("No se ha encontrado el nombre del donante");
        }
    }
    
    public static void mostrarNumeroDonaciones(Campania campania) {
        System.out.println("El número de donaciones es de "+campania.getDonaciones().size()+"");
    }
    
    public static void mostrarTotalDinero(Campania campania) {
        double suma = 0;
        for (Donacion d : campania.getDonaciones()) {
            suma = suma + d.getCantidadDonada();
        }
        System.out.println("La cantidad de dinero recaudada es de "+suma+"");
    }
    
    public static void ordenarDonaciones(Campania campania) {
        TreeSet<Donacion> ordenadas = new TreeSet<>(campania.getDonaciones());

        for (Donacion d : ordenadas) {
            System.out.println("Donante: " + d.getNombre() + " | Cantidad: " + d.getCantidadDonada() + "");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Campania campania = new Campania(new LinkedHashSet<>(), "Coronavirus");
        int opcion = 0;
        
        do {
            
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        añadirDonacion(campania);
                        break;
                    case 2:
                        mostrarDonaciones(campania);
                        break;
                    case 3:
                        mostrarDonacionesPorNombre(campania);
                        break;
                    case 4:
                        mostrarNumeroDonaciones(campania);
                        break;
                    case 5:
                        mostrarTotalDinero(campania);
                        break;
                    case 6:
                        ordenarDonaciones(campania);
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
