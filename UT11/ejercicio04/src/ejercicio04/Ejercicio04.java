/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
/**
 *
 * @author alumno
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", 
        "Octubre", "Noviembre", "Diciembre"};
        
        Set<String> hashSet = new HashSet<>(); // no mantiene orden
        Set<String> linkedHashSet = new LinkedHashSet<>(); // mantiene orden de inserción
        
        for (String mes : meses) {
            hashSet.add(mes);
            linkedHashSet.add(mes);
        }
        
        System.out.println("HashSet");
        for (String mes : hashSet) {
            System.out.println(mes);
        }
        
        System.out.println("LinkedHashSet");
        for (String mes : linkedHashSet) {
            System.out.println(mes);
        }
    }
    
}
