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
public class Celsius {
    
    
    /*
    *Creo la clase como indica el ejercicio con su m�todo para la conversi�n
    *necesito registrar los grados que el usuario quiere convertir y despu�s
    *opero con ellos y saco por pantalla la equivalencia
    */
    public static void tofahrenheit(){
                               
        Scanner teclado;
        teclado = new Scanner(System.in);
        double grados, fahrenheit;
        
        System.out.println("Introduzca la temperatura en Celsius para calcular a Fahrenheit:");
        grados = teclado.nextDouble();
        
        fahrenheit = (grados*9/5)+32;
        System.out.println(grados+" �C equivalen a "+fahrenheit+"�F.");
                
       
    }
    
}
