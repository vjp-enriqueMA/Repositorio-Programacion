/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectocorelink;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author alumno
 */
public class ProyectoCorelink {

    public static final String FICHERO = "datos_empleados.txt";
    public static final String FICHERO2 = "sospechosos_zona_cero.txt";
    public static final String FICHERO3 = "04dedf8afeb8a4177a009f41bb78018af601e341ed4322d4073911c9ac879726.txt";
    public static final String FICHERO4 = "claves.txt";
    
    /**
     * Método que muestra el menú al usuario.
     */
    public static void mostrarMenu() {
        System.out.println("INTRODUCE UNA OPCIÓN");
        System.out.println("1. Leer fichero de los datos de los empleados.");
        System.out.println("2. Escribir fichero de los datos de los empleados que pertenecen a la zona cero");
        System.out.println("3. Leer fichero claves");
        System.out.println("4. Escribir claves");
        System.out.println("5. Salir del programa");
    }
    
    /**
     * Método que le permite al usuario leer el fichero de los datos del empleado.
     * @throws IOException
     * @throws FileNotFoundException 
     */
    public static void leerFichero() throws IOException, FileNotFoundException {
        try (
                FileReader fr = new FileReader(FICHERO); 
                BufferedReader br = new BufferedReader(fr);) {
            String linea = br.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
        }
    }
    
    /**
     * Método que le permite al usuario escribir los datos del empleado que pertenezcan a la zona cero.
     * @throws IOException
     * @throws FileNotFoundException 
     */
    public static void escribirFichero() throws IOException, FileNotFoundException {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el nombre de la persona que pertenezca a la zona cero");
        String nombre = entrada.nextLine();
        
        System.out.println("Introduce el número de la persona");
        int numero = entrada.nextInt();
        entrada.nextLine();
        
        System.out.println("Introduce la ubicación de la persona");
        String ubicacion = entrada.nextLine();
        
        System.out.println("Introduce el rol de la persona");
        String rol = entrada.nextLine();
        
        try (
            FileWriter fw = new FileWriter(FICHERO2, true);
            PrintWriter pw = new PrintWriter(fw);
            ) {
            pw.println(" "+nombre+";"+numero+";"+ubicacion+";"+rol+"");
        }
    }
    
    /**
     * Método para leer el fichero de las claves.
     * @throws IOException
     * @throws FileNotFoundException 
     */
    public static void leerFicheroClaves() throws IOException, FileNotFoundException {
        try (
                FileReader fr = new FileReader(FICHERO3);
                BufferedReader br = new BufferedReader(fr);) {
            String linea = br.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
        }
    }
    
    /**
     * Método para escribir las claves del fichero.
     * @throws IOException
     * @throws FileNotFoundException 
     */
    public static void escribirFicheroClaves() throws IOException, FileNotFoundException {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce la primera clave");
        int clave1 = entrada.nextInt();
        entrada.nextLine();
        
        System.out.println("Introduce la segunda clave");
        int clave2 = entrada.nextInt();
        
        System.out.println("Introduce la tercera clave");
        int clave3 = entrada.nextInt();
        
        try (
            FileWriter fw = new FileWriter(FICHERO4, true);
            PrintWriter pw = new PrintWriter(fw);
            ) {
            pw.println(clave1);
            pw.println(clave2);
            pw.println(clave3);
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
                        escribirFichero();
                        break;
                    case 3:
                        leerFicheroClaves();
                        break;
                    case 4:
                        
                        break;
                    case 5:
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
        } while (opcion != 5);
    }
    
}
