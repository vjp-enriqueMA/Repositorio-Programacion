/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author Enrique
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tiempo;
        tiempo=10000;
        int horas;
        horas=tiempo/3600;
        int minutos;
        minutos=(tiempo%3600)/60;
        int segundos;
        segundos=tiempo%60;
        System.out.println("10000 segundos hacen un total de: " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos");
    }
    
}
