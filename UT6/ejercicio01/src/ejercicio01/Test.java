package ejercicio01;

/**
 *
 * @author alumno
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos un objeto de la clase Suma con número=10 y sumando=6
        Suma suma = new Suma(10, 6);
        // Creamos un objeto de la clase Multiplicacion con número=10 y multiplicador=10
        Multiplicacion multiplicacion = new Multiplicacion(10, 10);
        // Creamos un objeto de la clase Potencia con número=4 y exponente=8
        Potencia potencia = new Potencia(4, 8);
        
        // Llamamos al método realizarOperacion() de cada objeto
        suma.realizarOperacion();
        multiplicacion.realizarOperacion();
        potencia.realizarOperacion();
        
        // Polimorfismo
        Calculadora c1 = new Suma(10, 6);
        Calculadora c2 = new Multiplicacion(10, 10);
        Calculadora c3 = new Potencia(4, 8);
        
        // Llamamos al método realizarOperacion()
        c1.realizarOperacion(); // Llama a Suma.realizarOperacion()
        c2.realizarOperacion(); // Llama a Multiplicacion.realizarOperacion()
        c3.realizarOperacion(); // Llama a Potencia.realizarOperacion()
    } 
}
