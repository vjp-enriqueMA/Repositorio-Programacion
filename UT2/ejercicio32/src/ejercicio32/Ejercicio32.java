/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //Creamos el objeto Scanner para leer desde el teclado
        System.out.println("Indique una cantidad de dinero"); //Pedimos al usuario una cantidad de dinero
        int dinero=entrada.nextInt(); //Guardamos la cantidad introducida
        
        // Declaramos variables para cada tipo de billete y moneda
        int billetes50,billetes20,billetes10,billetes5,monedas2,monedas1;
        
        // Calculamos cuántos billetes de cada tipo se pueden obtener
        billetes50 = dinero / 50;
        billetes20 = (dinero % 50) / 20;
        billetes10 = (dinero % 50 % 20) / 10;
        billetes5 = (dinero % 50 % 20 % 10) / 5;
        monedas2 = (dinero % 50 % 20 % 10 % 5) / 2;
        monedas1 = (dinero % 50 % 20 % 10 % 5 % 2) / 1;
        
        // Mostramos los resultados
        System.out.println("Billetes de 50: " + billetes50 + ", Billetes de 20: " + billetes20 + ", Billetes de 10: " + billetes10 + ", Billetes de 5: " + billetes5 + ", Monedas de 2: " + monedas2 + ", Monedas de 1: " + monedas1);

        // TODO code application logic here
    }
    
}
