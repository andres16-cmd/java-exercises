package Practica_3;

public class Cliente {
    
    // Declaracion de estado (atributos).
    private String nombre;
    private int dni;
    private int edad;
    
    // Declaracion de constructor(es).
    public Cliente(String unNombre, int unDNI, int unaEdad){
        nombre = unNombre;
        dni = unDNI;
        edad = unaEdad;
    }
    
    // Declaracion de metodos.
    public String getNombre(){
        return nombre;
    }
    
    public int getDNI(){
        return dni;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setNombre(String unNombre){
        nombre = unNombre;
    }
    
    public void setDNI(int unDNI){
        dni = unDNI;
    }
    
    public void setEdad(int unaEdad){
        edad = unaEdad;
    }
    
    @Override
    public String toString(){
        return "| Nombre -> ["+ nombre +"] | DNI -> ["+ dni +"] | Edad -> ["+ edad +"] |";
    }
}
