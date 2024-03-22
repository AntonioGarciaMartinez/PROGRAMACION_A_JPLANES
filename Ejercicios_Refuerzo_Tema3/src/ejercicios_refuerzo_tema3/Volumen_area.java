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
public class Volumen_area {
    
    /*
    *Siguiendo las indicaciones tengo esta clase y su método en el que
    *pedimos al usuario que ingrese el radio y la altura del cilindro
    *con las variables declaradas asignamos valores hasta terminar el cálculo y
    *mostrarlo por pantalla
    */    
    public static void calculo(){
        
        Scanner teclado;
        teclado = new Scanner(System.in);
        double radio, altura, periBase, areaBase, areaLado, area, volumen;
        final double PI = Math.PI;
                       
        System.out.println("Introduzca el radio de la base del cilindro en su unidad:");
        radio = teclado.nextDouble();
        System.out.println("Ahora introduzca la altura del cilindro en la misma unidad:");
        altura = teclado.nextDouble();
        
        periBase = 2*PI*radio;
        areaBase = PI*radio*radio;
        areaLado = periBase*altura;
        area = 2*areaBase + areaLado;
        volumen = areaBase*altura;
        
        System.out.println("El área total del cilindro es "+area+" uds. cuadradas y el volumen del mismo es "+volumen+" uds. cúbicas.");
               
    }
    
   
}
