/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AytoArchena;

import java.util.Comparator;

/**
 * Pasa como con ComparadorDuenioMatricula que le defino el �nido m�todo
 * heredado de Comparator abstracto que compara dos objetos tractores porque se
 * lo indico en el diamante de la cabecera, si no me dar�a problemas en el
 * m�todo y tendr�a que especificar un downcast para el objeto Tractor
 *
 * @author Antuan
 */
public class ComparadorMatricula implements Comparator<Tractor> {

    @Override
    public int compare(Tractor o1, Tractor o2) {
        /**
         * del tractor primero saco su matr�cula y la comparo con la de o2 y al
         * salir ordenar� seg�n sea menor antes, igual-igual, o mayor despu�s
         */
        return o1.getMatricula().compareTo(o2.getMatricula());
    }

}
