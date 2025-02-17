/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajos_ejercicios_java;

import java.util.Scanner;

public class Exercise_10 {
    private static int montouser;
    private static int retiro;
    public Exercise_10(){
        
        int montouser=0;
        int retiro=0;
    }
    public static void cajero(Scanner objscanner){
        int montocajero=100000;
        int continuar=0;
        while (continuar==0){
            System.out.println("Bienvenido a nuestro cajero.\nMonto del cajero: "+montocajero);
            System.out.println("Ingrese su monto propio q tiene en la cuenta en dollars");
            montouser=objscanner.nextInt();
            System.out.println("Ingrese el monto que desee retirar");
            retiro=objscanner.nextInt();
            montocajero=montocajero-retiro;
            montouser=montouser-retiro;
            System.out.println("entregando Dinero...");
            System.out.println("monto del cajero : "+montocajero);
            System.out.println("Su nuevo monto : "+montouser);
            System.out.println("desea retirar mas dinero?SI(0)/NO(1)");
            continuar=objscanner.nextShort();
        }
        
        
    }
}
