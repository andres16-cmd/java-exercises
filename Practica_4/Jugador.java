package Practica_4;


public class Jugador extends Empleado{
    
    // Declaramos estado(atributos).
    private int partidosJugados;
    private int cantidadGoles;
    
    // Declaramos el constructor(es).
    public Jugador(String nombre, double sueldo, double tiempo, int unaCantidadPartidos, int unaCantidadGoles){
        super(nombre,sueldo,tiempo);
        setPartidosJugados(unaCantidadPartidos);
        setGoles(unaCantidadGoles);
    }
    
    
    // Declaramos los metodos.
    
    public int getPartidosJugados(){
        return partidosJugados;
    }
    
    public void setPartidosJugados(int unaCantidadPartidos){
        partidosJugados = unaCantidadPartidos;
    }
    
    public int getGoles(){
        return cantidadGoles;
    }
    
    public void setGoles(int unaCantidadGoles){
        cantidadGoles = unaCantidadGoles;
    }
    /*La efectividad del Jugador es el 
    promedio de goles por partido.*/
    @Override
    public double calcularEfectividad(){
        return ((double)getGoles() / getPartidosJugados());
    }
    
    /*Para los jugadores: si el promedio 
    de goles por partido es superior a 
    0,5 se adiciona un plus de otro 
    sueldo básico*/
    @Override
    public double calcularSueldoACobrar(){
        
        double aux = super.calcularSueldoACobrar();
        
        if (calcularEfectividad() > 0.5){
            aux = aux + getSueldo();
        }
        
        return aux;
    }
    
    @Override
    public String toString(){
        String aux = "| Jugador |" + super.toString();
        return aux;
    }
}
