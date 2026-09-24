
package Practica_1;

import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;

public class Ejercicio_3 {
    
    public static void main (String[] args){
        
        GeneradorAleatorio.iniciar();
        
        /*Un teatro realizó durante los 7 días de la semana 4 funciones 
        diarias. Escriba un programa que cargue en una estructura la 
        cantidad de espectadores que concurrieron a cada día/función*/
        int dia = 7;
        int funcion = 4;
        
        int teatro [][] = new int [funcion][dia];
        
        // Cargamos la informacion a la Matriz(teatro).
        int i,j;
        
        for (i=0; i < funcion; i++){
            for (j=0; j < dia; j++) {
                teatro[i][j] = GeneradorAleatorio.generarInt(200);
            }
        }
        
        // Imprimimos la Matriz(teatro) para asi confirmar la info.
        for (i=0; i < funcion; i++){
                System.out.print("|");
            for (j=0; j < dia; j++){
                System.out.print(teatro[i][j] + "|");
            }
                System.out.println(" ");
                System.out.println("----------------------");
        }
        // Una vez cargada, realice recorridos independientes para:
        
        /*Dado un día (int) leído de teclado, informar la cantidad 
        de espectadores que concurrieron a cada función en ese día.*/
        
        System.out.print("Ingrese un dia a informar: ");
        int valor = Lector.leerInt();
        
        for(j=0; j < funcion; j++){
            System.out.println("Funcion -> ["+ j +"] tuvo -> ["+ teatro[j][valor]+"] espectador/es");
        }
        
        
        /*Dada una función (int) leída de teclado, informar la cantidad
        de espectadores que concurrieron en cada día a esa función.*/
        System.out.print("Ingrese la funcion a informar: ");
        int valor2 = Lector.leerInt();
        
        for(i=0; i < dia; i++){ 
            System.out.println("Dia -> ["+ i + "] tuvo -> ["+ teatro[valor2][i]+ "] espectador/es");
        }
        
        
        //Informar en qué día y función hubo más espectadores.
        int mayor = -1;
        int dMax = 0;
        int fMax = 0;
        
        for(i=0; i < funcion; i++){
            for(j=0; j < dia; j++){
                
                if (teatro[i][j] > mayor){
                    mayor = teatro[i][j];
                    fMax = i;
                    dMax = j;
                }
            }
        }
        
        System.out.println("La Funcion y dia con mas espectadores fue -> ["+ fMax +","+ dMax+"] con -> "+ mayor +" espectador/es");
        
    }
}
