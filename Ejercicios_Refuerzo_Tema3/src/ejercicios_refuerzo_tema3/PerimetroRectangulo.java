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
public class PerimetroRectangulo {
    
    /*
    *Creo como viene indicado la clase y el m�todo que va a usar esta
    *en el que solicitamos dos datos al usuarios. Para registrarlos escaneamos por
    *teclado y despu�s operamos con las variables para sacar los datos y mostrarlos
    */
    
    public static void perimetro(){
        
        Scanner teclado;
        teclado = new Scanner(System.in);
        double base, altura, perimetro;
        
        System.out.println("Para calcular el per�metro del rect�ngulo, introduzca primero su base:");
        base = teclado.nextDouble();
        System.out.println("Introduzca ahora la altura:");
        altura = teclado.nextDouble();
        
        perimetro = 2*base +2*altura;
        System.out.println("El per�metro del rect�ngulo de base "+base+" y altura "+altura+" es: "+perimetro);

    }
    
}
