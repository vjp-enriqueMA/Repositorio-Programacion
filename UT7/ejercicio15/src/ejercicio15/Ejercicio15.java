/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio15 {
    public static int mostrarMenu() {
        Scanner entrada = new Scanner (System.in);
        int opcion = 0;
        
        System.out.println("INTRODUCE UNA OPCIÓN:");
        System.out.println("1. Rellenar array");
        System.out.println("2. Mostrar ventas del punto anterior");
        System.out.println("3. Mostrar ventas introducidas al revés");
        System.out.println("4. Suma total de ventas al año");
        System.out.println("5. Ventas totales de los meses pares");
        System.out.println("6. Mostrar el nombre del mes con más ventas");
        System.out.println("7. Salir del programa");
        
        opcion = entrada.nextInt();
        
        return opcion;
    }
    
    public static int[] rellenarArray() {
        int [] array = new int [12];
        int i;
        for (i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * (100 - 10 + 1)) + 10);
        }
        return array;
    }
    
    public static void mostrarArray(int [] array) {
        int i;
        for (i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
    public static void mostrarArrayReves(int[] array) {
        int i;
        for (i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
    
    public static void mostrarSuma(int[] array) {
        int suma = 0;
        int i;
        for (i = 0; i < array.length; i++) {
            suma = suma + array[i];
        }
        System.out.println(suma);
    }
    
    public static void mostrarMeses(int [] array) {
        int suma = 0;
        int i;
        for (i = 1; i < array.length; i = i+2) {
            suma = suma + array[i];
        }
        System.out.println(suma);
    }
    
    public static void mesMayorVentas(int[] array) {
        String [] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        int[] array = new int [12];
        do {
            opcion = mostrarMenu();
            
        switch (opcion) {
            case 1:
                array = rellenarArray();
                break;
            case 2:
                mostrarArray(array);
                break;
            case 3:
                mostrarArrayReves(array);
                break;
            case 4:
                mostrarSuma(array);
                break;
            case 5:
                mostrarMeses(array);
                break;
            case 6:
                mesMayorVentas(array);
                        
                break;
            case 7:
                System.out.println("Te has salido del programa");
                break;
            default:
                System.out.println("Introduce un número entre el 1 y el 7");
            
        }
        } while (opcion!=7);
    }
}