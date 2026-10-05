package Practica_3;

public class EstanteriaHogarena {
    
    // Declaramos el estado (atributos).
    private Estante[] vector = new Estante[2];
    
    // Declaramos el contructor(es).
    public EstanteriaHogarena(){
        
        // Cargamos la Estanteria.
        for (int i=0; i < 2; i++){
            // Creamos el Objeto "Estante".
            Estante e = new Estante();
            // Cargamos el Objeto. 
            vector[i] = e;
        }
        
    }
    
    /* Agregar un libro a la estantería hogareña. 
    El libro debe agregarse al estante inferior si
    no está lleno, caso contrario al superior.*/
    
    public void agregarLibro(Libro unLibro){
                   
        if (!vector[0].getEstaLleno()){
            vector[0].setAgregarLibro(unLibro); // Estante 0 -> inferior.
        } else {
            vector[1].setAgregarLibro(unLibro); // Estante 1 -> superior.
        }
    }
    
    /*Obtener la cantidad de libros almacenados en la 
    estantería hogareña (considerar ambos estantes).*/
    public int cantidadLibros(){
        return (vector[0].getCantLibros() + vector[1].getCantLibros());
    }
    
    
    /*Dado un título, saber si ese libro está en la 
    estantería hogareña (ya sea en el estante
    inferior o en el superior).*/
    public boolean buscarLibro(String unTitulo){
        boolean aux = false;
        
        if (vector[0].buscarLibro(unTitulo) != null){
            
            return true;
        } else {
            if (vector[1].buscarLibro(unTitulo) != null){
                
                return true;
            }
        }
        return aux;
    }
    
    
}
