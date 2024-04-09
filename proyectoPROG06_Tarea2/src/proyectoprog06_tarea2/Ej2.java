/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoprog06_tarea2;

import java.util.Scanner;

/**
 *
 * @author Antuan
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /**
         * La primera parte es sencilla solo declarar y crear un vector de 10
         * elementos enteros. Después un vector que muestre la tabla del 5; he
         * querido hacerlo genérico para que se pueda utilizar con otros números
         */
        int vector[];
        int tam;
        Scanner teclado = new Scanner(System.in);
        String cadena;

        System.out.println("Introduzca el tamaño del array (entero positivo).");
        cadena = teclado.nextLine();
        tam = Integer.parseInt(cadena);

        vector = Vectores.introducir_array_unidimensional(tam);
        Vectores.mostrar_array_unidimensional(vector);

        System.out.println("Introduzca un entero para conocer su tabla de multiplicar");
        cadena = teclado.nextLine();
        int n = Integer.parseInt(cadena);

        vector = Vectores.tabla_multiplicar(n);
        System.out.println("********ESTA ES LA TABLA DE MULTIPLICAR DEL " + n + "********");
        Vectores.mostrar_array_unidimensional(vector);
    }

}
