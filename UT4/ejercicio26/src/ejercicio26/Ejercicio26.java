package ejercicio26;
import java.util.Scanner;

public class Ejercicio26 {

    public static boolean comprobarPrimo() {
        boolean esPrimo;
        int numero;
        int divisor;
        int divisoresEncontrados;

        // Inicializamos las variables
        divisor = 0;
        divisoresEncontrados = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Introduce un número:");
        numero = input.nextInt(); // Leemos el número del usuario

        // Bucle para contar cuántos divisores tiene el número
        while (divisor < numero && divisoresEncontrados != 3) {
            divisor++; // Aumentamos el divisor en cada iteración

            // Si el número es divisible por el divisor, aumentamos el contador
            if (numero % divisor == 0) {
                divisoresEncontrados++;
            }
        }

        // Si el número tiene exactamente dos divisores (1 y él mismo), es primo
        if (divisoresEncontrados == 2) {
            esPrimo = true;
        } else {
            esPrimo = false;
        }

        return esPrimo;
    }

    public static void main(String[] args) {
        // Variable para almacenar el resultado de la comprobación
        boolean esNumeroPrimo;

        // Llamamos al método que verifica si el número es primo
        esNumeroPrimo = comprobarPrimo();

        // Mostramos el resultado al usuario
        if (esNumeroPrimo == true) {
            System.out.println("El número ingresado es primo.");
        } else {
            System.out.println("El número ingresado es compuesto.");
        }
    }
}
