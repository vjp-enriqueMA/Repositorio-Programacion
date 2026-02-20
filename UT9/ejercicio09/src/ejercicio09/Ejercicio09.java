/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un usuario:");
        String usuario = entrada.nextLine();

        String contraseña;
        boolean contraseñaValida;

        do {
            System.out.println("Introduce una contraseña:");
            contraseña = entrada.nextLine();

            contraseñaValida = true;

            // Condición 1: mínimo 6 caracteres
            if (contraseña.length() < 6) {
                System.out.println("Error: la contraseña no puede tener menos de seis caracteres.");
                contraseñaValida = false;
            }

            // Condición 2: al menos 2 dígitos
            int contadorDigitos = 0;
            for (int i = 0; i < contraseña.length(); i++) {
                if (Character.isDigit(contraseña.charAt(i))) {
                    contadorDigitos++;
                }
            }
            if (contadorDigitos < 2) {
                System.out.println("Error: la contraseña debe contener al menos 2 dígitos.");
                contraseñaValida = false;
            }

            // Condición 3: no incluir el nombre de usuario
            if (contraseña.toLowerCase().contains(usuario.toLowerCase())) {
                System.out.println("Error: la contraseña no puede contener el nombre del usuario.");
                contraseñaValida = false;
            }

        } while (!contraseñaValida);

        System.out.println("¡Contraseña válida registrada con éxito!");
    }
}
