/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprog06_tarea3;

import java.util.Scanner;

/**
 *
 * @author Antuan
 */
public class Introducir {

    private static Scanner teclado = new Scanner(System.in);

    public static int[] introducir_array_unidimensional(int n) {

        /**
         * le damos n positivo y por teclado nos pide n números para devolvernos
         * el array
         */
        int array[];
        array = new int[n];
        String cadena;

        for (int i = 0; i < n; i++) {

            System.out.println("Introduzca un número entero: ");

            cadena = teclado.nextLine();
            array[i] = Integer.parseInt(cadena);

        }
        return array;
    }
}
