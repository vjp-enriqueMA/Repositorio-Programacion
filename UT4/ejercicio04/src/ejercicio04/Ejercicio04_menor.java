/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author Enrique
 */
public class Ejercicio04_menor {
    public static void ejercicio04_menor(int numero1, int numero2, int numero3) {
        if (numero1<numero2 && numero1<numero3) {
            System.out.println("El número menor es "+numero1+"");
        }
        else if (numero2<numero1 && numero2<numero3) {
            System.out.println("El número menor es "+numero2+"");
        }
        else if (numero3<numero1 && numero3<numero2) {
            System.out.println("El número menor es "+numero3+"");
        }
    }
    
}
