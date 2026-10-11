package escuelademusica;

public class Corista {
    
    // Declaracion de estado(atributos).
    private String nombreCorista;
    private int dni;
    private int edad;
    private int tonoFundamental;
    
    
    // Declaracion de constructor(es).
    public Corista(String unNombre, int unDNI, int unaEdad, int unTono){
        setNombreCorista(unNombre);
        setDniCorista(unDNI);
        setEdadCorista(unaEdad);
        setTono(unTono);
    }
    
    // Declaracion de metodos.
    public String getNombreCorista(){
        return nombreCorista;
    }
    
    public int getDniCorista(){
        return dni;
    }
    
    public int getEdadCorista(){
        return edad;
    }
    
    public int getTono(){
        return tonoFundamental;
    }
    
    public void setNombreCorista(String unNombre){
        nombreCorista = unNombre;
    }
    
    public void setDniCorista(int unDni){
        dni = unDni;
    }
    
    public void setEdadCorista(int unaEdad){
        edad = unaEdad;
    }
    
    public void setTono(int unTono){
        tonoFundamental = unTono;
    }
    
    
    
    /* Devolver la representación de un coro 
    formada por el nombre del coro, todos
    los datos del director y todos los datos 
    de todos los coristas.*/
    
    @Override
    public String toString(){
        String aux = "| Informacion de Corista | \n"
                    + "  | Nombre | -> ["+ getNombreCorista() +"] \n"
                    + " | DNI | -> ["+ getDniCorista() +"] \n"
                    + " | Edad | -> ["+ getEdadCorista() +"] \n"
                    + " | Tono Fundamental | -> ["+ getTono() +"] \n";
        
        return aux;
    }
    
}
