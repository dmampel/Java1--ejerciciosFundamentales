/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.ejerciciosfundamentales;

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int gradosC;
        int gradosF;
        
        System.out.println("Ingrese un número cualquiera que corresponda a una temnperatura en grados C.");
        gradosC = leer.nextInt();
        
        gradosF = 32 + (9 * gradosC / 5 );
        System.out.println(gradosC+ " grados Centigrados son " +gradosF+ " grados farenheit.");
    }
    
}
