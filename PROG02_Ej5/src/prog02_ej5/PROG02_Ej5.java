/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog02_ej5;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author Antuan
 */
public class PROG02_Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Para la ecuación C1x + C2 = 0 introduzca el valor de C1:");
        double C1 = teclado.nextLong();
        System.out.println("Introduzca el valor de C2:");
        double C2 = teclado.nextLong();
        double resultado = -C2 / C1;
        
        System.out.printf("% .2f\n", resultado);
        DecimalFormat cuatrodec = new DecimalFormat("#0.0000");
        String resultadoFormateado = cuatrodec.format(resultado);
        System.out.println("El resultado de la ecuación es " + resultadoFormateado + ".");

// TODO code application logic here
    }

}
