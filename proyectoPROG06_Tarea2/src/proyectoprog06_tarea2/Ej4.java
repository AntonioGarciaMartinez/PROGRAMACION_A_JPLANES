/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoprog06_tarea2;

/**
 *
 * @author Antuan
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Este método pide meter 10 notas reales que guardaremos en un array
         * Queremos sacar la media, para saber cuantas están por encima y
         * cuántas por debajo y cuántas son la media, que se puede hacer como mi
         * método de recuento de valores de Vectores
         */

        double array[];
        array = Vectores.introducir_array_real_unidimensional(10);

        double valores[];
        valores = Vectores.contar_notas(array);
        System.out.println(valores[0] + " notas coinciden con la media aritmética, " + valores[1] + " están por encima de la media y " + valores[2] + " están por debajo.");
        System.out.println("La media es de " + valores[3] + " puntos.");

    }

}
