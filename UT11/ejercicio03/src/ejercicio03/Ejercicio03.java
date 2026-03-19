/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author alumno
 */
public class Ejercicio03 {

    public static void mostrarMenu() {
        System.out.println("INTRODUCE UNA OPCIÓN");
        System.out.println("1. Aparcar");
        System.out.println("2. Mostrar dársenas libres");
        System.out.println("3. Buscar autobús");
        System.out.println("4. Buscar conductor");
        System.out.println("5. Método que retorne la posición del vector");
        System.out.println("6. Salir del programa");
    }
    
    public static void aparcar(Autobus[] estacion) {
        Scanner entrada = new Scanner(System.in);
        int posicion = - 1;
        boolean posicionValida = false;
        
        do {
            System.out.println("Introduce la posición en la que quieres aparcar el autobús");
            posicion = entrada.nextInt();
            entrada.nextLine();
            
            if (posicion < 0 || posicion >= estacion.length) {
                System.out.println("Posición no válida");
            }
            else if (estacion[posicion] != null) {
                System.out.println("La posición está ocupada. Por favor, elija otra.");
            }
            else {
                posicionValida = true;
            }
        } while (!posicionValida);
        
        System.out.println("Introduce la matrícula del autobús");
        String matricula = entrada.nextLine();
        
        Map<String, Conductor> conductores = new HashMap<>();
        String opcion;
        do {
            System.out.println("Introduce el DNI del conductor");
            String dni = entrada.nextLine();
            System.out.println("Introduce el nombre del conductor");
            String nombre = entrada.nextLine();
            conductores.put(dni, new Conductor(dni, nombre));
            System.out.println("¿Quiéres añadir otro conductor? (SI/NO)");
            opcion = entrada.nextLine();
        } while (opcion.equalsIgnoreCase("SI"));
        
        estacion[posicion] = new Autobus(matricula,conductores);
    }
    
    public static void mostrarDarsenasLibres(Autobus[] estacion) {
        for (int i = 0; i < estacion.length; i++) {
            if (estacion[i] == null) {
                System.out.println(i);
            }
        }
    }
    
    public static void buscarAutobus(Autobus[] estacion) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce la matrícula a buscar:");
        String matricula = entrada.nextLine();
        int i = 0;
        boolean encontrado = false;

        while (i < estacion.length && !encontrado) {
            if (estacion[i] != null && estacion[i].getMatricula().equals(matricula)) {
                encontrado = true;

                System.out.println("Posición: " + i + "");
                System.out.println("Matrícula: " + estacion[i].getMatricula() + "");

                for (Map.Entry<String, Conductor> entry : estacion[i].getConductores().entrySet()) {
                    System.out.println("DNI: " + entry.getValue().getDni() + ", Nombre: " + entry.getValue().getNombre() + "");
                }
            }
            i++;
        }

        if (!encontrado) {
            System.out.println("No se ha encontrado ningún autobús con esa matrícula.");
        }
    }

    public static void buscarConductor(Autobus[] estacion) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el DNI del conductor a buscar:");
        String dni = entrada.nextLine();
        int i = 0;
        boolean encontrado = false;

        while (i < estacion.length && !encontrado) {
            if (estacion[i] != null) {

                for (Map.Entry<String, Conductor> entry : estacion[i].getConductores().entrySet()) {

                    if (entry.getValue().getDni().equals(dni)) {
                        encontrado = true;

                        System.out.println("DNI: " + entry.getValue().getDni() + "");
                        System.out.println("Nombre: " + entry.getValue().getNombre() + "");
                        System.out.println("Matrícula del autobús: " + estacion[i].getMatricula() + "");
                    }
                }
            }
            i++;
        }

        if (!encontrado) {
            System.out.println("No se ha encontrado ningún conductor con ese DNI.");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Autobus[] estacion = new Autobus[6];
        int opcion = 0;
        
        do {
            
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        aparcar(estacion);
                        break;
                    case 2:
                        mostrarDarsenasLibres(estacion);
                        break;
                    case 3:
                        buscarAutobus(estacion);
                        break;
                    case 4:
                        buscarConductor(estacion);
                        break;
                    case 5:
                        // no he entendido el metodo 5.
                        break;
                    case 6:
                        System.out.println("Gracias por usar el programa");
                        break;
                    default:
                        System.out.println("Introduce una opción válida");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error, intrduce una opción entre 1 y 6");
                entrada.nextLine();
            }
        } while (opcion != 6);
    }
    
}
