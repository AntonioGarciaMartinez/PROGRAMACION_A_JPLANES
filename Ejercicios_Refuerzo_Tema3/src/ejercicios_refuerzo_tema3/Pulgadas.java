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
public class Pulgadas {
    
    /*
    *Creo la clase y el método solicitados. Creo el escáner para que el usuario
    *ingrese los metros que quiere calcular y registrarlos. Después opero con ellos
    *para que devuelvan el valor convertido
    */
    
    public static void pulgadas_pies(){
                       
        Scanner teclado;
        teclado = new Scanner(System.in);
        double metros, pulgadas, pies;
                
        System.out.println("Introduzca los metros para calcular su equivalencia a pulgadas y pies:");
        metros = teclado.nextDouble();
        
        pulgadas = metros*39.7;
        pies = pulgadas/12;
        
        System.out.println(metros +" metros equivalen a "+pulgadas+" pulgadas y "+pies+" pies.");
               
    }
   
    
}
