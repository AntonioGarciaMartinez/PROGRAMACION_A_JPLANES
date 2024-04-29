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
     * como este tipo admite duplicados tendr� que codificar algo que los evite
     * en el m�todo darAlta. Me indica que el atributo tractores podr�a ser
     * final y lo he hecho porque solo lo usa esta clase para los m�todos que
     * tiene que implementar referenciandolo con this.
     */
    private final ArrayList<Tractor> tractores;

    public ArrayListTractores() {
        this.tractores = new ArrayList<>();
    }

    /**
     * Utilizo este m�todo para agregar un tractor al arrayList de tractores que
     * se crea en el constructor
     *
     * @param a
     */
    public void add(Tractor a) {
        this.tractores.add(a);

    }

    /**
     * Este m�todo cumplir� con la segunda opci�n del men� le hago una
     * comparaci�n de la matr�cula exclusivamente porque se podr�a meter la
     * misma y otro nombre y eso ser�a un cambio de titularidad Lo que hago es
     * declarar un boolean para guardar el valor de si est� dada de alta esa
     * matr�cula y si lo est� no la guarda; si no est� utilizo add() para
     * agregarla y lo notifico
     */
    public void darAlta() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la m�tricula del tractor.");
        String matricula = teclado.next();
        System.out.println("Introduzca el nombre del due�o.");
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
            System.out.println("El tractor de matr�cula " + nuevo.getMatricula() + " ha sido registrado con �xito.");

        } else {

            System.out.println("El tractor de matr�cula " + nuevo.getMatricula() + " ya estaba registrado.");
        }
    }

    /**
     * este m�todo devolver� la segunda opci�n del men�, si el arrayList no est�
     * vac�o lista con un for each los tractores por orden de inserci�n y
     * guardado
     */
    public void listado() {

        if (!this.tractores.isEmpty()) {

            System.out.println("LISTADO DE TRACTORES POR ORDEN DE INSERCI�N EN EL AYTO. DE LA MURTA.");
            System.out.println("");

            for (Tractor a : this.tractores) {
                System.out.println("-- " + a + ".");
            }
        }
    }

    /**
     * esta ser�a la tercera opci�n del men�, que ordena los tractores seg�n
     * matr�cula ascendente, uso el m�todo sort de la interfaz collections para
     * que los ordene. Primero creo una lista de Tractores que la identifico con
     * este objeto de la clase, esto entra en el for y para cada elemento de la
     * lista lo muestra por pantalla
     */
    public void ordenarAsc() {

        List<Tractor> lista = this.tractores;
        Collections.sort(this.tractores);

        System.out.println("LISTADO DE TRACTORES POR ORDEN DE MATR�CULA ASCENDENTE EN EL AYTO. DE LA MURTA.");
        System.out.println("");

        for (Tractor a : lista) {
            System.out.println(a);
        }
    }

    /**
     * esta ser�a la cuarta opci�n del men�. Lo que me hac�a sin poner sort era
     * ordenar al rev�s el �ltimo orden guardado as� que he decidido obligarlo a
     * ordenarlo primero para luego darle la vuelta. Desconozco c�mo hacerlo de
     * otra forma de momento
     */
    public void ordenarDes() {

        List<Tractor> lista = this.tractores;
        Collections.sort(this.tractores);
        Collections.reverse(this.tractores);

        System.out.println("LISTADO DE TRACTORES POR ORDEN DE MATR�CULA DESCENDENTE EN EL AYTO. DE LA MURTA.");
        System.out.println("");

        for (Tractor a : lista) {
            System.out.println(a);
        }
    }

}
