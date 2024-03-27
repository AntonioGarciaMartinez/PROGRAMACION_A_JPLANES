/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog02_ej1;
import java.util.Scanner;
/**
 *
 * @author Antuan
 */
public class PROG02_Ej1 {

    
      
    public static void main(String[] args) {

     
      final int VALOR_MAX = 5000;
      boolean tieneCarnet;
      String respuesta1;
      int mes = 1;
      String meses = "enero";
      String nombreApellidos = "Antonio García Martínez";
      boolean sexo;
      String respuesta2;
      long milisegundos = System.currentTimeMillis();
      double saldoCuenta = 2550.3;
      final double DISTANCIA_TIE_JUP = 778000000;
    
      Scanner teclado = new Scanner(System.in);
      

      System.out.println("El valor máximo es " + VALOR_MAX);
      System.out.println("Confirme si tiene carnet de conducir:");
      respuesta1 = teclado.nextLine();
      respuesta1 = respuesta1.toLowerCase();
      if (respuesta1.equals ("no")== false) {
          tieneCarnet = true;
      } else {
          tieneCarnet = false;
      }
      
        if (tieneCarnet == false) {
          System.out.println("El usuario no tiene carnet de conducir.");
      } else {
          System.out.println("El usuario sí tiene carnet de conducir.");
      }
    
      System.out.println("Este es el mes de "+meses+", es decir, el mes número "+mes+" del año.");
      System.out.println("El nombre del usuario es "+nombreApellidos+".");
      System.out.println("Responda con V o M para indicar su sexo:");
      respuesta2= teclado.nextLine();
      respuesta2= respuesta2.toUpperCase();
      if (respuesta2.equals("V") == true){
          sexo = true;
      } else {
          sexo = false;
      }
      if (sexo == true) {
          System.out.println("El usuario es varón.");
      } else {
          System.out.println("La usuaria es mujer.");
      }
      System.out.println("Desde el 1 de enero de 1970 han transcurrido "+milisegundos+" segundos.");
      System.out.println("El saldo de esta cuenta bancaria es de "+saldoCuenta+" €.");
      System.out.println("La distancia de la Tierra a Júpiter es de "+DISTANCIA_TIE_JUP+" km.");
          
        
        
    }
}
