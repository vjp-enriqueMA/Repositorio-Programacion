/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio14 {
    public static int insertarMenu() {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        System.out.println("ELIGE UNA OPCIÓN");
        System.out.println("1. Rellenar las temperaturas");
        System.out.println("2. Mostrar las temperaturas");
        System.out.println("3. Visualizar la temperatura media del mes");
        System.out.println("4. Día o días más calurosos del mes");
        System.out.println("5. Salir");
        opcion = entrada.nextInt();
        return opcion;
    }
    
    public static int[][] rellenarTemperaturas() {
        Scanner entrada = new Scanner(System.in);
        int [] [] matriz = new int [4] [7];
        int i;
        int j;
        for (i = 0; i < matriz.length; i++) {
            System.out.println("Semana "+(i+1)+"");
            for (j = 0; j < matriz[0].length; j++) {
                System.out.println("Dia "+(j+1)+"");
                matriz[i][j] = entrada.nextInt();
            }
        }
        return matriz;
    }
    
    public static void mostrarTemperaturas(int [][] matriz) {
        int i;
        int j;
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[0].length; j++) {
                System.out.println(matriz[i][j]);
            }
        }
    }
    
    public static void visualizarTemperaturaMedia(int[][] matriz) {
        int media;
        int suma = 0;
        int i;
        int j;
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[0].length; j++) {
                suma = suma + matriz[i][j];
            }
        }
        media = suma / 28;
        System.out.println("La media total es de "+media+"");
    }
    
    public static void diaMasCaluroso(int[][] matriz) {
    int mayor = matriz[0][0];
    int i, j;

    String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

    for (i = 0; i < matriz.length; i++) {
        for (j = 0; j < matriz[0].length; j++) {
            if (matriz[i][j] > mayor) {
                mayor = matriz[i][j];
            }
        }
    }

    System.out.println("El día o días más calurosos fueron:");
    for (i = 0; i < matriz.length; i++) {
        for (j = 0; j < matriz[0].length; j++) {
            if (matriz[i][j] == mayor) {
                System.out.println("• El " + dias[j] + " de la Semana " + (i + 1)
                        + " con " + mayor + " grados.");
            }
        }
    }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        int [] [] matriz = new int [4] [7];
        do {
            opcion = insertarMenu();
            switch (opcion) {
                case 1:
                    matriz = rellenarTemperaturas();
                    break;
                case 2:
                    mostrarTemperaturas(matriz);
                    break;
                case 3:
                    visualizarTemperaturaMedia(matriz);
                    break;
                case 4:
                    diaMasCaluroso(matriz);
                    break;
                case 5:
                    System.out.println("Te has salido del programa");
                    break;
                default:
                    System.out.println("Introduce una opción válida");
            }
        } while (opcion!=5);
    }
    
}
