
package trabajos_ejercicios_java;
import java.util.Scanner;

public class Exercise_4 {
    private static int temp;
    private static int Eleccionpiso;
    public Exercise_4(){
        this.temp=0;
        this.Eleccionpiso=0;
    }
    public static void tomadatos(){
        Scanner objscanner =new Scanner(System.in);
        System.out.println("Ascensor individual");
        int add=0;
        String mensaje="";
        while(add==0){
            System.out.println("Ingrese su Temperatura en grados celsius");
            temp=objscanner.nextShort();
            if(temp>25 || temp<18){
                System.out.println("La temperatura no es adecuada para el ingreso");
                
                
            }else{
                System.out.println("el edificio tiene un total de 10 pisos, cual eliges?");
                Eleccionpiso=objscanner.nextShort();
                System.out.println("Bienvenido al piso "+Eleccionpiso);
            } 
            System.out.println("De sea ingresar una persona mas al ascensor?SI(0)/NO(1)");
            add=objscanner.nextShort();
            
        }
    }    
}
