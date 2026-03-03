/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Ejercicio06 {
    public static void pedirOpcion() {
        System.out.println("INTRODUCE UNA OPCIÓN");
        System.out.println("1. Introducir las ventas de coches de cada uno de los 12 meses del año.");
        System.out.println("2. Mostrar las ventas introducidas en el punto anterior");
        System.out.println("3. Mostrar las ventas introducidas al revés");
        System.out.println("4. Que muestre la suma total de ventas del año.");
        System.out.println("5. Que muestre las ventas totales de los meses cuyo nombre contenga la letra a.");
        System.out.println("6. Que muestre el nombre del mes (o meses) con más ventas.");
        System.out.println("7. Salir del programa.");
    }
     
    public static ArrayList<Integer> rellenarVentas() {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> ventas = new ArrayList<>();
        String[] meses = {
            "enero", "febrero", "marzo", "abril", "mayo", "junio",
            "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
        };
        for (int i = 0; i < 12; i++) {
            System.out.println("Introduce las ventas del mes "+meses[i]+"");
            int numero = entrada.nextInt();
            ventas.add(numero);
        }
        return ventas;
    }
    
    public static void mostrarVentas(ArrayList<Integer> ventas) {
        String[] meses = {
            "enero", "febrero", "marzo", "abril", "mayo", "junio",
            "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
        };
        for (int i = 0; i < ventas.size(); i++) {
            System.out.println("Las ventas del mes "+meses[i]+" son "+ventas.get(i)+"");
        }
    }
    
    public static void mostrarVentasIntroducidasAlReves(ArrayList<Integer> ventas) {
        String[] meses = {
            "enero", "febrero", "marzo", "abril", "mayo", "junio",
            "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
        };
        for (int i = ventas.size() - 1; i >= 0; i--) {
            System.out.println("Las ventas del mes "+meses[i]+" son "+ventas.get(i)+"");
        }
    }
    
    public static void sumaVentas(ArrayList<Integer> ventas) {
        int suma = 0;
        for (int i = 0; i < ventas.size(); i++) {
            suma = suma + ventas.get(i);
        }
        System.out.println("La suma total de ventas es de "+suma+"");
    }
    
    public static void totalVentasMesesA(ArrayList<Integer> ventas) {
        String[] meses = {
            "enero", "febrero", "marzo", "abril", "mayo", "junio",
            "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
        };
        for (int i = 0; i < ventas.size(); i++) {
            if (meses[i].toLowerCase().contains("a")) {
                System.out.println("Las ventas del mes "+meses[i]+" son "+ventas.get(i)+"");
            }
        }
    }
    
    public static void mesConMasVentas(ArrayList<Integer> ventas) {
        String[] meses = {
            "enero", "febrero", "marzo", "abril", "mayo", "junio",
            "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
        };
        int mayor = ventas.get(0);
        
        for (int i = 0; i < ventas.size(); i++) {
            if (ventas.get(i) > mayor) {
                mayor = ventas.get(i);
            }
            if (ventas.get(i) == mayor) {
                System.out.println("El mes con más ventas es "+meses[i]+"");
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> ventas = new ArrayList<>();
        int opcion = 0;
        
        do {
            
            try {
                pedirOpcion();
                opcion = entrada.nextInt();
                
                switch (opcion) {
                    case 1 -> ventas = rellenarVentas();
                    case 2 -> mostrarVentas(ventas);
                    case 3 -> mostrarVentasIntroducidasAlReves(ventas);
                    case 4 -> sumaVentas(ventas);
                    case 5 -> totalVentasMesesA(ventas);
                    case 6 -> mesConMasVentas(ventas);
                    case 7 -> System.out.println("Te has salido del programa");
                    default -> System.out.println("Introduce una opción válida");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Introduzca un número entero entre 1 y 7");
                entrada.nextLine();
            }
        } while (opcion != 7);
    }
    
}
