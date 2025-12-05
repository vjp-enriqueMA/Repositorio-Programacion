/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author Enrique
 */
public class Test {
    public static void mostrarEmpleado(Empleado empleado1) {
        System.out.println("EMPLEADO 1");
        System.out.println("Nombre: "+empleado1.getNombre()+"");
        System.out.println("Salario: "+empleado1.getSalario()+"");
        System.out.println("Direccion:");
        System.out.println(empleado1.getDireccion());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Direccion direccion1 = new Direccion("Cañada Real", 6, 2, "Plasencia");
        Empleado empleado1 = new Empleado("Enrique", 1000, direccion1);
        mostrarEmpleado(empleado1);
    // TODO code application logic here
    }
    
}
