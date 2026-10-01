package Practica_2;

import PaqueteLectura.Lector;

public class Ejercicio_6 {
    public static void main (String [] args){
        
        
        // Constantes.
        final int dimF = 20;
        final String fin = "ZZZ";
        
        // Variables.
        int dimL = 0;
        
        
        //Creamos el Vector de Objetos de Tipo "Partido".
        Partido [] vector = new Partido [dimF];
        
        
        // Cargamos el Vector.
        
        System.out.print("Ingrese el Nombre del Equipo LOCAL: ");
        String nombreLocal = Lector.leerString();
        System.out.print("Ingrese el Nombre del Equipo VISITANTE: ");
        String nombreVisitante = Lector.leerString();
        
        while ((dimL < dimF) && (!nombreVisitante.equals(fin))){
            
            System.out.print("Ingrese la Cantidad de Goles del Equipo LOCAL: ");
            int golesLocal = Lector.leerInt();
            
            System.out.print("Ingrese la Cantidad de Goles del Equipo VISITANTE: ");
            int golesVisitante = Lector.leerInt();
        
            // Creamos el Objeto de tipo "Partido".
            Partido partido = new Partido();
            
            // Cargamos los datos ingresados.
            partido.setLocal(nombreLocal);
            partido.setVisitante(nombreVisitante);
            partido.setGolesLocal(golesLocal);
            partido.setGolesVisitante(golesVisitante);
            
            // Cargamos el Vector con el respectivo "Pratido".
            vector[dimL] = partido;
            
            // Aumentamos la dimension Logica del vector.
            dimL++;
            
            // Pedimos la informacion del siguiente "Partido".
            System.out.print("Ingrese el Nombre del Equipo LOCAL: ");
            nombreLocal = Lector.leerString();
            System.out.print("Ingrese el Nombre del Equipo VISITANTE: ");
            nombreVisitante = Lector.leerString();
        
        }
        
        /* Para cada partido, armar e informar una representación String del estilo:
        {EQUIPO-LOCAL golesLocal VS EQUIPO-VISITANTE golesVisitante }
        
         - Calcular e informar la cantidad de partidos que ganó River.
        
         - Calcular e informar el total de goles que realizó Boca jugando de local.
        
        */
        
        // Variables Auxiliares.
        int cont1 = 0;
        String equipo1 = "River";
        int total2 = 0;
        String equipo2 = "Boca";
        
        for (int i=0; i < dimL; i++){
            System.out.println("Partido -> ["+ (i+1) +"]");
            System.out.println("{"+vector[i].getLocal() +"- ["+ vector[i].getGolesLocal() +"] VS "+
                             vector[i].getVisitante() +"-["+vector[i].getGolesVisitante()+"]}");
        
            if (vector[i].getGanador().equals(equipo1)){
                cont1++;
            }
            
            if (vector[i].getLocal().equals(equipo2)){
                total2 = total2 + vector[i].getGolesLocal();
            }
        }
        
        System.out.println("La Cantidad de Partidos que GANO "+ equipo1 +" fue de -> ["+ cont1 +"]");
        System.out.println("El Total de Goles que realizo "+ equipo2 +" jugando de LOCAL fue de -> ["+ total2 +"]");
    }
}
