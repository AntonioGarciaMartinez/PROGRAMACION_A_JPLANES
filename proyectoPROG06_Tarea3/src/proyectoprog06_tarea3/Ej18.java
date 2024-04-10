/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoprog06_tarea3;

/**
 *
 * @author Antuan
 */
public class Ej18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * A partir de un vector con 10 elementos predefinido tengo que
         * desplazarlos una posición a la derecha hasta que el último pase a la
         * primera posición
         */

        int v[] = {7, 56, 89, 23, 58, 9, 99, 23, 44, 22};
        v = Vectores.desplazarDerecha(v);
        Vectores.mostrar_array_unidimensional(v);

    }

}
