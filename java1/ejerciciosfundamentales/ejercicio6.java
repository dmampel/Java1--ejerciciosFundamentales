/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.ejerciciosfundamentales;

import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int numero;
        
        System.out.println("Escriba cualquier número");
        numero = leer.nextInt();
        
        if (numero % 2 == 0){
            System.out.println("Es par.");
        }else {
            System.out.println("Es impar.");
            
        }
       
            
    }
                
}
    
