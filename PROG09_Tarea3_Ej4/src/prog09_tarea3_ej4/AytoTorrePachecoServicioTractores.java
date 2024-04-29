/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog09_tarea3_ej4;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Antuan
 */
public class AytoTorrePachecoServicioTractores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Tractor t1 = new Tractor("1ASDS75RTRY778552", LocalDate.of(2011, 12, 25), "Pablo Pleitos");
        Tractor t2 = new Tractor("4JHGH06SDFD353687", LocalDate.of(2015, 10, 2), "Marina Diamante");
        Tractor t3 = new Tractor("7JHTR25SSJY758699", LocalDate.of(2023, 1, 8), "Carlos Baute");
        Tractor t4 = new Tractor("8AEAI28UKIU445255", LocalDate.of(2018, 5, 1), "Mariano R.");

        String m1 = "6584";
        String m2 = "1141";
        String m3 = "0251";
        String m4 = "9652";

        TreeMap<String, Tractor> tractores = new TreeMap<>();

        tractores.put(m1, t1);
        tractores.put(m2, t2);
        tractores.put(m3, t3);
        tractores.put(m4, t4);

        int opcion;

        do {

            mostrarMenu();
            opcion = introducirEntero("Seleccione una de las opciones:");

            while (opcion < 1 || opcion > 3) {
                System.out.println("Opci�n err�nea.");
                opcion = introducirEntero("Seleccione una de las opciones:");
            }

            switch (opcion) {

                case 1:
                    darAlta(tractores);
                    break;
                case 2:
                    listado(tractores);
                    break;
                default:
                    System.out.println("Programa finalizado con �xito.");
            }
        } while (opcion != 3);
    }

    //creo el mostrarMenu como hac�amos antes
    public static void mostrarMenu() {
        System.out.println("_________________________________________________________________________________");
        System.out.println(".Ayto. Torre Pacheco. Servicio de Tractores.");
        System.out.println("Elija una de las siguientes opciones introduciendo el n�mero que le corresponde.");
        System.out.println("1. Dar de alta un tractor.");
        System.out.println("2. Mostrar listado de tractores en orden ascendente de matr�cula.");
        System.out.println("3. Salir.");
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

    public static void darAlta(TreeMap<String, Tractor> a) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la m�tricula del tractor.");
        String matricula = teclado.next();

        System.out.println("Introduzca el n�mero de bastidor del tractor.");
        String numBastidor = teclado.next();
        //para meter la fecha es un poco lioso, pero le pido el formato separado por / y lo desmembro para adaptarlo
        System.out.println("Introduzca la fecha de compra del tractor (formato AAAA/MM/DD).");
        String cadena = teclado.next();
        String[] partes = cadena.split("/");
        int anio, mes, dia;
        anio = Integer.parseInt(partes[0]);
        mes = Integer.parseInt(partes[1]);
        dia = Integer.parseInt(partes[2]);
        LocalDate fechaCompra = LocalDate.of(anio, mes, dia);

        System.out.println("Introduzca el nombre del due�o.");
        String nombre = teclado.next();
        /**
         * Defino el tractor que ha entrado por teclado en el terminal y
         * compruebo si ya existe comparando con las matr�culas existentes y
         * tambi�n con los n�meros de bastidor, esta vez se requiere el m�todo
         * containsKey y no los get que ten�a antes de las clases de tractor
         * puesto que la matr�cula ahora es el key del TreeMap
         */

        Tractor nuevo = new Tractor(numBastidor, fechaCompra, nombre);

        boolean esta = false;
        for (int i = 0; i < a.size(); i++) {
            if (a.containsKey(matricula)) {
                esta = true;
            }
        }

        if (!esta) {
            a.put(matricula, nuevo);
            System.out.println("El tractor de matr�cula " + matricula + " ha sido registrado con �xito.");
        } else {
            System.out.println("El tractor de matr�cula " + matricula + "ya estaba registrado.");
        }
    }

    /**
     * modifico el que ten�a del primer ejercicio para que reciba el TreeMap de
     * donde necesita ver su key y su value
     */
    public static void listado(TreeMap<String, Tractor> a) {

        if (!a.isEmpty()) {

            System.out.println("LISTADO DE TRACTORES POR ORDEN ASCENDENTE DE MATR�CULA EN EL AYTO. DE TORRE PACHECO.");
            System.out.println("");

            for (Map.Entry<String, Tractor> entrada : a.entrySet()) {
                System.out.println("-Datos el tractor con matr�cula " + entrada.getKey() + ":");
                System.out.println("--" + entrada.getValue());
            }
        }
    }

}
