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
public class Energia {
    
    /*
    *Creo esta clase y su m�todo. Primero necesitamos registrar el valor que da el
    *el usuario, que es un valor entero. Despu�s utilizo la estructura de captaci�n
    *de errores que se ha visto en los v�deos de la UD4 para que si el usuario ingresa
    *otro valor, en lugar de detener el programa le pida que lo haga de nuevo
    *Despu�s se realizan los c�lculos con normalidad
    */
    public static void teoria(){
        
        Scanner teclado;
        teclado = new Scanner(System.in);
        final double C = 299729458;//constante, velocidad de la luz m/s
        double e;
        
        String cadena;
        int masa = 0;
        boolean entero = false;
        
        do{
            try{
                System.out.println("Introduzca la masa del objeto (valor entero) para calcular su energ�a con respecto a la T� de la relatividad:");
                cadena=teclado.nextLine();
                masa = Integer.parseInt(cadena);
                entero = true;
            }
            catch(NumberFormatException ex){
                System.out.println("La masa debe ser un n�mero entero. Por favor, vuelve a intentarlo.");
            }
        }while (!entero);
        
        e = masa*C;
        
        System.out.println("La energ�a equivale a "+e+" m/s2");
           
    }
    
}
