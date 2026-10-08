/*c) Escriba un programa que instancie un proyecto 
con tres investigadores. Agregue dos subsidios a cada 
investigador y otorgue los subsidios de uno de ellos. 
Luego imprima todos los datos del proyecto en pantalla.*/
package proyecto_unlp;
import PaqueteLectura.Lector;
import PaqueteLectura.GeneradorAleatorio;

public class Ejercicio_1 {
    public static void main(String[] args){
        
        
        // Pedimos la informacion del "Proyecto".
        System.out.println("| Datos del Proyecto |");
        System.out.print(" Nombre del mismo: ");
        String nombreP = Lector.leerString();
        System.out.print("Codigo: ");
        String codigo = Lector.leerString();
        System.out.print("Nombre del Director: ");
        String nombreD = Lector.leerString();
        
        // Creamos el Objeto(Proyecto) y lo Cargamos.
        Proyecto proyecto = new Proyecto(nombreP,codigo,nombreD);
        
        // Cargamos.
        for (int i=0; i < 3; i++){
            
            // Pedimos los Datos de los "Investigadores".
            System.out.println("| Datos del Investigador |");
            String nombre = GeneradorAleatorio.generarString(20);
            System.out.println("Nombre: "+ nombre);
            int categoria = GeneradorAleatorio.generarInt(5);
            System.out.println("Categoria: "+ categoria);
            String especialidad = GeneradorAleatorio.generarString(20);
            System.out.println("Especialidad: "+ especialidad);
            
            // Creamos el Objeto(Investigador) y lo Cargamos.
            Investigador investigador = new Investigador(nombre,categoria,especialidad);
        
            // Creamos y agregamos dos Subsidios.
            double monto1 = GeneradorAleatorio.generarDouble(500);
            String motivo1 = GeneradorAleatorio.generarString(20);
            Subsidio subsidio1 = new Subsidio(monto1,motivo1);
            investigador.agregarSubsidio(subsidio1);
            
            double monto2 = GeneradorAleatorio.generarDouble(500);
            String motivo2 = GeneradorAleatorio.generarString(20);
            Subsidio subsidio2 = new Subsidio(monto2,motivo2);
            investigador.agregarSubsidio(subsidio2);
             
            // Paso 2. Agregar "Investigador" a el "Proyecto".
            proyecto.agregarInvestigador(investigador);
           
        }
        
        // Otorgamos todos los subsidios a un investigador.
        System.out.println("Ingrese el Nombre del Investigador a Otorgarle todos los Subsidios: ");
        proyecto.otorgarTodos(Lector.leerString());
        
        
        // Imprimimos todos los datos por Pantalla.
        System.out.println(proyecto.toString());
        
    }
}
