/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduce un primer número");
        int numero1=entrada.nextInt();
        System.out.println("Introduce un segundo número");
        int numero2=entrada.nextInt();
        int division;
        try {
        division=numero1/numero2;
        System.out.println(division);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        }
        // TODO code application logic here
    }
    
