/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio16 {
    public static int insertarMenu() {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        System.out.println("INTRODUCE UNA OPCIÓN");
        System.out.println("1. Rellenar las notas de los alumnos");
        System.out.println("2. Mostrar las notas de los alumnos");
        System.out.println("3. Nota media más alta");
        System.out.println("4. Alumno con más suspensos");
        System.out.println("5. Asignatura más difícil");
        System.out.println("6. Salir del programa");
        opcion = entrada.nextInt();
        return opcion;
    }
    
    public static int[][] rellenarNotas() {
        Scanner entrada = new Scanner(System.in);
        int [] [] matriz = new int [6] [4];
        int i;
        int j;
        for (i = 0; i < matriz.length; i++) {
            System.out.println("Alumno 1 "+(i+1)+"");
            for (j = 0; j < matriz[0].length; j++) {
                System.out.println("Nota 1 "+(j+1)+"");
                matriz[i][j] = entrada.nextInt();
            }
        }
        return matriz;
    }
    
    public static void mostrarNotas(int [][] matriz) {
        int i;
        int j;
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[0].length; j++) {
                System.out.println(matriz[i][j]);
            }
        }
    }
    
    public static void alumnoMejor(int[][] matriz) {
        String [] nombres = {"Pepe", "Juan", "Ana", "Marta", "Pedro", "María"};
        int i;
        int j;
        double media;
        for (i = 0; i < matriz.length; i++) {
            int suma = 0;
            for (j = 0; j < matriz[0].length; j++) {
                suma = suma + matriz[i][j];
            }
            media = suma / 4;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        int [] [] matriz = new int [6] [4];
        do {
            opcion = insertarMenu();
            switch (opcion) {
                case 1:
                    matriz = rellenarNotas();
                    break;
                case 2:
                    mostrarNotas(matriz);
                    break;
                case 3:
                    
            }
        } while (opcion!=6);
    }
    
}
