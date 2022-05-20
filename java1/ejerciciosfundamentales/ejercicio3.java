/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.ejerciciosfundamentales;

import java.util.Scanner;
public class ejercicio3 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String frase;
        
        System.out.println("Escribí algo.");
        frase = leer.nextLine();
        
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }
    
}
