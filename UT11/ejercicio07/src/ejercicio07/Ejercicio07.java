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
        campania.add(new Campania(nombre));
    }
    
    public static void añadirDonacion(ArrayList<Campania> campania) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el nombre de la campaña");
        String nombre = entrada.nextLine();
        
        boolean encontrado = false;
        
        for (int i = 0; i < campania.size(); i++) {
            if (campania.get(i).getNombre().equalsIgnoreCase(nombre)) {
                encontrado = true;
                System.out.println("Introduce el nombre del donante");
                String nombreDonante = entrada.nextLine();
                System.out.println("Introduce la cantidad a donar");
                double cantidad = entrada.nextDouble();
                entrada.nextLine();
                campania.get(i).getDonaciones().add(new Donacion(nombreDonante,cantidad));
            }
        }
        if (!encontrado) {
            System.out.println("No se ha encontrado la campania");
        }
        
    }
    
    public static void mostrarCampañasYDonaciones(ArrayList<Campania> campania) {
        for (int i = 0; i < campania.size(); i++) {
            System.out.println(campania.get(i).getNombre());
            System.out.println(campania.get(i).getDonaciones());
        }
    }
    
    public static void mostrarCampañaPorNombre(ArrayList<Campania> campania) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el nombre de la campaña");
        String nombre = entrada.nextLine();
        boolean encontrado = false;
        for (int i = 0; i < campania.size(); i++) {
            if (campania.get(i).getNombre().equalsIgnoreCase(nombre)) {
                encontrado = true;
                System.out.println(campania.get(i).getNombre());
                System.out.println(campania.get(i).getDonaciones());
            }
        }
        if (!encontrado) {
            System.out.println("No se ha encontrado la campaña");
        }
    }
    
    public static void mostrarTotalDinero(ArrayList<Campania> campania) {
        double suma = 0;
        for (int i = 0; i < campania.size(); i++) {
            for (Donacion d : campania.get(i).getDonaciones()) {
                suma = suma + d.getCantidadDonada();
            }
        }
        System.out.println("El dinero total recaudado es de "+suma+"");
    }
    
    public static void mostrarMayorDonacion(ArrayList<Campania> campania) {
        double mayor = 0;
        Donacion mayorDonacion = null;
        String nombreCampania = "";

        for (int i = 0; i < campania.size(); i++) {
            for (Donacion d : campania.get(i).getDonaciones()) {
                if (d.getCantidadDonada() > mayor) {
                    mayor = d.getCantidadDonada();
                    mayorDonacion = d;
                    nombreCampania = campania.get(i).getNombre();
                }
            }
        }

        if (mayorDonacion != null) {
            System.out.println("La mayor donación es de " + mayor + "");
            System.out.println("Donante: " + mayorDonacion.getNombre()+"");
            System.out.println("Campaña: " + nombreCampania);
        } else {
            System.out.println("No hay donaciones registradas.");
        }
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
                        añadirCampaña(campania);
                        break;
                    case 2:
                        añadirDonacion(campania);
                        break;
                    case 3:
                        mostrarCampañasYDonaciones(campania);
                        break;
                    case 4:
                        mostrarCampañaPorNombre(campania);
                        break;
                    case 5:
                        mostrarTotalDinero(campania);
                        break;
                    case 6:
                        mostrarMayorDonacion(campania);
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
