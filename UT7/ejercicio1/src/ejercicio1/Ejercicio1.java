/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author alumno
 */
public class Ejercicio1 {
    public static int[] pedirNumero() {
        int i;
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        for (i=0; i < numeros.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        return numeros;
    }
    
    public static void numerosPares(int[] numeros) {
        int i;
        for (i=0; i < numeros.length; i=i+2) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros;
        numeros = pedirNumero();
        numerosPares(numeros);
    }
    
}
