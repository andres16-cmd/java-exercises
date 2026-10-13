package balanzas;

public class Producto {
    
    // Declaramos el estado(atributos).
    private String descripcion;
    private String rubro;
    private double pesoKg;
    private double precioKg;
    
    
    // Declaramos el constructor(es).
    public Producto(String unaD, String unR, double unPeso, double unPrecio){
        setDescripcion(unaD);
        setRubro(unR);
        setPesoKg(unPeso);
        setPrecioKg(unPrecio);
    }
    
    // Declaramos los metodos.
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public String getRubro(){
        return rubro;
    }
    
    public double getPesoKg(){
        return pesoKg;
    }
    
    public double getPrecioKg(){
        return precioKg;
    }
    
    public void setDescripcion(String unaD){
        descripcion = unaD;
    }
    
    public void setRubro(String unR){
        rubro = unR;
    }
    
    public void setPesoKg(double unPeso){
        pesoKg = unPeso;
    }
    
    public void setPrecioKg(double unPrecio){
        precioKg = unPrecio;
    }
    
    
    @Override
    public String toString(){
        
        String aux = "| Descripcion | -> ["+ getDescripcion() +"] ";
        
        return aux;
    }
}
