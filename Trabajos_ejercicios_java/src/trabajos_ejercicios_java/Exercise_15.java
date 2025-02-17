/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajos_ejercicios_java;

import java.util.Random;
import java.util.Scanner;


public class Exercise_15 {
    private static int Numerouser;
    public Exercise_15(){
        this.Numerouser=0;
    }
    public static void Adivinanza(Scanner objscanner){
       Random aleatorio=new Random();
       int numeroaleatorio=aleatorio.nextInt(100);
       System.out.println("El numero aleatorio se ha creado empieza a adivinar.");
       while(Numerouser!=numeroaleatorio){
           System.out.println("ingresa el numero");
           Numerouser=objscanner.nextShort();
           
           
           if(Numerouser<numeroaleatorio){
               System.out.println("estas por debajo rey");
           }else if(Numerouser>numeroaleatorio){
               System.out.println("estas por encima rey");
           }
       }
        System.out.println("Congratulations madafaka");
    }
}
