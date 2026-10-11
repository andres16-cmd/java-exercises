package escuelademusica;

public class CoroSemiCircular extends Coro{
    
    // Declaracion de estado(atributos).
    private Corista [] vector_coristas;
    private int dimF;
    private int dimL;
    
    
    //Declaracion de constructor(es).
    public CoroSemiCircular(String unNombre, Director unDirector, int unaDimF){
        super(unNombre, unDirector);
        setDimF(unaDimF);
        
        dimL = 0;
        
        // Creamos el Vector de "Coristas".
        vector_coristas = new Corista[unaDimF];
    }
    
    
    // Declaracion de metodos.
   
    private void setDimF(int unaDimF){
        dimF = unaDimF;
    }
    
    public int getDimL(){
        return dimL;
    }

    /* Agregar un corista al coro.
    * En el coro semicircular los coristas se 
    deben ir agregando de izquierda a derecha*/
    
    public void agregarCorista(Corista c){
        if (getDimL() < dimF){
            vector_coristas[dimL] = c;
            dimL++;
        }
    }
    
    
    /*determinar si un coro está lleno o no. 
    Devuelve true si el coro tiene a todos sus
    coristas asignados o false en caso contrario.*/
    public boolean estaLleno(){
        return (getDimL() == dimF);
    }
    
    
    
    /*determinar si un coro (se supone que está lleno) 
    está bien formado. Un coro está bien formado si:
    En el caso del coro semicircular, de izquierda a 
    derecha los coristas están ordenados de mayor a 
    menor en cuanto a tono fundamental. */
    
    public boolean cumple(int act, int ant){
        boolean aux = false;
        
        if (act <= ant){
            aux = true;
        }
        
        return aux;
    }
    
    public boolean estaFormado(){
        
        boolean ok = true;
        int i=1;
        int anterior = vector_coristas[0].getTono();
        
        while ((i < getDimL() && (ok))){
            
            int actual = vector_coristas[i].getTono();
            
            if (cumple(actual,anterior)){
                
                i++;
                anterior = actual;
            } 
            else{
                ok = false;
            }
        }
        return ok;
    }
    
    
    @Override
    public String toString(){
        
        String aux = "| Coro SemiCircular | \n";
        
        for (int i=0; i < getDimL(); i++){
            aux += " | Posicion ["+ (i+1) +"]| \n"+ vector_coristas[i].toString();
        }
        return aux;
    }
    
    
    
}
