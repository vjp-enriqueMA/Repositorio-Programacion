/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.TreeSet;
/**
 *
 * @author alumno
 */
public class Ejercicio01 {

    public static void mostrarMenu() {
        System.out.println("1. Añadir contactos a la agenda");
        System.out.println("2. Visualizar la lista de contactos");
        System.out.println("3. Eliminar contactos de la lista");
        System.out.println("4. Mostrar todos los contactos ordenados por su edad");
        System.out.println("5. Salir del programa");
    }
    
    public static void añadirContacto(ArrayList<Contacto> contactos) throws InputMismatchException {
        Scanner entrada = new Scanner(System.in);
            System.out.println("Introduce el nombre del contacto");
            String nombre = entrada.nextLine();
            System.out.println("Introduce la edad del contacto");
            int edad = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Introduce el número del contacto");
            String numero = entrada.nextLine();
        
        contactos.add(new Contacto(nombre,edad,numero));
    }
    
    public static void mostrarContactos(ArrayList<Contacto> contactos) {
        for (int i = 0; i < contactos.size(); i++) {
            System.out.println("Nombre: "+contactos.get(i).getNombre()+"");
            System.out.println("Edad: "+contactos.get(i).getEdad()+"");
            System.out.println("Numero de Teléfono: "+contactos.get(i).getNumeroMovil()+"");
        }
    }
    
    public static void eliminarContactos(ArrayList<Contacto> contactos) throws InputMismatchException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el número de teléfono");
        String telefono = entrada.nextLine();
        
        int i = 0;
        boolean encontrado = false;
        
        while (i < contactos.size() && !encontrado) {
            if (contactos.get(i).getNumeroMovil().equalsIgnoreCase(telefono))  {
                encontrado = true;
                contactos.remove(i);
            }
            i++;
        }
        
        if (!encontrado) {
            System.out.println("No se ha encontrado el número de teléfono");
        }
    }
    
    public static void mostrarContactosOrdenadosPorEdad(ArrayList<Contacto> contactos) {
        TreeSet<Contacto> ordenadas = new TreeSet<>(contactos);
        
        for (Contacto t : ordenadas) {
                System.out.println(t);
            }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Contacto> contactos = new ArrayList <>();
        int opcion = 0;
        
        do {
            
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        añadirContacto(contactos);
                        break;
                    case 2:
                        mostrarContactos(contactos);
                        break;
                    case 3:
                        eliminarContactos(contactos);
                        break;
                    case 4:
                        mostrarContactosOrdenadosPorEdad(contactos);
                        break;
                    case 5:
                        System.out.println("Gracias por usar el programa.");
                        break;
                    default:
                        System.out.println("Introduce una opción válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error, no se pueden introducir letras.");
                entrada.nextLine();
            } catch(Exception e) {
                System.out.println("Error inesperado");
            }
        } while (opcion !=5);
    }
}
