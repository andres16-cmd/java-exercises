package Practica_1;

import PaqueteLectura.Lector;

public class Ejercicio_4 {
    public static void main (String[] args){
        
        // Constantes.
        int fin = 9;
        int dimPisos = 8;
        int dimOficinas = 4;
        
        // Creamos la Matriz(edificio).
        int [][] edificio = new int [dimPisos][dimOficinas];
        
        // Inicializamos todos los pisos y oficinas en 0.
        for (int i=0; i < dimPisos; i++){
            for (int j=0; j < dimOficinas; j++){
                edificio[i][j] = 0;
            }
        }
        
        // Ingresamos los datos a la Matriz(edificio).
        
        System.out.println("Informacion de la visita al Edificio");
        
        System.out.print("Ingrese el nro de Piso: ");
        int piso = Lector.leerInt();
        
        while (piso != fin){
            System.out.print("Ingrese el nro de Oficina: ");
            int oficina = Lector.leerInt();
            
            edificio[piso][oficina] = edificio[piso][oficina] + 1;
            
            System.out.print("Ingrese el nro de Piso: ");
            piso = Lector.leerInt();
        }
        
        
        // Imprimimos la Matriz(edificio).
        for (int i=0; i < dimPisos; i++){
                System.out.print("|");
            for(int j=0; j < dimOficinas; j++){
                System.out.print(edificio[i][j] + "|");
            }
  
                System.out.println("");
        }
        
        /*
        //Informamos de otra manera.
        for (int i=0; i < dimPisos; i++){
            for (int j=0; j < dimOficinas; j++){
                System.out.println("Cantidad de Personas en el Piso y Oficina ["+ i +","+ j + "] fueron -> ["+ edificio[i][j] +"]");
            }
        }*/
        
    }
}
