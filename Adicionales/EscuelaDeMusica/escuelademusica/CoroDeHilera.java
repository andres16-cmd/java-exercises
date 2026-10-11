package escuelademusica;

public class CoroDeHilera extends Coro{
    
    // Declaracion de estado(atributos).
    private Corista [][] matriz_coristas;
    private int filas;
    private int columnas;
    private int dimL;
    
    
    // Declaracion de constructor(es).
    public CoroDeHilera(String unNombre, Director unD, int cantFilas, int cantColumnas){
        super(unNombre,unD);
        setFilas(cantFilas);
        setColumnas(cantColumnas);
        
        dimL = 0;
        
        // Creamos la matriz de "Coristas".
        matriz_coristas = new Corista[cantFilas][cantColumnas];
    }
    
    
    // Declaracion de metodos.
    
    private void setFilas(int cantF){
        filas = cantF;
    }
    
    private void setColumnas(int cantC){
        columnas = cantC;
    }
    
    public int getDimL(){
        return dimL;
    }
    
    /* Agregar un corista al coro.
    En el coro por hileras los coristas 
    se deben ir agregando de izquierda a
    derecha, completando la hilera antes de 
    pasar a la siguiente.*/
    
    public boolean hayLugar(){
        return (getDimL() < (filas*columnas));
    }

    public void agregarCorista(Corista c){
        
        if (hayLugar()){
            int i= getDimL() / columnas; // Calculamos la Fila.
            int j= getDimL() % columnas;// Calculamos la Columna.
            
            matriz_coristas[i][j] = c;
            dimL++;
        }
    }
    
    /*determinar si un coro está lleno o no. 
    Devuelve true si el coro tiene a todos sus
    coristas asignados o false en caso contrario.*/
    public boolean estaLleno(){
        return (getDimL() == (filas*columnas));
    }
    
    
    /*Determinar si un coro (se supone que está lleno) 
    está bien formado. Un coro está bien formado si:
    En el caso del coro por hileras, todos los miembros 
    de una misma hilera tienen el mismo tono fundamental.*/
    
    public boolean cumple(int ant, int act){
        boolean aux = false;
        
        if (ant == act){
            aux = true;
        }
        
        return aux;
    }
    
    
    
    public boolean estaFormado(){
        
        boolean ok = true;
        int i = 0; // Fila.
        
        
        while ((i < filas) && (ok)){
            int j = 1; // Columna.
            int anterior = matriz_coristas[i][0].getTono();
            
            while ((j < columnas) && (ok)){
                
                int actual = matriz_coristas[i][j].getTono();
                if (cumple(anterior,actual)){
                    j++;
                    anterior = actual;
                } else{
                    ok = false;
                }
            }
            i++;
        
        }
        
        return ok;
    }
    
    
    
    @Override
    public String toString(){
        String aux = "| Coro de Hilera | \n";
        
        int ok = 0;
        int i = 0;
        
        while ((i < filas) && (ok < getDimL())){
            int j = 0;
            while((j < columnas) && (ok < getDimL())){
                aux += "\n  | Posicion ["+ (i+1) +","+ (j+1) +"] | \n"
                        + matriz_coristas[i][j].toString();
                ok++;
                j++;
            }
            i++;
        }
        return aux;
    }
    
    
    
}
