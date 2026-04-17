/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

import java.io.FileWriter;
import java.io.PrintWriter;
/**
 *
 * @author alumno
 */
public class Ejercicio09 {

    public static final String FICHERO = "frase.txt";
    public static final String FICHERO2 = "fraseinvertida.txt";
    
    public static void mostrarMenu() {
        System.out.println("INTRODUCE UNA OPCIÓN");
        System.out.println("1. Leer fichero frase.txt");
        System.out.println("2. Escribir texto fraseinvertida.txt");
        System.out.println("3. Leer texto invertido");
        System.out.println("4. Salir del programa");
    }
    
    public static void leerFichero() throws IOException, FileNotFoundException {
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
    
    public static void escribirFicheroInvertido() throws IOException, FileNotFoundException {
        try(
            FileReader fr = new FileReader(FICHERO);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(FICHERO2);
            PrintWriter pw = new PrintWriter(fw);
            ) {
            String linea = br.readLine();
            while (linea != null) {
                String invertida = "";

                for (int i = linea.length() - 1; i >= 0; i--) {
                    invertida = invertida + linea.charAt(i);
                }

                pw.println(invertida);
                linea = br.readLine();
            }
        }
    }
    
    public static void leerFicheroInvertido() throws IOException, FileNotFoundException {
        try (
             FileReader fr = new FileReader(FICHERO2);
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
     */
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        
        do {
            
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        leerFichero();
                        break;
                    case 2:
                        escribirFicheroInvertido();
                        break;
                    case 3:
                        leerFicheroInvertido();
                        break;
                    case 4:
                        System.out.println("Gracias por usar el programa");
                        break;
                    default:
                        System.out.println("Introduce una opción válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error, has introducido una letra");
                entrada.nextLine();
            } catch (FileNotFoundException e) {
                System.out.println("Error, no se ha encontrado el fichero");
                entrada.nextLine();
            } catch (IOException e) {
                System.out.println("Error, ha ocurrido un error en la escritura o lectura del fichero");
                entrada.nextLine();
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error");
        }
        } while (opcion != 4);
    }
}
