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
                System.out.println("Opción errónea.");
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
                    System.out.println("Programa finalizado con éxito.");
            }
        } while (opcion != 3);
    }

    //creo el mostrarMenu como hacíamos antes
    public static void mostrarMenu() {
        System.out.println("_________________________________________________________________________________");
        System.out.println(".Ayto. Torre Pacheco. Servicio de Tractores.");
        System.out.println("Elija una de las siguientes opciones introduciendo el número que le corresponde.");
        System.out.println("1. Dar de alta un tractor.");
        System.out.println("2. Mostrar listado de tractores en orden ascendente de matrícula.");
        System.out.println("3. Salir.");
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

    public static void darAlta(TreeMap<String, Tractor> a) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la mátricula del tractor.");
        String matricula = teclado.next();

        System.out.println("Introduzca el número de bastidor del tractor.");
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

        System.out.println("Introduzca el nombre del dueño.");
        String nombre = teclado.next();
        /**
         * Defino el tractor que ha entrado por teclado en el terminal y
         * compruebo si ya existe comparando con las matrículas existentes y
         * también con los números de bastidor, esta vez se requiere el método
         * containsKey y no los get que tenía antes de las clases de tractor
         * puesto que la matrícula ahora es el key del TreeMap
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
            System.out.println("El tractor de matrícula " + matricula + " ha sido registrado con éxito.");
        } else {
            System.out.println("El tractor de matrícula " + matricula + "ya estaba registrado.");
        }
    }

    /**
     * modifico el que tenía del primer ejercicio para que reciba el TreeMap de
     * donde necesita ver su key y su value
     */
    public static void listado(TreeMap<String, Tractor> a) {

        if (!a.isEmpty()) {

            System.out.println("LISTADO DE TRACTORES POR ORDEN ASCENDENTE DE MATRÍCULA EN EL AYTO. DE TORRE PACHECO.");
            System.out.println("");

            for (Map.Entry<String, Tractor> entrada : a.entrySet()) {
                System.out.println("-Datos el tractor con matrícula " + entrada.getKey() + ":");
                System.out.println("--" + entrada.getValue());
            }
        }
    }

}
