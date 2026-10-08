package proyecto_unlp;

public class Investigador{
    
    // Declaracion de estado(atributos).
    private String nombre;
    private int categoria;
    private String especialidad;
    
    // Manejo de cantidad de subsidios del "Investigador".
    private Subsidio [] vector_subsidios;
    private int dimL = 0;
    
    // Declaracion de constructor(es).
    public Investigador(String unNombre, int unaCategoria, String unaEspecialidad){
        setNombre(unNombre);
        setCategoria(unaCategoria);
        setEspecialidad(unaEspecialidad);
        
        // Creamos el vector de subsidios maximos.
        vector_subsidios = new Subsidio[5];

    }

    // Declaracion de metodos.
    public String getNombre(){
        return nombre;
    }
    
    public int getCategoria(){
        return categoria;
    }
    
    public String getEspecialidad(){
        return especialidad;
    }
    
    public void setNombre(String unNombre){
        nombre = unNombre;
    }
    
    public void setCategoria(int unaCategoria){
        categoria = unaCategoria;
    }
    
    public void setEspecialidad(String unaEspecialidad){
        especialidad = unaEspecialidad;
    }         
    
        
    //ii. void agregarSubsidio(Subsidio unSubsidio);
    
    // agregar un subsidio al investigador
    
    public void agregarSubsidio(Subsidio unSubsidio){
        
        if (dimL < 5){
          vector_subsidios[dimL] = unSubsidio; 
          dimL++;
        }
    }
    
    //Retornar la suma total de montos de todos los Subsidios de un "Investigador".
    public double montoTotalSubsidios(){
        double aux = 0;

        for (int i=0; i < dimL; i++){
            
            if (vector_subsidios[i].getOtorgado() == true){
                aux += vector_subsidios[i].getMonto();
            }
        }
        return aux;
    }
    
    
    public void otorgar(){
        
        for (int i=0; i<dimL; i++){
            
            if (vector_subsidios[i].getOtorgado() == false){
                
                vector_subsidios[i].setOtorgado(true);
            }     
        }
    }
    
    
    @Override
    public String toString(){
        String aux = "| Nombre Investigador -> ["+ getNombre() + "] | \n"+
                    " | Categoria -> ["+ getCategoria() +"] | \n "+
                    " | Especialidad -> ["+ getEspecialidad()+"] | \n" + 
                    " | Monto Total de Subsidios Otorgados -> ["+ montoTotalSubsidios() + "] |";
        return aux;
    }
}
