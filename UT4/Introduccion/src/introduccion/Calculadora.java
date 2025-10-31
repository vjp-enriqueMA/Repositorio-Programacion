/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccion;

/**
 *
 * @author alumno
 */
public class Calculadora {
   /**
    * Metodo que suma dis numeroso pasados por parametro
    * @param num1
    * @param num2
    * @return suma los dos numeros
    */
    public static int suma(int num1, int num2){
    int  resultado = num1+num2;
        return resultado;
    }
    /**
     * Metodo que resta dos numeros pasador por parametro
     * @param num1
     * @param num2
     * @return resta los dos numeros
     */
    public static int resta(int num1, int num2){
    int  resultado = num1-num2;
        return resultado;
    }
    /**
     * Metodo que resta dos numeros pasador por parametro
     * @param num1
     * @param num2
     * @return multiplica los dos numeros
     */
    public static int multiplicacion(int num1,int num2){
    int resultado = num1*num2;
        return resultado;
    }
    /**
     * Metodo que resta dos numeros pasador por parametro
     * @param num1
     * @param num2
     * @return divide los dos numeros
     */
     public static int division(int num1,int num2){
        int resultado = num1/num2;
        return resultado;}
     
     public static double raizCuadrada(int num1){
       return Math.sqrt(num1);
     }
    }