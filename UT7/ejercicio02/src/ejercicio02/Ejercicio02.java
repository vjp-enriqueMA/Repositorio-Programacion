/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author alumno
 */
public class Ejercicio02 {
    public static int[] introducirDatos() {
        int i;
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[7];
        for (i=0; i < numeros.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        return numeros;
    }
    
    public static void mostrarDatos(int[] numeros) {
        int i;
        for (i=0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
    
    public static void intercambiarDatos(int[] numeros) {
        int temp =  numeros[1];
        numeros[1] = numeros[3];
        numeros[3] = temp;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros;
        numeros = introducirDatos();
        mostrarDatos(numeros);
        intercambiarDatos(numeros);
        // TODO code application logic here
    }
    
}
