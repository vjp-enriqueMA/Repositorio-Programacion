/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.TreeSet;
/**
 *
 * @author alumno
 */
public class Ejercicio08 {

    public static void mostrarMenu() {
        System.out.println("Introduce una opción");
        System.out.println("1. Añadir una ciudad");
        System.out.println("2. Mostrar todas las ciudades junto con sus sedes");
        System.out.println("3. Método que muestre el nombre de las sedes cuyos ingresos anuales son superiores a la media. ");
        System.out.println("4. Buscar por nombre de sede.");
        System.out.println("5. Añadir sede");
        System.out.println("6. Mostrar todas las sedes ordenadas de mayor a menor");
        System.out.println("7. Salir del programa");
    }
    
    public static void añadirCiudad(ArrayList<Ciudad> ciudades) {
        Scanner entrada = new Scanner(System.in);
        String añadirSede;
        
        System.out.println("Introduce el nombre de la ciudad");
        String nombre = entrada.nextLine();
        
        Ciudad c = new Ciudad(nombre);
        
        do {
            System.out.println("Introduce el nombre de la sede");
            String nombreSede = entrada.nextLine();
            
            System.out.println("Introduce los ingresos anuales de la sede");
            double ingresos = entrada.nextDouble();
            entrada.nextLine();
            c.getSedes().add(new Sede(nombreSede,ingresos));
            System.out.println("¿Quierés añadir otra sede? (SI/NO)");
            añadirSede = entrada.nextLine();
        } while (añadirSede.equalsIgnoreCase("SI"));
        
        ciudades.add(c);
    }
    
    public static void mostrarCiudadesYSedes(ArrayList<Ciudad> ciudades) {
        for (int i = 0; i < ciudades.size(); i++) {
            System.out.println("Ciudad: "+ciudades.get(i).getNombre()+"");
            for (Sede s : ciudades.get(i).getSedes()) {
                System.out.println("Nombre : "+s.getNombreSede()+"");
                System.out.println("Ingresos: "+s.getIngresosAnuales()+"");
            }
        }
    }
          
    public static void mostrarSedesMedia(ArrayList<Ciudad> ciudades) {
        double media;
        int sedes = 0;
        double suma = 0;
        for (int i = 0; i < ciudades.size(); i++) {
            for (Sede s : ciudades.get(i).getSedes()) {
                suma = suma + s.getIngresosAnuales();
                sedes++;
            }
        }
        media = suma / sedes;
        for (int i = 0; i < ciudades.size(); i++) {
            for (Sede s : ciudades.get(i).getSedes()) {
                if (s.getIngresosAnuales() > media) {
                    System.out.println(s.getNombreSede());
                }
            }
        }
    }
    
    public static void buscarSede(ArrayList<Ciudad> ciudades) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el nombre de la sede");
        String nombre = entrada.nextLine();
        
        boolean encontrado = false;
        int i = 0;
        
        while (i < ciudades.size() && !encontrado) {
            for (Sede s : ciudades.get(i).getSedes()) {
                if (s.getNombreSede().equalsIgnoreCase(nombre)) {
                    encontrado = true;
                    System.out.println(s.toString());
                }
            }
            i++;
        }
        if (!encontrado) {
            System.out.println("No se ha encontrado la sede");
        }
    }
    
    public static void añadirSede(ArrayList<Ciudad> ciudades) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el nombre de la ciudad");
        String nombre = entrada.nextLine();
        
        boolean encontrado = false;
        int i = 0;
        
        while (i < ciudades.size() && !encontrado) {
            if (ciudades.get(i).getNombre().equalsIgnoreCase(nombre)) {
                encontrado = true;
                System.out.println("Introduce el nombre de la sede");
                String nombreSede = entrada.nextLine();
                System.out.println("Introduce los ingresos de la sede");
                double ingresos = entrada.nextDouble();
                entrada.nextLine();
                
                ciudades.get(i).getSedes().add(new Sede(nombreSede,ingresos));
            }
            i++;
        }
        if (!encontrado) {
            System.out.println("No se ha encontrado el nombre de la ciudad");
        }
    }
    
    public static void ordenarDonaciones(ArrayList<Ciudad> ciudades) {
        TreeSet<Sede> ordenadas = new TreeSet<>();

        for (Ciudad c : ciudades) {
            for (Sede s : c.getSedes()) {
                ordenadas.add(s);
            }
        }
        for (Sede s : ordenadas) {
            System.out.println(s.toString());
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Ciudad> ciudades = new ArrayList<>();
        int opcion = 0;
        
        do {
            
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        añadirCiudad(ciudades);
                        break;
                    case 2:
                        mostrarCiudadesYSedes(ciudades);
                        break;
                    case 3:
                        mostrarSedesMedia(ciudades);
                        break;
                    case 4:
                        buscarSede(ciudades);
                        break;
                    case 5:
                        añadirSede(ciudades);
                        break;
                    case 6:
                        ordenarDonaciones(ciudades);
                        break;
                    case 7:
                        System.out.println("Gracias por usar el programa.");
                        break;
                    default:
                        System.out.println("Introduce una opción válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error, introduce una opción entre 1 y 7.");
                entrada.nextLine();
            }
        } while (opcion != 7);
    }
    
}
