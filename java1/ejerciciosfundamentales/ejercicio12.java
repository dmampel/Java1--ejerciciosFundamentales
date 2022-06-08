/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.ejerciciosfundamentales;

import java.util.Scanner;
public class ejercicio12 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String cadena;
        String cadena2;
        int longitud;
        String primerLetra;
        String ultimaLetra;
        boolean validacion;
        int lecturasCorrectas = 0;
        int lecturasIncorrectas = 0;
        
        
        do {
            System.out.println("Ingrese una cadena.");
            cadena = leer.next();
            
            if (cadena.equals("&&&&&")){
                validacion = true;
            }else {
                validacion = false;
            }
        
            longitud = cadena.length();
            cadena2 = cadena.toUpperCase();
            primerLetra = cadena2.substring(0,1);
            ultimaLetra = cadena2.substring(longitud - 1, longitud);
            
            
            if ((longitud == 5) && (primerLetra.equals("X")) && (ultimaLetra.equals("O"))){
                lecturasCorrectas++;
                
            }else {
                lecturasIncorrectas++;
            }
            
            if (cadena.equals("&&&&&")){
                lecturasIncorrectas--;
            }
            
        }while (validacion == false);
        
        System.out.println("Cantidad de lecturas correctas: " +lecturasCorrectas);
        System.out.println("Cantidad de lecturas incorrectas: " +lecturasIncorrectas);
       
    }
    
}
