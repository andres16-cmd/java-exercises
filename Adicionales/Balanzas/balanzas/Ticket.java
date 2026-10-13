package balanzas;

public class Ticket {

    // Declaracion de estado(atributos).
    private int numeroCompra;
    private String resumen;
    private double montoTotal;
    
    
    // Declaracion de constructor(es).
    public Ticket(int unNumero, String unResumen, double unTotal){
        setNumero(unNumero);
        setResumen(unResumen);
        setTotal(unTotal);
    }

    public int getNumeroCompra() {
        return numeroCompra;
    }

    public void setNumero(int numeroCompra) {
        this.numeroCompra = numeroCompra;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }
    
    
    
}
