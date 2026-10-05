package Practica_3;

public class Habitacion {
    
    // Declaracion de estado (atributos).
    private boolean ocupada;
    private double costo;
    private Cliente cliente;
    
    // Declaracion de constructor(es).
    
    public Habitacion (boolean estado, double unCosto){
        ocupada = estado;
        costo = unCosto;
    }
    
    public Habitacion (boolean estado, double unCosto, Cliente unCliente){
        ocupada = estado;
        costo = unCosto;
        cliente = unCliente;
    }
    
    // Declaracion de metodos.
    
    public boolean getOcupada(){
        return ocupada;
    }
    
    public double getCosto(){
        return costo;
    }
    
    public Cliente getCliente(){
        return cliente;
    }
    
    public void setCosto(double unCosto){
        costo = unCosto;
    }
    
    public void setOcupada(boolean estado){
        ocupada = estado;
    }
    
    public void setCliente(Cliente unCliente){
        cliente = unCliente;
    }
    
    @Override
    public String toString(){
        String aux = "Disponibilidad -> [ DESOCUPADA ] | Costo -> ["+ costo +"]";
        
        if (ocupada == true){
            aux = "OCUPADA";
            return "Disponibilidad -> ["+ aux +"] | Costo -> ["+ costo +"] | Cliente -> ["+ cliente.toString() +"]";
        }    
        
        return aux;
    }
}
