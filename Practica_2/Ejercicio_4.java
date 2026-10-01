/*Se realizará un casting para un programa de TV. El casting durará 5 días y en cada día
se entrevistarán a 8 personas en distinto turno.

a) Simular el proceso de inscripción de personas al casting. A cada persona se le
pide sus datos (nombre, DNI y edad) y se la debe asignar en un día y turno de la
siguiente manera: las personas primero completan el primer día en turnos
sucesivos, luego el segundo día y así siguiendo. La inscripción finaliza al llegar una
persona con nombre “ZZZ” o al cubrirse los 40 cupos de casting.*/


package Practica_2;

import PaqueteLectura.Lector;

public class Ejercicio_4 {
    public static void main (String[] args){
        
        //Constantes.
        int dia = 5;
        int turno = 8;
        int contPersonas = 0;
        int maxPersonas = 40;
        String fin = "ZZZ";
        
        
        // Creamos la Matriz de personas.
        Persona[][] castingTV = new Persona[dia][turno];
        
        
        // Creamos la Carga de las Personas.
        
        int dimDia = 0;
        int dimTurno = 0;
        
        System.out.print("Ingrese el Nombre: ");
        String nombre = Lector.leerString();
        
        while ((contPersonas < maxPersonas) && (!nombre.equals(fin))){
            
            
            while ((dimTurno < turno) && (!nombre.equals(fin))){
                
                // Creamos el Objeto de tipo "Persona".
                Persona p = new Persona();
                
                // Asignamos los valores.
                p.setNombre(nombre);
                
                System.out.print("Ingrese el DNI: ");
                p.setDNI(Lector.leerInt());
                
                System.out.print("Ingrese la Edad: ");
                p.setEdad(Lector.leerInt());
                
                // Cargamos la "Persona" a la Matriz(castingTV).
                castingTV[dimDia][dimTurno] = p;
                
                // Aumentamos la dimension del Turno.
                dimTurno++;
                
                // Aumentamos el contador de personas.
                contPersonas++;
                
                if (contPersonas != maxPersonas){
                    // Pedimos el nuevo nombre.
                    System.out.print("Ingrese el Nombre: ");
                    nombre = Lector.leerString();
                }
            }
            
            if ((!nombre.equals(fin)) && (contPersonas != maxPersonas)){
                // Reiniciamos la dimension de los turnos para agregar mas personas.
                dimTurno = 0;
            
                // Aumentamos la posicion del dia.
                dimDia++;
            } 
            
        }
        
        
        /*b) Informar para cada día y turno asignado, el nombre de la persona a entrevistar.*/
        
        // Variable auxiliar para recorrido.
        int i = 0;
        int pos1 = 0;
        int pos2 = 0;
        

        while ((i < contPersonas) && (pos1 < dia)){
            
                   System.out.println("DIA -> ["+ (pos1 + 1) +"]");
            while ((i < contPersonas) && (pos2 < turno)){
                
                System.out.println("TURNO -> ["+ (pos2 + 1) +"] lo tiene -> ["
                                        + castingTV[pos1][pos2].getNombre() +"]");
                    
                // Aumentamos el turno(pos2).
                pos2++;
                // Aumentamos la cantidad de personas impresas(i).
                i++;
            }
                // Aumentamos el dia(pos1).
                pos1++;
                // Reiniciamos el turno(pos2).
                pos2 = 0;
        }

    }
}
