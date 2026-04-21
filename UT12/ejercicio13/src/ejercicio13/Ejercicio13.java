/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;
import java.util.InputMismatchException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio13 {
    public static final String FICHERO = "DatosBeca.txt";
    
    public static void mostrarMenu() {
        System.out.println("1. Escribir fichero");
        System.out.println("2. Leer fichero");
        System.out.println("3. Salir del programa");
    }
    public static void escribirFichero() throws IOException, FileNotFoundException {
        Scanner entrada = new Scanner(System.in);
        int suspensos;
        int edad;
        String sexo;
        
        System.out.println("Introduce el nombre y los apellidos de un supuesto becario");
        String nombreYApellidos = entrada.nextLine();
        
        System.out.println("Introduce el sexo (H/M)");
        sexo = entrada.nextLine();
        
        while (!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M")) {
            System.out.println("Introduce el sexo (H/M)");
            sexo = entrada.nextLine();
        }
        
        System.out.println("Introduce la edad del usuario (20-60)");
        edad = entrada.nextInt();
        entrada.nextLine();

        while (edad < 20 || edad > 60) {
            System.out.println("Introduce la edad del usuario (20-60)");
            edad = entrada.nextInt();
            entrada.nextLine();
        }
        
        System.out.println("Introduce el número de suspensos del curso anterior (0-4)");
        suspensos = entrada.nextInt();
        entrada.nextLine();

        while (suspensos < 0 || suspensos > 4) {
            System.out.println("Introduce el número de suspensos del curso anterior (0-4)");
            suspensos = entrada.nextInt();
            entrada.nextLine();
        }
        
        System.out.println("Introduce si perteneces a una residencia familiar (SI/NO)");
        String residencia = entrada.nextLine();
        
        System.out.println("Introduce los ingresos anuales de la familia");
        double ingresos = entrada.nextDouble();
        entrada.nextLine();
        
        try (
            FileWriter fw = new FileWriter(FICHERO,true);
            PrintWriter pw = new PrintWriter(fw);
            ) {
            pw.print(" "+nombreYApellidos+"; "+sexo+"; "+edad+"; "+suspensos+"; "+residencia+"; "+ingresos+"");
        }
    }

    public static void leerFichero() throws IOException, FileNotFoundException {
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
        int opcion = 0;
        
        do {
            
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        escribirFichero();
                        break;
                    case 2:
                        leerFichero();
                        break;
                    case 3:
                        System.out.println("Gracias por usar el programa.");
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
                System.out.println("Error, ha ocurrido un error en la lectura o escritura del fichero.");
                entrada.nextLine();
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error insesperado");
            }
        } while (opcion != 3);
    }
    
}
