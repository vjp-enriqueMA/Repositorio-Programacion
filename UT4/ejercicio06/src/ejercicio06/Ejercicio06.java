/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;
import java.util.Scanner;
/**
 *
 * @author Enrique
 */
public class Ejercicio06 {
    public static void ejercicio06_nota(int nota) {
        if (nota>0 && nota<=4) {
            System.out.println("Suspenso");
        }
        else if (nota>=5 && nota<=6) {
            System.out.println("Bien");
        }
        else if (nota>=7 && nota<=8) {
            System.out.println("Notable");
        }
        else if (nota>=9 && nota<=10) {
            System.out.println("Sobresaliente");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce la nota del alumno");
        int nota=entrada.nextInt();
        ejercicio06_nota(nota);
        // TODO code application logic here
    }
    
}
