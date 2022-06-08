/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.ejerciciosfundamentales;

public class ejercicio19 {

    public static void main(String[] args) {
       
        int n = 3;
        int m = n; 
        int fila;
        int columna;
        int elemento;
        
        int [][] matrizA = new int [n][m];
        int [][] matrizB = new int [n][m];
        
        System.out.println("MATRIZ A");
        for (fila = 0; fila < n; fila++){
            for (columna = 0; columna < m; columna++){
                elemento = (int)(Math.random()* 9);
                matrizA [fila][columna] = elemento;
                System.out.print(matrizA[fila][columna]);
            
            }
            System.out.println();
        }
        
        System.out.println();
        
        creacionMatrizB(matrizA, matrizB, n, m);
        
        validacion(matrizA, matrizB, n, m);
    }
    
    
    
    public static void creacionMatrizB(int [][] matrizA, int [][] matrizB, int n, int m){
        
       int fila;
       int columna;
       
       System.out.println("MATRIZ B");
       for (columna = 0; columna < m; columna++){
           for (fila = 0; fila < n; fila++){
               matrizB[fila][columna] = matrizA[fila][columna];
               System.out.print(matrizB[fila][columna]);
            }
           System.out.println();
        }
    }
    
    public static void validacion(int [][] matrizA, int [][] matrizB, int n, int m){
        
        int fila;
        int columna;
        boolean validacion = false;
        
        for (fila = 0; fila < n; fila++){
            for (columna = 0; columna < m; columna++){
                
                if (matrizB[fila][columna] == -matrizA[fila][columna]){
                    validacion = true;
                    System.out.println("La matriz es antisimétrica.");
                }
            }
        }
        
        if (validacion == false){
            System.out.println("La matriz no es antisimétrica.");
        }
    }
}
