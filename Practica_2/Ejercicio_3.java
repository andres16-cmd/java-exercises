/*Se realizará un casting para un musical. El casting durará 5 días y en cada día se
entrevistarán a 8 personas en distinto turno.
a) Simular el proceso de inscripción de personas al casting. A cada persona se le
pide sus datos (nombre, DNI, edad) , el día (1..5) y turno (1..8) en que se quiere
presentar al casting. La persona debe ser inscripta en ese día y turno si está
disponible. En caso contrario, sólo informe la situación. La inscripción finaliza al
llegar una persona con nombre “ZZZ” o al cubrirse los 40 cupos de casting*/

package Practica_2;

import PaqueteLectura.Lector;

public class Ejercicio_3 {
    
    public static void main(String[] args){
        
            //Definimos las Constantes.
            String fin = "ZZZ";
            int turno = 8;
            int dia = 5;
            int dimL = 0;
            int dimF = 40;
            
            // Creamos la Matriz (casting) de personas.
            Persona [][] casting = new Persona[turno][dia];
            
            // Inicializamos las posiciones de la Matriz(casting) en null.
            for (int i=0; i < turno; i++){
                for (int j=0; j < dia; j++){
                    
                    casting[i][j] = null;
                }
            }
            
            // Cargamos los datos a la Matriz(casting).
            System.out.print("Ingrese el Nombre: ");
            String nombre = Lector.leerString();
   
            while ((dimL < dimF) && (!nombre.equals(fin))){
   
                // Pedimos la info correspondiente a la "Persona"
                
                System.out.print("Ingrese su DNI: ");
                int dni = Lector.leerInt();
                System.out.print("Ingrese su Edad: ");
                int edad = Lector.leerInt();
                
                // Pedimos el "Turno y el Dia" a asistir.
                System.out.print("Ingrese el Turno a asistir (1..8): ");
                int t = Lector.leerInt();
                
                while ((t < 1) || (t > turno)){
                    System.out.println("! TURNO INVALIDO !");
                    System.out.println("Ingrese el Turno a asistir (1..8): ");
                    t = Lector.leerInt();
                }
                
                System.out.print("Ingrese el Dia a asistir (1..5): ");
                int d = Lector.leerInt();
                
                while ((d < 1) || (d > dia)){
                    System.out.println("! DIA INVALIDO !");
                    System.out.println("Ingrese el Dia a asistir (1..5): ");
                    d = Lector.leerInt();
                }
                
                
                if ((casting[t-1][d-1] == null)){
                    // Creamos el Objeto de tipo Persona.
                    Persona p = new Persona();
                    
                    // Ingresamos los datos. 
                    p.setNombre(nombre);
                    p.setDNI(dni);
                    p.setEdad(edad);
                    
                    // Cargamos la persona.
                    casting[t-1][d-1] = p;
                    dimL++;
                }
                else{
                    System.out.println("El Turno -> ["+ t + "] , El Dia -> ["+ d +"] ! Esta Ocupado! ");
                }
                
                System.out.print("Ingrese el Nombre: ");
                nombre = Lector.leerString();
            }
            
            /*b) Informar para cada día y turno: si está asignado o no y el nombre de la persona
            a entrevistar en ese caso de estar asignado.*/

            
            for (int i=0; i < turno; i++){
                System.out.println("Turno -> ["+ (i+1) +"]");
                for (int j=0; j < dia; j++) {
                    
                    if (casting[i][j] == null){
                        System.out.println("Dia -> ["+ (j+1) +"] - DISPONIBLE");
                    }
                    else {
                        System.out.println("Dia -> ["+ (j+1) +"] - ASIGNADO a -> ["+ casting[i][j].getNombre() +"]");
                    }
                }
                System.out.println();
            }
            
            
            
    }
}
