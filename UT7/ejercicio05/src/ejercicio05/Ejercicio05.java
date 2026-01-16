/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio05 {
    public static int[][] introducirValores() {
        Scanner entrada = new Scanner(System.in);
        int matriz [] [] = new int [4] [2];
        int i;
        int j;
        for (i = 0; i < matriz.length; i++) {
            System.out.println("Introduce la fila "+(i+1)+"");
            for (j = 0; j < matriz[0].length; j++) {
                matriz [i] [j] = entrada.nextInt();
            }
        }
        return matriz;
    }
    
    public static void mostrarArray(int [] [] matriz) {
        int i;
        int j;
        for (i = 0; i < matriz.length; i++) {
            for(j = 0; j < matriz[0].length; j++) {
                System.out.println(matriz[i][j]);
            }
        }
    }
    
    public static void mostrarNumeroMayor(int [] [] matriz) {
        int mayor = matriz[0][0];
        int i;
        int j;
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
            }
        }
        System.out.println("El numero mayor es "+mayor+"");
    }
    
    public static void mostrarNumeroMenor(int [] [] matriz) {
        int menor = matriz [0][0];
        int i;
        int j;
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
        System.out.println("El número menor es "+menor+"");
    }
    
    public static void suma(int [] [] matriz) {
        int suma = 0;
        int i;
        int j;
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j< matriz[0].length; j++) {
                suma = suma + matriz[i][j];
            }
        }
        System.out.println("La suma total de todos los numeros es "+suma+"");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] [] matriz = introducirValores();
        mostrarArray(matriz);
        mostrarNumeroMayor(matriz);
        mostrarNumeroMenor(matriz);
        suma(matriz);
    }
    
}
