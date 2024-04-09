/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoprog06_tarea2;

/**
 *
 * @author Antuan
 */
public class Ej19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Un ejercicio muy simple para el que creo dos métodos, uno para la
         * primera solución y otro para la segunda
         */

        int a[] = {7, 56, 89, 23, 58, 9, 99, 23, 44, 22};
        int b[];
        b = Vectores.suma15(a);
        Vectores.mostrar_array_unidimensional(b);
        b = Vectores.resto3(a);
        Vectores.mostrar_array_unidimensional(b);
    }

}
