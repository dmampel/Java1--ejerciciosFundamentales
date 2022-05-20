/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.ejerciciosfundamentales;

import java.util.Scanner;
public class ejercicio8 {

   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String palabra;
        int longitud;
        
        System.out.println("Escriba una palabra de 8 caracteres.");
        palabra = leer.nextLine();
        
        longitud = palabra.length();
        
        if (longitud == 8){
            System.out.println("Correcto.");
        }else {
            System.out.println("Incorrecto.");
        }
        
    }
    
}
