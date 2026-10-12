package gestorestrenos;

public class Estreno {
    
    // Declaracion de estado(atributos).
    private String titulo;
    private String tipoContenido;
    private double recaudacionObtenida;
    private int cantVisualizaciones;
    
    
    // Declaracion de constructor(es).
    public Estreno(String unTitulo, String unTipo, double unaRec, int cantV){
        setTitulo(unTitulo);
        setTipoContenido(unTipo);
        setRecaudado(unaRec);
        setCantVisualizaciones(cantV);
    }
    
    
    // Declaracion de metodos.
    public String getTitulo(){
        return titulo;
    }
    
    public String getTipoContenido(){
        return tipoContenido;
    }
    
    public double getRecaudado(){
        return recaudacionObtenida;
    }
    
    public int getCantVisualizaciones(){
        return cantVisualizaciones;
    }
    
    public void setTitulo(String unTitulo){
        titulo = unTitulo;
    }
    
    public void setTipoContenido(String unContenido){
        tipoContenido = unContenido;
    }
    
    public void setRecaudado(double loRecaudado){
        recaudacionObtenida = loRecaudado;
    }
    
    public void setCantVisualizaciones(int unaCant){
        cantVisualizaciones = unaCant;
    }
    
    
}
