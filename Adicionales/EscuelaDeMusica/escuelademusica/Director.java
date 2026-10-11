package escuelademusica;

public class Director {
    
    // Declaracion de estado(atributos).
    private String nombreDirector;
    private int dni;
    private int edad;
    private int antiguedad;
    
    
    // Declaracion de constructor(es).
    public Director(String unNombre, int unDni, int unaEdad, int unaAntiguedad){
        setNombreDirector(unNombre);
        setDniDirector(unDni);
        setEdadDirector(unaEdad);
        setAntiguedad(unaAntiguedad);
    }
    
    // Declaracion de metodos.
    
    public String getNombreDirector(){
        return nombreDirector;
    }
    
    public int getDniDirector(){
        return dni;
    }
    
    public int getEdadDirector(){
        return edad;
    }
    
    public int getAntiguedad(){
        return antiguedad;
    }
    
    public void setNombreDirector(String unNombre){
        nombreDirector = unNombre;
    }
    
    public void setDniDirector(int unDni){
        dni = unDni;
    }
    
    public void setEdadDirector(int unaEdad){
        edad = unaEdad;
    }
    
    public void setAntiguedad(int unaA){
        antiguedad = unaA;
    }
 
    @Override
    public String toString(){
        String aux = super.toString() + " | Nombre del Director | -> ["+ getNombreDirector()+ "] \n"
                    + "| DNI | -> ["+ getDniDirector() +"] | Edad | -> [" + getEdadDirector() +"]"
                    + "| Antiguedad | -> ["+ getAntiguedad() +"]";
        
        return aux;
    }
}   
