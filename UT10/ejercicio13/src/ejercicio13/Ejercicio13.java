/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;
/**
 *
 * @author alumno
 */
public class Ejercicio13 {
    public static void mostrarMenu() {
        System.out.println("INTRODUCE UNA OPCIÓN");
        System.out.println("1. Introducir las ventas de coches de cada uno de los meses del año .");
        System.out.println("2. Mostrar las ventas introducidas en el punto anterior.");
        System.out.println("3. Que muestre la suma total de ventas de coches del año.");
        System.out.println("4. Que muestre las ventas totales de los meses que empiezan por la letra A.");
        System.out.println("5. Que muestre el nombre del mes con más ventas.");
        System.out.println("6. Salir del programa");
    }
    
    public static ArrayList<Venta> rellenarVentas() {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Venta> ventas = new ArrayList<>();
        String[] meses = {
            "enero", "febrero", "marzo", "abril", "mayo", "junio",
            "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
        };
        for (int i = 0; i < 12; i++) {
            System.out.println("Introduzca las ventas del mes "+meses[i]+"");
            int numero = entrada.nextInt();
            ventas.add(new Venta(meses[i],numero));
        }
        return ventas;
    }
    
    public static void mostrarVentas(ArrayList<Venta> ventas) {
        for (int i = 0; i < ventas.size(); i++) {
            System.out.println(ventas.get(i).toString());
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        ArrayList<Venta> ventas = new ArrayList<>();
        int opcion = 0;
        do {
            
            try {
                switch(opcion) {
                    case 1:
                        ventas = rellenarVentas();
                        break;
                    case 2:
                        mostrarVentas(ventas);
                        break;
                    case 3:
                        
                        break;
                    case 4:
                        
                        break;
                    case 5:
                        
                        break;
                    case 6:
                        System.out.println("Te has salido del programa");
                        break;
                    default:
                        System.out.println("Introduce una opción válida");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Introduzca un número entero entre 1 y 7");
                entrada.nextLine();
            }
        } while (opcion != 6);
    }
    
}
