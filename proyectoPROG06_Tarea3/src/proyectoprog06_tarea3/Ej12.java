/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoprog06_tarea3;

/**
 *
 * @author Antuan
 */
public class Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Primero introducir un vector de 10 elementos como se hizo n el ej10 de otro proyecto.
         * Despu�s calcular el elemento de mayor valor e intercambiarlo con el �ltimo elemento.
         */
        
        int v[] = Introducir.introducir_array_unidimensional(10);
        v = Vectores.intercambioUltimaPosicion(v);
        
        System.out.println("El n�mero mayor lo ocupa "+v[v.length-1]+" en la �ltima posici�n.");
        Vectores.mostrar_array_unidimensional(v);
    }
    
}
