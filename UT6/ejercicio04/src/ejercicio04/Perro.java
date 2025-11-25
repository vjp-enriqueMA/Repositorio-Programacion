/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author alumno
 */
public class Perro extends Canido {

    public Perro(String nombre, int edad, int peso) {
        super(nombre, edad, peso);
    }

    @Override
    public String sonido() {
        return "Ladrido";
    }

    @Override
    public String alimentacion() {
        return "Carnívora";
    }

    @Override
    public String habitat() {
        return "Doméstico";
    }

    @Override
    public String nombreCientifico() {
        return "Canis lupus familiaris";
    }
}
