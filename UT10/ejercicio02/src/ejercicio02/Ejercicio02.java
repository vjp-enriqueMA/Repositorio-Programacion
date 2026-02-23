/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio02 {
    public static ArrayList<Integer> introducirValores() {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int numero;
        System.out.println("Introduce números positivos");
        numero = entrada.nextInt();
        entrada.nextLine();
        while (numero >= 0) {
            numeros.add(numero);
            System.out.println("Introduce otro número");
            numero = entrada.nextInt();
        }
        return numeros;
    }

    public static void mostrarLista(ArrayList<Integer> numeros) {
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("Numero "+(i+1)+"");
            numeros.get(i);
        }
    }
    
    public static void mostrarMayor(ArrayList<Integer> numeros) {
        int mayor = numeros.get(0);
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) > mayor) {
                mayor = numeros.get(i);
            }
        }
        System.out.println("El número mayor es "+mayor+"");
    }
    
    public static void mostrarMenor(ArrayList<Integer> numeros) {
        int menor = numeros.get(0);
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) < menor) {
                menor = numeros.get(i);
            }
        }
        System.out.println("El número menor es "+menor+"");
    }
    
    public static void mostrarSuma(ArrayList<Integer> numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.size(); i++) {
            suma = suma + numeros.get(i);
        }
        System.out.println("La suma total es de "+suma+"");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> numeros = introducirValores();
        mostrarLista(numeros);
        mostrarMayor(numeros);
        mostrarMenor(numeros);
        mostrarSuma(numeros);
    }
    
}
