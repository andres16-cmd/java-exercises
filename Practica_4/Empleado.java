/* 2- Queremos representar a los empleados de un club: jugadores y entrenadores.
 Cualquier empleado se caracteriza por su nombre, sueldo básico y antigüedad.*/
package Practica_4;

public abstract class Empleado {
    
    // Declaramos el estado(atributos).
    private String nombre;
    private double sueldoBasico;
    private double antiguedad;
    
    // Declaramos el constructor(es).
    public Empleado(String unNombre, double unSueldo, double unTiempo){
        setNombre(unNombre);
        setSueldo(unSueldo);
        setAntiguedad(unTiempo);
    }
    
    // Declaramos los metodos.
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String unNombre){
        nombre = unNombre;
    }
    
    public double getSueldo(){
        return sueldoBasico;
    }
    
    public void setSueldo(double unSueldo){
        sueldoBasico = unSueldo;
    }
    
    public double getAntiguedad(){
        return antiguedad;
    }
    
    public void setAntiguedad(double unTiempo){
        antiguedad = unTiempo;
    }
   
    
    /*D- Cualquier empleado debe responder al mensaje 
    toString, que devuelve un String que lo representa, 
    compuesto por nombre, sueldo a cobrar y efectividad. */
    
    @Override
    public String toString(){
        String aux = "| Nombre -> ["+ getNombre() + "] | Sueldo a Cobrar -> ["+ this.calcularSueldoACobrar() +
                "] | Efectividad -> [" + this.calcularEfectividad() +"]";
        
        return aux;
    }
    
    /*B- Cualquier empleado debe responder al mensaje 
    calcularEfectividad. La efectividad del entrenador 
    es el promedio de campeonatos ganados por año de 
    antigüedad, mientras que la del jugador es el 
    promedio de goles por partido.*/
    
    public abstract double calcularEfectividad();
    
    /*Cualquier empleado debe responder al mensaje 
    calcularSueldoACobrar. El sueldo a cobrar es el 
    sueldo básico más un 10% del básico por 
    cada año de antigüedad*/
    
    public double calcularSueldoACobrar(){
        double aux = (this.getSueldo() * 0.1);
        
        return (aux * this.getAntiguedad()) + this.getSueldo();
    }

}
