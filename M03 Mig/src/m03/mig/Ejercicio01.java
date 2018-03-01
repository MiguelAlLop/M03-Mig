
package m03.mig;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ejercicio01 {

 //Creamos las funciones fuera del main
    
   
    
     /**
      *Pide un numero entero entre 1 y 4.
      *Le tienes que pasar una String y te devuelve un valor int
      */
     
        
        
    public static int pideEntero (String pregunta){

         int numero1=0;            
        try {
            System.out.println(pregunta);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String texto;
            texto = br.readLine();
            numero1 = Integer.parseInt(texto);
        } catch (IOException | NumberFormatException excep) {
            System.out.println("Error al introducir datos por consola, por favor vuelvalo a intentar.");
            numero1=pideEntero(pregunta);
        } 
     if(numero1<1 || numero1>4){
         System.out.println("Por favor, introduce una opcion valida del menu.");
    }
     return numero1; 
    }
    
    /**
      *Pide un numero double cualquiera
      *Le tienes que pasar una String y te devuelve un valor double
      */
    
     public static double pideDouble (String pregunta){
         double numero2=0;            
        try {
            System.out.println(pregunta);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String texto;
            texto = br.readLine();
            numero2 = Double.parseDouble(texto);
        } catch (IOException | NumberFormatException excep) {
            System.out.println("Error al introducir datos por consola, por favor vuelvalo a intentar.");
            numero2=pideDouble(pregunta);
        } 
     
    return numero2;
    }
    
     /**
      *Pide tres numeros double y los compara.
      */
     
   public static void mayorDe3 (){
                     
         System.out.println("¿Cual es el mayor de los 3?");
                  double numero3 = pideDouble("Introduzca el primer número");
                  double numero4 = pideDouble("Introduzca el segundo número");
                  double numero5 = pideDouble("Introduzca el tercer número");
                  
                  if(numero3 > numero4)
           if(numero3>numero5)
              System.out.println("El mayor es: " + numero3);
           else
              System.out.println("el mayor es: " + numero5);
        else if(numero4>numero5)
              System.out.println("el mayor es: " + numero4);
                else
              System.out.println("el mayor es: " + numero5);
                  
                  System.out.println("Gracias por usar nuestro comparador.");
    }
    /**
      *Pide un numero entero entre 1 y 7.
      *Te devuelve el dia de la semana que se corresponde a ese numero.
      */
       public static void diaSemana (){
           
           int nDia=0;
           System.out.println("Introduce un numero para saber el dia de la semana.");
        try {       
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String texto;
            texto = br.readLine();
            nDia = Integer.parseInt(texto);
        } catch (IOException | NumberFormatException excep) {
            System.out.println("Error al introducir datos por consola, por favor vuelvalo a intentar.");
            diaSemana();
        } 
         
         switch (nDia) {
             
             case 1:
                 System.out.println("El dia de la semana es: Lunes");  
                 System.out.println("Gracias por usar nuestro sistema para averiguar el dia de la semana.");
              break;        
             case 2:
               System.out.println("El dia de la semana es: Martes");
               System.out.println("Gracias por usar nuestro sistema para averiguar el dia de la semana.");
              break;
             case 3:
               System.out.println("El dia de la semana es: Miercoles");
               System.out.println("Gracias por usar nuestro sistema para averiguar el dia de la semana.");
              break;
             case 4:
                 System.out.println("El dia de la semana es: Jueves");
                 System.out.println("Gracias por usar nuestro sistema para averiguar el dia de la semana.");
              break;  
             case 5:
               System.out.println("El dia de la semana es: Viernes");
               System.out.println("Gracias por usar nuestro sistema para averiguar el dia de la semana.");
              break;
             case 6:
                 System.out.println("El dia de la semana es: Sabado");
                 System.out.println("Gracias por usar nuestro sistema para averiguar el dia de la semana.");
              break;
             case 7:    
               System.out.println("El dia de la semana es: Domingo");
               System.out.println("Gracias por usar nuestro sistema para averiguar el dia de la semana.");
              break; 
              default:
                  System.out.println("Por favor, introduce un valor entre 1 y 7");
                  diaSemana(); 
                  break;
              }       
           
    } 
     
     /**
      * Pide numeros double hasta que introduces uno mayor que 50;
      * te muestra los intentos realizados.
      */
    public static void mayor50 (){
      
        double n50=0;
        int intentos=0;
        
        while(n50<51){
        
      n50 = pideDouble("Introduzca un numero mayor que 50");
        
      intentos++;
      
        }
        System.out.println("El valor ultimo valor indicado ha sido: "+ n50+". Por lo tanto es mayor que 50!");
        System.out.println("El numero de intentos ha sido: "+intentos+".");
        
        
    } 
     
    public static void main(String[] args) {      
      int numero1=10; 
      while (numero1 !=4){
      do{
          System.out.println("Menú:");
          System.out.println("1- Comparador de numeros.");
          System.out.println("2- Dias de la semana.");
          System.out.println("3- Mayor que 50.");
          System.out.println("4- Salir.");
          numero1 = pideEntero("¿Que opcion del menu eliges?");  
                
      
      }while(numero1>4 || numero1<1);
          System.out.println("La opcion elegida es: " + numero1);
  
          
          switch (numero1){
          
              case 1:
                  mayorDe3 ();
              break;
              
              case 2:  
                  diaSemana ();
                  break;
                  
              case 3:
                  mayor50();
                  break;
                  
              case 4:  
                  System.out.println("Muchas gracias por usar nuestro programa. Que tenga un buen dia.");;  
                  break;
     
          
          
          }
          
          
          
          
              
              }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
  }
      
      
      
      
      
    }
    

