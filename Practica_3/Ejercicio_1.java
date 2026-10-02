/*B- Realizar un programa que instancie un triángulo 
y un círculo e informe en consola el
perímetro y el área de cada uno. */
package Practica_3;

import PaqueteLectura.Lector;

public class Ejercicio_1 {
    public static void main(String[] args){
        
        // Pedimos los Datos del Objeto (Triangulo).
        System.out.println("INFORMACION DEL [TRIANGULO]");
        System.out.print("Ingrese el Lado1: ");
        double lado1 = Lector.leerDouble();
        System.out.print("Ingrese el Lado2: ");
        double lado2 = Lector.leerDouble();
        System.out.print("Ingrese el Lado3: ");
        double lado3 = Lector.leerDouble();
        System.out.print("Ingrese el Color de Relleno: ");
        String colorDeRelleno = Lector.leerString();
        System.out.print("Ingrese el Color de Linea: ");
        String colorDeLinea = Lector.leerString();
        
        //Creamos el Objeto (Triangulo) y lo Cargamos.
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3, colorDeRelleno, colorDeLinea);
    
        // Pedimos los Datos del Objeto (Circulo).
        System.out.println("INFORMACION DEL [CIRCULO]");
        System.out.print("Ingrese el Radio: ");
        double radio = Lector.leerDouble();
        System.out.print("Ingrese el Color de Relleno: ");
        colorDeRelleno = Lector.leerString();
        System.out.print("Ingrese el Color de Linea: ");
        colorDeLinea = Lector.leerString();
        
        //Creamos el Objeto (Circulo) y lo Cargamos.
        Circulo circulo = new Circulo(radio, colorDeRelleno, colorDeLinea);
        
        // Ahora imprimimos lo pedido.
        System.out.println("[TRIANGULO]");
        System.out.println("El Perimetro fue de -> ["+triangulo.calcularPerimetro()+"]");
        System.out.println("El Area fue de -> ["+triangulo.calcularArea()+"]");
        
        System.out.println("[CIRCULO]");
        System.out.println("El Perimetro fue de -> ["+circulo.calcularPerimetro()+"]");
        System.out.println("El Area fue de -> ["+circulo.calcularArea()+"]");
    }
}
