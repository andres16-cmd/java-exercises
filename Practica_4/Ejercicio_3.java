/*B- Realice un programa que instancie una 
persona y un trabajador y muestre la
representación de cada uno en consola. */
package Practica_4;
import PaqueteLectura.Lector;

public class Ejercicio_3 {
    public static void main(String[] args){
        
        // Pedimos los Datos del "Persona".
        System.out.println("| Datos de la Persona |");
        System.out.print("Nombre: ");
        String nombre = Lector.leerString();
        System.out.print("DNI: ");
        int dni = Lector.leerInt();
        System.out.print("Edad: ");
        int edad = Lector.leerInt();
        
        // Creamos el Objeto(Persona) y lo Cargamos.
        Persona persona = new Persona(nombre,dni,edad);
        
        
        // Pedimos los Datos del "Trabajador".
        System.out.println("| Datos del Trabajador |");
        System.out.print("Nombre: ");
        nombre = Lector.leerString();
        System.out.print("DNI: ");
        dni = Lector.leerInt();
        System.out.print("Edad: ");
        edad = Lector.leerInt();
        System.out.print("Tarea a Realiza: ");
        String tarea = Lector.leerString();
        
        // Creamos el Objeto(Trabajador) y lo Cargamos.
        Trabajador trabajador = new Trabajador(tarea,nombre,dni,edad);
        
        
        // Imprimimos lo pedido.
        System.out.println("Persona -> " + persona.toString());
        System.out.print(trabajador.toString());   
    }
}
