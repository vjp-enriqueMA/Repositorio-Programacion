/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;

/**
 *
 * @author Enrique
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // INSTANCIAMOS LOS OBJETOS
        Ornitorrinco ornitorrinco = new Ornitorrinco(8, "Asier", "Macho", "Verde", 12);
        System.out.println(ornitorrinco.toString());
        System.out.println(ornitorrinco.obtenerMensajeOviparo());
        ornitorrinco.ponerHuevo();
        ornitorrinco.incubarHuevo();
        ornitorrinco.mostrarNumHuevos();
        
        Murcielago murcielago = new Murcielago(30, "Pit", "Macho", "Rojo", 20);
        System.out.println(murcielago.toString());
        System.out.println(murcielago.obtenerMensajeVolador());
        murcielago.aumentarAlturaVuelo();
        murcielago.bajarAlturaVuelo();
        murcielago.mostrarAlturaVuelo();
        
        // POLIMORFISMO
        Oviparo o1 = new Ornitorrinco(8, "Asier", "Macho", "Verde", 12);
        System.out.println(o1.toString());
        System.out.println(o1.obtenerMensajeOviparo());
        o1.ponerHuevo();
        o1.incubarHuevo();
        o1.mostrarNumHuevos();
        
        Volador v1 = new Murcielago(30, "Pit", "Macho", "Rojo", 20);
        System.out.println(v1.toString());
        System.out.println(v1.obtenerMensajeVolador());
        v1.aumentarAlturaVuelo();
        v1.bajarAlturaVuelo();
        v1.mostrarAlturaVuelo();
    }
    
}
