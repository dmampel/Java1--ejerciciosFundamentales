/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.ejerciciosfundamentales;

import java.util.Scanner;

public class ejercicio14 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        double euros;
        String convertirA;
        
        System.out.println("Hola, este es un conversor de moneda.");
        System.out.println("Por favor, inserte el monto (euro).");
                
        euros = leer.nextInt();
        
        System.out.println("Ahora, seleccione a que moneda quiere hacer la conversión.");
        System.out.println("A - Libras.");
        System.out.println("B - Dolar.");
        System.out.println("C - Yen.");
        
        convertirA = leer.next();
        convertir(euros, convertirA);
    }
    
    public static void convertir(double euros, String convertirA){
        
        double libra;
        double dolar;
        double yen;
       
        switch (convertirA){
            case "A":
                System.out.println("Has elegido convertir a libras.");
                libra = 0.86 * euros;
                System.out.println(euros+ " euros son " +libra+ " libras.");
                break;
            case "B":
                System.out.println("Has elegido convertir a dolares.");
                dolar = 1.28611 * euros;
                System.out.println(euros+ " euros son " +dolar+ " dolares.");
                break;
            case "C":
                System.out.println("Has elegido convertir a yenes.");
                yen = 129.852 * euros;
                System.out.println(euros+ " euros son " +yen+ " yenes.");
                break;
        }
    }
    
}
