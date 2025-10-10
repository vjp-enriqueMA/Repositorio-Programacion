/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in); //Creamos un objeto Scanner para leer la entrada del usuario desde el teclado
        System.out.println("Introduce un número"); //Pedimos al usuario que introduzca un número
        int numero=entrada.nextInt(); //Guardamos el número introducido en la variable numero
        
        // Hacemos una condición para determinar si el número es positivo o negativo
        if (numero>=0) {
            System.out.println("El número introducido es positivo");
        }
        else {
            System.out.println("El número introducido es negativo");
        }
        }
    }
