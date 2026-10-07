package Practica_4;

public class Trabajador extends Persona{
    
    // Declaramos el estado(atributos).
    private String tarea;
    
    // Declaramos el constructor(es).
    public Trabajador(String unaTarea, String unNombre, int unDni, int unaEdad){
        
        super(unNombre,unDni,unaEdad);
        setTarea(unaTarea);
    }
    
    // Declaramos los metodos.
    public String getTarea(){
        return tarea;
    }
    
    public void setTarea(String unaTarea){
        tarea = unaTarea;
    }
    
    @Override
    public String toString(){
        String aux = "Trabajador -> " + super.toString() + "Soy -> ["+ getTarea() +"]";
        return aux;
    }
}
