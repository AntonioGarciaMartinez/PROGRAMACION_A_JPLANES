/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog06_tareaevaluable;

/**
 *
 * @author Antuan
 */
public class PROG06_TareaEvaluable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Crear 3 arrays unidimensionales La variable booleana me vertifica que
         * el cartón que sale del bucle no tiene ingún número repetido
         */

        int carton[] = MisMetodos.generarCarton();
        boolean repetido;
        int arrayBingo[] = new int[10];
        int arrayNumeros[] = new int[6];

        do {
            carton = MisMetodos.generarCarton();
            repetido = MisMetodos.comprobarRepeticiones(carton);
        } while (repetido == true);

        /**
         * Este do-while me termina dando un cartón válido Y muestro el carton
         * del jugador
         */
        MisMetodos.mostrarCarton(carton);

        /**
         * Y ahora viene el bucle de lo que va a ser sacar una bola y hacer
         * todas las comprobaciones pertinentes. Creo dos variables enteras para
         * almacenar cuando se ha cantado línea y el número de rondas jugadas
         * Inicio el bucle con una pausa para que sea el jugador el que decida
         * que se empieza a ejecutar una ronda Llamo al método extraccion para
         * sacar una bola no repetida (se explica en el método). Después guardo
         * en el arrayBingo la bola que ha salido que ya sé que no estaba antes
         * en su posición que es el número de la bola -1. Muestro al usuario el
         * número que ha salido y comprueba en su cartón sí está en un método
         * que devuelve la posición en la que está o -1 si no lo tiene. Si está,
         * cambio el valor 0 de su posición a 1 para marcar que ha salido ya.
         * Después si en efecto he marcado un número en mi cartón compruebo si
         * tengo línea con compruebaLinea y en caso positivo sumo 1 a la
         * variable línea para que en las siguientes iteraciones no me devuelva
         * la misma línea sino una nueva en caso de cantarla. El bucle de juego
         * se ejecuta mientras no se haya cantado bingo.
         */
        int linea = 0;
        int ronda = 0;
        do {
            MisMetodos.pausa();
            int numeroextraido = MisMetodos.extraccion(arrayBingo);
            arrayBingo[numeroextraido - 1] = numeroextraido;

            MisMetodos.subrayado();
            System.out.println("Ha sido extraída la bola " + numeroextraido + ".");
            ronda++;
            int lotengo = MisMetodos.existeNumeroCarton(carton, numeroextraido);//compruebo si está en mi cartón    

            if (lotengo != -1) {//sí está sigo por aquí y a esa posición le doy valor 1
                arrayNumeros[lotengo] = 1;

                if (MisMetodos.compruebaLinea(arrayNumeros, linea) == true) {
                    linea++;
                }

            }
        } while (MisMetodos.compruebaBingo(arrayNumeros) == false);
        System.out.println("Felicidades. Ha cantado BINGO después de extraer un total de " + ronda + " números.");
        System.out.println("Fin del BINGO.");

    }

}
