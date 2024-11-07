/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

/**
 *
 * @author kvall
 */
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
         Scanner Scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer numero: ");
        int numero1 = Scanner.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        int numero2 = Scanner.nextInt();

        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int division = numero1 / numero2;
        int modulo = numero1 % numero2;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);
        System.out.println("Modulo: " + modulo);
        Scanner.close();
    }
}
