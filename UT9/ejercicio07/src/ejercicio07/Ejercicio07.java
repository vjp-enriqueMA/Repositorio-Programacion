/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author alumno
 */
public class Ejercicio07 {
    public static void frase() {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduce una frase");
        String frase = entrada.nextLine();
        
        String [] palabras = frase.split(" ");
        
        for (int i = palabras.length - 1; i >= 0; i--) {
            System.out.print(palabras[i] + " ");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frase();
    }
    
}
