/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author alumno
 */
public class Ejercicio15 {
    public static void mostrarMenu() {
        System.out.println("INTRODUCE UNA OPCIÓN");
        System.out.println("1. Rellenar las películas junto con los socios que han acudido a verla");
        System.out.println("2. Mostrar las películas y los socios que la han visto");
        System.out.println("3. Mostrar película más rentable");
        System.out.println("4. Mostrar película menos rentable");
        System.out.println("5. Pedir el nombre de una película y mostrar el beneficio neto y la información de los socios que han asistido");
        System.out.println("6. Contar el número de socios que han abonado una cantidad mayor a la pedida por pantalla");
        System.out.println("7. Salir del programa");
    }

    public static Pelicula[] rellenarPeliculasConSocios() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el número de películas");
        int numeroPeliculas = entrada.nextInt();
        
        Pelicula [] peliculas = new Pelicula [numeroPeliculas];
        for (int i = 0; i < peliculas.length; i++) {
            entrada.nextLine();
            System.out.println("Introduce el título de la película "+(i+1)+"");
            String titulo = entrada.nextLine();
            System.out.println("Introduce el coste de la película "+(i+1)+"");
            double coste = entrada.nextDouble();
            entrada.nextLine();
            
            Socio[] socios = new Socio [4];
            for (int j = 0; j < socios.length; j++) {
                System.out.println("Introduce el nombre del socio "+(j+1)+"");
                String nombre = entrada.nextLine();
                System.out.println("Introduce el precio abonado del socio "+(j+1)+"");
                double precio = entrada.nextDouble();
                entrada.nextLine();
                socios[j] = new Socio(nombre,precio);
            }
            peliculas[i] = new Pelicula(titulo,coste,socios);
        }
        return peliculas;
    }
    
    public static void mostrarPeliculasConSocios(Pelicula[] peliculas) {
        for (int i = 0; i < peliculas.length; i++) {
            System.out.println(peliculas[i]);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 0;
        Pelicula [] peliculas = null;
        Scanner entrada = new Scanner(System.in);
        do {
                mostrarMenu();
                opcion = entrada.nextInt();
                
                switch (opcion) {
                    case 1:
                        peliculas = rellenarPeliculasConSocios();
                        break;
                    case 2:
                        mostrarPeliculasConSocios(peliculas);
                        break;
                    case 3:
                        
                        break;
                    case 4:
                        
                        break;
                    case 5:
                        
                        break;
                    case 6:
                        
                        break;
                    case 7:
                        System.out.println("Te has salido del programa");
                        break;
                    default:
                        System.out.println("Introduce una opción válida");
                }
            } while (opcion != 7);
        }
}
