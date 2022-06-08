/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.ejerciciosfundamentales;

import java.util.Scanner;

public class ejercicio17 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int n;
        
        
        System.out.println("Vamos a crear un vector.Ingrese el tamaño de N.");
        n = leer.nextInt();
        
        int [] vector = new int [n];
        
        llenarVector(vector, n, leer);
        
        contabilizarVector(vector, n);
    }
    
    public static void llenarVector(int [] vector, int n, Scanner leer){
        
        int cont;
        int elemento;
        
        System.out.println("Ingrese los elementos.");
        
        for (cont = 0; cont < n; cont++){
            
            elemento = leer.nextInt();
            vector[cont] = elemento;
            System.out.println("Vector " +cont+ ": " +vector[cont]);
        }
    }
    
    public static void contabilizarVector(int [] vector, int n){
        
        int cont;
        int unD = 0;
        int dosD = 0;
        int tresD = 0;
        int cuatroD = 0;
        int cincoD = 0;
        
        for (cont = 0; cont < n; cont++){
            
            if (vector[cont] >= 0 && vector[cont] < 10){
                unD++;
            
            }else if (vector[cont] >= 10 && vector[cont] < 100){
                dosD++;
            
            }else if (vector[cont] >= 100 && vector[cont] < 1000){
                tresD++;
            
            }else if (vector[cont] >= 1000 && vector[cont] < 10000){
                cuatroD++;
            
            }else if (vector[cont] >= 10000 && vector[cont] < 100000){
                cincoD++;
            }
            
        }
        
        System.out.println("Total de números de un digito: " +unD);
        System.out.println("Total de números de dos digitos: " +dosD);
        System.out.println("Total de números de tres digitos: " +tresD);
        System.out.println("Total de números de cuatro digitos: " +cuatroD);
        System.out.println("Total de números de cinco dígitos: " +cincoD);
    }
    
}
