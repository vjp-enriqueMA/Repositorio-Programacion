/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Enrique
 */
public class Ejercicio02 {
    /**
     * Método que pide al usuario 7 números enteros
     * @return 
     */
    public static int[] introducirDatos() {
        Scanner entrada = new Scanner(System.in);
        int i;
        int [] numeros = new int [7];
        for (i = 0; i < numeros.length; i++) {
            System.out.println("Introduce el número");
            numeros[i] = entrada.nextInt();
        }
        return numeros;
    }
    
    /**
     * Método que muestra por pantalla todos los valores
     * @param numeros 
     */
    public static void mostrarDatos(int[] numeros) {
        int i;
        for (i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    /**
     * Método que intercambia los valores de las posiciones 1 y 3
     * @param numeros 
     */
    public static void intercambiarNumeros(int [] numeros) {
        int i;
        int temporal = numeros[1];
        numeros[1] = numeros[3];
        numeros[3] = temporal;
        
        for (i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] numeros = introducirDatos();
        mostrarDatos(numeros);
        intercambiarNumeros(numeros);
    }
    
}
