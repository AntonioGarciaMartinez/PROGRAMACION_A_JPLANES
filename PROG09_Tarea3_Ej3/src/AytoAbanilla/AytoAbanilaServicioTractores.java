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
         * Después de declarar e instanciarlos creo el ArrayList de tractores y
         * los meto. El ArrayList entra como segundo argumento del objeto nuevo
         * Archena. Es como si fuera el ArrayListTractores del primer ejercicio
         */
        ArrayList<Tractor> tractores = new ArrayList();
        tractores.add(t1);
        tractores.add(t2);
        tractores.add(t3);
        tractores.add(t4);
        /**
         * este objeto nuevo es el que llama a los métodos que están en Archena
         * en cada uno de los casos del switch
         */
        Archena almacenamiento = new Archena("Feliz", tractores);

        //me valgo del menú que ya conocemos para mostrar las opciones
        int opcion;

        do {

            mostrarMenu();
            opcion = introducirEntero("Seleccione una de las opciones:");

            while (opcion < 1 || opcion > 7) {
                System.out.println("Opción errónea.");
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
                    System.out.println("Programa finalizado con éxito.");
            }
        } while (opcion != 7);
    }

    //creo el mostrarMenu como hacíamos antes
    public static void mostrarMenu() {
        System.out.println("_________________________________________________________________________________");
        System.out.println(".Ayto. Abanilla. Servicio de Tractores.");
        System.out.println("Elija una de las siguientes opciones introduciendo el número que le corresponde.");
        System.out.println("1. Dar de alta un tractor.");
        System.out.println("2. Mostrar listado de tractores según orden de inserción.");
        System.out.println("3. Mostrar listado de tractores según orden ascendente de matrícula.");
        System.out.println("4. Mostrar listado de tractores según orden descendente de matrícula.");
        System.out.println("5. Mostrar listado de tractores según orden ascendente por fecha de Compra.");
        System.out.println("6. Mostrar listado de tractores según orden ascendente del nombre del dueño y matrícula.");
        System.out.println("7. Salir.");
        System.out.println("_________________________________________________________________________________");
        System.out.println("");
    }

    //y su correspondiente entero para la opción del menú
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
