/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_refuerzo_tema3;

import java.util.Scanner;
/**
 *
 * @author Antuan
 */
public class EstructuraSeleccion {
    
    /*
    *En esta sección de ejercicios no se pedía una clase específica para cada
    *método así que los he englobado en su sección.
    */
    
        public static void ecuacionprimergrado(){
            
            /*Este método busca resolver una ecuación de primer grado de tipo ax+b=0
            *El usuario deberá introducir los valores de a y b para que le demos la solución
            *Decido crear un bloque if-else con otro anidado, ya que la primera condición es que
            *el valor de a sea 0, me deja dos opciones sin solución, una indeterminada y otra imposible
            *en el otro caso sea b=0 o no, la solución existe.
            */
            Scanner teclado;
            teclado = new Scanner(System.in);
            double a, b, x;

            System.out.println("En esta ecuación de primer grado ax + b = 0, introduzca el valor de a:");
            a = teclado.nextDouble();
            System.out.println("Introduzca el valor de b:");
            b = teclado.nextDouble();

            if (a==0){
                if(b==0){
                    System.out.println("El sistema tiene solución indeterminada.");
                        }
                else{
                    System.out.println("La solución del sistema es imposible");
                }
            }
            else{
                x = -b/a;
                System.out.println("La solución del sistema es x = "+x);
                }
        }
    
        public static void ecuacionsegundogrado(){
            /*preguntar por este error a la docente
            *En este método se resuelve una ec de segundo grado
            *siguiendo las instrucciones del ejercicio, a b y c tienen que ser
            *números enteros, así que aplico una vez más la estructura para capturar
            *el error que se ha visto en la UD4 a la hora de pedir esos datos al usuario
            *Después realizo los cálculos y según los resultados un if-else del mismo modo
            *que en el ejercicio anterior, nos da los resultados por pantalla.
            *No entiendo el problema que encuentra para no ejecutarse el programa
            *si no inicializo con un valor las variables que luego van a recibir valor
            *del usuario.
            */
            int a=1, b=1, c=1, d=1;
            double s1, s2;

            String cadena;
            boolean entero = false;
            Scanner teclado;
            teclado = new Scanner(System.in);
            
            do{
                try{
                    System.out.println("En la ecuación de segundo grado ax2 + bx + c = 0, los valores a, b y c son enteros.\nIntroduzca el valor de a:");
                    cadena = teclado.nextLine();
                    a = Integer.parseInt(cadena);
                    System.out.println("Introduzca el valor de b:");
                    cadena = teclado.nextLine();
                    b = Integer.parseInt(cadena);
                    System.out.println("Introduzca el valor de c:");
                    cadena = teclado.nextLine();
                    c = Integer.parseInt(cadena);
                    entero = true;
                }
                catch(NumberFormatException ex){
                    System.out.println("Los números a, b y c deben ser enteros. Por favor, introduce un valor entero.");
                }
            }while (!entero);

            d = (b*b)-(4*a*c);
            
            if (d ==0){
                s1 = -b/(2*a);
                System.out.println("Las soluciones son iguales, x1 y x2 = "+s1);

            }else{
                if(d<0){
                    System.out.println("Esta ecuación no tiene solución real.");
                }
                else{
                    s1=(-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
                    s2=(-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
                    System.out.println("Existen dos soluciones, x1 = "+s1+" y x2 = "+s2+".");

                }
            }    
        }
        
        public static void kmtomillas(){
            
            /*En este método quiero que el usuario me dé un valor en km y me diga
            *si lo quiere en millas náuticas o terrestres (el enunciado dice marinas
            *pero uso más naúticas y creo que es un detalle sin importancia)
            *Lo que hago al registrar la selección de las millas que quiere el usuario
            *es que si lo mete en minúscula o mayúscula, yo las convierto a mayúscula y me
            *quedo con el primer caracter, por si pone 'terrestres' sin darse cuenta
            *Después si el while ve que la primera letra no es ninguna de las dos, le dice
            *que se ha confundido y lo pide de nuevo. Después he usado un switch con dos casos
            *que también lo podría haber hecho con un if
            *Me volví loco ene l while porque introduje mal el conector con || y claro, era
            *imposible que N y T existieran a la vez en el mismo char
            */
            Scanner teclado;
            teclado = new Scanner(System.in);
            System.out.println("¿Qué cantidad de km desea convertir a millas?:");
            double km = teclado.nextDouble();
            
            teclado.nextLine();//
            System.out.println("Para convertir a millas naútica escriba N, para terrestres escriba T:");
            String conversion = teclado.nextLine();
            conversion = conversion.toUpperCase();
            char inicial = conversion.charAt(0);
                        
            while(inicial != 'N' && inicial != 'T'){
                
                System.out.println("No ha introducido la letra correcta. Debe escribir N o T según su opción.");
                System.out.println("Para convertir a millas naútica escriba N, para terrestres escriba T:");
                conversion = teclado.nextLine();
                conversion = conversion.toUpperCase();
                inicial = conversion.charAt(0);
              
            }
            
            switch(inicial){

                case 'N':
                    double mnautica= km*1.852;
                    System.out.println(km+" kilómetros equivalen a "+mnautica+" millas naúticas.");break;
                case 'T':
                    double mterrestre = km*1.609;
                    System.out.println(km+" kilómetros equivalen a "+mterrestre+" millas terrestres.");break;
                
            }    
               
        }
        
        public static void numeroescrito(){
            /*De manera similar al arranque de la clase principal, este método
            *pide una nota para asignarle un valor alfabético y mostrarlo
            *Me valgo de un while para asegurar que mete un entero entre 0 y 10
            *Y al final pues según la nota un switch
            */
            Scanner teclado;
            teclado = new Scanner(System.in);
            System.out.println("Introduzca una nota numérica de 0 a 10:");
            String cadena = teclado.nextLine();
            int nota = Integer.parseInt(cadena);
            
            while(nota < 0 || nota > 10){
                
                System.out.println("No ha introducido una nota válida entre 0 y 10.");
                System.out.println("Introduzca una nota numérica entre 0 y 10:");
                cadena = teclado.nextLine();
                nota = Integer.parseInt(cadena);
                              
            }
            
            switch(nota){
                
                case 0: System.out.println("La nota es cero.");break;
                case 1: System.out.println("La nota es uno.");break;
                case 2: System.out.println("La nota es dos.");break;
                case 3: System.out.println("La nota es tres.");break;
                case 4: System.out.println("La nota es cuatro.");break;
                case 5: System.out.println("La nota es cinco.");break;
                case 6: System.out.println("La nota es seis.");break;
                case 7: System.out.println("La nota es siete.");break;
                case 8: System.out.println("La nota es ocho.");break;
                case 9: System.out.println("La nota es nueve.");break;
                case 10: System.out.println("La nota es diez.");break;
                
            }
        }
        
        public static void nombremes(){
            
            /*Tal y cómo hacía enel método anterior, este otro en lugar de pedir
            *una nota pide un mes para devolverlo en su forma de palabra
            *en estos métodos he usado el sistema de cadena y luego el conversor
            *a entero porque he visto que en los apuntes se usaba mucho y yo venía
            *de usar el método nextDouble o nextInt que me había enseñado un amigo
            *en los casos en los que registro errores, el último no sé cómo se comporta
            */
            Scanner teclado;
            teclado = new Scanner(System.in);
            System.out.println("Introduzca un número del 1 al 12 para indicar el mes que desea:");
            String cadena = teclado.nextLine();
            int mes = Integer.parseInt(cadena);
            
            while(mes < 0 || mes > 12){
                
                System.out.println("No ha introducido un mes válido.");
                System.out.println("Introduzca un mes entre 1 y 12:");
                cadena = teclado.nextLine();
                mes = Integer.parseInt(cadena);
                              
            }
            
            switch(mes){
                
                case 1: System.out.println("El mes es enero.");break;
                case 2: System.out.println("El mes es febrero.");break;
                case 3: System.out.println("El mes es marzo.");break;
                case 4: System.out.println("El mes es abril.");break;
                case 5: System.out.println("El mes es mayo.");break;
                case 6: System.out.println("El mes es junio.");break;
                case 7: System.out.println("El mes es julio.");break;
                case 8: System.out.println("El mes es agosto.");break;
                case 9: System.out.println("El mes septiembre.");break;
                case 10: System.out.println("El mes es octubre.");break;
                case 11: System.out.println("El mes es noviembre.");break;
                case 12: System.out.println("El mes es diciembre.");break;
                
            }
        }
        

}
