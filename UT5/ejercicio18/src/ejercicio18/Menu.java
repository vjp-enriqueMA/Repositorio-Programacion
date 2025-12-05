/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio18;

/**
 *
 * @author Enrique
 */
public class Menu {
    private int numero1;
    private int numero2;

    public Menu() {
        this.numero1 = 0;
        this.numero2 = 0;
    }

    public Menu(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        return "Menu{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }


    
    
    
    
}
