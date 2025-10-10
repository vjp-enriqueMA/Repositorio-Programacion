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
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una cantidad de segundos");
        int segundos=entrada.nextInt();
        int dias,horas,minutos,segundosRestantes;
        dias=segundos/86400;
        horas=(segundos%86400)/3600;
        minutos=(segundos%3600)/60;
        segundosRestantes=segundos%60;
        System.out.println(""+dias+"");
        System.out.println(""+horas+"");
        System.out.println(""+minutos+"");
        System.out.println(""+segundosRestantes+"");
        // TODO code application logic here
    }
    
}
