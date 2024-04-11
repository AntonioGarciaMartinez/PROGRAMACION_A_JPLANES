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
         * el cart�n que sale del bucle no tiene ing�n n�mero repetido
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
         * Este do-while me termina dando un cart�n v�lido Y muestro el carton
         * del jugador
         */
        MisMetodos.mostrarCarton(carton);

        /**
         * Y ahora viene el bucle de lo que va a ser sacar una bola y hacer
         * todas las comprobaciones pertinentes. Creo dos variables enteras para
         * almacenar cuando se ha cantado l�nea y el n�mero de rondas jugadas
         * Inicio el bucle con una pausa para que sea el jugador el que decida
         * que se empieza a ejecutar una ronda Llamo al m�todo extraccion para
         * sacar una bola no repetida (se explica en el m�todo). Despu�s guardo
         * en el arrayBingo la bola que ha salido que ya s� que no estaba antes
         * en su posici�n que es el n�mero de la bola -1. Muestro al usuario el
         * n�mero que ha salido y comprueba en su cart�n s� est� en un m�todo
         * que devuelve la posici�n en la que est� o -1 si no lo tiene. Si est�,
         * cambio el valor 0 de su posici�n a 1 para marcar que ha salido ya.
         * Despu�s si en efecto he marcado un n�mero en mi cart�n compruebo si
         * tengo l�nea con compruebaLinea y en caso positivo sumo 1 a la
         * variable l�nea para que en las siguientes iteraciones no me devuelva
         * la misma l�nea sino una nueva en caso de cantarla. El bucle de juego
         * se ejecuta mientras no se haya cantado bingo.
         */
        int linea = 0;
        int ronda = 0;
        do {
            MisMetodos.pausa();
            int numeroextraido = MisMetodos.extraccion(arrayBingo);
            arrayBingo[numeroextraido - 1] = numeroextraido;

            MisMetodos.subrayado();
            System.out.println("Ha sido extra�da la bola " + numeroextraido + ".");
            ronda++;
            int lotengo = MisMetodos.existeNumeroCarton(carton, numeroextraido);//compruebo si est� en mi cart�n    

            if (lotengo != -1) {//s� est� sigo por aqu� y a esa posici�n le doy valor 1
                arrayNumeros[lotengo] = 1;

                if (MisMetodos.compruebaLinea(arrayNumeros, linea) == true) {
                    linea++;
                }

            }
        } while (MisMetodos.compruebaBingo(arrayNumeros) == false);
        System.out.println("Felicidades. Ha cantado BINGO despu�s de extraer un total de " + ronda + " n�meros.");
        System.out.println("Fin del BINGO.");

    }

}
