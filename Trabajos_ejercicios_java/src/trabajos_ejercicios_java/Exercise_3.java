
package trabajos_ejercicios_java;

import java.util.Scanner;


public class Exercise_3 {
    
    private static int TemperaturaUser;
    
    public Exercise_3(){
        this.TemperaturaUser=0;
    }
    
    
    public static void Registrotemperatura(){
        Scanner objscanner=new Scanner(System.in);
        System.out.println("Bienvenido a nuestro establecimiento.\nPara el ingreso registtre su temperatura,\nsi su temperatura esta fuera del rango(18 a 25) no entraaaa ");
        TemperaturaUser=objscanner.nextShort();
        if(TemperaturaUser<18 || TemperaturaUser>25){
            System.out.println("No puede entrar mijo de malas");
        }else{
            System.out.println("Bienvenido papito");
        }
    }
}
