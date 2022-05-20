/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.ejerciciosfundamentales;

import java.util.Scanner;
public class ejercicio7 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String frase;
        
        System.out.println("Escriba algo.");
        frase = leer.nextLine();
        
        if (frase.equals("eureka")){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
    }
    
}
