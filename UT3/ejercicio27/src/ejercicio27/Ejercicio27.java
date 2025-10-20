/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author Enrique
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        //Pedimos al usuario que introduzca dos números
        System.out.println("Introduce un primer número");
        int numero1=entrada.nextInt();
        System.out.println("Introduce un segundo número");
        int numero2=entrada.nextInt();
        int operacion=0; //Aquí guardaremos la opción que elija el usuario
        //Mientras el usuario no elija la opción 5, el programa sigue mostrando el menú
        while (operacion!=5) {
           
        //Mostramos el menú con las opciones disponibles
        System.out.println("1.- Sumar los números");
        System.out.println("2.- Restar los números");
        System.out.println("3.- Multiplicar los números");
        System.out.println("4.- Dividir los números");
        System.out.println("5.- Salir del programa");
        operacion=entrada.nextInt();
   
        //Intentamos ejecutar la operación elegida
        try {
        if (operacion==1) {
            System.out.println(numero1+numero2);
        }
        else if (operacion==2) {
            System.out.println(numero1-numero2);
        }
        else if (operacion==3) {
            System.out.println(numero1*numero2);
        }
        else if (operacion==4) {
            System.out.println(numero1/numero2);
        }
        else if (operacion==5) {
            System.out.println("Has  abandonado el programa");
        }
        else {
            System.out.println("El número no es válido");
        }
        }
        //Si ocurre un error al dividir entre 0, se muestra un mensaje
        catch (ArithmeticException e) {
            System.out.println(e);
        //Si el usuario mete algo que no sea un número
        } catch (InputMismatchException e) {
            System.out.println(e);
        //Este bloque se ejecuta siempre, haya o no error
        } finally {
            System.out.println("Este mensaje se muestra siempre");
        }
        }
    }
   
}