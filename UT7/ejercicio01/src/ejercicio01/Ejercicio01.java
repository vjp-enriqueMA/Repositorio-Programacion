/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Enrique
 */
public class Ejercicio01 {
    /**
     * Método que pide 10 números enteros al usuario
     * @return 
     */
    public static int[] pedirNumerosEnteros() {
        Scanner entrada = new Scanner(System.in);
        int [] numeros = new int [10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce el número");
            numeros[i] = entrada.nextInt();
        }
        return numeros;
    }
    
    /**
     * Método que muestra por pantalla solo los números pares
     * @param numeros 
     */
    public static void mostrarNumerosPares(int[] numeros) {
        int i;
        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = pedirNumerosEnteros();
        mostrarNumerosPares(numeros);
    }
    
}
