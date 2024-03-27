/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog02_ej6;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author Antuan
 */
public class PROG02_Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la cifra de alumnos matriculados en programación:");
        double prog = teclado.nextDouble();
        System.out.println("Introduzca la cifra de alumnos matriculados en entornos:");
        double ent = teclado.nextDouble();
        System.out.println("Introduzca la cifra de alumnos matriculados en bases de datos:");
        double bases = teclado.nextDouble();

        double totalAlumnos = prog + ent + bases;
        double porcProg = (prog / totalAlumnos) * 100;
        double porcEnt = (ent / totalAlumnos) * 100;
        double porcBases = (bases / totalAlumnos) * 100;

        DecimalFormat unDec = new DecimalFormat("0.0");
        String progFormateado = unDec.format(porcProg);
        String entFormateado = unDec.format(porcEnt);
        String basesFormateado = unDec.format(porcBases);

        System.out.println("El porcentaje de alumnos matriculados en programación es de " + progFormateado + "%.");    // TODO code application logic here
        System.out.println("El porcentaje de alumnos matriculados en entornos es de " + entFormateado + "%.");    // TODO code application logic here
        System.out.println("El porcentaje de alumnos\\ matriculados en bases es de " + basesFormateado + "%.");    // TODO code application logic here
    }

}
