/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprog06_tarea2;

import java.util.Scanner;

/**
 *
 * @author Antuan
 */
public class Fecha {

    /**
     * Creo adem�s del teclado y cadena, un array que me representa un a�o no
     * bisiesto com�n para poder recurrir a sus elementos cuando sea necesario
     */
    private static Scanner teclado = new Scanner(System.in);
    private static String cadena;
    private static int meses[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static int[] introducir_fecha(String mensaje) {

        /**
         * Primero quise crear un m�todo que cogiera la fecha por teclado y se
         * asegurara de que era la correcta, pero luego hablando con algunos
         * amigos se me ocurri� que era m�s �til separar ambas operaciones. Este
         * primer m�todo recoge la fecha en formato String y la divide y
         * transforma a un array de enteros que se manda a un segundo m�todo que
         * ver� si el n�mero de d�as se ajusta al mes y si el a�o es bisiesto
         * Para ello, creo dos arrays, uno de enteros y otro de texto y un
         * booleano Pido por teclado la fecha con formato la asigno dividiendo
         * por las barras y hago el cambio a enteros, esta informaci�n es la que
         * mando al m�todo para ver si es una fecha correcta
         */
        int a[] = new int[3];
        String[] divifecha;
        boolean correcto;

        do {
            System.out.println("Introduzca a continuaci�n la fecha en formato A�O/MES/D�A:");
            cadena = teclado.nextLine();
            divifecha = cadena.split("/");
            for (int i = 0; i < divifecha.length; i++) {
                a[i] = Integer.parseInt(divifecha[i]);

            }
            correcto = comprobar_fecha(a);
        } while (!correcto);

        return a;
    }

    public static boolean comprobar_fecha(int[] a) {

        /**
         * Llega un array de enteros, pos0 el a�o, pos1 el mes, pos2 el d�a
         * Tengo un boolean para el bisiesto y otro para devolver que la fecha
         * es correcta
         */
        boolean comprueba = false;
        boolean bisiesto = false;

        if (a[2] < 0 || a[2] > 31 || a[1] < 0 || a[1] > 12) {

            System.out.println("FECHA INCORRECTA. POR FAVOR, VUELVA A INTRODUCIR UNA FECHA.");
            return comprueba;

        } else {
            /**
             * Primero el algortimo para ver si es bisiesto e inici
             */

            if (a[0] % 400 == 0) {
                bisiesto = true;
            } else if (a[0] % 4 == 0 && a[0] % 100 != 0) {
                bisiesto = true;
            }

            /**
             * Ahora seg�n el tipo de mes asigno un valor
             */
            if (a[1] == 4 || a[1] == 6 || a[1] == 9 || a[1] == 11) {
                if (a[2] > 30) {
                    System.out.println("FECHA INCORRECTA. POR FAVOR, VUELVA A INTRODUCIR UNA FECHA.");
                    return comprueba;
                }
            } else if (a[1] == 2) {
                if (bisiesto == true && a[2] > 29) {
                    System.out.println("FECHA INCORRECTA. POR FAVOR, VUELVA A INTRODUCIR UNA FECHA.");
                    return comprueba;
                } else if (bisiesto == false && a[2] > 28) {
                    System.out.println("FECHA INCORRECTA. POR FAVOR, VUELVA A INTRODUCIR UNA FECHA.");
                    return comprueba;
                }
            } else {
                if (a[2] > 31) {
                    System.out.println("FECHA INCORRECTA. POR FAVOR, VUELVA A INTRODUCIR UNA FECHA.");
                    return comprueba;
                }

            }

            return !comprueba;

        }

    }

    public static int dias_transcurridos(int b[]) {

        /**
         * creo una variable para hacer el recuento, al mes que han aportado, le
         * resto una posici�n en el array de meses para hacer la suma del resto
         * de meses anteriores y los d�as, finalmente le sumo 1 si es bisiesto
         */
        int recuento = b[2];

        for (int i = 0; i < (b[1] - 1); i++) {
            recuento += meses[i];
        }

        if (b[1] > 2) {
            if (b[0] % 400 == 0) {

                recuento++;

            } else if (b[0] % 4 == 0 && b[0] % 100 != 0) {
                recuento++;
            }
        }

        return recuento;
    }

}
