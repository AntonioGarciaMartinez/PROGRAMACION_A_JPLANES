/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AytoAbanilla;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * Est clase es la que desarrolla los métodos que eran directos en el ej2, se
 * crea como se indica en el enunciado del ej3
 *
 * @author Antuan
 */
public class Archena {

    private String nombre;
    private ArrayList<Tractor> tractores;

    public Archena(String nombre, ArrayList<Tractor> tractores) {
        this.nombre = nombre;
        this.tractores = tractores;
    }

    public void add(Tractor a) {
        this.tractores.add(a);

    }

    /**
     * Este método cumplirá con la segunda opción del menú, le hago una
     * comparación de la matrícula y del número de Bastidor (porque creo que no
     * pueden tampoco coincidir) porque se podría meter la misma mat. y otro
     * nombre y eso sería un cambio de titularidad
     */
    public void darAlta() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la mátricula del tractor.");

        String matricula = teclado.next();
        System.out.println("Introduzca el número de bastidor del tractor.");

        String numBastidor = teclado.next();
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

        Tractor nuevo = new Tractor(matricula, numBastidor, fechaCompra, nombre);

        boolean esta = false;
        for (int i = 0; i < this.tractores.size(); i++) {
            //también me indica que podría usar equals y no valores de igualdad
            if (this.tractores.get(i).getMatricula() == nuevo.getMatricula()) {
                esta = true;
            }
        }
        for (int i = 0; i < this.tractores.size(); i++) {
            if (this.tractores.get(i).getNumBastidor() == nuevo.getNumBastidor()) {
                esta = true;
            }
        }
        if (!esta) {
            this.tractores.add(nuevo);
            System.out.println("El tractor de matrícula " + nuevo.getMatricula() + " ha sido registrado con éxito.");
        } else {
            System.out.println("El tractor de matrícula " + nuevo.getMatricula() + "\n y de número de bastidor " + nuevo.getNumBastidor() + "ya estaba registrado.");
        }
    }

    //es como en el primer ejercicio
    public void listado() {

        if (!this.tractores.isEmpty()) {

            System.out.println("LISTADO DE TRACTORES POR ORDEN DE INSERCIÓN EN EL AYTO. DE ABANILLA.");
            System.out.println("");

            for (Tractor a : this.tractores) {
                System.out.println("-- " + a + ".");
                System.out.println("");
            }
        }
    }

    //se queda también como el primer ejercicio
    public void ordenarAsc() {

        List<Tractor> lista = this.tractores;
        Collections.sort(this.tractores, new ComparadorMatricula());

        System.out.println("LISTADO DE TRACTORES POR ORDEN DE MATRÍCULA ASCENDENTE EN EL AYTO. DE ABANILLA.");
        System.out.println("");

        for (Tractor a : lista) {
            System.out.println(a);
        }
    }

    //se queda como el del primer ej
    public void ordenarDes() {

        List<Tractor> lista = this.tractores;
        Collections.sort(this.tractores, new ComparadorMatricula());
        Collections.reverse(this.tractores);

        System.out.println("LISTADO DE TRACTORES POR ORDEN DE MATRÍCULA DESCENDENTE EN EL AYTO. DE ABANILLA.");
        System.out.println("");

        for (Tractor a : lista) {
            System.out.println(a);
        }
    }

    /**
     * aquí no me hace falta valor de entrada como en el seg ejercicio porque
     * usa el atributo con this de esta clase
     */
    public void ordenarAscFechaCompra() {

        List<Tractor> lista = this.tractores;
        Collections.sort(this.tractores, new ComparadorFechaCompra());

        System.out.println("LISTADO DE TRACTORES POR ORDEN DE FECHA DE COMPRA ASCENDENTE EN EL AYTO. DE ABANILLA.");
        System.out.println("");

        for (Tractor a : lista) {
            System.out.println(a);
        }
    }

    /**
     * Este último pues le quito igualmente el dato de entrda del ej2 y lo
     * adapto
     */
    public void ordenarAscDuenioMatricula() {

        List<Tractor> lista = this.tractores;
        Collections.sort(this.tractores, new ComparadorDuenioMatricula());

        System.out.println("LISTADO DE TRACTORES POR ORDEN DE DUEÑO Y MATRÍCULA ASCENDENTE EN EL AYTO. DE ABANILLA.");
        System.out.println("");

        for (Tractor a : lista) {
            System.out.println(a);
        }
    }

    /**
     * Aquí empiezan las tres clases internas que pide el ejercicio que eran las
     * que eran clases independiente en el ej2 y que ahora están dentro de esta
     * otra clase con los métodos del menú, el código se queda igual al
     * indicarle al Comparator que se trabaja con objetos de tipo Tractor en las
     * tres clases
     */
    public class ComparadorMatricula implements Comparator<Tractor> {

        @Override
        public int compare(Tractor o1, Tractor o2) {

            return o1.getMatricula().compareTo(o2.getMatricula());
        }

    }

    public class ComparadorFechaCompra implements Comparator<Tractor> {

        @Override
        public int compare(Tractor o1, Tractor o2) {

            return o1.getFechaCompra().compareTo(o2.getFechaCompra());
        }

    }

    public class ComparadorDuenioMatricula implements Comparator<Tractor> {

        @Override
        public int compare(Tractor o1, Tractor o2) {
            //el programa me dice que en el if podría usar un método equals
            if (o1.getDuenio() == o2.getDuenio()) {
                return o1.getMatricula().compareToIgnoreCase(o2.getMatricula());
            } else {
                return o1.getDuenio().compareToIgnoreCase(o2.getDuenio());
            }
        }

    }
}
