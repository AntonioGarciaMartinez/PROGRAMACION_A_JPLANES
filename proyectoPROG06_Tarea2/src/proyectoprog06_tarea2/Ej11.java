/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoprog06_tarea2;

import java.util.Scanner;

/**
 *
 * @author Antuan
 */
public class Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         *
         */

        int[] a = {12, 4, 5, 78, 45, 67, 45, 66, 77, 44};
        int n;
        int solucion[];
        Scanner teclado = new Scanner(System.in);
        String cadena;

        System.out.println("Introduzca un número entero n para comparar con los diez números del ejercicio.");
        cadena = teclado.nextLine();
        n = Integer.parseInt(cadena);

        solucion = Vectores.compara_intro(a, n);
        System.out.println("Hay " + solucion[0] + " números iguales a " + n + "; " + solucion[1] + " son superiores y " + solucion[2] + " inferiores.");

    }

}
