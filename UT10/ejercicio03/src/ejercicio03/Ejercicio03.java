/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio03 {
    public static ArrayList<Integer> introducirNumeros() {
        Scanner entrada = new Scanner (System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        String respuesta;
        do {
            System.out.println("Introduce un número entero");
            int numero = entrada.nextInt();
            entrada.nextLine();
            lista.add(numero);
            System.out.println("¿Quieres introducir otro número? (SI/NO):");
            respuesta = entrada.nextLine();
        } while (respuesta.equalsIgnoreCase("SI"));
        
        return lista;
    }
    
    public static void mostrarLista(ArrayList<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Numero "+(i+1)+"");
            System.out.println(lista.get(i));
        }
    }
    
    public static void intercambiarValores(ArrayList<Integer> lista) {
        if (lista.size() >= 4) {
            int temp = lista.get(1);
            lista.set(1, lista.get(3));
            lista.set(3, temp);
        }
        else {
            System.out.println("No hay suficientes elementos para intercambiar.");
        }
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Numero "+(i+1)+"");
            System.out.println(lista.get(i));
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> lista = introducirNumeros();
        mostrarLista(lista);
        intercambiarValores(lista);
    }
    
}
