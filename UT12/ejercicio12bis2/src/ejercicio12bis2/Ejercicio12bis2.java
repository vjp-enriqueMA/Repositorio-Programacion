/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12bis2;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
/**
 *
 * @author alumno
 */
public class Ejercicio12bis2 {
    
    public static String FICHERO = null;
    
    public static void mostrarMenu() {
        System.out.println("1. Escribir cadenas en un archivo");
        System.out.println("2. Leer fichero");
        System.out.println("3. Salir del programa");
    }
    
    public static void escribirCadenasEnArchivo(String FICHERO, String [] caracteres) throws IOException, FileNotFoundException {
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < caracteres.length; i++) {
            System.out.println("Introduce el caracter "+(i+1)+"");
            caracteres[i] = entrada.nextLine();
        }
        
        try (
                FileWriter fw = new FileWriter(FICHERO,true);
                PrintWriter pw = new PrintWriter(fw);
            ) {
            for (int i = 0; i < caracteres.length; i++) {
                pw.print(""+caracteres[i]+"*");
            }
        }
    }
    
    public static void leerFichero(String FICHERO) throws IOException, FileNotFoundException {
        try (
                FileReader fr = new FileReader(FICHERO); 
                BufferedReader br = new BufferedReader(fr);) 
        {
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
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        if (FICHERO == null) {
            System.out.println("Introduce el nombre del fichero");
            FICHERO = entrada.nextLine();
        }
        
        String [] caracteres = new String [4];
        
        int opcion = 0;
        
        do {
            
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        escribirCadenasEnArchivo(FICHERO,caracteres);
                        break;
                    case 2:
                        leerFichero(FICHERO);
                        break;
                    case 3:
                        System.out.println("Te has salido del programa.");
                        break;
                    default:
                        System.out.println("Introduce una opción válida");
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
                System.out.println("Ha ocurrido un error inesperado");
            }
        } while (opcion != 3);
    }
    
}
