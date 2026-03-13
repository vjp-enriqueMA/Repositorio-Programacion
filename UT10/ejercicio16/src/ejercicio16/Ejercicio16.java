/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;
/**
 *
 * @author alumno
 */
public class Ejercicio16 {
    public static void mostrarMenu() {
        System.out.println("INTRODUCE UNA OPCIÓN");
        System.out.println("1. MENÚ DE ADMINISTRACIÓN");
        System.out.println("2. MENÚ DE COMPRA");
        System.out.println("3. Salir");
    }
    
    public static int menuAdministracion() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Introducir productos en la lista");
        System.out.println("2. Visualizar la lista de productos");
        System.out.println("3. Eliminar productos de la lista");
        System.out.println("4. Volver al menú principal");
        
        int opcion2 = entrada.nextInt();
        return opcion2;
    }
    
    public static int menuCompra() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Comprar productos");
        System.out.println("2. Volver al menú principal");
        
        int opcion3 = entrada.nextInt();
        return opcion3;
    }
    
    public static void introducirProductos(ArrayList<Producto> productos) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la cantidad de productos que quieres añadir a la lista");
        int numeroProductos = entrada.nextInt();
        entrada.nextLine();
        for (int i = 0; i < numeroProductos; i++) {
            System.out.println("Introduce el nombre del producto "+(i+1)+"");
            String nombreProducto = entrada.nextLine();
            System.out.println("Introduce el precio");
            float precio = entrada.nextFloat();
            entrada.nextLine();
            System.out.println("Introduce el stock del producto");
            int stock = entrada.nextInt();
            entrada.nextLine();
            
            productos.add(new Producto(nombreProducto,precio,stock));
        } 
    }
    
    public static void mostrarLista(ArrayList<Producto> productos) {
        for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i).toString());
        }
    }
    
    public static void eliminarProductos(ArrayList<Producto> productos) {
        Scanner entrada = new Scanner(System.in);
        String respuesta;
        do {
        System.out.println("Introduce el nombre del producto que quieras borrar");
        String nombreProducto = entrada.nextLine();
        
        boolean encontrado = false;
        
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getNombreProducto().equalsIgnoreCase(nombreProducto)) {
                productos.remove(i);
                System.out.println("Se ha eliminado el producto correctamente");
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se ha encontrado ningún producto");
        }
            System.out.println("¿Quieres borrar otro producto?");
            respuesta = entrada.nextLine();
        } while (respuesta.equalsIgnoreCase("Si"));
    }
    
    public static void comprarProductos(ArrayList<Producto> productos) {
        Scanner entrada = new Scanner(System.in);
        String seguirComprando;
        double total = 0;
        do {
        System.out.println("LISTA DE PRODUCTOS");
        for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i).toString());
        }
        for (int i = 0; i < productos.size(); i++) {
            System.out.println("Pulse "+(i+1)+" para comprar el producto "+productos.get(i).getNombreProducto()+"");
        }
        int opcion = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Cuántas unidades quieres comprar");
        int unidades = entrada.nextInt();
        entrada.nextLine();
        if (unidades <= productos.get(opcion - 1).getStock()) {
            total = total + unidades * productos.get(opcion - 1).getPrecio();
            productos.get(opcion - 1).setStock(productos.get(opcion - 1).getStock() - unidades);
        }
        else {
            System.out.println("No tenemos suficiente stock de este producto");
        }
            System.out.println("¿Quierés seguir comprando productos?");
            seguirComprando = entrada.nextLine();
        } while (seguirComprando.equalsIgnoreCase("SI"));
        System.out.println("Precio total: "+total+"");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        ArrayList<Producto> productos = new ArrayList<>();
        do {
            
            try {
                mostrarMenu();
                    opcion = entrada.nextInt();
                    switch (opcion) {
                        case 1 -> {
                            int opcion2 = 0;
                            do {
                                
                                try {
                                    opcion2 = menuAdministracion();
                                    switch (opcion2) {
                                        case 1 -> introducirProductos(productos);
                                        case 2 -> mostrarLista(productos);
                                        case 3 -> eliminarProductos(productos);
                                        case 4 -> System.out.println("Volviendo al menú principal");
                                        default -> System.out.println("Introduce una opción válida");
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("Error, introduce una opción entre 1 y 4");
                                }
                            } while (opcion2 != 4);
                    }
                        case 2 -> {
                            int opcion3 = 0;
                            do {
                                
                                try {
                                    opcion3 = menuCompra();
                                    switch (opcion3) {
                                        case 1 -> comprarProductos(productos);
                                        case 2 -> System.out.println("Volviendo al menú principal");
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("Error, introduce una opción entre 1 y 2");

                                }
                            } while (opcion3 != 2);
                    }
                        case 3 -> System.out.println("Te has salido del programa");
                        default -> System.out.println("Introduce una opción válida");
                    }
            } catch (InputMismatchException e) {
                System.out.println("Error, introduce una opción entre 1 y 3");
                entrada.nextLine();
            }
        } while (opcion != 3);
    }
    
}
