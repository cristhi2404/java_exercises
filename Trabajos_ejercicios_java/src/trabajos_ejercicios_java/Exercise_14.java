
package trabajos_ejercicios_java;

import java.util.Scanner;


public class Exercise_14 {
    private static int numero;
    public Exercise_14(){
        this.numero=0;
    }
    
    public static void Cuentaregresiva(Scanner objscanner){
        System.out.println("Digite el numero para la cuenta regresiva");
        numero=objscanner.nextShort();
        while(numero>0){
            numero=numero-1;
            System.out.println(numero);   
        }
        System.out.println("CEROOOOOOOOOOO");
        System.out.println("FELIZ AÑO");
    }
}
