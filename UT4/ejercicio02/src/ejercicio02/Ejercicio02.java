/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;
import java.util.Scanner;
/**
 *
 * @author Enrique
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resultado;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Por favor, introduzca un número:");
        int numero1=entrada.nextInt();
        System.out.println("Ahora, introduzca un segundo numero:");
        int numero2=entrada.nextInt();
        if (numero1>10) {
            resultado=Multiplicacion.multiplicacion(numero1, numero2);
            System.out.println("La operación que se realizó es producto y el resultado es "+resultado+"");
        }
        else {
            resultado=Suma.suma(numero1, numero2);
            System.out.println("La operación que se realizó es suma y el producto es "+resultado+"");
        }
        // TODO code application logic here
    }
    
}
