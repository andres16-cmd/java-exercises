/*c) Realice un programa que instancie una 
plataforma de streaming. Registre varios
estrenos y compruebe el correcto funcionamiento 
de los métodos implementados*/
package gestorestrenos;

public class Ejercicio_5 {
    public static void main(String[] args){
        
        // Creamos un Objeto(Sistema) y lo Cargamos
        Sistema sistema = new Sistema("Youtube",200,2);
        
        for (int i=0; i< 4; i++){
            Estreno estreno = new Estreno("Nuevo Mundo","Historico",250.25,90);
            sistema.agregarEstreno(estreno,2);
        }
        
        System.out.println(sistema.toString());
    }
}
