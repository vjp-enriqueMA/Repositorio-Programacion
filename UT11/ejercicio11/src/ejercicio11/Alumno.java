/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author alumno
 */
public class Alumno implements Comparable<Alumno>{
    // ATRIBUTOS
    private String dni;
    private int numeroExpediente;
    private float notaMedia;
    
    // CONSTRUCTOR POR DEFECTO
    public Alumno() {
        this.dni = "";
        this.numeroExpediente = 0;
        this.notaMedia = 0.0f;
    }
    
    // CONSTRUCTOR PARAMETRIZADO
    public Alumno(String dni, int numeroExpediente, float notaMedia) {
        this.dni = dni;
        this.numeroExpediente = numeroExpediente;
        this.notaMedia = notaMedia;
    }
    
    // GETTERS Y SETTERS
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNumeroExpediente() {
        return numeroExpediente;
    }

    public void setNumeroExpediente(int numeroExpediente) {
        this.numeroExpediente = numeroExpediente;
    }

    public float getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(float notaMedia) {
        this.notaMedia = notaMedia;
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Alumno{" + "dni=" + dni + ", numeroExpediente=" + numeroExpediente + ", notaMedia=" + notaMedia + '}';
    }
    
    @Override
        public int compareTo(Alumno o) {
            return (int) (this.getNumeroExpediente() - o.getNumeroExpediente());
    }
      
}
