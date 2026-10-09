package gestion_estacionamiento;

public class Estacionamiento {
    
    // Declaramos el estado(atributo).
    private String nombreE;
    private String direccion;
    private String horaApertura;
    private String horaCierre;
    private Auto[][] matriz;
    private int N; // Cantidad de Pisos.
    private int M; // Cantidad de Plazas.
    
    // Declaramos el constructor(es).
    public Estacionamiento(String unNombre, String unaDireccion){
        setNombreEstacionamiento(unNombre);
        setDireccion(unaDireccion);
        setHoraApertura("8:00");
        setHoraCierre("21:00");
        N = 5; // Cantidad de Pisos.
        M = 10; // Cantidad de Plazas.
        
        // Creamos la Matriz.
        matriz = new Auto[N][M];
        
        /*El estacionamiento inicialmente no tiene autos.*/
        for (int i=0; i < N; i++){
            for (int j=0; j < M; j++){
                matriz[i][j] = null;
            }
        }
    }
    
    
    public Estacionamiento(String unNombre, String unaDireccion, String apertura, String cierre, int pisos, int plazas){
        
        setNombreEstacionamiento(unNombre);
        setDireccion(unaDireccion);
        setHoraApertura(apertura);
        setHoraCierre(cierre);
        setPisos(pisos);
        setPlazas(plazas);
        
        // Creamos la Matriz.
        matriz = new Auto[pisos][plazas];
        
        /*Iniciar el estacionamiento con los datos recibidos y sin autos.*/
        for (int i=0; i < pisos; i++){
            for (int j=0; j < plazas; j++){
                matriz[i][j] = null;
            }
        }
    }
    
    
    
    // Declaramos los metodos.
    
    public String getNombreEstacionamiento(){
        return nombreE;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public String getHoraApertura(){
        return horaApertura;
    }
    
    public String getHoraCierre(){
        return horaCierre;
    }
    
    
    public void setNombreEstacionamiento(String unNombre){
        nombreE = unNombre;
    }
    
    public void setDireccion(String unaDireccion){
        direccion = unaDireccion;
    }
    
    public void setHoraApertura(String apertura){
        horaApertura = apertura;
    }
    
    public void setHoraCierre(String cierre){
        horaCierre = cierre;
    }
    
    private void setPisos(int pisos){
        N = pisos;
    }
    
    private void setPlazas(int plazas){
        M = plazas;
    }
    
    private int getPisos(){
        return N;
    }
    
    private int getPlazas(){
        return M;
    }
    
    
    /* Dado un auto A, un número de piso X 
    y un número de plaza Y, registrar al auto
    en el estacionamiento en el lugar X,Y. 
    Suponga que X, Y son válidos (es decir,
    están en rango 1..N y 1..M respectivamente)
    y que el lugar está desocupado.*/
    
    public void registrarAuto(Auto A, int X, int Y){
        matriz[X-1][Y-1] = A;
    }
    
    
    /*Dada una patente, obtener un String que contenga 
    el número de piso y plaza donde está dicho auto en 
    el estacionamiento. En caso de no encontrarse,
    retornar el mensaje “Auto Inexistente”.*/
    
    public String Obtener(String patente){
        String aux = "Auto Inexistente";
        
        boolean ok = false;
        int i=0;

        while ((i < getPisos()) && (ok == false)){
            int j=0;
            while ((j < getPlazas()) && (ok == false)){
                
                if ((matriz[i][j] != null) && (matriz[i][j].getPatente().equals(patente))){
                    aux = "Piso -> ["+ (i+1) +"] Plaza -> ["+ (j+1) +"]";
                    ok = true;
                }
                j++;
            }
            i++;
        }
        
        return aux;
    }
    
    
    /*Obtener un String con la representación del estacionamiento. Ejemplo:
    “Piso 1 Plaza 1: libre Piso 1 Plaza 2: representación del auto …
    Piso 2 Plaza 1: libre … etc”*/
    
    @Override
    public String toString(){
        
        String aux = "";
        
        for (int i=0; i < getPisos(); i++){
            for (int j=0; j < getPlazas(); j++){
                aux += "Piso["+ (i+1) +"] Plaza["+ (j+1)+ "]";
                
                if (matriz[i][j] != null){
                    aux += matriz[i][j].toString();
                } else {
                    aux += "Libre";
                }
            }
        }
        
        return aux;
    }
    
    /*Dado un número de plaza Y, obtener la cantidad de 
    autos ubicados en dicha plaza 
    (teniendo en cuenta todos los pisos).*/
    
    public int cantAutosEnPlaza(int Y){
        
        int cont = 0;
        
        for (int i=0; i < getPisos(); i++){
            
            if (matriz[i][Y-1] != null){
                cont++;
            }
        }
        
        return cont;
    }
    
}
