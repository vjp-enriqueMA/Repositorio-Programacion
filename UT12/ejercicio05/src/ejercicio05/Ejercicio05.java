/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author Enrique
 */
public class Ejercicio05 {

    public static final String FICHERO = "agenda.txt";
    
    public static void mostrarMenu() {
        System.out.println("1. Añadir un contacto a un fichero.");
        System.out.println("2. Mostrar fichero");
        System.out.println("3. Salir del programa");
    }
    
    public static void añadirContactoAFichero() throws InputMismatchException, FileNotFoundException, IOException {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el nombre del contacto");
        String nombre = entrada.nextLine();
        
        System.out.println("Introduce la edad del contacto");
        int edad = entrada.nextInt();
        entrada.nextLine();
        
        System.out.println("Introduce el número de teléfono del contacto");
        String numero = entrada.nextLine();
        
        try (
            FileWriter fw = new FileWriter(FICHERO, true);
            PrintWriter pw = new PrintWriter(fw);
        ) {
            pw.println(nombre);
            pw.println(edad);
            pw.println(numero);
        }
        
        System.out.println("Contacto añadido correctamente");
    }
    
    public static void mostrarFichero() throws FileNotFoundException, IOException {
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
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        
        do {
            
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        añadirContactoAFichero();
                        break;
                    case 2:
                        mostrarFichero();
                        break;
                    case 3:
                        System.out.println("Gracias por usar el programa");
                        break;
                    default:
                        System.out.println("Introduce una opción entre 1 y 3");
                }
            } catch(InputMismatchException e) {
                System.out.println("Error, has introducido una letra.");
                entrada.nextLine();
            }
            catch(FileNotFoundException e) {
                System.out.println("Error, el archivo no se ha encontrado");
                entrada.nextLine();
            }
            catch(IOException e) {
                System.out.println("Error, ha ocurrido un error en la escritura o lectura del fichero");
                entrada.nextLine();
            }
            catch(Exception e) {
                System.out.println("Ha ocurrido un error");
            }
        } while (opcion != 3);
    }
    
}
