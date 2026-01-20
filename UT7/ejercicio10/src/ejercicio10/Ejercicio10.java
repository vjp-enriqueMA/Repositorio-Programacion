/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author alumno
 */
public class Ejercicio10 {
    public static int[] generarVector() {
        int [] array = new int [10];
        int i;
        for (i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (8 - 1 + 1) + 1);
        }
        return array;
    }
    
    public static void mostrarArray(int [] array) {
        int i;
        for (i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
    public static void sustituirValorRepetido(int [] array) {
        int i;
        int j;
        for (i = 0; i < array.length; i++) {
            for (j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[i] = 0;
                    array[j] = 0;
                }
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] array = generarVector();
        mostrarArray(array);
        sustituirValorRepetido(array);
        mostrarArray(array);
    }
    
}
