/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoprog06_tarea2;

/**
 *
 * @author Antuan
 */
public class Ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Calcular los días que pasan del 1 de enero hasta la fecha introducida
         * por teclado El formato de la fecha va a ser AÑO/MES/DÍA
         */

        int fecha[];
        String mensaje = "Introduzca la fecha.";
        fecha = Fecha.introducir_fecha(mensaje);
        //Vectores.mostrar_array_unidimensional(fecha);
        int dias = Fecha.dias_transcurridos(fecha);
        System.out.println("Han pasado " + dias + " días desde el 1 de enero de este año " + fecha[0]);

    }

}
