/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_refuerzo_tema3;

/**
 *
 * @author Antuan
 */
public class Potencias2 {
    
    public static void calculofor(){
        
        for (double i = 0; i < 11; i++) {
            double potencia = Math.pow(2, i);
            System.out.println("La potencia de 2 elevado a "+(int)i+" es: "+(int)potencia+".");
        }
    }
    
    /*Siguiendo el ejercicio he utilizado while para que se muestren las potencias del 2
    *por pantalla, aunque de primeras me surgió hacerlo como en el método de arriba
    *que he dejado en el código por tenerlo y comparar
    */
    public static void calculo(){
        
        double j = 0, potencia;
        
        while(j<11){
            
            potencia = Math.pow(2, j);
            System.out.println("La potencia de 2 elevado a "+(int)j+" es: "+(int)potencia+".");
            j++;
        }
    }
    
}
