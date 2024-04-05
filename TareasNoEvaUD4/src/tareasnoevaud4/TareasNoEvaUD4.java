/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareasnoevaud4;

import java.util.Scanner;

/**
 *
 * @author Antuan
 */
public class TareasNoEvaUD4 {

    /**
     * @param args the command line arguments
     * Voy a utilizar esta clase como la principal para deasarrollar las tareas
     * no evaluables del tema 4 que son de los ejercicios propuestos en el tema
     * 2 que no se habían hecho
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**
        * Primero se pide un algoritmo que lea la edad de una persona e indique
        * si es la correcta.
        */
        
        Scanner teclado = new Scanner(System.in);
        String cadena;
        int edad;
        System.out.println("Por favor, indique su edad a continuación (años):");
        cadena = teclado.nextLine();
        edad = Integer.parseInt(cadena);
        
        if(edad < 18){
            System.out.println("Edad no admitida. no puede continuar el programa.");
        }
        
        /**
         * Este segundo calcula el valor de una llamada según se haya hablado menos
         * de tres minutos o más.
         */
        
        double minuto, llamadaBase = 0.25, minutoExtra = 0.06, costExtra;
        System.out.println("Informe de la duración de la llamada en minutos:");
        cadena = teclado.nextLine();
        minuto = Integer.parseInt(cadena);
        
        if(minuto < 3){
            System.out.println("La llamada tiene un coste de 0,25 euros.");
        }
        else{
            
            costExtra = (minuto-3)*minutoExtra;
            System.out.println("La llamada tiene un coste de "+(costExtra+llamadaBase)+" euros.");
        }
        
        /**
         * El siguiente algoritmo calcula si un alumno está aprobado o suspenso
         * según su nota en formato entero
         */
        
        int nota;
        System.out.println("Introduzca la nota del alumno en formato entero:");
        cadena = teclado.nextLine();
        nota = Integer.parseInt(cadena);
        
        if(nota<5){
            System.out.println("El alumno ha suspendido.");
        }
        else{
            System.out.println("El alumno ha aprobado.");
        }
        
        /**
         * El siguiente algoritmo indica si un número es par o impar, es decir,
         * si se puede dividir por 2 o si tiene un resto distinto de 0.
         */
        
        int par;
        System.out.println("Introduzca un número entero:");
        cadena = teclado.nextLine();
        par = Integer.parseInt(cadena);
        
        if(par%2 == 0){
            System.out.println("El número es par.");
        }
        else{
            System.out.println("El número es impar.");
        }
        
        /**
         * El siguiente algoritmo se usa para saber si la nota que se introduce 
         * es correcta o incorrecta. No sé si se refiere a identificarla con un valor
         * pero entiendo que sí y es el que voy a hacer
         */
        
        System.out.println("Introduzca una nota:");
        cadena = teclado.nextLine();
        nota = Integer.parseInt(cadena);
        
        if(nota == 8){
            System.out.println("Sí, 8 es la nota correcta.");
        }
        else{
            System.out.println(nota+" no es la nota correcta.");
        }
        
        /**
         * Este algoritmo comprueba si un año es bisiesto o no, esto creo recordar
         * que se hizo en ejercicios del tema 4
         */
        
        
        System.out.println("Para saber si es bisiesto, introduzca aquí el año:");
        long aniobisiesto = teclado.nextLong();
        System.out.println(aniobisiesto);
        if(aniobisiesto%100 == 0){
            if(aniobisiesto%4 == 0 && aniobisiesto%400 == 0){
                System.out.println("El año "+aniobisiesto+" es bisiesto.");
                
            }
            else{
                System.out.println("El año "+aniobisiesto+" no es bisiesto.");
            }
        }
        else{
            if(aniobisiesto%4 == 0){
            System.out.println("El año "+aniobisiesto+" es bisiesto.");
            }
        }
        
        /**
         * El siguiente algoritmo solo dice si el número entero introducido es
         * -10 o no lo es
         */
        
        teclado.nextLine();
        int negativo;
        System.out.println("Introduzca un número entero:");
        cadena = teclado.nextLine();
        negativo = Integer.parseInt(cadena);
        
        if(negativo == -10){
            System.out.println("El número introducido es -10.");
        }
        else{
            System.out.println("El número introducido no es -10.");
        }
        
        /**
         * El siguiente algoritmo pide 3 números enteros para saber si uno de ellos
         * es la suma de los otros dos. Diseño un método externo para calcular la
         * afirmación
         */
        
        int a, b, c;
        System.out.println("Introduzca un entero:");
        cadena = teclado.nextLine();
        a = Integer.parseInt(cadena);
        
        System.out.println("Introduzca un entero:");
        cadena = teclado.nextLine();
        b = Integer.parseInt(cadena);
        
        System.out.println("Introduzca un entero:");
        cadena = teclado.nextLine();
        c = Integer.parseInt(cadena);
        
        if(sumaSi(a,b,c)){
            System.out.println("Sí, uno de ellos es la suma de los otros.");
        }
        else{
            System.out.println("Ningún número coincide con la suma de los otros dos.");
        }
        
        /**
         * Un algoritmo que calcule el salario de un empleado por horas trabajadas
         * Pasadas las 40h cobrará la hora extra a 1.5 veces el precio ordinario
         */
        
        double horaslaboradas, precioporhora, extra;
        
        System.out.println("¿A cuánto cobra la hora trabajada?");
        cadena = teclado.nextLine();
        precioporhora = Double.parseDouble(cadena);
        System.out.println("¿Cuántas horas ha trabajado esta semana?");
        cadena = teclado.nextLine();
        horaslaboradas = Double.parseDouble(cadena);
        
        if(horaslaboradas <= 40){
            System.out.println("Cobrará un total de "+(precioporhora*horaslaboradas)+" euros.");
        }
        else{
            extra = (horaslaboradas-40)*(1.5*precioporhora);
            System.out.println("Cobrará un total de "+((40*precioporhora)+extra)+" euros.");
        }
        
        /**
         * Llegamos a los ejercicios de alternativa múltiple. El primer algoritmo
         * nos dice si un entero es positivo, negativo o cero
         */
        
        System.out.println("Introduzca un número entero:");
        cadena = teclado.nextLine();
        a = Integer.parseInt(cadena);
        
        if(a > 0){
            System.out.println("El entero es positivo.");
        }
        else{
            if(a == 0){
                System.out.println("El entero es cero.");
            }
            System.out.println("El entero es negativo.");
        }
        
        /**
         * Ahora el algoritmo pide dos enteros para saber cuál es mayor o si son
         * el mismo
         */
        
        System.out.println("Introduzca un número entero:");
        cadena = teclado.nextLine();
        a = Integer.parseInt(cadena);
        System.out.println("Introduzca otro número entero:");
        cadena = teclado.nextLine();
        b = Integer.parseInt(cadena);
        
        if(Math.max(a, b) == a && a != b){
            System.out.println("El mayor de ambos es "+a+".");
        }
        
        else{
            if(Math.max(a, b) == b && a != b){
                System.out.println("El mayor de ambos es "+b+".");
            }
            else{
                System.out.println("Son los dos números iguales.");
            }
        }
        
        /**
         * El siguiente algoritmo quiere poner una calificación al alumno según
         * la nota que haya sacado
         */
        
        int calif;
        double aux;
        System.out.println("Introduzca la calificación del alumno:");
        aux = teclado.nextDouble();
        calif = (int) Math.floor(aux);
        switch(calif){
            
        case 0: System.out.println("SUSPENSO");break;
        case 1: System.out.println("SUSPENSO");break;
        case 2: System.out.println("SUSPENSO");break;
        case 3: System.out.println("SUSPENSO");break;
        case 4: System.out.println("SUSPENSO");break;
        case 5: System.out.println("APROBADO");break;
        case 6: System.out.println("BIEN");break;
        case 7: System.out.println("NOTABLE");break;
        case 8: System.out.println("NOTABLE");break;
        case 9: System.out.println("SOBRESALIENTE");break;
        case 10: System.out.println("SOBRESALIENTE");break;
            
        }
        
        /**
         * El siguiente algoritmo pide lo mismo pero con un entero. Yo en el anterior
         * me he valido de un método de math para transformar el real en entero
         * y así poder usar una estructura de switch, porque anidar if-else se me
         * hacía demasiado pesado en código, pero de tener que usar dos, en el primero
         * usaría la anidación y en este el caso anterior
         */
        
        System.out.println("Introduzca la calificación del alumno:");
        aux = teclado.nextDouble();
        calif = (int) Math.floor(aux);
        
        if(aux < 5){
            System.out.println("SUSPENSO");
        }
        else{
            if(aux >= 5 && aux < 6){
                System.out.println("APROBADO");
            }
            else{
                if(aux >= 6 && aux < 7){
                    System.out.println("BIEN");
                }
                else{
                    if(aux >= 7 && aux < 9){
                        System.out.println("NOTABLE");
                    }
                    else{
                        System.out.println("SOBRESALIENTE");
                    }
                }
            }
        }
        
        /**
         * El siguiente algoritmo se diseña para mostrar el día de la semana
         * habiendo comprobado previamente que el número introducido está entre
         * el 1 y el 7
         */
        
        int dia;
        
        System.out.println("Introduzca un número del 1 al 7.");
        dia = teclado.nextInt();
                    
        while(dia < 1 || dia > 7){
        System.out.println("Opción errónea.");
        System.out.println("El número introducido debe estar comprendido entre el 1 y el 7.");
        dia = teclado.nextInt();
        
        }
            
        switch(dia){
                
        case 1: System.out.println("Es lunes.");break;
        case 2: System.out.println("Es martes.");break;
        case 3: System.out.println("Es miércoles.");;break;
        case 4: System.out.println("Es jueves.");;break;
        case 5: System.out.println("Es viernes.");;break;
        case 6: System.out.println("Es sábado.");;break;
        case 7: System.out.println("Es domingo.");;break;
        }
        
        /**
         * El siguiente algoritmo lee una letra para asignarle un valor de calificación
         * según el sistema de Nueva Zelanda
         */
        
        teclado.nextLine();
        System.out.println("Introduzca la calificación correspondiente (A, B, C, D o E).");
        String cadena2 = teclado.nextLine();
        char nzel = cadena2.charAt(0);
        
        switch(nzel){
            
            case 'A': System.out.println("La calificación es de 9-10 puntos.");break;
            case 'B': System.out.println("La calificación es de 7-8 puntos.");break;
            case 'C': System.out.println("La calificación es de 5-6-7 puntos.");break;
            case 'D': System.out.println("La calificación es de 3-4 puntos.");break;
            case 'E': System.out.println("La calificación es de 0-1-2 puntos.");break;
        }
        
        /**
         * En el siguiente algoritmo pedimos la hora, minutos y segundos y queremos
         * que se muestre la hora al segundo siguiente
         */
        
        int hora, min, seg;
        System.out.println("Introduzca primero la hora actual.");
        hora = teclado.nextInt();
        System.out.println("Introduzca ahora los minutos.");
        min = teclado.nextInt();
        System.out.println("Introduzca ahora los segundos.");
        seg = teclado.nextInt()+1;
                
        if(seg ==60){
            min++;
            if(min == 60){
                hora++;
                System.out.println("Son las "+hora+":00:00 horas.");
            }
            else{
                System.out.println("Son las "+hora+":"+min+":00 horas.");
            }
        }
        else{
            System.out.println("Son las "+hora+":"+min+":"+seg+" horas.");
        }
        
        /**
         * El siguiente algoritmo recoge 3 enteros y muestra el menor de todos
         */
        
        System.out.println("Introduzca un número entero:");
        a = teclado.nextInt();
        System.out.println("Introduzca otro número entero:");
        b = teclado.nextInt();
        System.out.println("Introduzca otro número entero:");
        c = teclado.nextInt();
        
        if(a==b && a==c){
            System.out.println("Son todos iguales.");
        }
        else{
            if(Math.min(a, b) == a && a != b){
            
                if(Math.min(a, c) == c && a != c){
                    System.out.println("El menor de todos es "+c+".");
                }
                else{
                    System.out.println("El menor de todos es "+a+".");
                }
            }
        
            else{
                if(Math.min(b, c) == b && c != b){
                    System.out.println("El menor de todos es "+b+".");
                }
                else{
                    System.out.println("El menor de todos es "+c+".");
                }
            }
        }
        
        
    }
    
    public static boolean sumaSi(int a, int b, int c){
        
        return a == b +c || b == a + c || c == a + b;
    }
}
