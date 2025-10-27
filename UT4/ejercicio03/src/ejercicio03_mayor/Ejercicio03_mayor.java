/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03_mayor;

/**
 *
 * @author Enrique
 */
public class Ejercicio03_mayor {
    public static void mayor(int numero1, int numero2, int numero3) {
        if (numero1>numero2 && numero1>numero3) {
            System.out.println("El número mayor de los introducidos es el: "+numero1+"");
        }
        else if (numero2>numero1 && numero2>numero3) {
            System.out.println("El número mayor de los introducidos es el: "+numero2+"");
        }
        else if (numero3>numero1 && numero3>numero2) {
            System.out.println("El número mayor de los introducidos es el: "+numero3+"");
        }
    }
    
}
