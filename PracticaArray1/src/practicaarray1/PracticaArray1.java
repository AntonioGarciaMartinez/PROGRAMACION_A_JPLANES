/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaarray1;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Antuan
 */
public class PracticaArray1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**
         * Esta sería la declaración y creación de la variable que recogería
         * el número de alumnos matriculados en 4 institutos y 5 niveles de estudios
         * por eso su primer array tiene un tamaño de 4, el segundo de 5 por los niveles
         * y el tercero se definiría especificando cuántos alumnos hay en cada nivel de
         * cada instituto
         */
        
        int alumMatriculados[][];
        alumMatriculados = new int[4][5];
        
        /**
         * Por ejemplo la posición alumMatriculados [0][0], mostraría los 'x' matriculados
         * en el primer centro que cursen la ESO.
         */
        
        /**
         * Ahora se pide que declare y cree una variable que contenga la nota de 4 alumnos en sus módulos
         * El primero nota[0][] cursa 4 módulos, el segundo nota[1][] cursa 7, el tercero nota[2][]
         * cursa 3 y el cuarto nota[3][] cursa 2.
         * La tercera 
         */
        
        int [][]nota = new int[4][];
        nota[0]= new int[4];
        nota[1] = new int[7];
        nota[2] = new int[3];
        nota[3] = new int[2];
        
        /**
         * Si me piden ahora guardar nombres de alumnos por módulos en el ciclo y sabemos que hay
         * 21 en SI, 17 en BD, 30 en PROG, 14 en LengMarcas y 25 en Entornos
         */
        
        String matriculados[][] = new String[5][];
        matriculados[0] = new String[21];
        matriculados[1] = new String[17];
        matriculados[2] = new String[30];
        matriculados[3] = new String[14];
        matriculados[4] = new String[25];
        
        /**
         * Se queda preparado a falta de un método que pida al usuario introducir
         * los nombres de los alumnos de cada módulo y registrar uno por hueco de
         * la matriz
         * El último elemento de esta matriz por ejemplo, sería el matriculados[4][25]
         * o lo que es lo mismo matriculados.length-1, matriculados[matriculados.length-1].lenght-1
         */
        
        /**
         * Aquí procedo a copiar los ejemplos singulares de teoría o al menos parte
         * para experimentar más con los contenidos.
         */
        
        Scanner teclado = new Scanner (System.in);
        int ejemplo1[] = new int[10];
        for (int i = 0; i < ejemplo1.length; i++) {
            System.out.println("Introduce un entero:");
            ejemplo1[i] = teclado.nextInt();
            
        }
        
        /**
         * Aquí declaro el ejemplo dos sin necesidad de recurrir a una creación con
         * new. Directamente especifico su longitud al especificar los elementos
         * que contiene
         */
        
        int ejemplo2[][] = {{5,6},{-6,56},{4,-7},{36,-11}};
        for (int i = 0; i < ejemplo2.length; i++) {
            
            for (int j = 0; j < ejemplo2[0].length; j++) {
                System.out.println(ejemplo2[i][j]+" ");
                
            }
            
        }
        
        /**
         * Este es el ejemplo3 con dos métodos que trabajan con un array
         * para que sus valores se inicien debo crearlo al introducir el tam 
         */
        
        int ejemplo3[];
        int tam;
        System.out.println("Introduzca el tamaño del array:");
        tam = teclado.nextInt();
        ejemplo3 = new int[tam];
        mostrarArrayUnidim(ejemplo3);
        ejemplo3 = crearArrayUnidim(tam);
        mostrarArrayUnidim(ejemplo3);
        
        /**
         * Para el ejemplo 4 el array es bidimensional y le tengo que dar un tamaño
         * a sus filas y a sus columnas para mandarlo al método de creación aleatoria
         * de sus elementos. Sigue exactamente la misma estructura anterior, pero
         * requiere dos dimensiones en lugar de una
         */
        
        int ejemplo4[][];
        System.out.println("Va a crear una matriz bidimensional.");
        System.out.println("Introduzca el número de filas del array:");
        int filas = teclado.nextInt();
        System.out.println("Introdduzca el número de columnas del array:");
        int columnas = teclado.nextInt();
        
        ejemplo4 = new int[filas][columnas];
        mostrarArrayBidim(ejemplo4);
        ejemplo4 = crearArrayBidim(filas, columnas);
        mostrarArrayBidim(ejemplo4);
    }

    /**
     * Estos dos métodos son del ejemplo 3 para mostrar un array unidim
     * y para crear aleatoriamente un array unidim
     * @param a 
     */
public static void mostrarArrayUnidim(int a[]){
    
    System.out.println("**************************");
    for (int i = 0; i < a.length; i++) {
        System.out.println(a[i]+" ");
        
    }
}

public static int[] crearArrayUnidim(int tam){
    
    int nuevoarray[];
    nuevoarray = new int[tam];
    Random aleatorio = new Random();
    
    for (int i = 0; i < nuevoarray.length; i++) {
        nuevoarray[i] = aleatorio.nextInt(-630,720);
        
    }
    return nuevoarray;
}

public static void mostrarArrayBidim(int a[][]){
    
    System.out.println("**************************");
    
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[0].length; j++) {
            System.out.print(a[i][j]+" ");
            
        }
        System.out.println("|");
    }
}

public static int[][] crearArrayBidim(int filas, int columnas){
    
    int nuevoarray[][];
    nuevoarray = new int[filas][columnas];
    Random aleatorio = new Random();
    
    for (int i = 0; i < filas; i++) {
        for (int j = 0; j < columnas; j++) {
            nuevoarray[i][j] = aleatorio.nextInt(-120,240);
            
        }
        
    }
    return nuevoarray;
}
    
}
