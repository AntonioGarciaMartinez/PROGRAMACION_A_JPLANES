/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoprog06_tarea2;

/**
 *
 * @author Antuan
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * En este ejercicio queremos averiguar la desviación estándar de 6
         * números
         */

        double desviacion;
        double numeros[];
        numeros = Vectores.introducir_array_real_unidimensional(6);

        desviacion = Vectores.desviacion(numeros);
        System.out.println("La desviación estándar equivale a " + desviacion);

    }

}
