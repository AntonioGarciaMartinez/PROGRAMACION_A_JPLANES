/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AytoLaMurta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Antuan
 */
public class ArrayListTractores {

    /**
     * como este tipo admite duplicados tendré que codificar algo que los evite
     * en el método darAlta. Me indica que el atributo tractores podría ser
     * final y lo he hecho porque solo lo usa esta clase para los métodos que
     * tiene que implementar referenciandolo con this.
     */
    private final ArrayList<Tractor> tractores;

    public ArrayListTractores() {
        this.tractores = new ArrayList<>();
    }

    /**
     * Utilizo este método para agregar un tractor al arrayList de tractores que
     * se crea en el constructor
     *
     * @param a
     */
    public void add(Tractor a) {
        this.tractores.add(a);

    }

    /**
     * Este método cumplirá con la segunda opción del menú le hago una
     * comparación de la matrícula exclusivamente porque se podría meter la
     * misma y otro nombre y eso sería un cambio de titularidad Lo que hago es
     * declarar un boolean para guardar el valor de si está dada de alta esa
     * matrícula y si lo está no la guarda; si no está utilizo add() para
     * agregarla y lo notifico
     */
    public void darAlta() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la mátricula del tractor.");
        String matricula = teclado.next();
        System.out.println("Introduzca el nombre del dueño.");
        String nombre = teclado.next();
        Tractor nuevo = new Tractor(matricula, nombre);

        boolean esta = false;
        for (int i = 0; i < this.tractores.size(); i++) {

            if (this.tractores.get(i).getMatricula() == nuevo.getMatricula()) {
                esta = true;
            }
        }
        if (!esta) {

            this.tractores.add(nuevo);
            System.out.println("El tractor de matrícula " + nuevo.getMatricula() + " ha sido registrado con éxito.");

        } else {

            System.out.println("El tractor de matrícula " + nuevo.getMatricula() + " ya estaba registrado.");
        }
    }

    /**
     * este método devolverá la segunda opción del menú, si el arrayList no está
     * vacío lista con un for each los tractores por orden de inserción y
     * guardado
     */
    public void listado() {

        if (!this.tractores.isEmpty()) {

            System.out.println("LISTADO DE TRACTORES POR ORDEN DE INSERCIÓN EN EL AYTO. DE LA MURTA.");
            System.out.println("");

            for (Tractor a : this.tractores) {
                System.out.println("-- " + a + ".");
            }
        }
    }

    /**
     * esta sería la tercera opción del menú, que ordena los tractores según
     * matrícula ascendente, uso el método sort de la interfaz collections para
     * que los ordene. Primero creo una lista de Tractores que la identifico con
     * este objeto de la clase, esto entra en el for y para cada elemento de la
     * lista lo muestra por pantalla
     */
    public void ordenarAsc() {

        List<Tractor> lista = this.tractores;
        Collections.sort(this.tractores);

        System.out.println("LISTADO DE TRACTORES POR ORDEN DE MATRÍCULA ASCENDENTE EN EL AYTO. DE LA MURTA.");
        System.out.println("");

        for (Tractor a : lista) {
            System.out.println(a);
        }
    }

    /**
     * esta sería la cuarta opción del menú. Lo que me hacía sin poner sort era
     * ordenar al revés el último orden guardado así que he decidido obligarlo a
     * ordenarlo primero para luego darle la vuelta. Desconozco cómo hacerlo de
     * otra forma de momento
     */
    public void ordenarDes() {

        List<Tractor> lista = this.tractores;
        Collections.sort(this.tractores);
        Collections.reverse(this.tractores);

        System.out.println("LISTADO DE TRACTORES POR ORDEN DE MATRÍCULA DESCENDENTE EN EL AYTO. DE LA MURTA.");
        System.out.println("");

        for (Tractor a : lista) {
            System.out.println(a);
        }
    }

}
