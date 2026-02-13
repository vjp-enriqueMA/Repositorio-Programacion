/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduce una cadena de caracteres");
        String cadena = entrada.nextLine();
        
        char[] caracteres = cadena.toCharArray();

        for (int i = 0; i < caracteres.length; i++) {
            System.out.println(caracteres[i]);
        }
    }
    
}
