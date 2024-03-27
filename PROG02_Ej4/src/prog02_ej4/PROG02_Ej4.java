/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog02_ej4;
import java.util.Scanner;
/**
 *
 * @author Antuan
 */
public class PROG02_Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
    
        // TODO code application logic here
        
        
        Scanner teclado = new Scanner(System.in);
        System.out.println ("Introduzca el número de segundos que desea calcular:");
        long segundos = teclado.nextLong();
        
        long minutos = segundos/60;
        long horas = minutos/60;
        long dias = horas/24;
        
        System.out.println(segundos +" segundos equivale a:");
        System.out.print(minutos + " minutos, a ");
        System.out.print(horas + " horas y a ");
        System.out.println(dias + " días.");
    }
    
}
