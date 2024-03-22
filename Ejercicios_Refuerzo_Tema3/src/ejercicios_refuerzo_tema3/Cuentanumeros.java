/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_refuerzo_tema3;

import java.util.Scanner;

/**
 *
 * @author Antuan
 */
public class Cuentanumeros {
    
    /*En este caso se pide que usemos un do while, le queremos pedir números al usuario
    *así que si van a ser 10 haremos esa petición mientras un contador sea menor de 10
    *si lo inicio en 0, o menor de 11 si lo iniciara en 1
    *Si el introducido es 0 lo contamos para saber cuántos han entrado y lo mostramos al final del
    *bucle
    */
    public static void contar(){
        
        Scanner teclado = new Scanner(System.in);
        String cadena;
        int i = 0, ceros = 0, entero;
                
        do{
            System.out.println("Introduzca un número entero:");
            cadena = teclado.nextLine();
            entero = Integer.parseInt(cadena);
            i++;
            if(entero == 0){
                ceros++;
            }
            
        }
        while(i < 10);
        
        System.out.println("Se han introducido un total de "+ceros+" ceros.");
        
    }
    
}
