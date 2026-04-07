/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio09;
import java.time.LocalDate;
import java.util.Arrays;
/**
 *
 * @author alumno
 */
public class Sorteo {
    // ATRIBUTOS
    private LocalDate fecha;
    private int[] numeroGanadores;
    
    // CONSTRUCTOR POR DEFECTO
    public Sorteo() {
        this.fecha = LocalDate.now();
        this.numeroGanadores = new int[4];
        
        for (int i = 0; i < numeroGanadores.length; i++) {
            numeroGanadores[i] = (int) (Math.random() * (100 - 1 + 1) + 1);
        }
    }
    
    // CONSTRUCTOR PARAMETRIZADO
    public Sorteo(LocalDate fecha, int[] numeroGanadores) {
        this.fecha = fecha;
        this.numeroGanadores = numeroGanadores;
    }
    
    // GETTERS Y SETTERS
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int[] getNumeroGanadores() {
        return numeroGanadores;
    }

    public void setNumeroGanadores(int[] numeroGanadores) {
        this.numeroGanadores = numeroGanadores;
    }
    
    // TO STRING

    @Override
    public String toString() {
        return "Sorteo{" + "fecha=" + fecha + ", numeroGanadores=" + Arrays.toString(numeroGanadores) + '}';
    }
    
    
}
