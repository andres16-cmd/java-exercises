/*Los triángulos tendrán como atributos: 
el tamaño de sus 3 lados (double), 
el color de relleno (String) y 
el color de línea (String).

Provea en cada clase un constructor que reciba todos los 
datos necesarios para iniciar el objeto y métodos para:
- Devolver/modificar el valor de cada uno de sus atributos (métodos get y set).
- Calcular el perímetro y devolverlo (método calcularPerimetro)
- Calcular el área y devolverla (método calcularArea)*/


package Practica_3;

public class Triangulo {
    
    
    // Declaracion de estado. (atributos)
    private double lado1;
    private double lado2;
    private double lado3;
    private String colorDeRelleno;
    private String colorDeLinea;
    
    
    // Declaracion de constructor(es).
    public Triangulo(double unLado1, double unLado2, double unLado3, String unColorDeRelleno, String unColorDeLinea){
        
        lado1 = unLado1;
        lado2 = unLado2;
        lado3 = unLado3;
        colorDeRelleno = unColorDeRelleno;
        colorDeLinea = unColorDeLinea;
    }
    
    // Declaracion de metodos.
    
    public double getLado1(){
        return lado1;
    }
    
    public void setLado1(double unLado1){
        lado1 = unLado1;
    }
    
    public double getLado2(){
        return lado2;
    }
    
    public void setLado2(double unLado2){
        lado2 = unLado2;
    }
    
    public double getLado3(){
        return lado3;
    }
    
    public void setLado3(double unLado3){
        lado3 = unLado3;
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
      
    /* Calcular el perímetro y devolverlo (método calcularPerimetro).
    Como los lados son (atributos) del objeto, el metodo no 
    necesita recibirlos como parametros.*/
    
    public double calcularPerimetro(){
        return lado1 + lado2 + lado3;
    }
    
    /*Calcular el área y devolverla (método calcularArea).*/
    
    public double calcularArea(){
        double s = (lado1+lado2+lado3)/2;
        
        double area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
        
        return area;
    }
}
