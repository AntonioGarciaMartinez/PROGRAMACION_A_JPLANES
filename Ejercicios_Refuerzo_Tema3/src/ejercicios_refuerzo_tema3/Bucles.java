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
public class Bucles {
    
    /*Para el resto de ejercicios de bucles decido crear una clase en la que 
    *los englobo todos ya que el enunciado no dice nada de crear clases individuales
    */
    public static void mediaCinco(){
        
        /*Queremos que el usuario nos dé 5 números y luego los vamos a sumar y 
        *hacer su medi arimética. Inicializamos las variables y con un for creo
        *el bucle que terminará a las 5 iteraciones. Aquí no se ha preparado una
        *recogida de posible excepciones
        */
        Scanner teclado = new Scanner(System.in);
        String cadena;
        double suma = 0, media;
        
        for (int i = 0; i < 5; i++) {
            
            System.out.println("Introduzca un número entero:");
            cadena = teclado.nextLine();
            suma = suma + Integer.parseInt(cadena);
            
        }
        
        media = suma/5;
        System.out.println("La media de los 5 números introducidos es "+media+".");
    }
    
    public static void OrdenDescenciente(){
        
        /*Este método nos vale para practicar el uso de variables auxiliares
        *Queremos que nos den dos números que son los límites para hacer una lista
        *de números en orden descendiente del más alto al más bajo
        *El if nos ayuda a asignar el valor más alto siempre a la variable lim1
        *Después solo hace falta un do while para que muestre todo hasta llegar al
        *primer valor más pequeño que lim2
        */
        Scanner teclado = new Scanner(System.in);
        String cadena;
        
        System.out.println("Vamos a mostrar los números en orden descendiente entre dos límites. Introduzca el primer límite:");
        cadena = teclado.nextLine();
        int lim1 = Integer.parseInt(cadena);
        System.out.println("Introduzca el segundo límite:");
        cadena = teclado.nextLine();
        int lim2 = Integer.parseInt(cadena);
        
        int aux;
        if (lim1<lim2){
            aux = lim1;
            lim1 = lim2;
            lim2 = aux;
        }

        System.out.println("Los números en orden descendente de "+lim1+" a "+lim2+" son:");
        do{
            System.out.println(lim1);
            lim1--;
        }
        while(lim1>=lim2);
        
    }
    
    public static void multiplosvarios(){
        
        /*aquí queremos con un while mostrar los múltiplos comunes de 3 y 5
        *entre el 20 y el 200, por eso inicializo el contador i en 20 y el límite
        *del while en 201, si los restos de el contador son cero, entonces es que
        *múltiplo de 3 y 5, también podría haber hecho la multiplicación de 3 y 5
        *ya que todos sus múltiplos son exactamente múltiplos de 15
        */
        int a = 5, b = 3;
        int i = 20;
        
        while(i<201){
            
            if(i%5 == 0 && i%3 == 0){
                System.out.println(i+" es un múltiplo común de "+a+" y "+b+".");
                i++;
            }
            
            i++;
        }
                
    }
    
    public static void pares(){
        
        /*En este método nos han pedido que de 10 números enteros ingresados por el
        *usuario digamos cuántos son pares y la media de la suma de impares
        *con un for hasta 10 voy a recoger 10 números; una vez recogido, dentro analizo
        *si es par y ese contador suma 1, si es impar me quedo su valor para sumarle
        *los que vengan luego, fuera del bucle me hará la media de ese sumatorio y
        *mostraré cómo ha quedado el contador de impares
        *NOTA: al salir del bucle quise usar el valor de i en el cálculo de la media
        *ya que eltotal de impares que se registra es 10 - los pares que están en su
        *contador, pero me grababa mal el número y lo dejé sencillo porque sabía
        *que eran 10, entiendo que el valor final de i es 11 porque ahí es cuando
        *sale del bucle, pero si le ponía i-1-contador, no me salía bien y seguí adelante...
        */
        Scanner teclado = new Scanner(System.in);
        String cadena;
        int contadorpar = 0, i = 0;
        double sumatorioimpar = 0;
        
        for (; i < 10; i++) {
            
            System.out.println("Introduzca un número entero:");
            cadena = teclado.nextLine();
            int entero = Integer.parseInt(cadena);
            
            if(entero%2 ==0){
                contadorpar++;
            }
            else{
                sumatorioimpar = sumatorioimpar + entero;
            }
            
        }
        
        double mediaimpar = sumatorioimpar/(10-contadorpar);
        System.out.println("Hay un total de "+contadorpar+" números pares.");
        System.out.println("La media aritmética de los números impares es "+mediaimpar);
    }
    
    public static void multiplostres(){
        
        /*Este método es parecido al de los múltiplos comunes, pero pide cosas distintas
        *así que he pensado usar un while con condicionales anidados dentro
        *si el resto del contador muestra que es múltiplo de 3, lo da por pantalla
        *si es múltiplo de cinco lo almacena en su contador y si es par, lo va sumando
        *El método me da estos dos últimos datos una vez ha finalizado el bucle
        */
        int a = 5, b = 3;
        int i = 100;
        int cuentacinco = 0, sumapares = 0;
        
        while(i<151){
            
            if(i%3 == 0){
                System.out.println(i+" es un múltiplo de "+b+".");
                
            }
            if(i%5 == 0){
                cuentacinco++;
                                
            }
            if(i%2 == 0){
                sumapares = sumapares +i;
            }
            i++;
        }
        
        System.out.println("Hay un total de "+cuentacinco+" múltiplos de 5 en [100,150] y la suma de todos los pares es "+sumapares+".");
        
    }
    
    public static void conversormilla(){
        
        /*Este método me ha recordado al vídeo en el que la docente muestra las
        *tablas de multiplicar y creo que he hecho lo mismo. El contador i lo inicio
        *en 1 porque voy a multiplicar las millas por ese valor. Utilizo dos bucles
        *idénticos ya que lo único que cambia el valor de una milla náutica o
        *terrestre. Lo que sí he hecho porque me daba TOC ha sido formatear la salida
        *de la equivalencia para que me pusiera como mucho 3 decimales
        */
        final double mnautica = 1.852;
        final double mterrestre = 1.609;
                
        for (int i = 1; i < 101; i++) {
            
            if(i==1){
                
                System.out.println(i+" milla náutica equivale a "+(i*mnautica)+" km.");
            }
            System.out.print(i+" millas náuticas equivalen a ");
            System.out.printf("%.3f",(i*mnautica));
            System.out.println(" km.");
        }
        
        for (int j = 1; j < 101; j++) {
           
        if(j==1){
                
                System.out.println(j+" milla terrestre equivale a "+(j*mterrestre)+" km.");
            }
            System.out.print(j+" millas terrestres equivalen a ");
            System.out.printf("%.3f",(j*mterrestre));
            System.out.println(" km.");
            
        }
    }
    
    public static void interes(){
        
        /*Este ejercicio es parecido a uno de la primera tanda, solo que aquí solo
        *pedimos al usuario que dé un valor en años para ver cómo crece su capital
        *No he usado ningún bucle así que sospecho que no es lo que se buscaba, pero no sabía
        *si tal vez se buscaba el crecimiento año a año de ese capital o no
        */
        Scanner teclado;
        teclado = new Scanner(System.in);
        String cadena;
        int capital = 6000, tipoInt = 2, tiempoInv;
        double rendimiento;
               
        System.out.println("Introduzca el tiempo que dura su inversión en años:");
        cadena = teclado.nextLine();
        tiempoInv = Integer.parseInt(cadena);
        
        rendimiento = capital*tipoInt*tiempoInv/100;
        System.out.println("El capital inicial se convertirá en "+rendimiento+" euros a los "+tiempoInv+" años.");
    }
    
    public static void imc(){
        
        /*En este método que está diseñado para pedir el peso y altura de una persona
        *y darle su imc he tenido que decidir que usaría 4 categorías de clasificación
        *según el imc y las he creado en un if-else anidado. Para pedir el peso y altura
        *se le pide a 5 personas, de ahí el uso del bucle for.
        *Me volví loco porque al dividir estatura por 100 me salía siempre 1 y era porque
        *había declarado esa variable como entera así que me la reducía a 1 y el imc me
        *salía igual al peso. Tengo la intuición de que podría haberlo optimizado
        */
        Scanner teclado;
        teclado = new Scanner(System.in);
        String cadena;
        double peso, aux, imc, estatura;
        
        for (int i = 1; i < 6; i++) {
            
            System.out.println("Introduzca el peso en kg.:");
            cadena = teclado.nextLine();
            peso = Double.parseDouble(cadena);
            
            System.out.println("Introduzca la altura en cm.:");
            cadena = teclado.nextLine();
            estatura = Integer.parseInt(cadena);
            aux = estatura/100;
            imc = peso/(aux*aux);
            
            if(imc <18.5){
                
                System.out.print("Es una persona que tiene bajo peso. Su IMC es ");
                System.out.printf("%.3f", imc);
                System.out.println(" kg/m2.");
            }
            else{
                if(imc<24.9){
                    
                    System.out.print("Es una persona que tiene peso normal. Su IMC es ");
                    System.out.printf("%.3f", imc);
                    System.out.println(" kg/m2.");
                }
                else{
                    if(imc<29.9){
                        
                        System.out.print("Es una persona que tiene sobrepeso. Su IMC es ");
                        System.out.printf("%.3f", imc);
                        System.out.println(" kg/m2.");
                    }
                    else{
                        System.out.print("Es una persona con obesidad. Su IMC es ");
                        System.out.printf("%.3f", imc);
                        System.out.println(" kg/m2.");
                    }
                }
            }
        }
    }
    
    public static void medianotas(){
        
        /*Finalmente queremos pedirle al usuario 15 notas que se ajusten enter 0 y 10
        *Me he vuelto loco queriendo meter recogida de excepciones en el for, fuera del
        *for intentando imitar la estructura de la clase principal, pero luego me he
        *dado cuenta de que un solo for con condcionales podía hacer el trabajo
        *No sé si lo podría haber hecho de forma más óptima, pero así me ha funcionado
        *Igual que en el método de km a millas he querido darle formato para que no
        *saliera un real demasiado loco
        */
        int nota = 0, total = 0;
        double media;

        String cadena;
        Scanner teclado;
        teclado = new Scanner(System.in);
            
        
        for (int i = 0; i < 15;) {
            
            
            System.out.println("Introduza una nota entera comprendida entre 0 y 10.");
            cadena = teclado.nextLine();
            nota = Integer.parseInt(cadena);
                
            if(nota<0 || nota>10){
                
                System.out.println("Este número no es válido, ajústese a los valores.");
                System.out.println("Introduza una nota entera comprendida entre 0 y 10.");
                cadena = teclado.nextLine();
                nota = Integer.parseInt(cadena);
                
            }
            else{
                
            total = total + nota;
            i++;
            
            }
                                
                
        }
        media = (double)total/15;
        System.out.print("La media aritmética de las notas es :");
        System.out.printf("%.2f",media);
        System.out.println(".");
            
    }
   
}
