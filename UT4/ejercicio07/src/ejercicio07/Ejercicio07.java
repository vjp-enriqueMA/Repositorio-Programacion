/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;
import java.util.Scanner;
/**
 *
 * @author Enrique
 */
public class Ejercicio07 {
    //Método que recibe cuatro números y los imprime ordenados de menor a mayor
    public static void ejercicio07_orden(int numero1, int numero2, int numero3, int numero4) {
         //Variables para almacenar los números ordenados
        int menor, segundo, tercero, mayor;
        
         //Determinamos el menor número
        if(numero1 <= numero2 && numero1 <= numero3 && numero1 <= numero4){
            menor = numero1;
            //Ordenamos los demás
            if(numero2 <= numero3 && numero2 <= numero4){
                segundo = numero2;
                if(numero3 <= numero4){
                    tercero = numero3;
                    mayor = numero4;
                } else {
                    tercero = numero4;
                    mayor = numero3;
                }
            } else if(numero3 <= numero2 && numero3 <= numero4){
                segundo = numero3;
                if(numero2 <= numero4){
                    tercero = numero2;
                    mayor = numero4;
                } else {
                    tercero = numero4;
                    mayor = numero2;
                }
            } else { //numero4 es el segundo más pequeño
                segundo = numero4;
                if(numero2 <= numero3){
                    tercero = numero2;
                    mayor = numero3;
                } else {
                    tercero = numero3;
                    mayor = numero2;
                }
            }
        } else if(numero2 <= numero1 && numero2 <= numero3 && numero2 <= numero4){
            menor = numero2;
            if(numero1 <= numero3 && numero1 <= numero4){
                segundo = numero1;
                if(numero3 <= numero4){
                    tercero = numero3;
                    mayor = numero4;
                } else {
                    tercero = numero4;
                    mayor = numero3;
                }
            } else if(numero3 <= numero1 && numero3 <= numero4){
                segundo = numero3;
                if(numero1 <= numero4){
                    tercero = numero1;
                    mayor = numero4;
                } else {
                    tercero = numero4;
                    mayor = numero1;
                }
            } else {
                segundo = numero4;
                if(numero1 <= numero3){
                    tercero = numero1;
                    mayor = numero3;
                } else {
                    tercero = numero3;
                    mayor = numero1;
                }
            }
        } else if(numero3 <= numero1 && numero3 <= numero2 && numero3 <= numero4){
            menor = numero3;
            if(numero1 <= numero2 && numero1 <= numero4){
                segundo = numero1;
                if(numero2 <= numero4){
                    tercero = numero2;
                    mayor = numero4;
                } else {
                    tercero = numero4;
                    mayor = numero2;
                }
            } else if(numero2 <= numero1 && numero2 <= numero4){
                segundo = numero2;
                if(numero1 <= numero4){
                    tercero = numero1;
                    mayor = numero4;
                } else {
                    tercero = numero4;
                    mayor = numero1;
                }
            } else {
                segundo = numero4;
                if(numero1 <= numero2){
                    tercero = numero1;
                    mayor = numero2;
                } else {
                    tercero = numero2;
                    mayor = numero1;
                }
            }
        } else { //numero4 es el menor
            menor = numero4;
            if(numero1 <= numero2 && numero1 <= numero3){
                segundo = numero1;
                if(numero2 <= numero3){
                    tercero = numero2;
                    mayor = numero3;
                } else {
                    tercero = numero3;
                    mayor = numero2;
                }
            } else if(numero2 <= numero1 && numero2 <= numero3){
                segundo = numero2;
                if(numero1 <= numero3){
                    tercero = numero1;
                    mayor = numero3;
                } else {
                    tercero = numero3;
                    mayor = numero1;
                }
            } else {
                segundo = numero3;
                if(numero1 <= numero2){
                    tercero = numero1;
                    mayor = numero2;
                } else {
                    tercero = numero2;
                    mayor = numero1;
                }
            }
        }
        
        //Mostramos los números en orden creciente
        System.out.println("El orden de los números introducidos es: " + menor + "-" + segundo + "-" + tercero + "-" + mayor);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        //Pedimos al usuario que introduzca los números
        System.out.println("Por favor, introduzca el primer numero:");
        int numero1=entrada.nextInt();
        System.out.println("Ahora, introduzca un segundo numero:");
        int numero2=entrada.nextInt();
        System.out.println("Introduzca el tercer numero:");
        int numero3=entrada.nextInt();
        System.out.println("Por último, introduzca un cuarto numero:");
        int numero4=entrada.nextInt();
        //Llamamos al método que se encarga de ordenar y mostrar los números
        ejercicio07_orden(numero1,numero2,numero3,numero4);
        // TODO code application logic here
    }
    
}
