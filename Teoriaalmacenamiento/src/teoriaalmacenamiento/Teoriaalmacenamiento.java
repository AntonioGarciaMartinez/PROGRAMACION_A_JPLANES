/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriaalmacenamiento;

/**
 *
 * @author Antuan
 */
public class Teoriaalmacenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String cad = "Historia de Enkor";
        System.out.println(cad);
        System.out.println(cad+" del s. XXVII");
        
        cad = cad.concat(" del s. XXII");
        System.out.println(cad);
        System.out.println(1+cad+2); //toString() automático del valor 1 y 2
        
        int recuento = cad.length();
        System.out.println(recuento);
        
        char n = cad.charAt(5);
        System.out.println(n);
        
        String palabra = cad.substring(0, 7);
        System.out.println(palabra);
        
        palabra = cad.substring(11);
        System.out.println(palabra);
        
        CharSequence nuevo = cad.subSequence(0, 11);//tipo desconocido
        System.out.println(nuevo);
        System.out.println("A"+5f);//muestra A5.0
        
        float precio = 3.3f;
        System.out.println("El precio es: "+precio+"?");
        
        String salida = String.format("El precio es: %.2f ?", precio);
        System.out.println(salida);
        
        int ordenalf = cad.compareTo(palabra);//+ si va antes,0 igual y -si palabra va después
        boolean identif = cad.equals(nuevo);
        if(ordenalf == 0){
            System.out.println("Las dos cadenas son iguales.");
        }
        else{
            if(ordenalf >0){
                System.out.println(cad+", "+palabra);
            }
            else{
                System.out.println(palabra+","+cad);
            }
        }
        if(identif == true){
            System.out.println("Es la misma cadena de caracteres.");
        }
        
        
    }
    
}
