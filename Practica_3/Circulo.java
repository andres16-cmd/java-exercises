/*Los círculos tendrán como atributos: 
el radio (double), 
el color de relleno (String) 
y el color de línea (String).

Provea en cada clase un constructor que reciba todos los 
datos necesarios para iniciar el objeto y métodos para:
- Devolver/modificar el valor de cada uno de sus atributos (métodos get y set).
- Calcular el perímetro y devolverlo (método calcularPerimetro)
- Calcular el área y devolverla (método calcularArea)*/

package Practica_3;

public class Circulo {
    
    // Declaracion de estado. (atributos)
    private double radio;
    private String colorDeRelleno;
    private String colorDeLinea;
    
    // Declaracion de constructor(es).
    public Circulo(double unRadio, String unColorDeRelleno, String unColorDeLinea){
        radio = unRadio;
        colorDeRelleno = unColorDeRelleno;
        colorDeLinea = unColorDeLinea;
    }
    
    // Declaracion de metodos.
    
    public double getRadio(){
        return radio;
    }
    
    public void setRadio(double unRadio){
        radio = unRadio;
    }
    
    public String getColorDeRelleno(){
        return colorDeRelleno;
    }
    
    public void setColorDeRelleno(String unColorDeRelleno){
        colorDeRelleno = unColorDeRelleno;
    }
    
    public String getColorDeLinea(){
        return colorDeLinea;
    }
    
    public void setColorDeLinea(String unColorDeLinea){
        colorDeLinea = unColorDeLinea;
    }
    
    /*- Calcular el perímetro y devolverlo 
    (método calcularPerimetro).
    Formula: (2 * π * radio)*/
    
    public double calcularPerimetro(){
        return (2 * Math.PI * radio);
    }
    
    /*- Calcular el área y devolverla (método calcularArea).
    Formula: (π * radio^2)*/
    
    public double calcularArea(){
        return (Math.PI * (radio * radio));
    } 
}
