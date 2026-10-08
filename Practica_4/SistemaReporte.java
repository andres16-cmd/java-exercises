package Practica_4;

public class SistemaReporte {
    
    // Declaramos los estados(atributos).
    private String partido;
    private String provincia;
    private String fecha;
    private int N;
    private double[][] matriz_temperaturas;
    
    //Declaramos el constructor(es).
    public SistemaReporte(String unPartido, String unaProvincia, String unaFecha, int cantidad){
        setPartido(unPartido);
        setProvincia(unaProvincia);
        setFecha(unaFecha);
        setN(cantidad);
        
        // Creamos la Matriz.
        matriz_temperaturas = new double[cantidad][3];
        
        // Inicializamos todas las temperaturas en un valor Alto.
        for(int i=0; i<cantidad; i++){
            for(int j=0; j<3; j++){
                matriz_temperaturas[i][j] = 70.0;
            }
        }
        
    }
    
    // Declaramos los metodos.
    public String getPartido(){
        return partido;
    }
    
    public String getProvincia(){
        return provincia;
    }
    
    public String getFecha(){
        return fecha;
    }
    
    public int getN(){
        return N;
    }
    
    public void setPartido(String unPartido){
        partido = unPartido;
    }
    
    public void setProvincia(String unaProvincia){
        provincia = unaProvincia;
    }
    
    public void setFecha(String unaFecha){
        fecha = unaFecha;
    }
    
    public void setN(int unN){
        N = unN;
    }
    
    
    /*b) Registrar la temperatura de una localidad y franja 
    horaria recibidos por parámetro. Nota: La localidad está 
    en rango 1..N y la franja horaria está en rango 1..3.*/
    
    public void registrarTemperatura(int localidad, int horario, double temperatura){
        matriz_temperaturas[localidad-1][horario-1] = temperatura;
    }
    
    /*c) Obtener la temperatura de una localidad y franja 
    horaria recibidos por parámetro.Nota: La localidad está 
    en rango 1..N y la franja horaria está en rango 1..3. */
    public double temperatura(int localidad, int horario){
        return matriz_temperaturas[localidad-1][horario-1];
    }
    
    /*d) Devolver un String que concatene el código de 
    localidad y franja horaria en que se
    registró la mayor temperatura. */
    public String mayorTemperatura(){
        
        double maximo = -1;
        int posLocalidad = -1;
        int posHorario = -1;
        
        for(int i=0; i < getN(); i++){
            for(int j=0; j < 3; j++){
                
                if (matriz_temperaturas[i][j] > maximo){
                    maximo = matriz_temperaturas[i][j];
                    posLocalidad = i;
                    posHorario = j;
                }
            }
        }
        
        String aux = "| Codigo de Localidad -> ["+ (posLocalidad+1) +"] | Horario -> ["+ (posHorario+1) +"] |";
        
        return aux;
    }
}
