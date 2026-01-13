/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author alumno
 */
public class Ejercicio09 {
    public static int pedirNumero() {
        Scanner entrada = new Scanner (System.in);
        int numero;
        System.out.println("Introduzca un número");
        numero = entrada.nextInt();
        
        return numero;
    }
    
    public static int calcularCifras(int numero) {
        int contador = 0;
        int numero2 = numero;
        
        while (numero2 > 0) {
            numero2 = numero2 / 10;
            contador++;
        }
        return contador;
    }
    
    public static int[] dividirCifras(int numero, int cifras) {
        int[] array = new int[cifras];

        for (int i = cifras - 1; i >= 0; i--) {
            array[i] = numero % 10;
            numero = numero / 10;
        }

        return array;
}
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = pedirNumero();
        int cifras = calcularCifras(numero);
        int[] array = dividirCifras(numero, cifras);
        
        System.out.print("El número al revés es: ");
        for (int i = array.length - 1; i >= 0; i--) {
        System.out.print(array[i]);
    }
}
}
