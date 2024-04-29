/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AytoLaMurta;

/**
 *
 * @author Antuan
 */
public class Tractor implements Comparable<Tractor> {

    /**
     * Los atributos de un tractor son el n�mero de matr�cula y el nombre de su
     * due�o
     *
     * @param o
     * @return
     */
    private String matricula;
    private String due�o;

    /**
     * Constructor por defecto y m�todos get-set para cada atributo adem�s de
     * toString y el m�todo de la interfaz abstracta Comparable que tengo que
     * definir
     *
     * @param matricula
     * @param due�o
     */
    public Tractor(String matricula, String due�o) {
        this.matricula = matricula;
        this.due�o = due�o;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getDue�o() {
        return due�o;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setDue�o(String due�o) {
        this.due�o = due�o;
    }

    @Override
    public String toString() {
        return "Tractor{" + "matricula=" + matricula + ", due\u00f1o=" + due�o + '}';
    }

    /**
     * como es un String utilizo para compararlo la comparaci�n que hemos visto
     * en v�deos, la matr�cula como no tiene letras no he usado el IgnoreCase
     */
    @Override
    public int compareTo(Tractor o) {

        return this.matricula.compareTo(o.matricula);
    }

}
