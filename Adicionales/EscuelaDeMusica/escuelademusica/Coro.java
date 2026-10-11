package escuelademusica;

public class Coro {
    
    // Declaramos el estado(atributos).
    private String nombreCoro;
    private Director director;
    
    // Declaramos el constructor(es).
    public Coro(String unNombre, Director d){
        setNombreCoro(unNombre);
        setDirector(d);
    }
    
    // Declaracion de metodos.
    
    public String getNombreCoro(){
        return nombreCoro;
    }
    
    public void setNombreCoro(String unNombre){
        nombreCoro = unNombre;
    }
    
    public void setDirector(Director unDirector){
        director = unDirector;
    }
    
    
    /* Devolver la representación de un coro 
    formada por el nombre del coro, todos
    los datos del director y todos los datos 
    de todos los coristas.*/
   
    @Override
    public String toString(){
        String aux = "| Nombre del Coro |->["+ getNombreCoro() +"] \n"
                      + director.toString();
        
        return aux;
    }
    
    
}
