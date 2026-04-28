/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author alumno
 */
public class Ejercicio26 {

    public static final String FICHERO = "bebidas.obj";
    
    public static void mostrarMenu() throws InputMismatchException {
        System.out.println("INTRODUCE UNA OPCION");
        System.out.println("1. Introducción de bebidas");
        System.out.println("2. Comprar productos");
        System.out.println("3. Salir del programa");
    }
    
    public static void introduccionBebidas() throws InputMismatchException {
        
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
                        introduccionBebidas();
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        System.out.println("Gracias por usar el programa.");
                        break;
                    default:
                        System.out.println("Introduce una opción válida");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error, has introducido una letra.");
                entrada.nextLine();
            } catch (FileNotFoundException e) {
                System.out.println("Error, no se ha encontrado el fichero");
            } catch (IOException e) {
                System.out.println("Error, ha ocurrido un error de lectura o escritura en el fichero");
            } catch (ClassNotFoundException e) {
                System.out.println("Error, no se ha encontrado la clase");
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error inesperado");
            }
        } while (opcion != 3);
    }
    
}
