/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema05;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Instancio un objeto del tipo que he creado
        // 1.1. Con constructor parametrizado y estableciendo valores con setters
//        Coche miCoche=new Coche();
//        System.out.println(miCoche.toString());
//        
//        miCoche.setEspejos(5);
//        System.out.println(miCoche.toString());
//        
//        System.out.println(miCoche.getEspejos());
//        
//        miCoche.acelerar();
        
        // 1.2. Con constructor parametrizado, inicializando los atributos
        // con los valores pasados por parámetro
//        Coche tuCoche=new Coche("Michelin", "Bajo", 3);
//        System.out.println(tuCoche.toString());
//        System.out.println(tuCoche.getRuedas());

        // MODIFICACCIONES DE ACCESO
        Bicicleta bicicleta = new Bicicleta();
        System.out.println();
        
        System.out.println("¿Cuántas bicis hemos creado?");
        System.out.println(bicicleta.getNumBicicletas());
        
        // PASO DE PARÁMETROS POR VALOR O POR REFERENCIA
        int num1=4;
        System.out.println(suma(num1));
        
        Bicicleta bici = new Bicicleta();
        empezarAPedalear(bici);
    }
        
    public static int suma(int num1) {
        int num2=3;
        return num1+num2;
    }
    
    public static void empezarAPedalear(Bicicleta bici) {
        bici.setEstaPedaleando(true);
    }
}
