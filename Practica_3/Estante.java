
/*3-A- Defina una clase para representar estantes. 
Un estante almacena a lo sumo 20 libros.Implemente un 
constructor que permita iniciar el estante sin libros.
Provea métodos para: */


package Practica_3;

public class Estante {
    
    //Declaracion de estado (atributos).
    private int dimF = 20;
    private Libro [] vector = new Libro[dimF];
    private int dimL = 0;
    
    // Declaracion del constructor(es).
    public Estante(){
        /* Es un contructor vacio porque nos piden  
        "Implemente un constructor que permita iniciar 
        el estante sin libros".*/
    }
    
    
    // Declaracion de metodos.
    
    // (i) Devolver la cantidad de libros almacenados en el estante.
    public int getCantLibros(){
        return dimL;
    }
    
    // (ii) Devolver si el estante está lleno.
    public boolean getEstaLleno(){
        return (dimL == dimF);
    }
    
    // (iii) Agregar un libro que se recibe al estante.
    public void setAgregarLibro(Libro unLibro){
        if (dimL < dimF){
            vector[dimL] = unLibro;
            dimL++;
        }
    }
    
    /*(iv) Dado un título, buscar y devolver el libro 
    con ese título (ó null si no existe).*/
    public Libro buscarLibro(String unTitulo){
        
        int i = 0;
        while (i < dimL) {
            
            if (vector[i].getTitulo().equals(unTitulo)){ 
                return vector[i];                
            }
            i++;
        }
        return null;
    }

}
