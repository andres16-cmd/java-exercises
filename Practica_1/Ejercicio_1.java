
package Practica_1;

//Paso 1: Importar la funcionalidad para lectura de datos
import PaqueteLectura.Lector;

public class Ejercicio_1 {
    public static void main (String[] args){
        //Paso 2: Declarar y crear el vector para 15 double 
        
        int dimF = 15;
        double [] vector = new double[dimF];
        
        //Paso 3: Ingresar 15 numeros (altura), cargarlos en el vector, 
        //        ir calculando la suma de alturas sobre variable auxiliar
        
        double total = 0;
    
        
        for (int i=0; i<dimF; i++){
            System.out.print("Ingrese una Altura: ");
            double altura = Lector.leerDouble();
            
            vector[i] = altura;
            
            total = total + altura;
        }
        
        //Paso 4: Calcular el promedio de alturas e informar.
        
        double promedio;
        
        promedio = total / dimF;
        
        System.out.println("El Promedio de las Alturas fue de -> ["+ promedio+ "]");
        
        //Paso 5: Recorrer el vector calculando lo pedido (cant. alturas que están por encima del promedio)
        
        int contador = 0;
        
        for (int l =0; l < dimF; l++){
            
            if (vector[l] > promedio){
                contador++;
            }
        }
        
        //Paso 6: Informar la cantidad.
        
        System.out.println("La Cantida de Alturas que superan el promedio fue de -> ["+ contador + "]");
    }
}
