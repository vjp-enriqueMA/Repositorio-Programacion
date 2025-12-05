/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author alumno
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instanciamos cada subclase
        Perro perro = new Perro("Bobby", 5, 20);
        Lobo lobo = new Lobo("Luna", 7, 35);
        Leon leon = new Leon("Simba", 8, 190);
        Gato gato = new Gato("Michi", 3, 4);

        // Instanciamos las subclases directamente
        System.out.println(perro);
        System.out.println("Sonido: " + perro.sonido());
        System.out.println("Alimentación: " + perro.alimentacion());
        System.out.println("Hábitat: " + perro.habitat());
        System.out.println("Nombre científico: " + perro.nombreCientifico());
        System.out.println("-------------------------------------");

        System.out.println(lobo);
        System.out.println("Sonido: " + lobo.sonido());
        System.out.println("Alimentación: " + lobo.alimentacion());
        System.out.println("Hábitat: " + lobo.habitat());
        System.out.println("Nombre científico: " + lobo.nombreCientifico());
        System.out.println("-------------------------------------");

        System.out.println(leon);
        System.out.println("Sonido: " + leon.sonido());
        System.out.println("Alimentación: " + leon.alimentacion());
        System.out.println("Hábitat: " + leon.habitat());
        System.out.println("Nombre científico: " + leon.nombreCientifico());
        System.out.println("-------------------------------------");

        System.out.println(gato);
        System.out.println("Sonido: " + gato.sonido());
        System.out.println("Alimentación: " + gato.alimentacion());
        System.out.println("Hábitat: " + gato.habitat());
        System.out.println("Nombre científico: " + gato.nombreCientifico());
        System.out.println("-------------------------------------");


        //Polimorfismos
        Animal perroPoli = new Perro("Rex", 4, 22);
        Animal loboPoli = new Lobo("Akela", 6, 40);
        Animal leonPoli = new Leon("Nala", 7, 180);
        Animal gatoPoli = new Gato("Pelusa", 2, 5);

        System.out.println(perroPoli);
        System.out.println("Sonido: " + perroPoli.sonido());
        System.out.println("Alimentación: " + perroPoli.alimentacion());
        System.out.println("Hábitat: " + perroPoli.habitat());
        System.out.println("Nombre científico: " + perroPoli.nombreCientifico());
        System.out.println("-------------------------------------");

        System.out.println(loboPoli);
        System.out.println("Sonido: " + loboPoli.sonido());
        System.out.println("Alimentación: " + loboPoli.alimentacion());
        System.out.println("Hábitat: " + loboPoli.habitat());
        System.out.println("Nombre científico: " + loboPoli.nombreCientifico());
        System.out.println("-------------------------------------");

        System.out.println(leonPoli);
        System.out.println("Sonido: " + leonPoli.sonido());
        System.out.println("Alimentación: " + leonPoli.alimentacion());
        System.out.println("Hábitat: " + leonPoli.habitat());
        System.out.println("Nombre científico: " + leonPoli.nombreCientifico());
        System.out.println("-------------------------------------");

        System.out.println(gatoPoli);
        System.out.println("Sonido: " + gatoPoli.sonido());
        System.out.println("Alimentación: " + gatoPoli.alimentacion());
        System.out.println("Hábitat: " + gatoPoli.habitat());
        System.out.println("Nombre científico: " + gatoPoli.nombreCientifico());
        System.out.println("-------------------------------------");
    }
}


    
 
