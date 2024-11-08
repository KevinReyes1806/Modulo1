/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6;

/**
 *
 * @author kvall
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        String nombre;
        int nota;
        
        System.out.println("Introduce el nombre del estudiante: ");
        nombre = System.console().readLine();

        System.out.println("Introduce la nota del estudiante: ");
        nota = Integer.parseInt(System.console().readLine());
        
        if (nota >= 70) 
        {
            System.out.println(nombre + " " + nota + " Aprobado");
        } 
        else 
        {
            System.out.println(nombre + " " + nota + " Reprobado");
        }
    }  
}
