/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio13 {
    public final static int MESES = 12;

    public static int menu() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Introducir ventas.");
        System.out.println("2. Mostrar ventas.");
        System.out.println("3. Mostrar suma total de ventas.");
        System.out.println("4. Mostrar ventas totales de meses que contengan la letra a.");
        System.out.println("5. Mostrar meses con más ventas");
        System.out.println("6. Salir.");
        int opcion = entrada.nextInt();
        return opcion;
    }
   
    public static ArrayList<Venta> rellenarVentas() {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Venta> ventas = new ArrayList<>();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        for (int i = 0; i < MESES; i++) {
            System.out.println("Introduce las ventas de " + meses[i] + "");
            int ventas2 = entrada.nextInt();
            entrada.nextLine();
            ventas.add(new Venta(meses[i],ventas2));
        }
        return ventas;
    }
   
    public static void mostrarVentas(ArrayList<Venta> ventas) {
        for (int i = 0; i < ventas.size(); i++) {
            System.out.println(ventas.get(i).toString());
        }
    }
   
    public static void sumaVentas(ArrayList<Venta> ventas) {
        int suma = 0;
        for (int i = 0; i < ventas.size(); i++) {
            suma = suma + ventas.get(i).getVentas();
        }
        System.out.println("La suma total de ventas es de " + suma + "");
    }
   
    public static void ventasMesesA(ArrayList<Venta> ventas) {
        for (int i = 0; i < ventas.size(); i++) {
            if (ventas.get(i).getNombre().toLowerCase().contains("a")) {
                System.out.println(ventas.get(i).toString());
            }
        }
    }
   
    public static void mesesConMasVentas(ArrayList<Venta> ventas) {
        int mayor = ventas.get(0).getVentas();

        for (int i = 0; i < ventas.size(); i++) {
            if (ventas.get(i).getVentas() > mayor) {
                mayor = ventas.get(i).getVentas();
            }
        }

        for (int i = 0; i < ventas.size(); i++) {
            if (ventas.get(i).getVentas() == mayor) {
                System.out.println(ventas.get(i).toString());
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 0;
        ArrayList<Venta> ventas = new ArrayList<>();
        do {
            try {
                opcion = menu();
                switch (opcion) {
                    case 1 ->
                        ventas = rellenarVentas();
                    case 2 ->
                        mostrarVentas(ventas);
                    case 3 ->
                        sumaVentas(ventas);
                    case 4 ->
                        ventasMesesA(ventas);
                    case 5 ->
                        mesesConMasVentas(ventas);
                    case 6 ->
                        System.out.println("Te has salido del programa.");
                    default ->
                        System.out.println("ERROR. Introduce una opción válida.");

                }
            } catch (InputMismatchException e) {
                System.out.println("ERROR. Introduzca un número entero entre 1 y 7.");
            }
        } while (opcion != 6);
    }

    }