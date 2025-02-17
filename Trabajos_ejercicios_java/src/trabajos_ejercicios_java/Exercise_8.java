
package trabajos_ejercicios_java;

import java.util.Scanner;

public class Exercise_8 {
    private static int Marcador1;
    private static int Marcador2;
    public Exercise_8(){
        this.Marcador1=0;
        this.Marcador2=0;
    }
    public static void Analizarmarcador(Scanner objscanner){
        System.out.println("Ingrese el score del primer equipo");
        Marcador1=objscanner.nextShort();
        System.out.println("Ingrese el score del segundo equipo");
        Marcador2=objscanner.nextShort();
        if(Marcador1<Marcador2){
            System.out.println("Equipo 2 haz ganado");
        }else if(Marcador1==Marcador2){
            System.out.println("Han quedado en empate");
        }else if(Marcador1>Marcador2){
            System.out.println("Equipo 1 haz ganado");
        }
    }
}
