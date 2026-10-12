package gestorestrenos;

public class Sistema {
    
    // Declaracion de estado(atributos).
    private String nombrePlataforma;
    private int cantSubs;
    private Estreno[][] agenda;
    private int categorias;
    private int meses;
    
    
    // Declaracion de constructor(es).
    public Sistema(String unNombre, int cantS, int cantC){
        setNombrePlataforma(unNombre);
        setCantidadSubs(cantS);
        setCantidadCategorias(cantC);
        meses = 12;
        
        // Creamos la Matriz(agenda) de estrenos.
        agenda = new Estreno[cantC][meses];
        
        // Inicializamos la (agenda) sin ningun "Estreno".
        for (int i=0; i < cantC; i++){
            for (int j=0; j < meses; j++){
                agenda[i][j] = null;
            }
        }
    }
    
    // Declaracion de metodos.
    
    public String getNombrePlataforma(){
        return nombrePlataforma;
    }
    
    public int getCantSubs(){
        return cantSubs;
    }
    
    public int getCantC(){
        return categorias;
    }
    
    public void setNombrePlataforma(String unNombre){
        nombrePlataforma = unNombre;
    }
    
    public void setCantidadSubs(int cantS){
        cantSubs = cantS;
    }
    
    private void setCantidadCategorias(int cantC){
        categorias = cantC;
    }
    
    /*i. Agregar un estreno en la categoría X. 
    El estreno debe ser registrado en el primer
    mes disponible de esa categoría. Asuma que hay espacio.*/
    
    public void agregarEstreno(Estreno e, int X){
        
        int i=0;
        boolean ok = true;
        
        while ((i < meses) && (ok)){
            
            if (agenda[X-1][i] == null){
                agenda[X-1][i] = e;
                ok = false;
                i++;
            }else {
                i++;
            }
            
        }
    }
    
    /*ii. Listar los estrenos de la categoría X, 
    devolviendo un String con la representación
    de los mismos en el siguiente formato:
    “Título, tipo de contenido, recaudación, 
    cantidad de visualizaciones”}*/
    
    public String ListarEstrenosCategoriaX(int X){
        
        String aux = "";
        
        for (int i=0; i < meses; i++){
            
            if (agenda[X-1][i] != null){
            aux += "| Titulo | -> [" + agenda[X-1][i].getTitulo() +"]"
                    +" |Tipo de Contenido| -> ["+ agenda[X-1][i].getTipoContenido()+"] "
                    + "| Recaudacion | -> ["+ agenda[X-1][i].getRecaudado()+"] "
                    + "| Cantidad de Visualizaciones | -> ["+ agenda[X-1][i].getCantVisualizaciones()+"]";
            } else {
                aux += " | No hay Estreno | ";
            }
        }
        
        return aux;
    }
    
    /*iii. Calcular la ganancia total de la 
    plataforma en estrenos. Considere que la ganancia
    de un estreno es la mitad de la recaudación.*/
    
    public double gananciaEstreno(double valor){
        return (valor / 2);
    }
    
    
    public double gananciaTotal(){
        
        double total = 0;
        
        for (int i=0; i < getCantC(); i++){
            for (int j=0; j < meses; j++){
                
                if(agenda[i][j] != null){
                    total = total + gananciaEstreno(agenda[i][j].getRecaudado());
                }
            }
        }
        
        return total;
    }
    
    /*iv. Obtener un String que represente el 
    sistema de estrenos siguiendo el ejemplo:
    “Nombre de la Plataforma, Cantidad de Suscriptores
    Categoría 1: listado de estrenos de la categoría 1
    …
    Categoría C: listado de estrenos de la categoría C
    Ganancia total en estrenos"*/
    
    @Override
    public String toString(){
        String aux = "| Nombre de la Plataforma | -> [" + getNombrePlataforma() 
                      +"| Cantidad de Subscriptores | -> ["+ getCantSubs() +"] ";
        
        for (int i=0; i < getCantC(); i++){
            
             aux += "| Categoria["+ (i+1) +"]: \n "+ ListarEstrenosCategoriaX(i+1);
        }
        
            aux += "| Ganancia Total en Estrenos | -> ["+ gananciaTotal() +"]";
            
        return aux;
    }
    
    
}
