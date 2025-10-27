/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;
import java.util.Scanner;
import ejercicio03_mayor.Ejercicio03_mayor;
/**
 *
 * @author Enrique
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Por favor, introduzca el primer numero: ");
        int numero1=entrada.nextInt();
        System.out.println("Ahora, introduzca un segundo numero:");
        int numero2=entrada.nextInt();
        System.out.println("Por último, introduzca un tercer numero:");
        int numero3=entrada.nextInt();
        ejercicio03_mayor.Ejercicio03_mayor.mayor(numero1, numero2, numero3);
        
        // TODO code application logic here
    }
    
}
