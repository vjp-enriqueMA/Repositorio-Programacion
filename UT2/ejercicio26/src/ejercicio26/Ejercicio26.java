/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in); //Creamos el objeto Scanner para leer datos introducidos por el usuario
        System.out.println("Por favor, introduzca un número de 4 cifras:"); //Solicitamos al usuario que introduzca un número de 4 cifras
        int numero = entrada.nextInt(); //Guardamos el número introducido por el usuario en la variable numero
       
        int cifra1, cifra2, cifra3, cifra4; //Declaramos variables para guardar cada una de las cifras del número
        cifra1 = numero / 1000; //Primera cifra: miles
        cifra2 = (numero / 100) % 10; //Segunda cifra: centenas
        cifra3 = (numero / 10) % 10; //Tercera cifra: decenas
        cifra4 = numero % 10; //Cuarta cifra: unidades
        
       // Mostramos los resultados por pantalla
        System.out.println("La primera cifra es: "+cifra1+"");
        System.out.println("La segunda cifra es: "+cifra2+"");
        System.out.println("La tercera cifra es: "+cifra3+"");
        System.out.println("La primera cifra es: "+cifra4+"");
    }
}
