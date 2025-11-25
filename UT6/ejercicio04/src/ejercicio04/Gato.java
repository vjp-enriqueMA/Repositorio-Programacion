/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author alumno
 */
public class Gato extends Felino {

    public Gato(String nombre, int edad, int peso) {
        super(nombre, edad, peso);
    }

    @Override
    public String sonido() {
        return "Maullido";
    }

    @Override
    public String alimentacion() {
        return "Ratones";
    }

    @Override
    public String habitat() {
        return "Doméstico";
    }

    @Override
    public String nombreCientifico() {
        return "Felis silvestris catus";
    }
}
