/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12bis;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 * @author alumno
 */
public class Ejercicio12bis {
    
    public static final String FICHERO = "masnumeros.txt";

    public static void mostrarMenu() {
        System.out.println("INTRODUCE UNA OPCIÓN");
        System.out.println("1. Leer fichero");
        System.out.println("2. Sumar números");
        System.out.println("3. Salir del programa");
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
    
    public static void sumarNumerosFicheros() throws IOException, FileNotFoundException {
        try (
            FileReader fr = new FileReader(FICHERO);
            BufferedReader br = new BufferedReader(fr);
        ) {
            String linea = br.readLine();
            int suma = 0;

            while (linea != null) {
                String[] numeros = linea.split(";");

                for (int i = 0; i < numeros.length; i++) {
                    suma = suma + Integer.parseInt(numeros[i]); // convierto el texto en entero y lo añado a la suma total
                }

                linea = br.readLine();
            }

            System.out.println("El total de la suma es de "+suma+"");
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
                        leerFichero();
                        break;
                    case 2:
                        sumarNumerosFicheros();
                        break;
                    case 3:
                        System.out.println("Gracias por usar el programa");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error, has introducido una letra");
                entrada.nextLine();
            } catch (FileNotFoundException e) {
                System.out.println("Error, no se ha encontrado el archivo");
                entrada.nextLine();
            } catch (IOException e) {
                System.out.println("Error, ha ocurrido un error en la escritura o lectura del fichero");
                entrada.nextLine();
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error");
            }
        } while (opcion != 3);
    }
    
}
