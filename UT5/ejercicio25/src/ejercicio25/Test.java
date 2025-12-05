/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;
import java.util.Scanner;
/**
 *
 * @author fmont
 */
public class Test {
    public static void controlarCapacidadDisco(Ordenador ordenador, Scanner entrada) {
        while (ordenador.getDisco() % 5 !=0) {
            System.out.println("Error, introduce una capacidad que sea múltiplo de 5");
            ordenador.setDisco(entrada.nextInt());
        }  
    }
    
    public static void listaProcesador(Ordenador ordenador, Scanner entrada) {
        System.out.println("1. AMD Ryzen");
        System.out.println("2. Intel Core");
        ordenador.setModeloProcesador(entrada.nextLine());
        entrada.nextLine();
    }
    
    public static void precioProcesador(Ordenador ordenador, Scanner entrada) {
        while (ordenador.getPrecio() <= 0) {
            System.out.println("Error, introduce un precio mayor a 0");
            ordenador.setPrecio(entrada.nextInt());
        }
    }
    
    public static void tamañoMonitor(Servidor servidor, Scanner entrada) {
        while (servidor.getTamanoMonitor() <= 14) {
            System.out.println("Error, introduce un tamaño mayor a 14");
            servidor.setTamanoMonitor(entrada.nextInt());
        }
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
       Servidor servidor1 = new Servidor(15, "Logi", "Logi", 50, 60, "Logi", "Ryzen", 200);
       Portatil portatil1 = new Portatil("Logi", 50, 80, 15, 50, "Logi", "Logi", 60);
       
       Portatil portatil2 = new Portatil();
        System.out.println("Introduce el precio");
        portatil2.setPrecio(entrada.nextInt());
        precioProcesador(portatil2, entrada);
        System.out.println(portatil2.getPrecio());
            
    }
   
}