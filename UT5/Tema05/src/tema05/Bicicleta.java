/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema05;

/**
 *
 * @author alumno
 */
public class Bicicleta {
    // ATRIBUTOS
    private int ruedas;
    private String manillar;
    private String pedales;
    private String frenos;
    private boolean estaPedaleando;
    private static int numBicicletas = 0; // Atributo estático que pertenece a la clase
   
    // CONSTRUCTORES
    // Por defecto
    public Bicicleta() {
        this.ruedas = 0;
        this.manillar = "";
        this.pedales = "";
        this.frenos = "";
        this.estaPedaleando = false;
        incrementarNumBicicletas(); // Incrementamos el valor del atributo estático
    }
   
    public Bicicleta(int ruedas, String manillar, String pedales, String frenos, boolean estaPedaleando) {
        this.ruedas = ruedas;
        this.manillar = manillar;
        this.pedales = pedales;
        this.frenos = frenos;
        this.estaPedaleando = estaPedaleando;
        incrementarNumBicicletas(); // Incrementamos el valor del atributo estático
    }
   
    // GETTERS Y SETTERS
    public void setRuedas(int ruedas){
        this.ruedas = ruedas;
    }
    public int getRuedas() {
        return this.ruedas;
    }
   
    public void setManillar(String manillar) {
        this.manillar = manillar;
    }
    public String getManillar() {
        return this.manillar;
    }
   
    public void setPedales(String pedales) {
        this.pedales = pedales;
    }
    public String getPedales() {
        return this.pedales;
    }
   
    public void setFrenos(String frenos) {
        this.frenos = frenos;
    }
    public String getFrenos() {
        return this.frenos;
    }
   
    public void setEstaPedaleando(boolean estaPedaleando) {
        this.estaPedaleando = estaPedaleando;
    }
    public boolean getEstaPedaleando() {
        return this.estaPedaleando;
    }
   
    public int getNumBicicletas() {
        return this.numBicicletas;
    }
    // MÉTODOS
    private void acelerar() {
        System.out.println("Acelerando...");
    }
    private void incrementarNumBicicletas() {
        numBicicletas++;
    }
    // TO STRING
    @Override
    public String toString() {
        return "Mi bicicleta tiene " + this.pedales +
                ", un manillar " + this.manillar +
                ", unos pedales " + this.pedales +
                ", unos frenos " + this.frenos +
                " y ahora ¿estoy pedaleando? " + this.estaPedaleando;
    }
}
