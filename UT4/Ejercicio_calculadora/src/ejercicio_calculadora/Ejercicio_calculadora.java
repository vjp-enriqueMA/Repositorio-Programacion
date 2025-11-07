package ejercicio_calculadora;

// importamos nuestras clases para poder usar sus métodos
import Calculadora.Calculadora;
import Utilidades.Utilidades;

public class Ejercicio_calculadora {
    public static void main(String[] args) {
        // aquí pedimos al usuario que introduzca un número por teclado
        int num1 = Utilidades.pedirNumero();
        
        // ahora pedimos un segundo número
        int num2 = Utilidades.pedirNumero();

        // mostramos por pantalla el resultado de sumar los dos números
        System.out.println("Suma: " + Calculadora.suma(num1, num2));
        
        // calculamos y mostramos la resta
        System.out.println("Resta: " + Calculadora.resta(num1, num2));
        
        // aquí sacamos la multiplicación de ambos números
        System.out.println("Multiplicación: " + Calculadora.multiplicacion(num1, num2));
        
        // dividimos num1 entre num2 y mostramos el resultado
        System.out.println("División: " + Calculadora.division(num1, num2));

        // ahora usamos algunos métodos de la clase Math a través de Calculadora
        System.out.println("Raíz cuadrada de " + num1 + ": " + Calculadora.raizCuadrada(num1));
        System.out.println("Cuadrado de " + num1 + ": " + Calculadora.cuadrado(num1));
        System.out.println("Cubo de " + num1 + ": " + Calculadora.cubo(num1));
        System.out.println("Logaritmo de " + num1 + ": " + Calculadora.logaritmo(num1));

        // comprobamos cuál de los dos números es mayor o menor
        System.out.println("Máximo: " + Calculadora.valorMaximo(num1, num2));
        System.out.println("Mínimo: " + Calculadora.valorMinimo(num1, num2));

        // aquí hacemos pruebas con redondeos
        System.out.println("Redondeo al alza de 3.14: " + Calculadora.redondeoAlto(3.14));
        System.out.println("Redondeo a la baja de 3.14: " + Calculadora.redondeoBajo(3.14));

        // por último generamos una letra aleatoria del abecedario
        System.out.println("Letra aleatoria: " + Utilidades.generarLetraAleatoria());
    }
}
