/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author alumno
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaramos las variables:
        int i;
        int contador;
        
        contador=0; // Inicializamos el contador a 0
        
        // Mostramos un mensaje inicial indicando qué números se van a imprimir
        System.out.print("Los números impares existentes entre el número 20 y el 160 son: ");
        
        //Realizamos el bucle
        for (i=21;i<=160;i=i+2) {
            
            // Imprimimos el número impar
            System.out.print(""+i+"-");
            
            // Aumentamos el contador en 1 cada vez que imprimimos un número
            contador++;
        }
        
        //Mostramos la cantidad total de números impares que se imprimieron
        System.out.println();
        System.out.println("La cantidad de números impares han sido: " +contador+"");
    }

}
