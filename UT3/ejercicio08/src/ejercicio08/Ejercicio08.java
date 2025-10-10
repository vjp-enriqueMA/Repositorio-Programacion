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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor, indique una cantidad de dinero");
        int dinero=entrada.nextInt();
        int billetes50,billetes20,billetes10,billetes5,monedas2; //Declaramos variables para los billetes y monedas
        
         // Calculamos el número de billetes y monedas
        billetes50=dinero/50;
        billetes20=(dinero%50)/20;
        billetes10=(dinero%20)/10;
        billetes5=(dinero%10)/5;
        monedas2=(dinero%5)/2;
        
        //Mostramos la distribución
        System.out.println(""+dinero+" Euros se descomponen en:");
        if (billetes50 > 0) System.out.println("Billetes de 50: " + billetes50);
        if (billetes20 > 0) System.out.println("Billetes de 20: " + billetes20);
        if (billetes10 > 0) System.out.println("Billetes de 10: " + billetes10);
        if (billetes5 > 0) System.out.println("Billetes de 5: " + billetes5);
        if (monedas2 > 0) System.out.println("Monedas de 2 euros: " + monedas2);
    }
    }
    
