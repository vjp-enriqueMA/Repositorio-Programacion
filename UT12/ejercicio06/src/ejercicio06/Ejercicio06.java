/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
/**
 *
 * @author Enrique
 */
public class Ejercicio06 {

    public static String FICHERO = null;
    
    public static void mostrarMenu() {
        System.out.println("1. Volcado de un array");
        System.out.println("2. Mostrar el fichero");
        System.out.println("3. Salir del programa.");
    }
    
    public static void volcado() throws InputMismatchException, FileNotFoundException, IOException {
        Scanner entrada = new Scanner(System.in);
        if (FICHERO == null) {
            System.out.println("Introduce el nombre del fichero");
            FICHERO = entrada.nextLine();
        }
        
        int[] array = new int [100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (i+1) * 2;
        }
        
        try (
             FileWriter fw = new FileWriter(FICHERO, true);
             PrintWriter pw = new PrintWriter(fw);
            ) {
            for (int i = 0; i < array.length; i++) {
                pw.println(array[i]);
            }
        }
    }
    
    public static void mostrarFichero() throws IOException,  FileNotFoundException {
        try (
             FileReader fr = new FileReader(FICHERO);
             BufferedReader br = new BufferedReader(fr);
            ) {
            String linea = br.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
        }
    }
    /**
     * @param args the command line arguments
     */    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        
        do {
            
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                
                switch(opcion) {
                    case 1:
                        volcado();
                        break;
                    case 2:
                        mostrarFichero();
                        break;
                    case 3:
                        System.out.println("Te has salido del programa.");
                        break;
                    default:
                        System.out.println("Introduce una opción entre 1 y 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error, has introducido una letra");
                entrada.nextLine();
            }
            catch (FileNotFoundException e) {
                System.out.println("Error, el archivo no se ha encontrado");
            }
            catch (IOException e) {
                System.out.println("Error, ha ocurrido un error en la escritura o lectura del fichero");
                entrada.nextLine();
            }
            catch(Exception e) {
                System.out.println("Ha ocurrido un error");
            }
        } while (opcion != 3);
    }
    
}
