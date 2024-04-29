/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AytoLaMurta;

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
         * Necesito un menú para dar de alta tractores, sacar un listado de
         * tractores según se hayan insertado, listado en orden ascendente de
         * matrícula, en orden descendente y finalizar. Pide dar de alta 4
         * tractores y comprobar si ya está dado de alta.
         */
        Tractor t1 = new Tractor("3589", "Manolo Bombo");
        Tractor t2 = new Tractor("8456", "Pepon Nieto");
        Tractor t3 = new Tractor("6584", "Andrés Escobar");
        Tractor t4 = new Tractor("0643", "Maria Cuenca");
        /**
         * creo un objeto del tipo ArrayListTractores y le agrego los tractores
         * arriba creados (4 decía el ejercicio)
         */
        ArrayListTractores tractores = new ArrayListTractores();
        tractores.add(t1);
        tractores.add(t2);
        tractores.add(t3);
        tractores.add(t4);

        //me valgo del menú que ya conocemos para mostrar las opciones
        int opcion;

        do {

            mostrarMenu();
            opcion = introducirEntero("Seleccione una de las opciones:");

            while (opcion < 1 || opcion > 5) {
                System.out.println("Opción errónea.");
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
                    System.out.println("Programa finalizado con éxito.");
            }
        } while (opcion != 5);
    }

    //creo el mostrarMenu como hacíamos antes en otras unidades
    public static void mostrarMenu() {
        System.out.println("_________________________________________________________________________________");
        System.out.println(".Ayto. La Murta. Servicio de Tractores.");
        System.out.println("Elija una de las siguientes opciones introduciendo el número que le corresponde.");
        System.out.println("1. Dar de alta un tractor.");
        System.out.println("2. Mostrar listado de tractores según orden de inserción.");
        System.out.println("3. Mostrar listado de tractores según orden ascendente de matrícula.");
        System.out.println("4. Mostrar listado de tractores según orden descendente de matrícula.");
        System.out.println("5. Salir.");
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
