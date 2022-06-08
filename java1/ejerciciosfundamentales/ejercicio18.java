/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.ejerciciosfundamentales;

public class ejercicio18 {

    public static void main(String[] args) {
        
        
        int n = 4;
        int m = n;
        int fila;
        int columna;
        int [][] matriz = new int [n][m];
        int elemento;
        
        System.out.println("MATRIZ A");
        for (fila = 0; fila < n; fila++){
            for (columna = 0; columna < m; columna++){
                elemento = (int) (Math.random()* 10);
                matriz[fila][columna] = elemento;
                System.out.print(matriz[fila][columna]);
            }
            System.out.println();
        }
        
        matrizTranspuesta(matriz, n, m);
    }
    
    public static void matrizTranspuesta(int [][] matriz, int n, int m){
        
        int fila;
        int columna;
        System.out.println("MATRIZ B");
        for (columna = 0; columna < m; columna++){
            for (fila = 0; fila < n; fila++){
                System.out.print(matriz[fila][columna]);
            }
            System.out.println();
        }
    }
    
}
