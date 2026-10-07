package Practica_4;

public abstract class Figura {
    
    // Declaramos el estado (atributos).
    private String colorRelleno;
    private String colorLinea;
   
    // Declaramos el constructor(es).
    public Figura(String unCR, String unCL){
        setColorRelleno(unCR);
        setColorLinea(unCL);
    }
    
    // Declaramos los metodos.
    public String toString(){
        String aux = " Area: " + this.calcularArea() +
                     " Perimetro: "+ this.calcularPerimetro() +
                     " CR: "  + getColorRelleno() + 
                      " CL: " + getColorLinea();             
        return aux;
    }

    
    public String getColorRelleno(){
        return colorRelleno;       
    }
    public void setColorRelleno(String unColor){
        colorRelleno = unColor;       
    }
    public String getColorLinea(){
        return colorLinea;       
    }
    public void setColorLinea(String unColor){
        colorLinea = unColor;       
    }
    /*E- Añada el método despintar que establece los colores 
    de la figura a línea “negra” y relleno “blanco”. Piense 
    ¿dónde debe definir el método: en cada subclase o en Figura?*/
    
    public void despintar(){
        setColorRelleno("blanco");
        setColorLinea("negra");
    }
    
    
    /*F- Añada el método esGrande que retorne un booleano que 
    indique si el área de la figura supera el valor 100. 
    Piense ¿dónde debe definir el método: en cada subclase o en Figura?*/
    
    public boolean esGrande(){
        boolean aux = false;
        
        if(this.calcularArea() > 100){
            aux = true;
        } 

        return aux;
    }
    
    
    public String mensaje(){
        String aux;
        if (esGrande()){
            aux = "es Mayor que 100.";
        } else{
            aux = "NO es Mayor que 100.";
        }
        return aux;
    }
    
    
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
     
}
