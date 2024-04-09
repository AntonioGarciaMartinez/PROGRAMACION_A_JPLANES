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
public class Vectores {

    private static Scanner teclado = new Scanner(System.in);

    public static void mostrar_array_unidimensional(int a[]) {

        /**
         * muestra los elementos del array unidimensional. Esto se hizo en
         * ejemplos
         */
        System.out.println("********ESTE ES SU ARRAY********");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

        }
        System.out.println("");
    }

    public static int[] generar_array_unidimensional_aleatorio(int a) {

        /**
         * Le damos un entero positivo y genera tantos números en el ranto
         * [0-10] como ese entero y devuelve el array
         */
        int array[];
        array = new int[a];
        for (int i = 0; i < a; i++) {

            array[i] = (int) (Math.random() * 10 + 1);

        }

        return array;
    }

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

    public static int[] menor(int a[]) {

        /**
         * recibe un array y muestra el valor más pequeño y su posición
         */
        int aux[] = new int[2];

        for (int i = 0; i < a.length; i++) {

            if (a[i] < aux[0]) {
                aux[1] = i;
            }
            aux[0] = Math.min(aux[0], a[i]);
        }
        return aux;
    }

    public static int[] mayor(int a[]) {

        /**
         * recibe un array y muestra el valor más alto y las veces que se repite
         */
        int aux[] = new int[2];

        for (int i = 0; i < a.length; i++) {

            aux[0] = Math.max(aux[0], a[i]);

        }

        for (int i = 0; i < a.length; i++) {
            if (aux[0] == a[i]) {
                aux[1]++;
            }

        }
        return aux;
    }

    public static int[] tabla_multiplicar(int n) {

        /**
         * da la tabla de multiplicar de un número n
         */
        int array[];
        array = new int[10];

        for (int i = 0; i < 10; i++) {

            array[i] = n * (i + 1);

        }
        return array;
    }

    public static int[] contar_valores(int a[]) {

        /**
         * un array me va a guardar cuantos valores son cero [pos0], cuantos
         * positivos [pos1] y cuantos negativos [pos2] al analizar el array de
         * entrada
         */
        int recuento[];
        recuento = new int[3];
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                recuento[0]++;
            } else if (a[i] > 0) {
                recuento[1]++;
            } else if (a[i] < 0) {
                recuento[2]++;
            }

        }
        return recuento;
    }

    public static int contador_diez(int a[]) {

        int contador = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 10) {
                contador++;
            }

        }
        return contador;
    }

    public static int[] compara_intro(int a[], int n) {

        /**
         * Para el ejercicio11, entra un entero y el array predefinido y buscao
         * saber cuantos elementos son iguales al número n, mayores o menores
         * (como el método contar_valores pero con n como referente, así que los
         * devolveré en un array de tres posiciones en las que los he contado
         */
        int recuento[];
        recuento = new int[3];
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                recuento[0]++;
            } else if (a[i] > n) {
                recuento[1]++;
            } else if (a[i] < n) {
                recuento[2]++;
            }

        }
        return recuento;
    }

    public static double[] introducir_array_real_unidimensional(int n) {

        /**
         * pongo n aunque lo he diseñado para el ej4, será 10 en este caso
         */
        double array[];
        array = new double[n];
        String cadena;
        boolean control = false;

        for (int i = 0; i < n; i++) {

            do {
                try {
                    System.out.println("Introduzca una nota (número real): ");
                    cadena = teclado.nextLine();
                    array[i] = Double.parseDouble(cadena);
                    control = true;
                } catch (NumberFormatException ex) {
                    System.out.println("El número introducido debe ser real.");
                }
            } while (!control);

        }
        return array;
    }

    public static double[] contar_notas(double a[]) {

        /**
         * una estructura idéntica a contar_valores; [pos0] notas en la media,
         * [pos1] notas superiores, [pos2] notas inferiores, como no se pide la
         * media, no tengo por qué darla, aunque podría aumentar un tamaño el
         * resultado para almacenarla en [pos3]
         */
        double recuento[];
        recuento = new double[4];
        double media = 0;

        for (int i = 0; i < a.length; i++) {
            media += a[i];
        }
        media /= 10;
        recuento[3] = media;

        for (int i = 0; i < a.length; i++) {
            
            if (a[i] == media) {
                recuento[0]++;
            } else if (a[i] > media) {
                recuento[1]++;
            } else if (a[i] < media) {
                recuento[2]++;
            }

        }

        return recuento;
    }

    public static double desviacion(double a[]) {

        /**
         * aquí voy a hacer el método con las operaciones correspondientes de
         * los números que forman el vector
         */
        double media = 0, diferencias = 0, varianza, desviacion;
        for (int i = 0; i < a.length; i++) {
            media += a[i];
        }
        media /= a.length;

        for (int i = 0; i < a.length; i++) {
            diferencias += Math.pow(a[i] - media, 2);

        }

        varianza = (diferencias / (a.length - 1));
        desviacion = Math.sqrt(varianza);

        return desviacion;
    }

    public static int[] suma15(int a[]) {

        /**
         * si el resto de la posición es 0 se le suma 15, si no, se deja igual
         */
        int aux[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                aux[i] = 15 + a[i];
            } else {
                aux[i] = a[i];
            }

        }
        return aux;
    }

    public static int[] resto3(int a[]) {

        /**
         * cada posición se sustituye por el resto de dividir entre 3
         */
        int aux[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            aux[i] = a[i] % 3;

        }
        return aux;
    }

    public static double media(int a[], int n) {

        double media = 0;
        for (int i = 0; i < n; i++) {
            media += a[i];

        }
        media /= n;
        return media;
    }
}
