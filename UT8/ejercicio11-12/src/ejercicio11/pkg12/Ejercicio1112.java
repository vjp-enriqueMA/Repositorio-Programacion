/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11.pkg12;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author alumno
 */
public class Ejercicio1112 {
    public static void mostrarOpciones() {
        System.out.println("INTRODUCE UNA OPCIÓN");
        System.out.println("1. Rellenar muebles");
        System.out.println("2. Mostrar muebles");
        System.out.println("3. Mostrar muebles por precio");
        System.out.println("4. Salir");
    }
    
    public static Mueble[] rellenarArray() {
        Scanner entrada = new Scanner(System.in);
        Mueble [] muebles = new Mueble[4];
        int i;
        for (i = 0; i < muebles.length; i++) {
            System.out.println("Introduce el precio del mueble "+(i+1)+"");
            double precio = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("Introduce la descripcion "+(i+1)+"");
            String descripcion = entrada.nextLine();
            muebles[i] = new Mueble(precio,descripcion);
        }
        return muebles;
    }
    
    public static void mostrarArray(Mueble[] muebles) {
        int i;
        for (i = 0; i < muebles.length; i++) {
            System.out.println(muebles[i]);
        }
    }
    
    public static void mostrarMueblesPorPrecio(Mueble[] muebles) {
        int i;
        for (i = 0; i < muebles.length; i++) {
            System.out.println(muebles[i].getPrecio());
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 0;
        Mueble [] muebles = new Mueble[4];
        Scanner entrada = new Scanner(System.in);
        do {
            try {
                mostrarOpciones();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        muebles = rellenarArray();
                        break;
                    case 2:
                        mostrarArray(muebles);
                        break;
                    case 3:
                        mostrarMueblesPorPrecio(muebles);
                        break;
                    case 4:
                        System.out.println("Te has salido del programa");
                        break;
                    default:
                        System.out.println("Introduce una opcíon válida");
                }
            }  catch (InputMismatchException e) {
                System.out.println("Error, introduce un número");
                entrada.nextLine();
            }
        } while (opcion!=4);
    }
    
}
