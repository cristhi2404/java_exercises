
package trabajos_ejercicios_java;

import java.util.Scanner;

    public class Excersise_2 {
        private static int Peso;
        private static int Eleccionpiso;
        public Excersise_2(){
            this.Peso=0;
            this.Eleccionpiso=0;
    }
    public static void tomadatos(){
        Scanner objscanner =new Scanner(System.in);
        System.out.println("El peso maximo del ascensor es 350kg,aprox 4 max");
        int add=0;
        int acumulador=0;
        String mensaje="";
        while(add==0){
            System.out.println("Ingrese su peso en kg");
            Peso=objscanner.nextShort();
            acumulador=Peso+acumulador;
            System.out.println("De sea ingresar una persona mas al ascensor?SI(0)/NO(1)");
            add=objscanner.nextShort();
        }
        if(acumulador>350){
            System.out.println("Papi todos estan muy gordos entre todos pesaron: "+acumulador);
            
        }else if(acumulador>0 && acumulador<350){
            System.out.println("El peso tosal fue "+acumulador+" kgs, el edificio tiene un total de 10 pisos, cual eliges?");
            Eleccionpiso=objscanner.nextShort();
            System.out.println("Bienvenido al piso "+Eleccionpiso);

        }
        
    }         
}
