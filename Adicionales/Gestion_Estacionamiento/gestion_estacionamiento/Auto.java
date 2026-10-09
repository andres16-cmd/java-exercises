package gestion_estacionamiento;

public class Auto {
    
    // Declaracion de estado(atributos).
    private String nombreDueño;
    private String patente;
    
    // Declaracion de constructor.
    public Auto(String unNombre, String unaPatente){
        setNombreDueño(unNombre);
        setPatente(unaPatente);
    }
    
    // Declaracion de metodos.
    
    public String getNombreDueño(){
        return nombreDueño;
    }
    
    public String getPatente(){
        return patente;
    }
    
    public void setNombreDueño(String unNombre){
        nombreDueño = unNombre;
    }
    
    public void setPatente(String unaPatente){
        patente = unaPatente;
    }
    
    @Override
    public String toString(){
        String aux = " | Nombre Del Dueño -> ["+ getNombreDueño() + "] |"
                    + "| Patente -> ["+ getPatente() +"] |";
        return aux;
    }
}

