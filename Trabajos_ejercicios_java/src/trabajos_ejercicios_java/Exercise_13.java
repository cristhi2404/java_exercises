
package trabajos_ejercicios_java;

import java.util.Scanner;


public class Exercise_13 {
    private static double Distance;
    private static double Velocidad;
    private static double time;
    public Exercise_13(){
        this.Distance=0;
        this.Velocidad=0;
        this.time=0;
    }
    
    public static double Calculartime(Scanner objscanner){
        System.out.println("Bienvenido a nuestro viaje.\nme podrias decir la distancia de nuestro viaje en km?");
        Distance=objscanner.nextDouble();
        System.out.println("Y tambien dime a q velocidad promediaremos en km/h?");
        Velocidad=objscanner.nextDouble();
        time=(Distance/Velocidad);
        return time;
    }
    public static void Mensaje(double time){
        System.out.println("Nuestro viaje durara "+ time+ " horas");
        double minstime=time*60;
        System.out.println("o "+minstime+" minutos");
    }
}
