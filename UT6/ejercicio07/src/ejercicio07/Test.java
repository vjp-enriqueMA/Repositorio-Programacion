/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

/**
 *
 * @author Enrique
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // INSTANCIA TELEVISOR
        Televisor televisor = new Televisor();
        televisor.encender();
        System.out.println(televisor.toString());
        
        televisor.subirVolumen();
        televisor.subirVolumen();
        televisor.subirVolumen();
        System.out.println(televisor.getVolumen());
        
        televisor.cambiarCanal(10);
        
        televisor.bajarVolumen();
        
        televisor.apagar();
        
        System.out.println(televisor.toString());
        
        // INSTANCIA RADIO
        Radio radio = new Radio();
        radio.encender();
        System.out.println(radio.toString());
        
        radio.subirVolumen();
        radio.subirVolumen();
        radio.subirVolumen();
        System.out.println(radio.getVolumen());
        
        radio.cambiarCanal(20);
        
        radio.bajarVolumen();
        
        radio.apagar();
        
        System.out.println(radio.toString());
        
    }
    
}
