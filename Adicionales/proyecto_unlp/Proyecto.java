package proyecto_unlp;

public class Proyecto {
    
    // Declaracion de estado(atributos).
    private String nombreProyecto;
    private String codigo;
    private String nombreDirector;
    private Investigador[] vector_investigadores;
    private int dimL = 0;
    
    // Declaracion de constructor(es).
    public Proyecto(String unNombreP, String unCodigo, String unNombreD){
        
        setNombreProyecto(unNombreP);
        setCodigo(unCodigo);
        setNombreDirector(unNombreD);
        
        // Creamos el vector de "Investigadores".
        vector_investigadores = new Investigador[50];
    }
    
    // Declaracion de metodos.
    
    public String getNombreProyecto(){
        return nombreProyecto;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public String getNombreDirector(){
        return nombreDirector;
    }
    
    public void setNombreProyecto(String unNombreP){
        nombreProyecto = unNombreP;
    }
    
    public void setCodigo(String unCodigo){
        codigo = unCodigo;
    }
    
    public void setNombreDirector(String unNombreD){
        nombreDirector = unNombreD;
    }
    
    //i. void agregarInvestigador(Investigador unInvestigador);
    public void agregarInvestigador(Investigador unInvestigador){
        vector_investigadores[dimL] = unInvestigador;// Agregar un investigador al proyecto.
        dimL++;
    }
 
    
    //iii. double dineroTotalOtorgado();
    /*Devolver el monto total otorgado en subsidios del 
    proyecto (tener en cuenta todos los subsidios otorgados 
    de todos los investigadores)*/
    
    public double dineroTotalOtorgado(){
        
        double aux = 0;
        for (int i=0; i < dimL; i++){
            aux += vector_investigadores[i].montoTotalSubsidios();
        }
        return aux;
    }
    
    /*iv. void otorgarTodos(String nombre_completo);
    Otorgar todos los subsidios no-otorgados del investigador llamado
    nombre_completo*/
    
    public void otorgarTodos(String nombre_completo){
        int pos = 0;
        while (!vector_investigadores[pos].getNombre().equals(nombre_completo)) {
            pos++;
        }

        vector_investigadores[pos].otorgar(); 
    }
    
    
    /*v. String toString();
    // devolver un string con: nombre del proyecto, código, 
    nombre del director, el total de dinero otorgado del 
    proyecto y la siguiente información de cada investigador: 
    nombre, categoría, especialidad, y el total de dinero de 
    sus subsidios otorgados.*/
    
    @Override
    public String toString(){
        
        String aux2 = "";
        
        for (int i=0; i < dimL; i++){
            aux2 += vector_investigadores[i].toString();
        }
        
        String aux = "| Nombre del Proyecto -> ["+ getNombreProyecto()+"] | \n"+
                    "| Codigo -> ["+ getCodigo() +"] | \n"+
                    "| Nombre del Director -> ["+ getNombreDirector() +"] | \n "+
                    "| Total de Dinero Otorgado al Proyecto -> ["+ dineroTotalOtorgado() +"] | \n"+ aux2;
  
        return aux;
    }
    
    
}
