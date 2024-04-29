/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AytoArchena;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Antuan
 */
public class AytoArchenaServicioTractores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Necesito un men� para dar de alta tractores, sacar un listado de
         * tractores seg�n se hayan insertado, listado en orden ascendente de
         * matr�cula, en orden descendente y dos m�todos nuevos para este
         * ejercicio. Pide dar de alta 4 tractores y comprobar si ya est� dado
         * de alta. Adem�s al declarar los tractores nuevos e instanciarlos
         * pondr� dos para un mismo due�o ya que uno de los m�todos me lo va a
         * querer ordenar cuando el due�o coincide
         */

        Tractor t1 = new Tractor("1658", "3HIES56IDNK584962", LocalDate.of(2005, 6, 18), "Juanjo Sares");
        Tractor t2 = new Tractor("1364", "6JIDF59OKDI485915", LocalDate.of(2015, 4, 24), "M�nica Garc�a");
        Tractor t3 = new Tractor("6584", "9AAFE95INJG485200", LocalDate.of(2019, 1, 1), "Tiberio Julio");
        Tractor t4 = new Tractor("5210", "6OLKM77UHYE114462", LocalDate.of(2022, 3, 29), "M�nica Garc�a");
        ArrayList<Tractor> tractores = new ArrayList();
        tractores.add(t1);
        tractores.add(t2);
        tractores.add(t3);
        tractores.add(t4);

        /**
         * Al igual que en el proyecto del primer ejercicio esto es id�ntico a
         * excepci�n de los m�todos que llama el men�q eu est�n directamente en
         * la clase main, es decir, bajo este c�digo
         *
         */
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
                    darAlta(tractores);
                    break;
                case 2:
                    listado(tractores);
                    break;
                case 3:
                    ordenarAsc(tractores);
                    break;
                case 4:
                    ordenarDes(tractores);
                    break;
                case 5:
                    ordenarAscFechaCompra(tractores);
                    break;
                case 6:
                    ordenarAscDuenioMatricula(tractores);
                    break;
                default:
                    System.out.println("Programa finalizado con �xito.");
            }
        } while (opcion != 7);
    }

    //creo el mostrarMenu como hac�amos antes
    public static void mostrarMenu() {
        System.out.println("_________________________________________________________________________________");
        System.out.println(".Ayto. Archena. Servicio de Tractores.");
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

    /**
     * Los m�todos de este main son casi id�nticos a los del ejercicio uno, sin
     * embargo para que el m�todo pueda valerse del array de tractores, tengo
     * que d�rselo como dato de entrada, antes no ten�a que hacerlo porque era
     * el atributo definido de la propia clase en la que estaban los m�todos.
     * Esto me obliga a cambiar las referencias que hac�a a this por el objeto
     * que ha entrado en el m�todo, adem�s de que estos tractores tienen m�s
     * atributos que los del primer ejercicio. lo que me he visto obligado a
     * hacer ha sido marcarlos como est�ticos para poder trabajar con ellos
     * desde el men�
     *
     * @param a
     */
    public static void darAlta(ArrayList<Tractor> a) {

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
         * tambi�n con los n�meros de bastidor
         */

        Tractor nuevo = new Tractor(matricula, numBastidor, fechaCompra, nombre);
        boolean esta = false;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getMatricula() == nuevo.getMatricula()) {
                esta = true;
            }
        }
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getNumBastidor() == nuevo.getNumBastidor()) {
                esta = true;
            }
        }
        if (!esta) {
            a.add(nuevo);
            System.out.println("El tractor de matr�cula " + nuevo.getMatricula() + " ha sido registrado con �xito.");
        } else {
            System.out.println("El tractor de matr�cula " + nuevo.getMatricula() + "\n y de n�mero de bastidor " + nuevo.getNumBastidor() + "ya estaba registrado.");
        }
    }

    //modifico el que ten�a del primer ejercicio para que reciba el ArrayList y trabaje con sus valores
    public static void listado(ArrayList<Tractor> a) {

        if (!a.isEmpty()) {

            System.out.println("LISTADO DE TRACTORES POR ORDEN DE INSERCI�N EN EL AYTO. DE ARCHENA.");
            System.out.println("");

            for (Tractor t : a) {
                System.out.println("-- " + t + ".");
                System.out.println("");//para que se vean mejor por pantalla les doy otro salto de l�nea
            }
        }
    }

    //hago lo propio con este m�todo
    public static void ordenarAsc(ArrayList<Tractor> a) {

        List<Tractor> lista = a;
        Collections.sort(a, new ComparadorMatricula());

        System.out.println("LISTADO DE TRACTORES POR ORDEN DE MATR�CULA ASCENDENTE EN EL AYTO. DE ARCHENA.");
        System.out.println("");

        for (Tractor t : lista) {
            System.out.println(t);
        }
    }

    //y con este m�todo
    public static void ordenarDes(ArrayList<Tractor> a) {

        List<Tractor> lista = a;
        Collections.sort(a, new ComparadorMatricula());
        Collections.reverse(a);

        System.out.println("LISTADO DE TRACTORES POR ORDEN DE MATR�CULA DESCENDENTE EN EL AYTO. DE ARCHENA.");
        System.out.println("");

        for (Tractor t : lista) {
            System.out.println(t);
        }
    }

    /**
     * Este m�todo es nuevo y se vale de la clase ComparadorFechaCompra() para
     * indicar en torno a qu� se ordena el array de tractores
     *
     * @param a
     */
    public static void ordenarAscFechaCompra(ArrayList<Tractor> a) {

        List<Tractor> lista = a;
        Collections.sort(a, new ComparadorFechaCompra());

        System.out.println("LISTADO DE TRACTORES POR ORDEN DE FECHA DE COMPRA ASCENDENTE EN EL AYTO. DE ARCHENA.");
        System.out.println("");

        for (Tractor b : lista) {
            System.out.println(b);
        }
    }

    /**
     * Este m�todo tambi�n es nuevo y se vale de la clase
     * ComparadorDuenioMatricula() para indicar en torno a qu� se ordena el
     * array de tractores. Me he valido de lo aprendido en los v�deos de la
     * unidad para utilizar esa estructura
     *
     * @param a
     */
    public static void ordenarAscDuenioMatricula(ArrayList<Tractor> a) {

        List<Tractor> lista = a;
        Collections.sort(a, new ComparadorDuenioMatricula());

        System.out.println("LISTADO DE TRACTORES POR ORDEN DE DUE�O Y MATR�CULA ASCENDENTE EN EL AYTO. DE ARCHENA.");
        System.out.println("");

        for (Tractor b : lista) {
            System.out.println(b);
        }
    }
}
