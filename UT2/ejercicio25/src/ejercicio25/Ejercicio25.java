/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         System.out.println("Introduce el primer número");
         int primerNumero=entrada.nextInt();
         System.out.println("Introduce el segundo número");
         int segundoNumero=entrada.nextInt();
         System.out.println("Introduce el tercer número");
         int tercerNumero=entrada.nextInt();
         int suma;
         suma=primerNumero+segundoNumero+tercerNumero;
         System.out.println("La suma de los número introducidos es "+suma+"");
         int multiplicacion;
         multiplicacion=primerNumero*segundoNumero*tercerNumero;
         System.out.println("La suma de los número introducidos es "+multiplicacion+"");
        // TODO code application logic here
    }
    
}
