/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio09;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class ejercicio09_pedir_numero {
    public static void pedir_Numero() {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce un primer número");
        int numero1=entrada.nextInt();
        System.out.println("Introduce un segundo número");
        int numero2=entrada.nextInt();
        System.out.println("Por último, introduce un tercer número");
        int numero3=entrada.nextInt();
        ejercicio09.ejercicio09_pedir_numero_2.numero_menor(numero1, numero2, numero3);
    }
}
