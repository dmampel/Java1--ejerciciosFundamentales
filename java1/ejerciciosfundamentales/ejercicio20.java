/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.ejerciciosfundamentales;

import java.util.Scanner;

public class ejercicio20 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int n = 3;
        int m = n;
        int [][] matriz = new int [n][m];
        
        crearMatriz(matriz, n, m, leer);
        comprobarSiEsMagico(matriz, n, m);
    }
    
    public static void crearMatriz(int [][] matriz, int n, int m, Scanner leer){
        
        int elementos;
        int fila; 
        int columna;
        
        System.out.println("Vamos a crear una matriz de 3x3.");
        System.out.println("Por favor introduzca los elementos (1 - 9).");
        
        for (fila = 0; fila < n; fila++){
            for (columna = 0; columna < m; columna++){
                elementos = leer.nextInt();
                matriz [fila][columna] = elementos;
                
                if (elementos < 1 || elementos > 9){
                    System.out.println("Dato inválido. Lo reepmlazaremos aleatoreamente por uno válido.");
                    elementos = (int)(Math.random()*9);
                    matriz[fila][columna]= elementos;
                }
            }
        }
        
        for (fila = 0; fila < n; fila++){
            for (columna = 0; columna < m; columna++){
                
                System.out.print(matriz[fila][columna]);
            }
            System.out.println();
        }
        
    }
    
    public static void comprobarSiEsMagico(int [][] matriz, int n, int m){
        
        int cont;
        int fila;
        int columna;
        int [] suma = new int [8]; 
        suma[0] = 0;
       
        
        for (fila = 0; fila < n; fila++){
            for (columna = 0; columna < m; columna++){
                
                if (columna == 0){
                    suma[0] = suma[0] + matriz [fila][columna];
                }else if (columna == 1){
                    suma[1]= suma[1] + matriz[fila][columna];
                }else if (columna == 2){
                    suma[2] = suma[2] + matriz[fila][columna];
                }
                
                if (fila == 0){
                    suma[3] = suma[3] + matriz [fila][columna];
                }else if (fila == 1){
                    suma[4] = suma[4] + matriz [fila][columna];
                }else if (fila == 2){
                    suma[5] = suma[5] + matriz [fila][columna];
                }
                
                if (fila == columna){
                    suma[6] = suma[6] + matriz [fila][columna];
                }
                
                if (fila == 0 && columna == 2){
                    suma[7] = suma[7] + matriz [fila][columna];
                }else if (fila == 1 && columna == 1){
                    suma[7] = suma[7] + matriz [fila][columna];
                }else if (fila == 2 && columna == 0){
                     suma[7] = suma[7] + matriz [fila][columna];
                }
                
            }
        }
        
        for (cont = 0; cont < 8; cont++){
            System.out.println("Suma " +cont+ ": " +suma[cont]);
        }
        
        if (suma[0] == suma[1] && suma[1] == suma[2] && suma[2] == suma[3] && suma[3] == suma[4] && suma[4] == suma[5] && suma[5] == suma[6] && suma[6] == suma[7]){
            System.out.println("El cuadrado es mágico.");
        }else{
            System.out.println("El cuadrado no es mágico.");
        }
    }
    
}
