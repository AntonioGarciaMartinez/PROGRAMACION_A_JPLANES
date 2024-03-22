/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_refuerzo_tema3;

import java.util.Scanner;

/**
 *
 * @author Antuan
 */
public class Ejercicios_Refuerzo_Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        /*Tomo como ejemplo el men� que se muestra en el v�deo de la UD4:
        *Primero creo dos m�todos en esta misma clase que me van a mostrar el men� por pantalla
        *y me van a recoger la opci�n que elija el usuario
        *despu�s cada opci�n va asignada a un m�todo de distintas clases o de las mismas clases
        *seg�n haya cre�do conveniente o viniera indicado en el ejercicio
        */
        
        int opcion;
        
        do{
            
            mostrarMenu();
            opcion = introducirEntero("Seleccione una de las opciones:");
            
            while(opcion < 1 || opcion > 24){
                System.out.println("Opci�n err�nea.");
                opcion = introducirEntero("Seleccione una de las opciones:");
            }
            
            switch(opcion){
                
                case 1: C243.cuadrado();break;
                case 2: PerimetroRectangulo.perimetro();break;
                case 3: Celsius.tofahrenheit();break;
                case 4: Volumen_area.calculo();break;
                case 5: Pulgadas.pulgadas_pies();break;
                case 6: Energia.teoria();break;
                case 7: Capital.rendimiento();break;
                case 8: EstructuraSeleccion.ecuacionprimergrado();break;
                case 9: EstructuraSeleccion.ecuacionsegundogrado();break;
                case 10: EstructuraSeleccion.kmtomillas();break;
                case 11: EstructuraSeleccion.numeroescrito();break;
                case 12: EstructuraSeleccion.nombremes();break;
                case 13: Potencias2.calculo();break;
                case 14: Cuentanumeros.contar();break;
                case 15: Bucles.mediaCinco();break;
                case 16: Bucles.OrdenDescenciente();break;
                case 17: Bucles.multiplosvarios();break;
                case 18: Bucles.pares();break;
                case 19: Bucles.multiplostres();break;
                case 20: Bucles.conversormilla();break;
                case 21: Bucles.interes();break;
                case 22: Bucles.imc();break;
                case 23: Bucles.medianotas();break;
                default: System.out.println("Programa finalizado correctamente.");                
            }
        }
        while(opcion != 24);
       
       
       
       
    }
    
    public static void mostrarMenu(){
        System.out.println(".-Men� de opciones-.");
        System.out.println("Elija una de las siguientes introduciendo el n�mero correspondiente");
        System.out.println("1. Mostrar el cuadrado de 243.");
        System.out.println("2. Calcular el per�metro de un rect�ngulo.");
        System.out.println("3. Convertir grados Celsius a Fahrenheit.");
        System.out.println("4. Determinar el �rea y volumen de un cilindro.");
        System.out.println("5. Convertir metros a pulgadas y pies.");
        System.out.println("6. Calcular la teor�a de la relatividad E=mc2.");
        System.out.println("7. Mostrar el rendimiento de una inversi�n de capital.");
        System.out.println("8. Solucionar una ecuaci�n de primer grado.");
        System.out.println("9. Solucionar una ecuaci�n de segundo grado.");
        System.out.println("10. Convertir km a millas.");
        System.out.println("11. Convertir una nota num�rica en escrita.");
        System.out.println("12. Pasar un mes en formato num�rico a alfabeto.");
        System.out.println("13. Calcular las potencias de 2 de 0 a 10.");
        System.out.println("14. Calcular cuantos 0 se introducen por teclado.");
        System.out.println("15. Calcular la media de 5 n�meros enteros.");
        System.out.println("16. Mostrar los n�meros en orden descendiente entre dos l�mites.");
        System.out.println("17. Mostrar los m�ltiplos comunes de 5 y 3.");
        System.out.println("18. Calcular cu�ntos pares hay en 10 enteros y la media de los impares.");
        System.out.println("19. Mostrar los m�ltiplos de 3 en [100,150], cu�ntos m�ltiplos de 5 hay y la suma de todos los pares.");
        System.out.println("20. Mostrar dos tablas con la equivalencia de millas na�ticas y terrestres a km [1,100].");
        System.out.println("21. Mostrar el capital obtenido tras n a�os al 2% de inter�s de 6000 euros iniciales.");
        System.out.println("22. Mostrar el IMC de cinco personas con su clasificaci�n.");
        System.out.println("23. Mostrar la media de 15 notas de alumnos.");
        System.out.println("24. Salir del programa.");
    }
    
    public static int introducirEntero(String mensaje){
        
        int opcion;
        Scanner teclado = new Scanner(System.in);
        String cadena;
        
        System.out.println(mensaje);
        cadena = teclado.nextLine();
        opcion = Integer.parseInt(cadena);
        
        return opcion;
    }

  
}
