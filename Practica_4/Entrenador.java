package Practica_4;

public class Entrenador extends Empleado{
   
    // Declaramos estado(atributos).
    private int campeonatosGanados;
    
    // Declaramos el constructor(es).
    public Entrenador(String nombre, double sueldo, double tiempo, int cantidad){
        super(nombre,sueldo,tiempo);
        setCampeonatosGanados(cantidad);
    }
    
    // Declaramos los metodos.
    public int getCampeonatosGanados(){
        return campeonatosGanados;
    }
    
    public void setCampeonatosGanados(int unaCantidad){
        campeonatosGanados = unaCantidad;
    }
    
    
    /*La efectividad del entrenador 
    es el promedio de campeonatos ganados por año de 
    antigüedad*/
    @Override
    public double calcularEfectividad(){
        return ( getCampeonatosGanados() / getAntiguedad() );
    }

    
    /*Para los entrenadores: se adiciona un plus por 
    campeonatos ganados (5000$ si haganado entre 1 y 4 
    campeonatos; $30.000 si ha ganado entre 5 y 10 campeonatos;
    50.000$ si ha ganado más de 10 campeonatos). */
    
    @Override
    public double calcularSueldoACobrar(){
        
        double aux = super.calcularSueldoACobrar();
        
        if ((getCampeonatosGanados() >= 1 ) && (getCampeonatosGanados() <= 4)){
            aux = aux + 5000;
        } 
        else {
           if ((getCampeonatosGanados() >= 5 ) && (getCampeonatosGanados() <= 10)){
            aux = aux + 30000;
           } 
           else {
               if (getCampeonatosGanados() > 10){
                   aux = aux + 50000;
               }
           }
        }
        
        return aux;
    }
    
    @Override
    public String toString(){
        String aux = "| Entrenador | "+ super.toString() ;
        return aux;
    }
}
