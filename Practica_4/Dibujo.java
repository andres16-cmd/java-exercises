package Practica_4;

public class Dibujo {
    private String titulo;
    private Figura [] vector;
    private int guardadas;
    private int capacidadMaxima = 10;
    
    //inicia el dibujo, sin figuras
    public Dibujo (String titulo){
    //completar
    setTitulo(titulo);
    guardadas = 0;
    vector = new Figura[capacidadMaxima];
    }

    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String unTitulo){
        titulo = unTitulo;
    }
    
    //agrega la figura al dibujo
    public void agregar(Figura f){
    //completar
    vector[guardadas] = f;
    guardadas++;
    System.out.println("la figura "+f.toString() +" se ha guardado");
    }

    //calcula el área del dibujo:
    //suma de las áreas de sus figuras
    public double calcularArea(){
    //completar
        double aux = 0;
        for (int i=0; i < guardadas; i++){
            aux+=vector[i].calcularArea();
        }
        return aux;
    }
    
    //imprime el título, representación
    //de cada figura, y área del dibujo
    public void mostrar(){
    //completar
        System.out.println("Titulo -> ["+ getTitulo() +"]");
        
        for(int i=0; i<guardadas; i++){
            System.out.println(vector[i].toString());
        }
        
        System.out.println("Area del Dibbujo -> ["+ this.calcularArea() +"]");
    
    }
    //retorna está lleno el dibujo
    public boolean estaLleno() {
    return (guardadas == capacidadMaxima);
    }
}



