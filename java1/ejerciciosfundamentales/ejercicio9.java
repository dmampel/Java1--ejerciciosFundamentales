/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.ejerciciosfundamentales;

import java.util.Scanner;

public class ejercicio9 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String palabra;
        String subcadena;
        int longitud;
        System.out.println("Escriba algo.");
        palabra = leer.nextLine();
        
        longitud = palabra.length();
        subcadena = palabra.substring(0, longitud - longitud + 1);
        
        
        if (subcadena.equals("a")){
            System.out.println("Correcto.");
        }else{
            System.out.println("Incorrecto.");
        }
    }
    
}
