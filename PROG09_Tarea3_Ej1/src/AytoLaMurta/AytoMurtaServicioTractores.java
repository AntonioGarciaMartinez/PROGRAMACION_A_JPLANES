/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AytoLaMurta;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author Antuan
 */
public class AytoMurtaServicioTractores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /**
         * Necesito un men� para dar de alta tractores, sacar un listado de
         * tractores seg�n se hayan insertado, listado en orden ascendente de
         * matr�cula, en orden descendente y finalizar. Pide dar de alta 4
         * tractores y comprobar si ya est� dado de alta.
         */
        Tractor t1 = new Tractor("3589", "Manolo Bombo");
        Tractor t2 = new Tractor("8456", "Pepon Nieto");
        Tractor t3 = new Tractor("6584", "Andr�s Escobar");
        Tractor t4 = new Tractor("0643", "Maria Cuenca");
        /**
         * creo un objeto del tipo ArrayListTractores y le agrego los tractores
         * arriba creados (4 dec�a el ejercicio)
         */
        ArrayListTractores tractores = new ArrayListTractores();
        tractores.add(t1);
        tractores.add(t2);
        tractores.add(t3);
        tractores.add(t4);

        //me valgo del men� que ya conocemos para mostrar las opciones
        int opcion;

        do {

            mostrarMenu();
            opcion = introducirEntero("Seleccione una de las opciones:");

            while (opcion < 1 || opcion > 5) {
                System.out.println("Opci�n err�nea.");
                opcion = introducirEntero("Seleccione una de las opciones:");
            }

            switch (opcion) {

                case 1:
                    tractores.darAlta();
                    break;
                case 2:
                    tractores.listado();
                    break;
                case 3:
                    tractores.ordenarAsc();
                    break;
                case 4:
                    tractores.ordenarDes();
                    break;
                default:
                    System.out.println("Programa finalizado con �xito.");
            }
        } while (opcion != 5);
    }

    //creo el mostrarMenu como hac�amos antes en otras unidades
    public static void mostrarMenu() {
        System.out.println("_________________________________________________________________________________");
        System.out.println(".Ayto. La Murta. Servicio de Tractores.");
        System.out.println("Elija una de las siguientes opciones introduciendo el n�mero que le corresponde.");
        System.out.println("1. Dar de alta un tractor.");
        System.out.println("2. Mostrar listado de tractores seg�n orden de inserci�n.");
        System.out.println("3. Mostrar listado de tractores seg�n orden ascendente de matr�cula.");
        System.out.println("4. Mostrar listado de tractores seg�n orden descendente de matr�cula.");
        System.out.println("5. Salir.");
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
