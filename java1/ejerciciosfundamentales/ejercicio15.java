/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.ejerciciosfundamentales;

import java.util.Scanner;
       
public class ejercicio15 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int tamaño = 100;
        int [] vector = new int [tamaño];
        int cont;
        
        for (cont = 0; cont < tamaño; cont++){
            
            vector[cont] = cont;
        }
        
        mostrar(vector, cont, tamaño);
    }
    
    public static void mostrar(int [] vector, int cont, int tamaño){
        
        for (cont = tamaño - 1; cont >= 0; cont--){
            System.out.println("Vector " +cont+ ": " +vector[cont]);
        }
    }
    
}