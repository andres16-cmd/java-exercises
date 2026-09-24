package Practica_1;

 import PaqueteLectura.GeneradorAleatorio;
 import PaqueteLectura.Lector;

public class Ejercicio_2 {
    
    public static void main(String[] args){
            
            // Declarar Constantes para usar en la Matriz.
            int dimFila = 5;
            int dimColumna = 5;
            
            // Creamos la Matriz.
            int [][] matriz = new int [dimFila][dimColumna];
            
            // Cargamos la Matriz con numeros entre 0 y 30.
            
            int f,c;// Definimos variables de la Matriz.
            
            for (f=0; f < dimFila; f++){
                for (c=0; c < dimColumna; c++){
                    matriz[f][c] = GeneradorAleatorio.generarInt(30);
                }
            }
    
            // Mostrar el contenido de la matriz en consola. 
            for (f=0; f < dimFila; f++){
                    System.out.print("|");
                for(c=0; c < dimColumna; c++){
                    System.out.print(matriz[f][c] + " |");
       
                }
                    System.out.println();
                    System.out.println("------------------");
            }
            
            //Calcular e informar la suma de los elementos de la fila 1
            int suma = 0;
            
            for(c=0; c < dimColumna; c++){
                suma = suma + matriz[1][c];
            }
            
            System.out.println("La Suma de los Elementos de la Fila '1' es de -> ["+ suma + "]");
    
            /* Generar un vector de 5 posiciones donde cada posición j 
             contiene la suma de los elementos de la columna j de la 
             matriz. Luego, imprima el vector.*/
    
            // Creamos el vector.
            int dimF = 5; // Difinimos Constante de dimension Fisica del Vector. 
           
            int [] vector = new int [dimF];
            

            for (c=0; c < dimColumna; c++){
                int total = 0;
                
                for (f=0; f < dimFila; f++){
                    total = total + matriz[f][c];
                }
                vector [c] = total;
            }
            
            // Impresion del Vector.
            for (int i=0; i < dimF; i++){
                System.out.println("Pos. "+ i +" tiene -> ["+ vector[i]+"]");
            }
            
            /*Leer un valor entero e indicar si se encuentra o no 
            en la matriz. En caso de encontrarse indique su 
            ubicación (fila y columna) en caso contrario imprima 
            “No se encontró el elemento”.*/
            
            // Leemos valor entero.
            System.out.print("Ingrese un valor entero: ");
            int valor = Lector.leerInt();
            
            boolean ok = false;
            int pos1 = -1;
            int pos2 = -1;
            
            for (f=0; f < dimFila && ok == false; f++){
                for (c=0; c < dimColumna && ok == false; c++){
                    
                    if (matriz[f][c] == valor){
                        ok = true;
                        pos1= f;
                        pos2= c;
                    }
                }
            }
            
            // Evaluamos que pasa por el recorrido de la Matriz.
            if (ok == true){
                System.out.print("Posicion en la Matriz");
                System.out.print("|"+ pos1 + ","+ pos2 +"|");
            }
            else
                System.out.println("No se encontro el elemento.");
    }       
}
