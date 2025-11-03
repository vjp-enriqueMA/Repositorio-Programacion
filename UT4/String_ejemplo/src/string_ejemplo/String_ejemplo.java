/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string_ejemplo;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class String_ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declarar una variable tipo String
        String nombre;
        String nombre1;
        //Inicializar la variable
        nombre="Manolo";
        nombre1="manolo";
        
        //Declarar e inicializar una variable de tipo String
        String apellido="Arsanaliev";
        
        //Pedir una caddena al usuario
        Scanner entrada=new Scanner(System.in);
        System.out.println("¿Cúal fue el último trofeo que ganaste?: ");
        String trofeo=entrada.nextLine();
        System.out.println("Has ganado el trofeo "+trofeo+"");
        
        //Comparar dos valores ( .equals() e .equalsIgnoreCase() )
        if(nombre.equals(apellido)) {
            System.out.println("Son iguales");
        }
        else {
            System.out.println("Son distintos");
        }
        // TODO code application logic here
    }
}
    

