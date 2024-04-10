/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoprog06_tarea3;

import java.util.Scanner;

/**
 *
 * @author Antuan
 */
public class Ej15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * quiero comprobar si un número que entra por teclado está en la lista
         * de elementos del vector
         */

        int v[] = Introducir.introducir_array_unidimensional(10);
        System.out.println("Introduzca un número para comprobar si está en su vector:");
        Scanner teclado = new Scanner(System.in);
        String cadena = teclado.nextLine();
        int n = Integer.parseInt(cadena);
        boolean estar = Vectores.busquedaLineal(v, n);

        if (estar == true) {
            System.out.println("El número SÍ está en su vector.");
        } else {
            System.out.println("El número NO está en su vector.");
        }
    }

}
