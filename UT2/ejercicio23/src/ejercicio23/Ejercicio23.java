/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         System.out.println("Cuál es el precio del producto");
         int precio=entrada.nextInt();
         System.out.println("Cúantas unidades quieres comprar");
         int unidades=entrada.nextInt ();
         int precioTotal=precio*unidades;
         System.out.println("El precio total de su compra es de "+precioTotal+" euros");
        // TODO code application logic here
    }
    
}
