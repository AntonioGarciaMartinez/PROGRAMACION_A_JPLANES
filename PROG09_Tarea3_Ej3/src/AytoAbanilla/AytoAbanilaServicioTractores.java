/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AytoAbanilla;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Antuan
 */
public class AytoAbanilaServicioTractores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Creo todo como antes pero el array de tractores lo meto en el objeto de tipo Archena
         */

        Tractor t1 = new Tractor("5962", "6HIOS11OIDS988542", LocalDate.of(2020, 7, 17), "Marta Cano");
        Tractor t2 = new Tractor("3552", "7IOSD08MNND302012", LocalDate.of(2005, 5, 21), "Marcos Los");
        Tractor t3 = new Tractor("0504", "5DSDF30IIAJ118854", LocalDate.of(2018, 5, 14), "Marta Cano");
        Tractor t4 = new Tractor("9620", "3FFAS59ZZEF362541", LocalDate.of(2021, 2, 2), "Nerea Ros");

        /**
         * Despu�s de declarar e instanciarlos creo el ArrayList de tractores y
         * los meto. El ArrayList entra como segundo argumento del objeto nuevo
         * Archena. Es como si fuera el ArrayListTractores del primer ejercicio
         */
        ArrayList<Tractor> tractores = new ArrayList();
        tractores.add(t1);
        tractores.add(t2);
        tractores.add(t3);
        tractores.add(t4);
        /**
         * este objeto nuevo es el que llama a los m�todos que est�n en Archena
         * en cada uno de los casos del switch
         */
        Archena almacenamiento = new Archena("Feliz", tractores);

        //me valgo del men� que ya conocemos para mostrar las opciones
        int opcion;

        do {

            mostrarMenu();
            opcion = introducirEntero("Seleccione una de las opciones:");

            while (opcion < 1 || opcion > 7) {
                System.out.println("Opci�n err�nea.");
                opcion = introducirEntero("Seleccione una de las opciones:");
            }

            switch (opcion) {

                case 1:
                    almacenamiento.darAlta();
                    break;
                case 2:
                    almacenamiento.listado();
                    break;
                case 3:
                    almacenamiento.ordenarAsc();
                    break;
                case 4:
                    almacenamiento.ordenarDes();
                    break;
                case 5:
                    almacenamiento.ordenarAscFechaCompra();
                    break;
                case 6:
                    almacenamiento.ordenarAscDuenioMatricula();
                    break;
                default:
                    System.out.println("Programa finalizado con �xito.");
            }
        } while (opcion != 7);
    }

    //creo el mostrarMenu como hac�amos antes
    public static void mostrarMenu() {
        System.out.println("_________________________________________________________________________________");
        System.out.println(".Ayto. Abanilla. Servicio de Tractores.");
        System.out.println("Elija una de las siguientes opciones introduciendo el n�mero que le corresponde.");
        System.out.println("1. Dar de alta un tractor.");
        System.out.println("2. Mostrar listado de tractores seg�n orden de inserci�n.");
        System.out.println("3. Mostrar listado de tractores seg�n orden ascendente de matr�cula.");
        System.out.println("4. Mostrar listado de tractores seg�n orden descendente de matr�cula.");
        System.out.println("5. Mostrar listado de tractores seg�n orden ascendente por fecha de Compra.");
        System.out.println("6. Mostrar listado de tractores seg�n orden ascendente del nombre del due�o y matr�cula.");
        System.out.println("7. Salir.");
        System.out.println("_________________________________________________________________________________");
        System.out.println("");
    }

    //y su correspondiente entero para la opci�n del men�
    public static int introducirEntero(String mensaje) {

        int opcion;
        Scanner teclado = new Scanner(System.in);
        String cadena;

        System.out.println(mensaje);
        cadena = teclado.nextLine();
        opcion = Integer.parseInt(cadena);

        return opcion;
    }

}
