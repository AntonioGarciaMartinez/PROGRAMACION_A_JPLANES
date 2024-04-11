/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog06_tareaevaluable;

import java.util.Scanner;

/**
 *
 * @author Antuan
 */
public class MisMetodos {

    /**
     * Incluye seguro los m�todos generarAleatorio, existeNumeroBingo
     */
    public static Scanner teclado = new Scanner(System.in);

    public static int[] generarCarton() {

        /**
         * Este m�todo es una variaci�n del que ten�amos con la salvedad de que
         * necesitamos que nos genere n�meros diferentes
         */
        int array[] = new int[6];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 + 1);

        }
        array = ordenarCarton(array);

        return array;
    }

    public static int[] ordenarCarton(int a[]) {

        /**
         * Ya vimos en la Hoja 1 un m�todo para ordenar n�meros de menor a mayor
         * en un array
         */
        for (int i = 1; i < a.length; i++) {

            for (int j = 0; j < a.length - i; j++) {

                if (a[j] > a[j + 1]) {
                    int aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                }

            }
        }
        return a;
    }

    public static boolean comprobarRepeticiones(int a[]) {
        /**
         * He decidido hacer un m�todo para comprobar las repeticiones y no
         * encerrarme en un bucle de otro m�todo para comprobar si alguno de los
         * n�meros se repet�a
         */
        boolean repetido = false;

        for (int i = 0; i < a.length - 1; i++) {

            if (a[i] == a[i + 1]) {
                repetido = true;
                break;
            }

        }
        return repetido;

    }

    public static void mostrarCarton(int a[]) {
        /**
         * Muestra el cart�n tal y como indica el ejercicio
         */
        System.out.println("----CARTON GENERADO----");
        subrayado();
        System.out.println("Primera l�nea: " + a[0] + "  " + a[1] + " ");
        System.out.println("Segunda l�nea: " + a[2] + "  " + a[3] + " ");
        System.out.println("Tercera l�nea: " + a[4] + "  " + a[5] + " ");
        subrayado();

    }

    public static int extraccion(int a[]) {

        /**
         * Voy a utilizar este m�todo para que la extracci�n de un n�mero sea
         * siempre la de un n�mero distinto al que ya haya salido Por eso se
         * recurre al m�todo existeNumeroBingo despu�s de haber generado un
         * aleatorio con el m�todo generararAleatorio. El do-while se ejecuta
         * mientras la bola no haya salido antes
         */
        int extraccion, bola;
        do {
            bola = MisMetodos.generarAleatorio(1, 10);
            extraccion = MisMetodos.existeNumeroBingo(a, bola);

        } while (extraccion != -1);

        return bola;
    }

    public static int generarAleatorio(int liminf, int limsup) {

        /**
         * Se utiliza para sacar un n�mero aleatorio del bingo, una bola con
         * l�mites iguales a los n�meros que peuden salir en el bingo, incluidos
         */
        int bola = (int) (Math.random() * limsup + liminf);
        return bola;
    }

    public static int existeNumeroBingo(int a[], int n) {

        /**
         * Voy a valerme de la b�squeda l�neal de otras tareas para comprobar si
         * el n�mero est� guardado en el vector proporcionado que es el que
         * almacena los n�meros que han salido ya. El m�todo me devuelve la
         * posici�n en el vector de ese n�mero o -1 si no est�, la b�squeda
         * dicot�mica en un vector que tiene ceros se vuelve confusa porque no
         * est� ordenada de menor a mayor, por eso no la puedo usar en este caso
         * Defino la soluci�n como -1 que identifica que no est� el n�mero
         * extra�do y devuelve -1 al bucle de extracci�n para que salga y le
         * mande la bola al programa principal
         */
        int solucion = -1;
        for (int i = 0; i < a.length; i++) {

            if (a[i] == n) {
                solucion = n;
            }

        }

        return solucion;

    }

    public static int existeNumeroCarton(int a[], int n) {

        /**
         * Este m�todo es similar al existeNumeroBingo, pero comprueba el carton
         * del usuario y devuelve en qu� posici�n est� o -1 si no est�. Me he
         * dado cuenta de que no me hace falta declarar un entero porque puedo
         * mandar i o directamente el valor -1
         */
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                return i;
            }
        }
        return -1;
    }

    public static boolean compruebaLinea(int a[], int n) {

        /**
         * El m�todo recibe el arrayNumeros que es la marca de haber confirmado
         * un n�mero en el cart�n y n que es las veces que el usuario ya ha
         * cantado l�nea. Comprueba 3 pares de valores del array que solo tiene
         * 1 o 0. Si la pos0 y pos1 son 1 es que ha cantado l�nea, pero si la
         * cant� ya, no pasar� nada porque canta ser� = n. No declaro un nombre
         * para el booleano porque puedo devolver el valor directamente. Esto ha
         * sido un poco intuici�n y fijarme en los mensajes de Netbeans.
         */
        int canta = 0;
        for (int i = 0; i < a.length - 1;) {
            if (a[i] == 1 && a[i + 1] == 1) {
                canta++;
                if (canta > n) {
                    cantaLinea();
                    return true;
                }
            }
            i += 2;
        }
        return false;
    }

    public static void cantaLinea() {

        subrayado();
        System.out.println("El jugdor ha cantado L�NEA.");
        subrayado();
    }

    public static boolean compruebaBingo(int a[]) {

        /**
         * El bingo solo se puede conseguir si los seis valores del arrayNumeros
         * son 1, es decir, si su suma es 6. Creo que hay mil formas de hacerlo,
         * pero esta es una de las que se me ha ocurrido
         */
        int suma = 0;
        for (int i = 0; i < a.length; i++) {

            suma += a[i];

        }
        if (suma == 6) {
            cantaBingo();
            return true;
        }
        return false;
    }

    public static void cantaBingo() {

        subrayado();
        System.out.println("El jugdor ha cantado BINGO.");
        subrayado();

    }

    public static void pausa() {

        String cadena;

        System.out.println("\033[H\033[2J");
        System.out.println("Pulsa una tecla para jugar...");
        cadena = teclado.nextLine();

    }

    public static void subrayado() {

        System.out.println("_______________________________________________");
    }

}
