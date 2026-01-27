/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio01 {
    public static Asignatura[] array() {
        Asignatura [] array = new Asignatura [6];
        return array;
    }
    
    public static Asignatura[] crearConstructor(Asignatura[] array) {
        Scanner entrada = new Scanner (System.in);
        String[] nombres = {
            "Programación",
            "Lenguajes de Marcas",
            "Bases de Datos",
            "Entornos de Desarrollo",
            "Sistemas Informáticos",
            "Formación y Orientación Laboral"
        };
        
        int i;
        for (i = 0; i < array.length; i++) {
            System.out.println("Introduce la nota de "+nombres[i]+"");
            double nota = entrada.nextDouble();
            array[i] = new Asignatura(nota, nombres[i]);
        }
        
        return array;
    }

    public static void calcularMedia(Asignatura[] array) {
        double suma = 0;
        double media;
        int i;
        for (i = 0; i < array.length; i++) {
            suma = suma + array[i].getNota();
        }
        media = suma / array.length;
        System.out.println("La nota media es de "+media+"");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Asignatura [] array = array();
        Asignatura [] array2 = crearConstructor(array);
        calcularMedia(array);
    }
    
}
