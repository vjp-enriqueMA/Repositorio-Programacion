/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio06 {
    public static Empleados [] array() {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int i;
        int j;
        System.out.println("Introduce el número de empleados");
        numero = entrada.nextInt();
        entrada.nextLine();
        
        Empleados [] empleado = new Empleados [numero];
        
        for (i = 0; i < empleado.length; i++) {
            System.out.println("-EMPLEADO "+(i+1)+"-");
            System.out.println("Introduzca el nombre del empleado");
            String nombre = entrada.nextLine();
            System.out.println("¿Cúantas horas has trabajado este més?");
            int horas = entrada.nextInt();
            entrada.nextLine();
            System.out.println("¿Cúal es su tarifa por hora de trabajo?");
            int tarifa = entrada.nextInt();
            empleado[i] = new Empleados(nombre,horas,tarifa);
            entrada.nextLine();
            System.out.println("EMPLEADO "+(i+1)+" ALMACENADO CON ÉXITO");
        }
        return empleado;
    }
    
    public static void calcularSueldo(Empleados[] empleado) {
        int i;
        System.out.println("SUELDO BRUTO DE LOS EMPLEADOS");
        for (i = 0; i < empleado.length; i++) {
            int sueldo = 0;
            if (sueldo <= 40) {
                sueldo = empleado[i].getHoras() * empleado[i].getTarifa();
            }
            else {
                int horasExtra = empleado[i].getHoras() - 40;
                sueldo = (40 * empleado[i].getTarifa() + (int)(horasExtra * empleado[i].getTarifa() * 1.5));
            }
            System.out.println(""+empleado[i].getNombre()+" trabajó "+empleado[i].getHoras()+ " horas, cobrá "+empleado[i].getTarifa()+" euros la hora por lo que le corresponde un sueldo de "+sueldo+" euros");

        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleados [] array = array();
        calcularSueldo(array);
        // TODO code application logic here
    }
    
}
