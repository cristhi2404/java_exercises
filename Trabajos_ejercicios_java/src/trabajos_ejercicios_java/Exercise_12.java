/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajos_ejercicios_java;
import java.util.Scanner;


public class Exercise_12 {
    private static int Cantprint;
    public Exercise_12(){
        this.Cantprint=0;
        
    }
    public static void Imprimir(Scanner objscanner){
        int Hojasimpresora=35;
        int continuar=0;
        while(continuar==0){
            
            System.out.println("Bienvenido a la impresora.\nHojas disponibles: "+Hojasimpresora);
            System.out.println("Cuantas hojas desea imprimir?");
            Cantprint=objscanner.nextShort();
            if(Cantprint<Hojasimpresora || Cantprint==Hojasimpresora){
                System.out.println("Imprimiendo... tus malditas "+Cantprint+" paginas");
                Hojasimpresora=Hojasimpresora-Cantprint;
                
            }else{
                System.out.println("Pero papito recargueme");
            }
            System.out.println("Desea imprimir de nuevo?SI(0)/NO(1)");
            continuar=objscanner.nextShort();
        }
    }
}
