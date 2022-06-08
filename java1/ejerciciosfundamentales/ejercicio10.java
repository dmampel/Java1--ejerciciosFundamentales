/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.ejerciciosfundamentales;

import java.util.Scanner;

public class ejercicio10 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int limite;
        int numero;
        int suma;
        System.out.println("Ingrese el valor del límite.");
        limite = leer.nextInt();
        
        suma = 0;
        
        do {
            System.out.println("Ingrese un número");
            numero = leer.nextInt();
            suma = suma + numero;
            
            System.out.println("El limite es " +limite);
            System.out.println("Cuenta de la suma: " +suma);
             
        }while (suma < limite);
        
        System.out.println("El programa se ha detenido porque la suma superó el límite.");
           
    }
    
}
