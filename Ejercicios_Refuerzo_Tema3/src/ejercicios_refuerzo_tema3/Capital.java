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
    *Sigo el ejercicio. S� que el usuario tendr� que introducir tres valores
    *y con esas variables declaradas y asignadas le daremos por pantalla
    *la informaci�n que desea
    */
    
    public static void rendimiento(){
        
        Scanner teclado;
        teclado = new Scanner(System.in);
        double capital, tipoInt, tiempoInv, rendimiento;
        
        System.out.println("Introduzca la cantidad de capital que ha invertido en euros:");
        capital = teclado.nextDouble();
        System.out.println("Introduzca el tipo de inter�s al que est�:");
        tipoInt = teclado.nextDouble();
        System.out.println("Introduzca el tiempo que dura su inversi�n en d�as:");
        tiempoInv = teclado.nextDouble();
        
        rendimiento = capital*tipoInt*tiempoInv/100;
        System.out.println("El rendimiento de esta inversi�n le supone un "+rendimiento+" %.");

    }
    
}
