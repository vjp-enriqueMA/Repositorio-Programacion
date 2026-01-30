/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio07 {

    public static Dia[] array() {
        Dia[] dia = new Dia[30];
        return dia;
    }

    public static int menu() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Rellenar temperaturas");
        System.out.println("2. Mostrar las temperaturas");
        System.out.println("3. Visualizar la temperatura media del mes");
        System.out.println("4. Día o días más caluros del mes");
        System.out.println("5. Salir del programa");
        int opcion = entrada.nextInt();
        return opcion;
    }

    public static void rellenarTemperaturas(Dia[] dia) {
        String[] diasSemanas = {"Lunes", "Martes", "Miércoles",
            "Jueves", "Viernes", "Sábado", "Domingo"};

        int diaSemana = (int) (Math.random() * 7);

        for (int i = 0; i < dia.length; i++) {
            int temperatura = (int) (Math.random() * 26) + 20;

            dia[i] = new Dia(diasSemanas[diaSemana], temperatura);

            diaSemana++;
            if (diaSemana == 7) {
                diaSemana = 0;
            }
        }
    }

    public static void mostrarTemperaturas(Dia[] dia) {
        for (int i = 0; i < dia.length; i++) {
            System.out.println(
                dia[i].getNombreDia() + " día " + (i + 1) +
                ": " + dia[i].getTemperatura() + " grados"
            );
        }
    }

    public static void temperaturaMedia(Dia[] dia) {
        int suma = 0;

        for (int i = 0; i < dia.length; i++) {
            suma += dia[i].getTemperatura();
        }

        double media = (double) suma / dia.length;
        System.out.println("Temperatura media del mes: " + media + " grados");
    }

    public static void diasMasCalurosos(Dia[] dia) {
        int max = dia[0].getTemperatura();

        for (int i = 1; i < dia.length; i++) {
            if (dia[i].getTemperatura() > max) {
                max = dia[i].getTemperatura();
            }
        }

        System.out.println("El día o días más calurosos fueron:");
        for (int i = 0; i < dia.length; i++) {
            if (dia[i].getTemperatura() == max) {
                System.out.println("• El " + dia[i].getNombreDia()
                        + " día " + (i + 1)
                        + " con " + max + " grados");
            }
        }
    }

    public static void main(String[] args) {
        Dia[] array = array();
        int opcion;

        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    rellenarTemperaturas(array);
                    break;
                case 2:
                    mostrarTemperaturas(array);
                    break;
                case 3:
                    temperaturaMedia(array);
                    break;
                case 4:
                    diasMasCalurosos(array);
                    break;
                case 5:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (opcion != 5);
    }
}
