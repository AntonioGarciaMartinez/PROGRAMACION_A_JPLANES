/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoprog06_tarea3;

/**
 *
 * @author Antuan
 */
public class EjBusquedaDicotomica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * El c�digo base lo tenemos porque nos lo da la hoja, pero hay que
         * modificarlo para que el m�todo indique si el valor se encuentra en el
         * vector y que devuelva su posici�n o -1 si no est� all�
         */

        int v[] = {4, 5, 12, 44, 45, 45, 66, 67, 77, 78};
        int x = 50;
        System.out.println("B�squeda del valor " + x + " usando el m�todo de B�squeda Dicot�mica.");

        int solucion = Vectores.busquedaDicotomica(v, x);

        if (solucion == -1) {
            System.out.println(x + " no est� en el vector.");
        } else {
            System.out.println(x + " s� est� en el vector en la posici�n " + (solucion + 1) + ".");
        }

    }

}
