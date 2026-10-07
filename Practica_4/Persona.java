/*La Clase Persona fue traida desde la guia de clases.*/

package Practica_4;

public class Persona {
    
    // Declaramos el estado(atributos).
    private String nombre;
    private int DNI;
    private int edad; 
    
    // Declaramos el constructor(es).
    public Persona(String unNombre, int unDNI, int unaEdad){
        setNombre(unNombre);
        setDNI(unDNI);
        setEdad(unaEdad);
    }
    
    // Declaramos los metodos.
    public int getDNI() {
        return DNI;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDNI(int unDNI) {
        DNI = unDNI;
    }

    public void setEdad(int unaEdad) {
        edad = unaEdad;
    }

    public void setNombre(String unNombre) {
        nombre = unNombre;
    }
    
    @Override
    public String toString(){
        String aux; 
        aux = "Mi nombre es " + nombre + ", mi DNI es " + DNI + " y tengo " + edad + " años.";
        return aux;
    }

}
