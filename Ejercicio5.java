package com.mycompany.ejercicio5;

public class Ejercicio5 {

    public static void main(String[] args) {
             String[][] datosCompaneros = {
            {"Ruben", "Canales", "Industrial", "no tarbaja"},
            {"Alexis", "Cabrera", "sistemas", "no trabaja"},
            {"Ivan", "Barahona", "sistemas", "no tarbaja"},
            {"Dulce", "Rivera", "Industrial", "no trabaja"},
            {"Erick", "Cueva", "Ibdustrial", "GrenValey"}
        };
             System.out.println("Nombre"+" Apellido"+" Carrera "+"  LugarTrabajo");
              System.out.println("----------------------------------------");
        for (int i = 0; i < datosCompaneros.length; i++) {
            System.out.println(
                datosCompaneros[i][0] + "  " +     
                datosCompaneros[i][1] + "  " +     
                datosCompaneros[i][2] + "  " +     
                datosCompaneros[i][3]              
            );
        }
    }
}