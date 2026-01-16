/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author alumno
 */
public class Ejercicio04 {
    public static int[] [] arrayBidimensional() {
        int [][] matriz = new int [4] [3];
        int i;
        int j;
        
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random()*(200 - 100 + 1) + 100);
            }
        }
        return matriz;
    }
    
    public static void mostrarNumerosPares(int [][] matriz) {
        int i;
        int j;
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    System.out.println(matriz[i][j]);
                }
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] [] array = arrayBidimensional();
        mostrarNumerosPares(array);
    }
    
}
