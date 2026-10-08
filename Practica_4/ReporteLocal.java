package Practica_4;

public class ReporteLocal extends SistemaReporte {
    
    // Declaracion de estado(atributos).
    
    
    // Declaracion del constructor(es).
    public ReporteLocal(String unPartido, String unaProvincia, String unaFecha, int cantidad){
        super(unPartido,unaProvincia,unaFecha,cantidad);
    }
    
    // Declaracion de metodos.
  
    /*e) Devolver un reporte String con el nombre del partido, provincia, fecha y las
    temperaturas promedio según el tipo de sistema: El Sistema de Reporte 
    Local debe calcular la temperatura promedio de cada localidad
    (el promedio de la localidad X se calcula con sus datos en todas las franjas horarias).
    Ej: “La Plata – Buenos Aires – 24/12/2025
    Localidad 1: 39,8 ºC;
    Localidad 2: 37,7 ºC;
            … ”*/
    
    public double temperaturaPromedio(int localidad){
        
        double aux = 0;
        
        for(int i=0; i<3; i++){
            aux+=temperatura(localidad,i+1);
        }
        
        return (aux/3);
    }
    
    public String reporte(){
        
        String aux = getPartido() +"-"+ getProvincia() +"-"+ getFecha()+"\n";
        
        for(int i=0; i<getN(); i++){
            aux += "Localidad -> ["+ (i+1) +"]" + temperaturaPromedio(i+1) +"ºC;\n";
        }
        return aux;
    }  
}
