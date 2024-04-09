/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoprog06_tarea2;

/**
 *
 * @author Antuan
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /**
         * crear un array de 17 elementos y rellenarlo como procede con los
         * valores dados podría llamar al método de
         * Vectores.introducir_array_unidimensional, pero tendría que meter los
         * valores cada vez que usara el programa, los voy a inicializar aquí en
         * el main NOTA: no hace falta que indique la longitud del vector cuando
         * lo mando a un método que me va a devolver un vector de x tamaño
         */
        int array[] = {7, 56, 10, -23, 0, 9, -99, 23, 10, 12, 56, 0, 88, 90, 33, 2, 28};
        int a;
        int valores[];

        a = Vectores.contador_diez(array);
        System.out.println("El array de este ejercicio contiene el 10 un total de " + a + " veces.");

        valores = Vectores.contar_valores(array);
        System.out.println("El array contiene el cero " + valores[0] + " veces, " + valores[1] + " valores positivos y " + valores[2] + " valores negativos.");

    }

}
