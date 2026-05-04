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
import java.util.ArrayList;
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
    
    public static void introduccionBebidas() throws InputMismatchException, FileNotFoundException, ClassNotFoundException, IOException {
        Scanner entrada = new Scanner(System.in);
        String añadirBebida;
        
        try(
                FileOutputStream fos = new FileOutputStream(FICHERO); 
                ObjectOutputStream oos = new ObjectOutputStream(fos);
        ) {
            do {
                System.out.println("Introduce el nombre de la bebida");
                String nombre = entrada.nextLine();

                System.out.println("Introduce el precio de la bebida");
                float precio = entrada.nextFloat();
                entrada.nextLine();

                System.out.println("Introduce el stock de la bebida");
                int stock = entrada.nextInt();
                entrada.nextLine();
                
                oos.writeObject(new Bebida(nombre, precio, stock));
                
                System.out.println("¿Quiéres añadir otra bebida? (SI/NO)");
                añadirBebida = entrada.nextLine();
                
            } while (añadirBebida.equalsIgnoreCase("SI"));
        }
    }
    
    public static void comprarProductos() throws FileNotFoundException, ClassNotFoundException, IOException {
        Scanner entrada = new Scanner(System.in);

        ArrayList<Bebida> lista = new ArrayList<>();

        float total = 0;
        String seguirComprando;

        try (
                FileInputStream fis = new FileInputStream(FICHERO);
                ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            Bebida bebida;

            while (true) {
                bebida = (Bebida) ois.readObject();
                lista.add(bebida);
            }
        } catch (EOFException e) {
            System.out.println("Fin del fichero");
        }

        do {
            System.out.println("LISTA PRODUCTOS");
            
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(""+(i+1)+": "+lista.get(i).getNombreBebida()+", "+lista.get(i).getPrecio()+", "+lista.get(i).getStock()+"");
            }

            System.out.print("Selecciona un producto ");
            int opcion = entrada.nextInt();
            entrada.nextLine();

            if (opcion < 1 || opcion > lista.size()) {
                System.out.println("Producto no válido");
                
            } else {
                Bebida bebidaSeleccionada = lista.get(opcion - 1);
                
                System.out.print("¿Cuántas unidades deseas? ");
                int unidades = entrada.nextInt();
                entrada.nextLine();

                if (unidades > bebidaSeleccionada.getStock()) {
                    System.out.println("No hay suficiente stock");
                    System.out.println("Solo quedan disponibles "+bebidaSeleccionada.getStock()+" unidades.");

                } else {
                    bebidaSeleccionada.setStock(bebidaSeleccionada.getStock() - unidades);
                    total = total + (unidades * bebidaSeleccionada.getPrecio());
                    System.out.println("Producto añadido correctamente");
                }
            }

            System.out.print("¿Quiéres comprar otro producto?(SI/NO)");
            seguirComprando = entrada.nextLine();

        } while (seguirComprando.equalsIgnoreCase("SI"));

        try (
                FileOutputStream fos = new FileOutputStream(FICHERO);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
        ) {
            for (int i = 0; i < lista.size(); i++) {
                oos.writeObject(lista.get(i));
            }
        }

        System.out.println("Importe total: "+total+" €");
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
                        comprarProductos();
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
