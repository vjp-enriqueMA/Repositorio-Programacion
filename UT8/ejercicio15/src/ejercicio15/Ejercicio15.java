/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;
import java.util.Scanner;
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
        System.out.println("Título: " + peliculas[i].getTitulo());
        System.out.println("Coste de licencia: " + peliculas[i].getCosteLicencia());

        Socio[] socios = peliculas[i].getSocios();
        for (int j = 0; j < socios.length; j++) {
            System.out.println("  Socio " + (j + 1) + ":");
            System.out.println("    Nombre: " + socios[j].getNombre());
            System.out.println("    Precio abonado: " + socios[j].getPrecio());
        }
        }
    }
    
    public static void mostrarPeliculaMasRentable(Pelicula[] peliculas) {
        int indiceMejor = 0;
        double mejorBeneficio = 0;
        for (int i = 0; i < peliculas.length; i++) {
            Socio[] socios = peliculas[i].getSocios();
            double suma = 0;
            for (int j = 0; j < socios.length; j++) {
                suma = suma + socios[j].getPrecio();
            }
            double beneficio = suma - peliculas[i].getCosteLicencia();
            if (i == 0 || beneficio > mejorBeneficio) {
                mejorBeneficio = beneficio;
                indiceMejor = i;
            }
        }
        System.out.println("La película más rentable es "+peliculas[indiceMejor].getTitulo()+" con un beneficio de "+mejorBeneficio+"");
    }
    
    public static void mostrarPeliculaMenosRentable(Pelicula[] peliculas) {
        int indiceMejor = 0;
        double menorBeneficio = 0;
        for (int i = 0; i < peliculas.length; i++) {
            Socio[] socios = peliculas[i].getSocios();
            double suma = 0;
            for (int j = 0; j < socios.length; j++) {
                suma = suma + socios[j].getPrecio();
            }
            double beneficio = suma - peliculas[i].getCosteLicencia();
            if (i == 0 || beneficio < menorBeneficio) {
                menorBeneficio = beneficio;
                indiceMejor = i;
            }
        }
        System.out.println("La película menos rentable es "+peliculas[indiceMejor].getTitulo()+" con un beneficio de "+menorBeneficio+"");
    }
    
    public static void pedirNombreYMostrar(Pelicula[] peliculas) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el nombre de una película");
        String nombre = entrada.nextLine();
        
        boolean encontrado = false;
        int i = 0;
        
        while (i < peliculas.length && !encontrado) {
            if (peliculas[i].getTitulo().equalsIgnoreCase(nombre)) {
                encontrado = true;
            }
            else {
                i++;
            }
        }
        if (encontrado == true) {
            System.out.println("Título: "+peliculas[i].getTitulo()+"");
            System.out.println("Coste: "+peliculas[i].getCosteLicencia()+"");
            Socio[] socios = peliculas[i].getSocios();
            double suma = 0;
            for (int j = 0; j < socios.length; j++) {
                suma = suma + socios[j].getPrecio();
                System.out.println("Nombre: "+socios[j].getNombre()+"");
                System.out.println("Total precio "+socios[j].getPrecio()+"");
            }
            double beneficio = suma - peliculas[i].getCosteLicencia();
            System.out.println("Beneficio de la película "+peliculas[i].getTitulo()+": "+beneficio+"");
        }
        else {
            System.out.println("La película no existe");
        }
    }
    
    public static void contarSocios(Pelicula[] peliculas) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un precio");
        int precio = entrada.nextInt();
        int contador = 0;
        for (int i = 0; i < peliculas.length; i++) {
            Socio[] socios = peliculas[i].getSocios();
            for (int j = 0; j < socios.length; j++) {
                if (socios[j].getPrecio() > precio) {
                    contador++;
                }
            }
        }
        System.out.println("Número de socios que han abonado más de " + precio + ": " + contador);

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
                        mostrarPeliculaMasRentable(peliculas);
                        break;
                    case 4:
                        mostrarPeliculaMenosRentable(peliculas);
                        break;
                    case 5:
                        pedirNombreYMostrar(peliculas);
                        break;
                    case 6:
                        contarSocios(peliculas);
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