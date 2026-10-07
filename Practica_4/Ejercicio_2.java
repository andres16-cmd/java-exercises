/*F- Realizar un programa que instancie un 
jugador y un entrenador. Informe la
representación String de cada uno.*/
package Practica_4;
import PaqueteLectura.Lector;

public class Ejercicio_2 {
    public static void main(String[] args){
        
        
        // Pedimos los Datos del "Jugador".
        System.out.println("| Datos del Jugador |");
        System.out.print("Nombre: ");
        String nombre = Lector.leerString();
        System.out.print("Sueldo Basico: ");
        double sueldoBasico = Lector.leerDouble();
        System.out.print("Años de Antiguedad: ");
        double años = Lector.leerDouble();
        System.out.print("Cantidad de Partidos: ");
        int partidos = Lector.leerInt();
        System.out.print("Cantidad de Goles: ");
        int goles = Lector.leerInt();
        
        // Creamos el Objeto(Jugador) y lo Cargamos.
        Jugador jugador = new Jugador(nombre,sueldoBasico,años,partidos,goles);
    
        // Pedimos los Datos del "Entrenador".
        System.out.println("| Datos del Entrenador |");
        System.out.print("Nombre: ");
        nombre = Lector.leerString();
        System.out.print("Sueldo Basico: ");
        sueldoBasico = Lector.leerDouble();
        System.out.print("Años de Antiguedad: ");
        años = Lector.leerDouble();
        System.out.print("Campeonatos Ganados: ");
        int campeonatos = Lector.leerInt();
        
        // Creamos el Objeto(Entrenador) y lo Cargamos.
        Entrenador entrenador = new Entrenador(nombre,sueldoBasico,años,campeonatos);
    
        // Imprimimos la info de cada uno.
        System.out.println(jugador.toString());
        System.out.println(entrenador.toString());
    
    }
}
