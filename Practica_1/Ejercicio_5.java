package Practica_1;

import PaqueteLectura.Lector;

public class Ejercicio_5 {
    public static void main(String[] args){
        
        // Constantes.
        int dimClientes = 5;
        int dimAspectos = 4;
        
        // Creamos la Matriz(calificacion).
        int [][] calificacion = new int [dimClientes] [dimAspectos];
        
        // Variables de recorrido de estructura.
        int i,j;
        
        // Cargamos la Matriz(calificacion).
        
        for (i=0; i < dimClientes; i++){
            
            System.out.println("Cliente -> ["+ (i+1) +"]");
            
            for (j=0; j < dimAspectos; j++){
                
                System.out.print("Ingrese su Calificacion del Aspecto ["+ j +"]: ");
                int dato = Lector.leerInt();
                
                calificacion[i][j] = dato;
            }
        }
        
        
        // Calificacion promedio de cada Aspecto.
        for (j=0; j < dimAspectos; j++){
            
            double total = 0;
            
            for (i=0; i < dimClientes; i++){
                
                total = total + calificacion[i][j];
            }
            
            double prom;
            
            prom = total / dimClientes;
            
            System.out.println("Promedio del Aspecto ["+ j +"] fue de -> [ "+ prom +"]");
        }
    }
}
