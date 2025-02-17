
package trabajos_ejercicios_java;
import java.util.Scanner;

public class Exercise_6 {
    private static double Peso;
    private static double altura;
    private static double IMC;
    public Exercise_6(){
        this.Peso=0;
        this.altura=0;
        this.IMC=0;
    }
    public static double tomardatos(Scanner objscanner){
        System.out.println("Calculador de indice de masas corporal(IMC)");
        System.out.println("Ingrese su peso");
        Peso=objscanner.nextDouble();
        System.out.println("Ingrese su altura");
        altura=objscanner.nextDouble();
        IMC=(Peso/(altura*altura));
        return IMC;
    }
    public static void clasificar(double IMC){
        if(IMC<18.5){
            System.out.println("Su peso es muy bajo");
        }else if(IMC>=18.5 && IMC<24.9){
            System.out.println("Su peso es normal");
         
        }else if(IMC>=24.9 && IMC<29.9){
            System.out.println("tienes sobrepeso");
        }else if(IMC>29.9){
            System.out.println("Gordo Boliqueso");
        }
    }
}
