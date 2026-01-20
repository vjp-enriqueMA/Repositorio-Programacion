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
        int[][] matriz = new int[6][4];
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Alumno " + (i+1));
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Nota " + (j+1));
                matriz[i][j] = entrada.nextInt();
            }
        }
        return matriz;
    }
    
    public static void mostrarNotas(int[][] matriz) {
        String[] nombres = {"Pepe", "Juan", "Ana", "Marta", "Pedro", "María"};
        String[] asignaturas = {"Lengua", "Mates", "Historia", "Física"};
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Notas de " + nombres[i] + ":");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println(asignaturas[j] + ": " + matriz[i][j]);
            }
            System.out.println();
        }
    }
    
    public static void alumnoMejor(int[][] matriz) {
        String[] nombres = {"Pepe", "Juan", "Ana", "Marta", "Pedro", "María"};
        double mejorMedia = -1;
        int indiceMejor = -1;
        for (int i = 0; i < matriz.length; i++) {
            int suma = 0;
            for (int j = 0; j < matriz[0].length; j++) {
                suma += matriz[i][j];
            }
            double media = suma / 4.0;
            if (media > mejorMedia) {
                mejorMedia = media;
                indiceMejor = i;
            }
        }
        System.out.println("El alumno con mejor media es " + nombres[indiceMejor] + " con media " + mejorMedia);
    }
    
    public static void alumnoMasSuspensos(int[][] matriz) {
        String[] nombres = {"Pepe", "Juan", "Ana", "Marta", "Pedro", "María"};
        int maxSuspensos = -1;
        int indice = -1;
        for (int i = 0; i < matriz.length; i++) {
            int suspensos = 0;
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] < 5) suspensos++;
            }
            if (suspensos > maxSuspensos) {
                maxSuspensos = suspensos;
                indice = i;
            }
        }
        System.out.println("El alumno con más suspensos es " + nombres[indice] + " con " + maxSuspensos + " suspensos");
    }
    
    public static void asignaturaDificil(int[][] matriz) {
        String[] asignaturas = {"Lengua", "Mates", "Historia", "Física"};
        double mediaMasBaja = 100;
        int indice = -1;
        for (int j = 0; j < matriz[0].length; j++) {
            int suma = 0;
            for (int i = 0; i < matriz.length; i++) {
                suma += matriz[i][j];
            }
            double media = suma / 6.0;
            if (media < mediaMasBaja) {
                mediaMasBaja = media;
                indice = j;
            }
        }
        System.out.println("La asignatura más difícil es " + asignaturas[indice] + " con media " + mediaMasBaja);
    }

    public static void main(String[] args) {
        int opcion;
        int[][] matriz = new int[6][4];
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
                    alumnoMejor(matriz);
                    break;
                case 4:
                    alumnoMasSuspensos(matriz);
                    break;
                case 5:
                    asignaturaDificil(matriz);
                    break;
                case 6:
                    System.out.println("Has salido del programa");
                    break;
                default:
                    System.out.println("Introduce una opción válida");
            }
        } while (opcion != 6);
    }
}
