/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.Map;
/**
 *
 * @author alumno
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", 
        "Octubre", "Noviembre", "Diciembre"};
        
        Map<Integer, String> treeMap = new TreeMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        
        for (int i = meses.length - 1; i >= 0; i--) {
            treeMap.put(i + 1, meses[i]);
            linkedHashMap.put(i + 1, meses[i]);
        }
        
        System.out.println("TreeMap");
        for (Map.Entry<Integer, String> mapa : treeMap.entrySet()) {
            System.out.println(mapa.getKey() + ", " + mapa.getValue());
        }
        
        System.out.println("LinkedHashMap");
        for (Map.Entry<Integer, String> mapa : linkedHashMap.entrySet()) {
            System.out.println(mapa.getKey() + ", " + mapa.getValue());
        }
    }
    
}
