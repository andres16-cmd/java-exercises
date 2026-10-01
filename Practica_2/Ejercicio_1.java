/*
Se dispone de la clase Persona (en la carpeta tema2). 
Un objeto persona puede crearse sin valores iniciales o enviando en el mensaje de creación el nombre, DNI y edad (en ese orden).
Un objeto persona responde a los siguientes mensajes:
getNombre()  retorna el nombre (String) de la persona
getDNI()     retorna el dni (int) de la persona
getEdad()    retorna la edad (int) de la persona
setNombre(X) modifica el nombre de la persona al “String” pasado por parámetro (X)
setDNI(X)    modifica el DNI de la persona al “int” pasado por parámetro (X)
setEdad(X)   modifica la edad de la persona al “int” pasado por parámetro (X)
toString()   retorna un String que representa al objeto. Ej: “Mi nombre es Mauro, mi DNI es 11203737 y tengo 70 años”

 */
package Practica_2;

import PaqueteLectura.Lector;

public class Ejercicio_1 {
    
    public static void main(String[] args){
        
        // Pedimos el Ingreso de los Datos de la persona.
        System.out.print("Ingrese el Nombre: ");
        String nombre = Lector.leerString();
        System.out.print("Ingrese el DNI: ");
        int dni = Lector.leerInt();
        System.out.print("Ingrese la Edad: ");
        int edad = Lector.leerInt();
        
        // Creamos el Objeto de tipo "Persona".
        Persona persona = new Persona();
        
        // Cargamos los Datos ingresados.
        persona.setNombre(nombre);
        persona.setDNI(dni);
        persona.setEdad(edad);
        
      //Imprimimos los datos con el tipo "toString()" echo en la clase "Persona"
        System.out.println(persona.toString());
        
    }
}
