/*f) Realice un programa que cree un Sistema de Reporte Local, 
para el partido de La Plata – Bs As – 24/12/2025 y 5 localidades. 
Registre todas las temperaturas (para todas las localidades/franjas horarias).

Luego cree un Sistema de Reporte Global, para el partido de
Berisso – Bs As - 24/12/2025 y 4 localidades. Registre todas las
temperaturas (para todas las localidades/franjas horarias). Para cada sistema creado,
imprima la información retornada por los métodos d y e.*/
package Practica_4;

public class Ejercicio_4 {
    public static void main(String[] args){
      // Cargamos el Reporte Local.
        ReporteLocal reporteLocal = new ReporteLocal("La Plata", "Bs As", "24/12/2025", 5);
        
        // Registramos las temperaturas.
        for(int i=1; i<=5; i++){
            for(int j=1; j<=3; j++){
                reporteLocal.registrarTemperatura(i, j, 20 + i + j);
            }
        }
        
        // Imprimimos la mayor temperatura.
        System.out.println(reporteLocal.mayorTemperatura());
        
        // Imprimimos el reporte.
        System.out.println(reporteLocal.reporte());
        
        
        // Cargamos el Reporte Global.
        ReporteGlobal reporteGlobal = new ReporteGlobal("Berisso", "Bs As", "24/12/2025", 4);
        
        // Registramos las temperaturas.
        for(int i=1; i<=4; i++){
            for(int j=1; j<=3; j++){
                reporteGlobal.registrarTemperatura(i, j, 20 + i + j);
            }
        }
        
        // Imprimimos la mayor temperatura.
        System.out.println(reporteGlobal.mayorTemperatura());
        
        // Imprimimos el reporte.
        System.out.println(reporteGlobal.reporte());
    }
}
