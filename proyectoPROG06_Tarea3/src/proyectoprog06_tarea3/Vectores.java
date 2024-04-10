/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprog06_tarea3;

/**
 *
 * @author Antuan
 */
public class Vectores {

    public static void mostrar_array_unidimensional(int a[]) {

        /**
         * muestra los elementos del array unidimensional. Esto se hizo en
         * ejemplos
         */
        System.out.println("********ESTE ES SU VECTOR********");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

        }
        System.out.println("");
    }

    public static int[] intercambioUltimaPosicion(int a[]) {

        for (int i = 0; i < a.length - 1; i++) {

            if (a[i] > a[i + 1]) {

                int aux = a[i];
                a[i] = a[i + 1];
                a[i + 1] = aux;
            }

        }
        return a;
    }

    public static boolean busquedaLineal(int a[], int b) {

        boolean resultado = false;

        for (int i = 0; i < a.length; i++) {

            if (a[i] == b) {
                resultado = true;
            }

        }
        return resultado;

    }

    public static int[] desplazarDerecha(int[] a) {

        int b[] = new int[10];
        for (int i = 0; i < a.length; i++) {

            if (i == a.length - 1) {
                b[0] = a[i];
            } else {
                b[i + 1] = a[i];
            }

        }
        return b;
    }

    public static int busquedaDicotomica(int a[], int n) {

        /**
         * He cambiado ligeramente el método para que en lugar de un booleano la
         * variable sea un entero que guarde la posición del vector o -1 si no
         * se encuentra, el programa principal sabrá así si está en una posición
         * o en -1
         */
        int izqda = 0, drcha = a.length - 1;
        int centro = (izqda + drcha) / 2;

        int solucion = -1;
        while (solucion == -1 && izqda <= drcha) {
            if (n == a[centro]) {
                solucion = centro;
            } else if (n > a[centro]) {
                izqda = centro + 1;

            } else {
                drcha = centro - 1;
            }
            centro = (izqda + drcha) / 2;
        }
        return solucion;
    }

}
