/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.ejerciciosfundamentales;

import java.util.Scanner;

public class ejercicio16 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int n;
        int numeroABuscar;
        
        System.out.println("Buenas, vamos a crear un vector. Ingrese el tamaño.");
        n = leer.nextInt();
        
        int [] vector = new int [n];
        
        llenarVector(vector, n);
        
        System.out.println("Ahora, ingrese un número a buscar en el vector (entre 0 y 30).");
        numeroABuscar = leer.nextInt();
        
        buscarNumero(vector, n, numeroABuscar);
        
    }
    
    public static void llenarVector(int [] vector, int n){
        
        int cont;
        int numeroAleatorio;
        
        for (cont = 0; cont < n; cont++){
           
            numeroAleatorio = (int) (Math.random() * 30);
            vector[cont] = numeroAleatorio;
            System.out.println("Vector " +cont+ ": " +vector[cont]);
       
        }
        
    }
     
    public static void buscarNumero(int [] vector, int n, int numeroABuscar){
        
        int cont;
        boolean validacion = false;
        int repeticion = 0;
        
        for (cont = 0; cont < n; cont++){
            
            if (vector[cont] == numeroABuscar){
                validacion = true;
                repeticion++;
                System.out.println("El número se encuentra en el vector " +cont);
            }
        }
        
        if (validacion == false){
            System.out.println("No hemos encontrado el número en el vector.");
        }
        
        if (repeticion > 1){
            System.out.println("El número se encuentra repetido.");
        
        }else {
            System.out.println("El número no está repetido.");
        }
    }
}
