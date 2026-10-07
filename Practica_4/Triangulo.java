/*B- Incluya la clase Triángulo a la jerarquía de figuras. Triángulo debe heredar de Figura
todo lo que es común y definir su constructor y sus atributos y métodos propios. Además
debe redefinir el método toString para agregarle la información propia.*/
package Practica_4;

public class Triangulo extends Figura{
    
    //Declaramos el estado (atributos).
    private double lado1;
    private double lado2;
    private double lado3;
    
    //Declaramos el/los constructor(es).
    public Triangulo(double unLado1, double unLado2, double unLado3, String unCR, String unCL){
        super(unCR,unCL);
        setLado1(unLado1);
        setLado2(unLado2);
        setLado3(unLado3);
    }
    
    //Declaramos los metodos.
    public double getLado1(){
        return lado1;
    }
    
    public double getLado2(){
        return lado2;
    }
    
    public double getLado3(){
        return lado3;
    }
    
    public void setLado1(double unLado1){
        lado1 = unLado1;
    }
    
    public void setLado2(double unLado2){
        lado2 = unLado2;
    }
    
    public void setLado3(double unLado3){
        lado3 = unLado3;
    }
    
    // Realizamos los metodos "abstractos" a la manera de "Triangulo".
    @Override
    public double calcularPerimetro(){
        return (getLado1() + getLado2() + getLado3());
    }
        
    @Override
    public double calcularArea(){
        double s = (calcularPerimetro() / 2);
        return (Math.sqrt(s * (s - getLado1())*(s - getLado2())*(s - getLado3())));
    }
       
    @Override
    public String toString(){
        String aux = super.toString() +
                    "Lado 1 -> ["+ getLado1() +"] Lado 2 -> ["+ getLado2() +"]" +
                    "Lado 3 -> ["+ getLado3()+"]";
        
        return aux;
    }
}
