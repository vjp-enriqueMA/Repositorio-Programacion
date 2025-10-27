/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio09;

/**
 *
 * @author alumno
 */
public class ejercicio09_pedir_numero_2 {
    public static void numero_menor(int numero1, int numero2, int numero3) {
        if (numero1<numero2 && numero1<numero3) {
            System.out.println(""+numero1+"");
        }
        else if (numero2<numero1 && numero2<numero3) {
            System.out.println(""+numero2+"");
        }
        else if (numero3<numero1 && numero3<numero2) {
            System.out.println(""+numero3+"");
        }
    }
}
