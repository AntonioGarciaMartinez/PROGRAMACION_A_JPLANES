/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog09_tarea3_ej4;

import java.time.LocalDate;

/**
 *
 * @author Antuan
 */
public class Tractor {
    
    private String numBastidor;
    private LocalDate fechaCompra;
    private String duenio;
        
    public Tractor(String numBastidor, LocalDate fechaCompra, String duenio) {
        this.numBastidor = numBastidor;
        this.fechaCompra = fechaCompra;
        this.duenio = duenio;
    }
        
    public void setNumBastidor(String numBastidor) {
        this.numBastidor = numBastidor;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
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
    
    @Override
    public String toString() {
        return "numBastidor=" + numBastidor + ", fechaCompra=" + fechaCompra + ", duenio=" + duenio + '.';
    }
    
}
