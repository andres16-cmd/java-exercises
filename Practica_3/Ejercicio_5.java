/*(iii) Realice un programa que instancie una estantería hogareña, 
le agregue libros y compruebe el funcionamiento de los métodos implementados.*/
package Practica_3;

import PaqueteLectura.Lector;
import PaqueteLectura.GeneradorAleatorio;

public class Ejercicio_5 {
    public static void main(String[] args){
        GeneradorAleatorio.iniciar();
        
        // Creamos el Objeto "Estanteria" un unico estante.
        EstanteriaHogareña estanteria1 = new EstanteriaHogareña();
        
        int cantLibros = GeneradorAleatorio.generarInt(40);
        
        System.out.println("Cantidad del Libros que se ingresaran ["+ cantLibros +"]");
        
        for (int i=0; i < cantLibros; i++) {
            
            GeneradorAleatorio.iniciar();
            
            // Pedimos datos del Objeto "Libro".
            System.out.println("|Datos del Libro|");
            System.out.println("Titulo: ");
            String titulo = GeneradorAleatorio.generarString(30);
            System.out.print(titulo);
            System.out.println("|Datos del Autor|");
            System.out.println("Nombre: ");
            String nombre = GeneradorAleatorio.generarString(20);
            System.out.println("Biografia: ");
            String biografia = GeneradorAleatorio.generarString(20);
            System.out.println("Origen: ");
            String origen = GeneradorAleatorio.generarString(20);
        
            //Creamos el Objeto "Autor" y lo Cargamos.
            Autor a = new Autor(nombre,biografia,origen);
        
            // Seguimos ingresando datos del "Libro".
            System.out.println("Editorial: ");
            String editorial = GeneradorAleatorio.generarString(20);
            System.out.println("Año Edicion: ");
            int añoEdicion = GeneradorAleatorio.generarInt(2000);
            System.out.println("ISBN: ");
            String isbn = GeneradorAleatorio.generarString(20);
            System.out.println("Precio: ");
            double precio = GeneradorAleatorio.generarDouble(200);
        
            // Creamos el Obejeto "Libro".
            Libro l = new Libro(titulo,editorial,añoEdicion,a,isbn,precio);
        
            // Cargamos el Libro a la Estanteria Hogareña.
            estanteria1.agregarLibro(l);
        }
        
        
        // Utilizamos los dos metodos creados.
        System.out.println("La Cantidad de Libros ingresados al Estante fueron -> ["+ estanteria1.cantidadLibros() +"]");
        
        System.out.println("Ingrese el Titulo a Buscar en el Estante: ");
        String t = Lector.leerString();
        
        if (estanteria1.buscarLibro(t) == true){
            System.out.println("El Titulo del Libro esta en el Estante.");
        } else{
            System.out.println("El Titulo del Libro NO esta en el Estante.");
        }
    }
}
