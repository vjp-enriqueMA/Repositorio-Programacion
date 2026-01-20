/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

/**
 *
 * @author alumno
 */
public class Ejercicio17 {
    public static int[] arrayAleatorio() {
        int [] array = new int [10];
        int i;
        for (i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (9 - 0 + 1) + 0);
        }
        return array;
    }
    
    public static void mostrarArray(int[] array) {
        int i;
        for (i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
    public static void ordenarArray(int[] array) {
        int aux;
        int i;
        int j;
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                aux = array[j];
                array[j] = array[j + 1];
                array[j + 1] = aux;
                }
        }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] array = arrayAleatorio();
        mostrarArray(array);
        ordenarArray(array);
        mostrarArray(array);
    }
    
}
