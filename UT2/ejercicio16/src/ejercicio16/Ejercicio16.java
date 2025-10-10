/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author Enrique
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int total;
        total=130;
        int billetes50=total/50;
        int billetes10=(total%50)/10;
        System.out.println(total + " euros equivalen a " + billetes50 + " billetes de 50 euros y a " + billetes10 + " billetes de 10 euros");
        
        
    }
    
}
