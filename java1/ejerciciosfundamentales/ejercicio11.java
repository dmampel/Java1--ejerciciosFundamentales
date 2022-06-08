/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.ejerciciosfundamentales;

import java.util.Scanner;
public class ejercicio11 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        int eleccion;
        int resultado;
        String respuesta;
                
        System.out.println("Ingrese dos números cualquiera.");    
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        System.out.println("Num1 = " +num1);
        System.out.println("Num2 = " +num2);
        
        do {
            System.out.println("MENÚ");
            System.out.println("1. Sumar.");    
            System.out.println("2. Restar.");
            System.out.println("3. Multiplicar.");
            System.out.println("4. Dividir.");
            System.out.println("5. Salir.");
            System.out.println("Elija una opción.");
            eleccion = leer.nextInt();
            
            switch (eleccion) {
                
                case 1:
                    System.out.println("Elegiste sumar.");
                    resultado = num1 + num2;
                    System.out.println("La suma es " +resultado);
                    break;
                case 2:
                    System.out.println("Elegiste restar.");
                    resultado = num1 - num2;
                    System.out.println("La resta es " +resultado);
                    break;
                case 3:
                    System.out.println("Elegiste multiplicar.");
                    resultado = num1 * num2;
                    System.out.println("La multiplicacion es " +resultado);
                    break;
                case 4:
                    System.out.println("Elegiste la dividir.");
                    resultado = num1 / num2;
                    System.out.println("La división es " +resultado);
                    break;
                case 5:
                    System.out.println("Estas seguro que quieres salir? (S/N)");
                    respuesta = leer.next();
                    
                    if (respuesta.equals("S")){
                        System.out.println("Ok, saliendo del programa.");
                    }else {
                        System.out.println("Elija una opción.");
                        eleccion = leer.nextInt();
                    }
                    break;
            }
                   
        }while(eleccion > 0 && eleccion < 6 && eleccion != 5);
        
        System.out.println("Error.");
           
    }
    
}
