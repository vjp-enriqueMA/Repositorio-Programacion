/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduce un número");
        int numero=entrada.nextInt();
        for (i=0;i<=10;i++) {
            System.out.println(""+numero+" x "+i+" = "+numero*i+"");
        }
    }
    
}
