/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AytoArchena;

import java.util.Comparator;

/**
 * Pasa como con ComparadorDuenioMatricula que le defino el únido método
 * heredado de Comparator abstracto que compara dos objetos tractores porque se
 * lo indico en el diamante de la cabecera, si no me daría problemas en el
 * método y tendría que especificar un downcast para el objeto Tractor
 *
 * @author Antuan
 */
public class ComparadorFechaCompra implements Comparator<Tractor> {

    @Override
    public int compare(Tractor o1, Tractor o2) {
        return o1.getFechaCompra().compareTo(o2.getFechaCompra());
    }

}
