/*G- Realizar un programa que instancie un triángulo 
y un círculo. Muestre en consola la representación 
String de cada uno. Pruebe el funcionamiento de 
los métodos despintar y esGrande.*/
package Practica_4;
import PaqueteLectura.Lector;

public class Ejercicio_1 {
    public static void main(String[] args){
        
        
        // Pedimos los Datos del "Triangulo".
        System.out.println("| Datos del Triangulo |");
        System.out.print("Lado 1: ");
        double lado1 = Lector.leerDouble();
        System.out.print("Lado 2: ");
        double lado2 = Lector.leerDouble();
        System.out.print("Lado 3: ");
        double lado3 = Lector.leerDouble();
        System.out.print("Color de Relleno: ");
        String CR = Lector.leerString();
        System.out.print("Color de Linea: ");
        String CL = Lector.leerString();
    
        // Creamos el Objeto "Triangulo" y lo cargamos.
        Triangulo triangulo = new Triangulo(lado1,lado2,lado3,CR,CL);
    
        // Pedimos los Datos del "Circulo".
        System.out.println("| Datos del Circulo |");
        System.out.print("Radio: ");
        double radio = Lector.leerDouble();
        System.out.print("Color de Relleno: ");
        CR = Lector.leerString();
        System.out.print("Color de Linea: ");
        CL = Lector.leerString();
        
        // Creamos el Objeto "Circulo" y lo cargamos.
        Circulo circulo = new Circulo(radio,CR,CL);
    
        // Imprimimos la representacion de cada Figura.
        System.out.println("| INFO TRIANGULO |");
        System.out.println(triangulo.toString());
        System.out.println("| INFO CIRCULO |");
        System.out.println(circulo.toString());
        
        
        
        // Metodo despintar.
        triangulo.despintar();
        circulo.despintar();
        
        // Imprimos el cambio.
        System.out.println("| Cambios de Circulo |");
        System.out.println("Color de Linea -> ["+circulo.getColorLinea()+"]");
        System.out.println("Color de Relleno -> ["+circulo.getColorRelleno()+"]");
        System.out.println("| Cambios de Triangulo |");
        System.out.println("Color de Linea -> ["+triangulo.getColorLinea()+"]");
        System.out.println("Color de Relleno -> ["+triangulo.getColorRelleno()+"]");
        
        
        // Metodos esGrande.
        
        circulo.esGrande();
        triangulo.esGrande();
        
        System.out.println("El valor del Area de Circulo "+ circulo.mensaje());

        System.out.println("El valor del Area de Triangulo "+ triangulo.mensaje());
    }
}
