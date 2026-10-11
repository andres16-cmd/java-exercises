/*c. Escriba un programa que instancie un coro 
de cada tipo. Lea o bien la cantidad de
coristas (en el caso del coro semicircular) o 
la cantidad de hileras e integrantes por
hilera (en el caso del coro por hileras). 
Luego cree la cantidad de coristas necesarios,
leyendo sus datos, y almacenándolos en el coro. 
Finalmente imprima toda la
información de los coros indicando si están 
bien formados o no.*/

package escuelademusica;
import PaqueteLectura.GeneradorAleatorio;

public class Ejercicio_4 {
    public static void main(String[] args){
        
        // Creo y Cargo un "Director".
        Director director = new Director("Yosbert Avila",123456789,22,4);

        // Creamos los "Coristas" -> CoroSemiCircular.
        CoroSemiCircular coroS = new CoroSemiCircular("Nuevo1",director,4);
        
        for (int i=0; i < 4; i++){
            GeneradorAleatorio.iniciar();
            int aux = GeneradorAleatorio.generarInt(10);
            Corista corista = new Corista("Andres",123456789,22,aux);
            
            // Agregamos el "Corista".
            coroS.agregarCorista(corista);
        }
        
        // Creamos los "Coristas" -> CoroDeHilera.
        CoroDeHilera coroH = new CoroDeHilera("Nuevo2",director,2,2);
        
        for (int i=0; i < 4; i++){
            GeneradorAleatorio.iniciar();
            int aux = GeneradorAleatorio.generarInt(10);
            Corista corista = new Corista("Yosbert",987654,22,aux);
            
            // Agregamos el "Corista".
            coroH.agregarCorista(corista);
        }

        /*Imprima toda la información de los coros 
        indicando si están bien formados o no.*/

        // CoroSemiCircular.
        
        if (coroS.estaFormado()){
            System.out.println("| EL Coro Semi Circular |");
            System.out.println("Esta Bien Formado");
        } else {
            System.out.println("| El Coro Semi Circular |");
            System.out.println("NO Esta Bien Formado");
        }
        
        System.out.println(coroS.toString());
        
        // CoroDeHilera.
        
        if (coroH.estaFormado()){
            System.out.println("| El Coro De Hilera |");
            System.out.println("Esta Bien Formado");
        } else {
            System.out.println("| El Coro De Hilera |");
            System.out.println("NO Esta Bien Formado");
        }
        
        System.out.println(coroH.toString());
        
        
    }
}
