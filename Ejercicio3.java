package com.mycompany.ejercicio3;


public class Ejercicio3 {    
    public static void main(String[] args) {
    int M = 6;
       int T = 1;
       int K = -10;
boolean exp1 = M > T;                
boolean exp2 = T / K == -5;           
boolean exp3 = (M + T == 7) || (M - T == 5);  
    System.out.println("M > T: " + exp1);      
    System.out.println("T / K == -5: " + exp2);  
    System.out.println("(M+T == 7) || (M-T == 5): " + exp3);  
    }
}