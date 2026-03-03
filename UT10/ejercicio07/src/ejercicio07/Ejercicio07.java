/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author alumno
 */
public class Ejercicio07 {
    public final static int SEMANAS = 4;
    public final static int DIAS = 7;
    
    /**
     * Método que rellena la lista de listas
     * con 28 temperaturas.
     * @param temperaturas 
     */
    public static void rellenar(ArrayList<ArrayList<Integer>> temperaturas) {
        // Creo el arrayList de temperaturas de la semana
        for (int i = 0; i < SEMANAS; i++) {
            ArrayList<Integer> dias = new ArrayList<>();
            
            // Relleno el arrayList de temperaturas de la semana
            for (int j = 0; j < DIAS; j++) {
                dias.add((int) (Math.random() * 15));
            }
            
            // Inserto las temperaturas de la semana a la lista
            temperaturas.add(dias);
        }
    }
    
    /**
     * Método que muestra las temperaturas del mes.
     * 
     * @param temperaturas
     * @param nombreDias 
     */
    public static void mostrar(ArrayList<ArrayList<Integer>> temperaturas, String[] nombreDias) {
        for (int i = 0; i < SEMANAS; i++) {
            System.out.println("Semana "+(i+1)+"");
            
            for (int j = 0; j < DIAS; j++) {
                System.out.println(nombreDias[j] + ": " + temperaturas.get(i).get(j) + "ºX");
            }
        }
    }
    
    /**
     * Método que muestra la temperatura media del mes.
     * 
     * @param temperaturas
     */
    public static void calcularMedia(ArrayList<ArrayList<Integer>> temperaturas) {
        int media = 0;
        for (int i = 0; i < SEMANAS; i++) {
            
            for (int j = 0; j < DIAS; j++) {
                media = media + temperaturas.get(i).get(j);
            }
        }
        media = media / SEMANAS * DIAS;
        System.out.println("La temperatura media del mes es: "+media+"");
    }
    
    public static void mostrarTemperaturasMaximas(ArrayList<ArrayList<Integer>> temperaturas, String[] nombreDias) {
        int maxTemp = 0;
        int tempActual;
        for (int i = 0; i < SEMANAS; i++) {
            for (int j = 0; j < DIAS; j++) {
                tempActual = temperaturas.get(i).get(j);
                
                if (tempActual > maxTemp) {
                    maxTemp = tempActual;
                }
            }
        }
        
        System.out.println("Los días con más temperaturas son:");
        for (int i = 0; i < SEMANAS; i++) {
            for (int j = 0; j < DIAS; j++) {
                if (temperaturas.get(i).get(j) == maxTemp) {
                    System.out.println("El "+nombreDias[j]+" de la semana "+(i+1)+" con "+maxTemp+"");
                }
            }
        }
        
    }
    
    public static int pedirOpcion() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> temperaturas = new ArrayList<>();
        String[] nombreDias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        int opcion = 0;
        do {
            
            try {
                System.out.println("1. Rellenar las temperaturas");
                System.out.println("2. Mostrar las temperaturas");
                System.out.println("3. Temperatura media");
                System.out.println("4. Mostrar días más calurosos");
                System.out.println("5. Salir");
                System.out.println(" Opción ");
                
                opcion = pedirOpcion();
                
                switch (opcion) {
                    case 1 -> rellenar(temperaturas);
                    case 2 -> mostrar(temperaturas, nombreDias);
                    case 3 -> calcularMedia(temperaturas);
                    case 4 -> mostrarTemperaturasMaximas(temperaturas, nombreDias);
                    case 5 -> System.out.println("Gracias por usar el programa");
                    default -> System.out.println("Introduzca una opción válida");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Introduzca un número entero entre 1 y 5");
            }
        } while (opcion != 5);
    }
    
}
