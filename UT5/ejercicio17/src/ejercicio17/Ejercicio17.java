/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;
import java.util.Scanner;
/**
 *
 * @author Enrique
 */
public class Ejercicio17 {
    public static void preguntaUsuario(Enunciado enunciado1, Scanner entrada) {
        enunciado1.setPregunta("Cual es la capital de España");
        System.out.println(enunciado1.getPregunta());
        enunciado1.setRespuesta(entrada.nextLine());
        if (enunciado1.getRespuesta().equals("Madrid")) {
            System.out.println("Correcto");
        }
        else {
            System.out.println("Incorrecto");
        }
        // TODO code application logic here
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Enunciado enunciado1 = new Enunciado();
        
        preguntaUsuario(enunciado1, entrada);
    }
}
