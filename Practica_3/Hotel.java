package Practica_3;

public class Hotel {
    
    //Declaracion de estado (atributos).
    private int N;
    private Habitacion[] vector; 
    
    
    //Declaracion de constructor(es).
    public Hotel(int unaDimF, double precioFrente, double precioContraFrente){
        N = unaDimF;
        
        // Creamos el vector.
        vector = new Habitacion[unaDimF];
        
        // Inicializamos el vector de "habitaciones" con los valores requeridos por el inciso.
        for (int i=0; i < unaDimF; i++){

            if ((i%2) != 0){ // Evaluamos si la habitacion es frente(indice impar).
                // Creamos la "Habitacion".
                Habitacion h = new Habitacion(false,precioFrente);
                
                // Guardo la "Habitacion -> (h)" en el vector.
                vector[i] = h;
            } else{
                // Creamos la "Habitacion".
                Habitacion h = new Habitacion(false,precioContraFrente);
                
                // Guardo la "Habitacion -> (h)" en el vector.
                vector[i] = h;
            }
        }
    }

    // Declaracion de metodos.
    
    /*Ingresar un cliente C en la habitación número X del hotel. 
    Asuma que X está en rango 1..N y que la habitación está libre. */
    
    public void cargarHotel(Cliente C, int X){
        
        if (vector[X-1].getOcupada() == false){ // Pregunto si esta DESOCUPADA.
            vector[X-1].setOcupada(true);// Cambiamos su valor a ocupada.
            vector[X-1].setCliente(C); // Guardo el Cliente en la habitacion.
        }
    }
    
    /*Aumentar el precio de todas las habitaciones 
    del hotel en un monto recibido.*/
    public void aumentarPrecioHabitaciones(double precio){
        
        // Recorremos todas las habitaciones del hotel.
        for (int i=0; i < N; i++){
            
            // Recibimos el precio de la habitacion y luego le sumamos el aumento.
            double aux = vector[i].getCosto() + precio; 
            // Agregamos el Aumento.
            vector[i].setCosto(aux);
        }
    }
    
    
    /*Obtener la representación String del hotel, siguiendo el formato:
    {Habitación N: costo, libre u ocupada, información del cliente si está ocupada} */
    
    @Override
    public String toString(){
        String aux = "";
        
        // Recorremos el Hotel.
        for(int i=0; i < N; i++){
              aux += "Habitacion -> ["+ (i+1) +"] | "+ vector[i].toString()+"\n";
        }
        return aux;
    }
}
