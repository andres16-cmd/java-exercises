/*B- Realice un programa que instancie un hotel, 
ingrese clientes en distintas habitaciones,
muestre el hotel, aumente el precio de las 
habitaciones y vuelva a mostrar el hotel.*/
package Practica_3;
import PaqueteLectura.Lector;
import PaqueteLectura.GeneradorAleatorio;

public class Ejercicio_4 {
    
    public static void main(String [] args){
        
        // Pedimos los datos de un Hotel.
        System.out.print("Ingrese la Cantidad de Habitaciones: ");
        int cantHabitaciones = Lector.leerInt();
        System.out.println("| Precios |");
        System.out.print("Habitaciones Frente: ");
        double frente = Lector.leerDouble();
        System.out.print("Habitaciones ContraFrente: ");
        double contraFrente = Lector.leerDouble();
        
        // Creamos el Hotel (hotel1) "SIN CLIENTES".
        Hotel hotel = new Hotel(cantHabitaciones,frente,contraFrente);
        
        
        // Cantidad Aleatoria de Clientes a entrar.      
        GeneradorAleatorio.iniciar();
        int cantClientes = GeneradorAleatorio.generarInt(cantHabitaciones); 
        System.out.println("La Cantidad de clientes que llegaron son -> ["+ cantClientes +"]");
        
        // Cargamos el hotel con Clientes.
        for (int i=0; i < cantClientes; i++){
            
            GeneradorAleatorio.iniciar();
            
            // Pedimos los datos de un Cliente.
            System.out.println("| Datos del Cliente |");
            System.out.print("Que Habitacion desea: ");
            int num = Lector.leerInt();
            System.out.print("Nombre: ");
            String nombre = Lector.leerString();
            System.out.println("DNI: ");
            int dni = GeneradorAleatorio.generarInt(900);
            System.out.println("Edad: ");
            int edad = GeneradorAleatorio.generarInt(101);
            
            // Creamos el Cliente.
            Cliente cliente = new Cliente(nombre,dni,edad);
            
            //Llamamos al metodo "cargarHotel".
            hotel.cargarHotel(cliente,num);   
        }
        
        //Mostramos el Hotel.
        System.out.println(hotel.toString());
        
        
        /*Aumente el precio de las habitaciones 
        y vuelva a mostrar el hotel.*/
        System.out.print("Ingrese el Aumento del Precio de las Habitaciones: ");
        double aumento = Lector.leerDouble();
        
        // Utilizamos el metodo creado en mi clase "Hotel".
        hotel.aumentarPrecioHabitaciones(aumento);
        
        //Mostramos el Hotel con los precios aumentado.
        System.out.println(hotel.toString());
    }
}
