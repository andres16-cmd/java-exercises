/*
Demo que crea objetos Libro invocando a los constructores definidos. 
 
B- Modifique el programa Demo01Constructores (carpeta tema3) para instanciar los
libros con su autor, considerando las modificaciones realizadas. Informe la representación
String de los libros. A partir de un objeto libro ¿cómo obtengo el nombre de su autor?

*/
package Practica_3;


public class Demo01ConstructoresLibro {


    public static void main(String[] args) {
        
        // Creamos el Obeto de clase (Autor).
        Autor autor = new Autor("Yosbert Avila","NINGUNA","Venezuela");
        Libro libro1= new  Libro( "Java: A Beginner's Guide","Mcgraw-Hill", 2014,autor, "978-0071809252", 21.72);
        
        Autor autor2 = new Autor("Andres Avila","NINGUNA","Venezuela");
        Libro libro2= new Libro("Learning Java by Building Android Games","CreateSpace Independent Publishing", autor2, "978-1512108347");
        
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println("Precio del libro2: " +libro2.getPrecio());
        System.out.println("Año edición del libro2: " +libro2.getAñoEdicion());
        Libro libro3= new Libro(); 
        
        
        
        //¿cómo obtengo el nombre de su autor?
        System.out.println("El Nombre del Autor del Libro 1 es -> ["+ autor.getNombre() +"]");
        System.out.println("El Nombre del Autor del Libro 2 es -> ["+ autor2.getNombre() +"]");
    }
    
}
