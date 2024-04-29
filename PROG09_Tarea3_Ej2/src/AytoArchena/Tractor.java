/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AytoArchena;

import java.time.LocalDate;

/**
 *
 * @author Antuan
 */
public class Tractor {

    /**
     * Es id�ntica al ej anterior pero tiene dos atributos m�s que se unen al
     * constructor y a los m�todos get-set y al string, adem�s de que no
     * implementa la interfaz comparable, porque ahora las comparaciones para
     * ordenar se hacen desde clases propias
     */
    private String matricula;
    private String numBastidor;
    private LocalDate fechaCompra;
    private String duenio;

    public Tractor(String matricula, String numBastidor, LocalDate fechaCompra, String duenio) {
        this.matricula = matricula;
        this.numBastidor = numBastidor;
        this.fechaCompra = fechaCompra;
        this.duenio = duenio;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNumBastidor() {
        return numBastidor;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNumBastidor(String numBastidor) {
        this.numBastidor = numBastidor;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public void setDue�o(String due�o) {
        this.duenio = due�o;
    }

    @Override
    public String toString() {
        return "Tractor{" + "matricula=" + matricula + ", \tnumBastidor=" + numBastidor + ", \n\nfechaCompra=" + fechaCompra + ", \tduenio=" + duenio + '}';
    }

}
