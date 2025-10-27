/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;
import java.util.Scanner;
/**
 *
 * @author Enrique
 */
public class Ejercicio14 {
    
    // Método que comprueba si el número introducido es mayor que 0
    public static boolean comprobarNumero(int num) {
        if (num > 0) {
            return true; // Devolvemos true si el número es válido
        } else {
            return false; // Devolvemos false si el número es menor o igual que 0
        }
    }
    
    // Método que muestra todos los múltiplos de 3 entre 1 y el número introducido
    public static void mostrarMultiplos(int num) {
        int contador = 0; // Creamos una variable para contar los múltiplos de 3
        
        System.out.println("Los múltiplos de 3 entre 1 y " + num + " son:");
        
        // Recorremos todos los números desde 1 hasta el número introducido
        for (int i = 1; i <= num; i++) {
            // Comprobamos si el número actual es múltiplo de 3
            if (i % 3 == 0) {
                System.out.println(i); // Mostramos el número si es múltiplo de 3
                contador++; // Aumentamos el contador en 1
            }
        }
        
        // Mostramos el total de múltiplos encontrados
        System.out.println("Total de números mostrados: " + contador);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer los datos del teclado
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        // Pedimos al usuario que introduzca un número mayor que 0
        System.out.println("Introduce un número mayor que 0:");
        numero = entrada.nextInt();
        
        // Comprobamos que el número introducido sea válido
        while (!comprobarNumero(numero)) {
            // Si el número no es válido, mostramos un mensaje de error y lo pedimos de nuevo
            System.out.println("Error. El número debe ser mayor que 0.");
            System.out.println("Introduce un número mayor que 0:");
            numero = entrada.nextInt();
        }
        
        // Llamamos al método que mostrará los múltiplos de 3 y su cantidad total
        mostrarMultiplos(numero);
    }
    
}
