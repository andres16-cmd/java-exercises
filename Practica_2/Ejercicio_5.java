/*a) Durante el proceso de inscripción se pida a cada persona sus datos (nombre,
DNI, edad) y el día en que se quiere presentar al casting. La persona debe ser
inscripta en ese día, en el siguiente turno disponible. En caso de no existir un turno
en ese día, informe la situación. La inscripción finaliza al llegar una persona con
nombre “ZZZ” o al cubrirse los 40 cupos de casting.*/
package Practica_2;

import PaqueteLectura.Lector;

public class Ejercicio_5 {
    public static void main (String [] args){
        
        // Constantes.
        int dia = 5;
        int turno = 8;
        String fin = "ZZZ";
        int maxCupos = 40;
        int contCupos = 0;
        
        // Creamos la Matriz(casting) de "Personas".
        Persona [][] casting = new Persona[dia][turno];
        
        // Creamos un Vector Contador.
        int [] vector = new int [dia];
        
        for(int i=0; i < dia; i++){
            vector[i] = 0;
        }
        
        //Cargamos la Matriz(casting).

        System.out.print("Ingrese el Nombre: ");
        String nombre = Lector.leerString();
        
        while ((contCupos < maxCupos) && (!nombre.equals(fin))){
                        

                // Creamos el Objeto de tipo "Persona".
                Persona p = new Persona();
                
                // Asignamos los datos a sus sets.
                p.setNombre(nombre); 
                System.out.print("Ingrese el DNI: ");
                p.setDNI(Lector.leerInt());
                System.out.print("Ingrese la Edad: ");
                p.setEdad(Lector.leerInt());
                
                System.out.print("Ingrese el Dia a asistir (1..5): ");
                int diaAsistir = Lector.leerInt(); 
                
                // Evaluamos si el (dia) esta dentro del Rango.
                while ((diaAsistir < 1) || (diaAsistir > 5)){
                    System.out.println("El Dia -> ["+ diaAsistir +"] !ES INVALIDO!");
                    
                    System.out.print("Ingrese un nuevo Dia (1..5): ");
                    diaAsistir = Lector.leerInt();
                }
     
                if (vector[diaAsistir-1] < turno){
                    // Cargamos la "Persona" a su posicion.
                    casting[diaAsistir-1][vector[diaAsistir-1]] = p;
                    //Aumentamos el contador del vector.
                    vector[diaAsistir-1]++;
                    //Aumentamos la Contador de Cupos
                    contCupos++;
                }          
                else{
                    System.out.println("El Dia -> ["+ diaAsistir + "] !ESTA OCUPADO TOTALMENTE!");
                }  
                
                // Ingresamos el nuevo Nombre.
                System.out.print("Ingrese el Nombre: ");
                nombre = Lector.leerString();
        }
        
        
        
        /*b) Informar para cada día: la cantidad de inscriptos al casting ese día y el nombre
        de la persona a entrevistar en cada turno asignado.*/
         
        for (int i=0; i < dia; i++){
            System.out.println("Dia -> ["+ (i+1) +"]");
            for (int j=0; j< turno; j++){
                
                if (casting[i][j] != null){
                    System.out.print("El Turno -> ["+ (j+1) +"] lo tiene la Persona -> ["+ casting[i][j].getNombre() + "]");
                }
            }
            
            System.out.println("El Dia -> ["+ (i+1) +"] Tuvo un Total de inscriptos de -> ["+ vector[i] +"]");
        }
        
    }
        
        
}

