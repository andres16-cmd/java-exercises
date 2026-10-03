/*B- Realice un programa que instancie un estante. 
Cargue varios libros. A partir del estante,busque 
e informe el autor del libro “Mujercitas”.*/
package Practica_3;

import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;

public class Ejercicio_3 {
    public static void main(String[] args){
        
        // Creamos el Objeto (Estante).
        Estante estante = new Estante();
        
        int dimL = GeneradorAleatorio.generarInt(21);
        
        for (int i=0; i < dimL; i++){
            
            System.out.print("Ingrese un Titulo: ");
            String titulo = Lector.leerString();
            
            // Creamos el Autor.
            System.out.println("DATOS DEL AUTOR");
            System.out.print("Ingrese el Nombre: ");
            String nombre = Lector.leerString();
            System.out.print("Ingrese la Biografia: ");
            String biografia = Lector.leerString();
            System.out.print("Ingrese el Origen: ");
            String origen = Lector.leerString();
            // Cargamos la info del Autor.
            Autor autor = new Autor(nombre,biografia,origen);
            
            // Seguimos con los siguientes datos del Libro.
            System.out.print("Ingrese el Editorial: ");
            String editorial = Lector.leerString();
            System.out.print("Ingrese el Año de Edicion: ");
            int añoEdicion = Lector.leerInt();
            System.out.print("Ingrese el ISBN: ");
            String isbn = Lector.leerString();
            System.out.print("Ingrese el Precio: ");
            double precio = Lector.leerDouble();
            
            // Creamos el (Libro).
            Libro libro = new Libro(titulo,editorial,añoEdicion,autor,isbn,precio);
            
            //Utilizamos el "metodo" para agregar el libro al (Estante).
            estante.setAgregarLibro(libro);
        }
        
        
        /*A partir del estante,busque e informe 
        el autor del libro “Mujercitas”.*/ 
        
        // Buscamos "Mujercitas" en el estante y guardamos el Libro encontrado.
        Libro libroEncontrado = estante.buscarLibro("Mujercitas");
        
        // Luego evaluamos el valor del Libro encontrado.
        if (libroEncontrado != null){
            System.out.println("El Nombre del Autor del Libro 'Mujercitas' es -> ["+ libroEncontrado.getPrimerAutor().getNombre() +"]");
        } else{
            System.out.println("El Nombre del Autor del Libro 'Mujercitas' no se encontro.");
        }
        
        
        /*C- Piense: ¿Qué modificaría en la clase definida para ahora permitir estantes que
        almacenen como máximo N libros? 
        
        R- Lo que modificaría en la clase "Estante" sería la dimensión física (dimF), 
        ya que actualmente está definida con un valor fijo de 20. Para permitir que 
        el estante almacene como máximo "N" libros, modificaría el constructor para 
        que reciba como parámetro la capacidad máxima del estante. De esta manera, 
        podría crear el vector con el tamaño indicado por "N", manteniendo dimL 
        en 0 para comenzar con el estante vacío.
 
        
        // Creamos el Objeto (Estante).
        System.out.print("Ingrese la cantidad de libros que soportara el estante: ");
        int N = Lector.leerInt();
        Estante estante = new Estante(N);
        
         ...
        
        */
    }
}
