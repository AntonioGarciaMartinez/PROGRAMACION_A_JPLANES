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
public class Capital {
    
    /*
    *Sigo el ejercicio. Sé que el usuario tendrá que introducir tres valores
    *y con esas variables declaradas y asignadas le daremos por pantalla
    *la información que desea
    */
    
    public static void rendimiento(){
        
        Scanner teclado;
        teclado = new Scanner(System.in);
        double capital, tipoInt, tiempoInv, rendimiento;
        
        System.out.println("Introduzca la cantidad de capital que ha invertido en euros:");
        capital = teclado.nextDouble();
        System.out.println("Introduzca el tipo de interés al que está:");
        tipoInt = teclado.nextDouble();
        System.out.println("Introduzca el tiempo que dura su inversión en días:");
        tiempoInv = teclado.nextDouble();
        
        rendimiento = capital*tipoInt*tiempoInv/100;
        System.out.println("El rendimiento de esta inversión le supone un "+rendimiento+" %.");

    }
    
}
