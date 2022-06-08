/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.ejerciciosfundamentales;

import java.util.Scanner;
public class ejercicio13 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int tamaño;
        int cont;
        System.out.println("Ingrese un número que corresponda al tamaño del cuadrado.");
        tamaño = leer.nextInt();
        
        for (cont = 0; cont < tamaño; cont++){
            System.out.print("*");
        }
        
        System.out.println();
       
       for (cont = 0; cont < tamaño - 2; cont++){
            System.out.print("*");
            for (int cont2 = 0; cont2 < tamaño - 2; cont2++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        
        for (cont = 0; cont < tamaño; cont++) {
            System.out.print("*");
        }
        
        System.out.println();
    }
}
