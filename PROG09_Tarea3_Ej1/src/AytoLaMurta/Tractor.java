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
     * Los atributos de un tractor son el número de matrícula y el nombre de su
     * dueño
     *
     * @param o
     * @return
     */
    private String matricula;
    private String dueño;

    /**
     * Constructor por defecto y métodos get-set para cada atributo además de
     * toString y el método de la interfaz abstracta Comparable que tengo que
     * definir
     *
     * @param matricula
     * @param dueño
     */
    public Tractor(String matricula, String dueño) {
        this.matricula = matricula;
        this.dueño = dueño;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getDueño() {
        return dueño;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    @Override
    public String toString() {
        return "Tractor{" + "matricula=" + matricula + ", due\u00f1o=" + dueño + '}';
    }

    /**
     * como es un String utilizo para compararlo la comparación que hemos visto
     * en vídeos, la matrícula como no tiene letras no he usado el IgnoreCase
     */
    @Override
    public int compareTo(Tractor o) {

        return this.matricula.compareTo(o.matricula);
    }

}
