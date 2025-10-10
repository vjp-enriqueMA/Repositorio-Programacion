/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduce la nota del alumno (número entero entre el 0 y el 10)"); 
        int nota=entrada.nextInt(); //Guardamos la nota introducida
         
        //Comprobamos en qué rango está la nota y mostramos la calificación
        if (nota>=0 && nota<=4) {
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
        else {
        //Si la nota no está entre 0 y 10, mostramos un mensaje de error
        System.out.println("La nota que has introducido no esta entre 0 y 10");
    }
    }
        // TODO code application logic here
    }
