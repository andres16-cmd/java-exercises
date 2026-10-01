/*Utilizando la clase Persona. Realice un programa 
que almacene en un vector a lo sumo 15 personas. 
La información (nombre, DNI, edad) se debe generar 
aleatoriamente hasta obtener edad 0.*/

package Practica_2;

import PaqueteLectura.GeneradorAleatorio;

public class Ejercicio_2 {
    public static void main(String[] args){
        
        GeneradorAleatorio.iniciar();
        
        // Definimos Constantes.
        int dimF = 15;
        int dimL = 0;
        int fin = 0; // Condicion de Corte.
        int dniMax = 40000000;
        int edadMax = 100;
        
        // Creamos el Vector de personas.
        Persona [] vector = new Persona [dimF];
        
        // Cargar el Vector. 
        int edad = GeneradorAleatorio.generarInt(edadMax);
        
        
        while ((dimL < dimF) && (edad != fin)){
            
            // Creamos el Objeto de tipo "Persona" para que se cree en cada iteracion uno nuevo.
            Persona p = new Persona();
            
            // Cargamos los datos en el Objeto (Persona).
            p.setEdad(edad);
            p.setNombre(GeneradorAleatorio.generarString(10));
            p.setDNI(GeneradorAleatorio.generarInt(dniMax));
            
            // Cargamos el Vector con la Persona.
            vector[dimL] = p;
            
            // Aumentamos la Dimension Logica.
            dimL++; 
            
            // Volvemos a Pedir la edad.
            edad = GeneradorAleatorio.generarInt(edadMax);
        }
        
        // Imprimimos el Vector.
        for (int j=0; j < dimL; j++){
            System.out.println(vector[j]);
        }
        
        
        //  I. Informe la cantidad de personas mayores de 65 años.
        // II. Muestre la representación de la persona con menor DNI.
        if (dimL > 0){
            
            int contador = 0;
            int edadMaxima = 65;
            
            /* Se crea una variable de Tipo "Persona" para que esa sea la minima 
            al principio de la iteracion.*/
            
            Persona minPersona = vector[0];
            
            for (int i=0; i < dimL; i++) {
                
                if (vector[i].getEdad() > edadMaxima) {
                    contador++;
                }
                
                if (vector[i].getDNI() < minPersona.getDNI()){
                    minPersona = vector[i];
                }
            }
            
            // Imprimimos lo pedido.
            System.out.println("La Cantidad de personas mayores de 65 años fue -> ["+ contador + "]");
            
            System.out.println("La Persona con Menor DNI fue ");
            System.out.println(minPersona);
        }
    }
}
