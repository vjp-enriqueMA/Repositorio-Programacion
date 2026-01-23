/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;

/**
 *
 * @author alumno
 */
public class Ejercicio06 {
    public static boolean esPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] primos = new int[80];
        int contador = 0;
        int numero = 1;

        while (contador < primos.length) {
            if (numero == 1 || esPrimo(numero)) {
                primos[contador] = numero;
                contador++;
            }
            numero++;
        }

        System.out.println("Contenido de un array unidimensional de 80 posiciones con números primos:");
        for (int i = 0; i < primos.length; i++) {
            System.out.print("["+i+"]:"+primos[i]+";");
        }
    }
}
