/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.ejerciciosfundamentales;

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        double numero;
        double doble;
        double triple;
        double raizCuadrada;
        
        System.out.println("Esciba un número cualquiera.");
        numero = leer.nextInt();
        
        doble = numero * numero;
        triple = numero * numero * numero;
        raizCuadrada = Math.sqrt(numero);
        
        System.out.println("El doble del número es " +doble);
        System.out.println("El triple del número es " +triple);
        System.out.println("La raíz cuadrada del número es " +raizCuadrada);
                
        
    }
    
}
