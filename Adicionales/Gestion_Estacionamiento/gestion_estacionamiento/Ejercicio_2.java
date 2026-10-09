/*d) Realice un programa que instancie un estacionamiento 
con 3 pisos y 3 plazas por piso. Registre 6 autos en el 
estacionamiento en distintos lugares.*/
package gestion_estacionamiento;

import PaqueteLectura.Lector;

public class Ejercicio_2 {
    public static void main(String[] args){
        
        // Pedimos la info del Estacionamiento.
        System.out.println("| Datos del Estacionamiento |");
        System.out.print("Nombre: ");
        String nombre = Lector.leerString();
        System.out.print("Direccion: ");
        String direccion = Lector.leerString();
        System.out.print("Hora de Apertura: ");
        String horaApertura = Lector.leerString();
        System.out.print("Hora de Cierre: ");
        String horaCierre = Lector.leerString();
        
        // Creamos el Objeto "Estacionamiento" y lo Cargamos.
        Estacionamiento estacionamiento = new Estacionamiento(nombre,direccion,horaApertura,horaCierre,3,3);  
        
        for (int i=0; i < 6; i++) {
            // Pedimos la informacion de los "Autos".
            System.out.println("| Datos del Auto |");
            System.out.print("Nombre del Dueño: ");
            String nombreDueño = Lector.leerString();
            System.out.print("Patente: ");
            String patente = Lector.leerString();
            
            // Creamos el Objeto (Auto) y lo Cargamos.
            Auto auto = new Auto(nombreDueño,patente);
            
            System.out.println("| Lugar donde se Encuentra |");
            System.out.print("Piso: ");
            int piso = Lector.leerInt();
            System.out.print("Plaza: ");
            int plaza = Lector.leerInt();
            
            estacionamiento.registrarAuto(auto, piso, plaza);
        }
        
        
        /*Muestre la representación String del estacionamiento en consola.*/
        System.out.println(estacionamiento.toString());
        
        /*Muestre la cantidad de autos ubicados en la plaza 1.*/
        System.out.println("Cantidad de Autos en la Plaza 1 son -> ["+ estacionamiento.cantAutosEnPlaza(1) +"]");
    
        /*Lea una patente por teclado e informe si dicho auto 
        se encuentra en el estacionamiento o no. En caso de 
        encontrarse, la información a imprimir es el piso y
        plaza que ocupa.*/
        
        System.out.print("Ingrese una Patente a Buscar: ");
        String patente = Lector.leerString();
        
        System.out.println(estacionamiento.Obtener(patente));
    
    }
}
