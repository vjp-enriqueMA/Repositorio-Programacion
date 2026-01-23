/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

/**
 *
 * @author alumno
 */
public class Ejercicio19 {
    public static int[] vectorAleatorio() {
        int array [] = new int [100];
        int i;
        for (i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()* (80 - 10 + 1) + 10);
        }
        return array;
    }
    
    public static void mostrarMayor(int[] array) {
        int i;
        int mayor = array[0];
        for (i = 0; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }
        System.out.println("Número mayor: "+mayor+"");
    }

    public static void mostrarMenor(int[] array) {
        int i;
        int menor = array[0];
        for (i = 0; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
        }
        System.out.println("Número menor: "+menor+"");
    }
    
    public static void mostrarValorRepetido(int[] array) {
        int valorMasRepetido = array[0];
        int maxRepeticiones = 0;

        for (int i = 0; i < array.length; i++) {
            int contador = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    contador++;
                }
            }
            if (contador > maxRepeticiones) {
                maxRepeticiones = contador;
                valorMasRepetido = array[i];
            }
        }

        System.out.println("Valor más repetido: " + valorMasRepetido);
    }
    
    public static void mostrarMedia(int [] array) {
        int suma = 0;
        int media;
        int i;
        for (i = 0; i < array.length; i++) {
            suma = suma + array[i];
        }
        media = suma / 100;
        System.out.println("Media "+media+"");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] array = vectorAleatorio();
        mostrarMayor(array);
        mostrarMenor(array);
        mostrarValorRepetido(array);
        mostrarMedia(array);
    }
    
}
