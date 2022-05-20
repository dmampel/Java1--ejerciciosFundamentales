/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.ejerciciosfundamentales;

import java.util.Scanner;

public class ejercicio1 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        int suma;
        
        System.out.println("Ingrese un número cualquiera.");
        num1 = leer.nextInt();
        System.out.println("Ahora, ingrese otro número cualquiera.");
        num2 = leer.nextInt();
        
        suma = num1 + num2;
        System.out.println("La suma de ambos números es " +suma);
                
    }
    
}
