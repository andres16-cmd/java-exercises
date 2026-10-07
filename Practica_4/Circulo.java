//C- De igual manera, incluya la clase Círculo a la jerarquía de figuras.
package Practica_4;

public class Circulo extends Figura{
    
    //Declaramos el estado(atributos).
    private double radio;
    
    //Declaramos el constructor(es).
    public Circulo(double unRadio, String unCR, String unCL){
        super(unCR,unCL);
        setRadio(unRadio);
    }
    
    //Declaramos los metodos.
    public double getRadio(){
        return radio;
    }
    
    public void setRadio(double unRadio){
        radio = unRadio;
    }
    
    // Realizamos los metodos "abstractos" a la manera de "Circulo".
    @Override
    public double calcularPerimetro(){
        return (2 * Math.PI * getRadio());
    }
    
    @Override
    public double calcularArea(){
        return (Math.PI * (getRadio() * getRadio())); 
    }
    
    @Override
    public String toString(){
        String aux = super.toString() + " Radio -> ["+ getRadio() +"]";
        return aux;
    }
}
