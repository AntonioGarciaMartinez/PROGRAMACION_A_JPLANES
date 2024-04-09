/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoprog06_tarea2;

/**
 *
 * @author Antuan
 */
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Sacar los valores menor y mayor de un vector introducido por teclado
         * e informar de su posición o repeticiones según el caso
         */

        int[] a;
        a = Vectores.introducir_array_unidimensional(10);
        int[] b;
        b = Vectores.menor(a);
        Vectores.mostrar_array_unidimensional(a);
        System.out.println("El menor de todos los números es " + b[0] + " y ocupa la posición " + b[1] + " del vector.");
        b = Vectores.mayor(a);
        System.out.println("El mayor de todos los números es " + b[0] + " y se ha repetido un total de " + b[1] + " veces.");

    }

}
