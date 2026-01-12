/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio08 {
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Introduce un número de cinco cifras:");
            numero = entrada.nextInt();
        } while (numero < 10000 || numero > 99999);

        return numero;
    }
    
    public static int[] dividirNumero(int numero) {
        int i;
        int [] dividirnumero = new int [5];
        for (i = 0; i < dividirnumero.length; i++) {
            dividirnumero[i] = numero % 10;
            numero = numero / 10;
        }
        return dividirnumero;
    }

    public static void mostrarNumero(int [] dividirnumero) {
        int i;
        for (i = 0; i < dividirnumero.length; i++) {
            System.out.println(dividirnumero[i]);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = pedirNumero();
        int [] divisor = dividirNumero(numero);
        mostrarNumero(divisor);
        // TODO code application logic here
    }
    
}
