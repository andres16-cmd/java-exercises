
package Practica_4;

public class ReporteGlobal extends SistemaReporte{
    
    // Declaracion de cosntructor.
    public ReporteGlobal(String unPartido, String unaProvincia, String unaFecha, int cantidad){
        super(unPartido,unaProvincia,unaFecha,cantidad);
    }
    
    // Declaracion de metodos.
    
    /*el Sistema de Reporte Global debe calcular la 
    temperatura promedio de cada franja horaria 
    (el promedio de la franja X se calcula con sus 
    datos en todas las localidades).*/

    public double temperaturaPromedio(int X){
        
        double aux = 0;
        
        for(int i=0; i<getN(); i++){
            aux+= temperatura(i+1,X);
        }
        return (aux/getN());
    }
    
    public String reporte(){
        
        String aux = getPartido() +"-"+ getProvincia() +"-"+ getFecha()+"\n";
        
        for(int i=0; i<3; i++){
            aux += "Franja Horaria -> ["+ (i+1) +"]" + temperaturaPromedio(i+1) +"ºC;\n";
        }
        return aux;
    }
}



