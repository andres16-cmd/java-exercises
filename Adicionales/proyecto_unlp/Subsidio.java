package proyecto_unlp;

public class Subsidio {
    
    // Declaracion de estado(atributos).
    private double monto;
    private String motivo;
    private boolean otorgado;
    
    // Declaracion de constructor(es).
    public Subsidio(double unMonto, String unMotivo){
        setMonto(unMonto);
        setMotivo(unMotivo);
        otorgado = false;
    }
    
    // Declaracion de metodos.
    public double getMonto(){
        return monto;
    }
    
    public String getMotivo(){
        return motivo;
    }
    
    public boolean getOtorgado(){
        return otorgado;
    }
    
    public void setMonto(double unMonto){
        monto = unMonto;
    }
    
    public void setMotivo(String unMotivo){
        motivo = unMotivo;
    }
   
    public void setOtorgado(boolean o){
        otorgado = o;
    }
    
    
} 
