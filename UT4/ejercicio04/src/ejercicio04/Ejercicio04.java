/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;
import java.util.Scanner;
/**
 *
 * @author Enrique
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int numero1=entrada.nextInt();
        System.out.println("Introduce el segundo número");
        int numero2=entrada.nextInt();
        System.out.println("Introduce el tercer número");
        int numero3=entrada.nextInt();
        Ejercicio04_menor.ejercicio04_menor(numero1, numero2, numero3);
        // TODO code application logic here
    }
    
}
