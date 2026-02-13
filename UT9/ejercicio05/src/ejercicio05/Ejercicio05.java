/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduce un día de la semana");
        String dia = entrada.nextLine();
        
        
        String [] diasSemanas = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        
        int i = 0;
        boolean encontrado = false;
        
        while (i < diasSemanas.length && !encontrado) {
            if (diasSemanas[i].equalsIgnoreCase(dia)) {
                encontrado = true;
            }
            else {
                i++;
            }
        }
        String [] posiciones = {"primer", "segundo", "tercer", "cuarto", "quinto", "sexto", "séptimo"};
        if (encontrado == true) {
            System.out.println("Es el "+posiciones[i]+" día de la semana");
        }
        else {
            System.out.println("No se ha encontrado ningún día de la semana");
        }
    }
}