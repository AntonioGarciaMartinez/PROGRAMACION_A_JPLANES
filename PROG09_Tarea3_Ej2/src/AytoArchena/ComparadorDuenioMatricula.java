/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AytoArchena;

import java.util.Comparator;

/**
 * El únido método que defino es el heredado de Comparator abstracto que tengo
 * que definir que compara dos objetos tractores porque se lo indico en el
 * diamante de la cabecera, si no me daría problemas en el método y tendría que
 * especificar un downcast para el objeto Tractor
 *
 * @author Antuan
 */
public class ComparadorDuenioMatricula implements Comparator<Tractor> {

    @Override
    public int compare(Tractor o1, Tractor o2) {
        /**
         * el if introduce el caso de igualdad de dueño, el else el método de
         * cualquier otro compare con los métodos que muestran su atributo
         * Duenio
         */
        if (o1.getDuenio() == o2.getDuenio()) {
            return o1.getMatricula().compareToIgnoreCase(o2.getMatricula());
        } else {
            return o1.getDuenio().compareToIgnoreCase(o2.getDuenio());
        }
    }

}
