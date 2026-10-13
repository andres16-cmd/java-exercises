package balanzas;

public class Avanzada extends Balanza{
    
    // Declaracion de estado(atributos).
    private int cantFrutas;
    private int cantVerduras;
    
    
    // Declaracion de constructor(es).
    public Avanzada(){
        super();
        cantFrutas = 0;
        cantVerduras = 0;
    }
    
    
    // Declaracion de metodos.

    public int getCantFrutas() {
        return cantFrutas;
    }

    public int getCantVerduras() {
        return cantVerduras;
    }

    @Override
    public void reiniciarBalanza(){
        super.reiniciarBalanza();
        cantFrutas = 0;
        cantVerduras = 0;
    }
    
    @Override
    public void agregarProducto(Producto p){
        super.agregarProducto(p);
        
        if (p.getRubro().equals("Verdura")){
            cantVerduras++;
        } else {
            
            if (p.getRubro().equals("Fruta")){
                cantFrutas++;
            }
        }
    }
    
    @Override
    public Ticket finalizarCompra(){

        Ticket ticket = super.finalizarCompra();

        String aux = ticket.getResumen()
                + "| Cantidad de Frutas | -> [" + cantFrutas + "] "
                + "| Cantidad de Verduras | -> [" + cantVerduras + "]";

        return new Ticket(ticket.getNumeroCompra(), aux, ticket.getMontoTotal());
    }

}
