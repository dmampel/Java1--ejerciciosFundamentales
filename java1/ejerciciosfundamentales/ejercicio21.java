/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.ejerciciosfundamentales;


public class ejercicio21 {

    public static void main(String[] args) {
       
        int n = 10;
        int m = n;
        int n2 = 3;
        int m2 = n2;
        
        
        int [][] matrizM = new int [n][m];
        int [][] matrizP = new int [n2][m2];
        
        llenarM(matrizM, n, m);
        System.out.println();
        llenarP(matrizP, n2, m2);
        System.out.println();
        comprobacion(matrizM, matrizP, n, m);
    }
    
    public static void llenarM(int [][] matrizM, int n, int m){
        
        int fila;
        int columna;
        int elemento;
        
        System.out.println("MATRIZ M");
        
        for (fila = 0; fila < n; fila++){
            for (columna = 0; columna < m; columna++){
                elemento = (int) (Math.random() * 10);
                matrizM[fila][columna] = elemento;
                System.out.print(matrizM[fila][columna]);
            }
            System.out.println();
        }
        
    }
    
    public static void llenarP(int [][] matrizP, int n2, int m2){
        int fila;
        int columna;
        int elemento;
        
        System.out.println("MATRIZ P");
        
        for (fila = 0; fila < n2; fila++){
            for (columna = 0; columna < m2; columna++){
                elemento = (int) (Math.random() * 10);
                matrizP[fila][columna] = elemento;
                System.out.print(matrizP[fila][columna]);
            }
            System.out.println();
        }    
    }
    
    public static void comprobacion(int [][] matrizM, int [][] matrizP, int n, int m){
        
        int fila;
        int columna;
        
        for (fila = 0; fila < n; fila++){
            for (columna = 0; columna < m; columna++){
                
                if (matrizM[fila][columna] == matrizP[0][0]){
                    System.out.println("La matriz P comienza en el punto (" +fila+ "," +columna+ ") de la matriz M.");
                }
            }
        }
    }
      
} 
