/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;
import java.util.Scanner;
/**
 *
 * @author Enrique
 */
public class Ejercicio18 {
    public static void mostrarMenu(Menu menu1, Menu menu2, Scanner entrada) {
        int opcion = 0;
        do {
        System.out.println("1. SUMAR");
        System.out.println("2. RESTAR");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        opcion=entrada.nextInt();
        
            try {
        switch (opcion) {
            case 1:
                System.out.println(menu1.getNumero1()+menu2.getNumero2());
                break;
            case 2:
                System.out.println(menu1.getNumero1()-menu2.getNumero2());
                break;
            case 3:
                System.out.println(menu1.getNumero1()+menu2.getNumero2());
                break;
            case 4:
                System.out.println(menu1.getNumero1()/menu2.getNumero2());
                break;
            case 5:
                System.out.println("Te has salido del programa");
                break;
            default:
                System.out.println("Itroduce un número entre el uno  y el 5");
        }
        
    }
            
        catch (ArithmeticException e) {
                System.out.println(e);
                }
       } while (opcion!=5);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Menu menu1 = new Menu();
        System.out.println("Introduce el primer numero");
        menu1.setNumero1(entrada.nextInt());
        
        Menu menu2 = new Menu();
        System.out.println("Introduce el segundo número");
        menu2.setNumero2(entrada.nextInt());
        
        mostrarMenu(menu1, menu2, entrada);
        
        
        // TODO code application logic here
    }
    
}
