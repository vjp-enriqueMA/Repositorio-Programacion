/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio05 {
    public static ArrayList<Integer> rellenarNumeros() {
        Scanner entrada = new Scanner (System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int numero;
        System.out.println("Introduce una cantida de numeros");
        numero = entrada.nextInt();
        
        for (int i = 0; i < numero; i++) {
            System.out.println("Introduce el numero "+(i+1)+"");
            int num = entrada.nextInt();
            lista.add(num);
        }
        return lista;
    }

    public static void mostrarLista(ArrayList<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Numero "+(i+1)+"");
            System.out.println(lista.get(i));
        }
    }
    
    public static void mayorNumeroPar(ArrayList<Integer> lista) {
        int mayor = 0;
        boolean hayPar = false;

        for (int i = 0; i < lista.size(); i++) {
            int num = lista.get(i);
            if (num % 2 == 0) {
                if (!hayPar || num > mayor) { // <-- COMPARACIÓN CORRECTA
                    mayor = num;
                    hayPar = true;
                }
            }
        }

        if (hayPar) {
            System.out.println("El número mayor par es " + mayor);
        } else {
            System.out.println("No hay números pares en la lista.");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> lista = rellenarNumeros();
        mostrarLista(lista);
        mayorNumeroPar(lista);
    }
    
}
