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
         * quiero comprobar si un n�mero que entra por teclado est� en la lista
         * de elementos del vector
         */

        int v[] = Introducir.introducir_array_unidimensional(10);
        System.out.println("Introduzca un n�mero para comprobar si est� en su vector:");
        Scanner teclado = new Scanner(System.in);
        String cadena = teclado.nextLine();
        int n = Integer.parseInt(cadena);
        boolean estar = Vectores.busquedaLineal(v, n);

        if (estar == true) {
            System.out.println("El n�mero S� est� en su vector.");
        } else {
            System.out.println("El n�mero NO est� en su vector.");
        }
    }

}
