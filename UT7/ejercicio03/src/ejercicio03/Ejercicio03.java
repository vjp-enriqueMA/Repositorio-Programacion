/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;
import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;
/**
 *
 * @author Enrique
 */
public class Ejercicio03 {
    /**
     * Método que genera un array de 6 números aleatorios
     * @return 
     */
    public static int[] numerosAleatorios(int longitud) {
        int i;
        int [] numeros = new int [longitud];
        for (i = 0; i < numeros.length; i++) {
            numeros[i] = (int)((Math.random() * 6) + 1);
        }
        return numeros;
    }
    
    /**
     * Método que muestra por pantalla todos los elementos del array recibido como parámetro
     * @param numeros 
     */
    public static void mostrarNumeros(int [] numeros) {
        int i;
        for (i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
    
    /**
     * Método que pide al usuario una longitud entre 1 y 10
     * @return 
     */
    public static int elegirLongitud() {
        Scanner entrada = new Scanner(System.in);
        int longitud = 0;
        do {
        System.out.println("Introduce la longitud entre 0 y 10");
        
        try {
        longitud = entrada.nextInt();
        } 
        catch (InputMismatchException e) {
            System.out.println(e);
            System.out.println("Introduce una longitud que no sea una letra");
            entrada.next();
        }
        } while(longitud < 1 || longitud > 10);
        return longitud;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int longitud = elegirLongitud();
        int [] numeros = numerosAleatorios(longitud);
        mostrarNumeros(numeros);
    }
    
}
