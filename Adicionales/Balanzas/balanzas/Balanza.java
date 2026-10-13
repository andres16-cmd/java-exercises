package balanzas;

public class Balanza {
    
    // Declaracion de estado(atributos).
    private int numeroCompraActual;
    private Producto[] vector;
    private int dimL;
    private int dimF;
    
    // Declaracion de constructor(es).
    public Balanza(){
        
        numeroCompraActual = 1;
        dimL = 0;
        dimF = 30;
        // Creamos el vector.
        vector = new Producto[dimF];    
    }
    
    
    // Declaracion de metodos.
   
    
    /*i- Reiniciar la balanza, preparándola 
    para una nueva compra. Para esto:
    incrementa el nro. de compra actual y 
    borra los productos almacenados; además, la
    versión avanzada reinicia sus contadores a 0.*/
    
    public void reiniciarBalanza(){
        numeroCompraActual++;
        dimL = 0;
        for (int i=0; i < dimF; i++){
            vector[i] = null;
        }
    }
    
    
    
    /*ii- Registrar un producto, esto es: agrega el
    producto en la balanza; además la versión 
    avanzada debe incrementar el contador adecuado 
    según este producto sea verdura o fruta.*/
    
    
    public void agregarProducto(Producto p){
        
        vector[dimL] = p;
        dimL++;
    }
    
    
    /*iii- Obtener el monto total a pagar por la 
    compra, teniendo en cuenta que es la suma de 
    los precios finales de los productos cargados 
    (el precio final de un
    producto es peso_en_kilos * precio_por_kilo).*/
    
    public double calcular(double precio, double peso){
        return (precio * peso);
    }
    
    
    public double montoTotal(){
        
        double aux = 0;
        for (int i=0; i < dimL; i++){
            aux = aux + calcular(vector[i].getPrecioKg(),vector[i].getPesoKg());
        }
        
        return aux;
    }
    
    
    
    /*iv- Finalizar la compra, teniendo en cuenta que: 
    la balanza de versión básica crea y retorna un Ticket 
    con nro. de compra, resumen (que concatena de cada producto:
    descripción y su precio final), y monto total de la 
    compra; además la balanza de versión avanzada añade 
    al resumen de ese Ticket la cantidad de frutas y 
    cantidad de verduras de la compra*/
    
    
    public Ticket finalizarCompra(){

        String aux = "";

        for (int i=0; i < dimL; i++){
            aux += "| Descripcion | -> [" + vector[i].getDescripcion() + "] "
                    + "| Precio Final | -> [" 
                    + calcular(vector[i].getPrecioKg(), vector[i].getPesoKg()) + "] ";
        }

        return new Ticket(numeroCompraActual, aux, montoTotal());
    }   
    
}
