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
public class Ej20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * De un vector dado lo mandaremos a un m�todo que calcule la media de n
         * n�meros de ese vector, el m�todo recibe el vector y n para calcularlo
         * y devuelve la media
         */
        
        int x;
        Scanner teclado = new Scanner(System.in);
        String cadena;
        System.out.println("Introduzca de cu�ntos elementos desea hacer la media aritm�tica (max.10):");
        cadena = teclado.nextLine();
        x = Integer.parseInt(cadena);
        int array[];
        array = Vectores.generar_array_unidimensional_aleatorio(10);
        Vectores.mostrar_array_unidimensional(array);
        double media = Vectores.media(array, x);
        System.out.println("La media de "+x+" valores del vector es "+media+".");
    }
    
}
