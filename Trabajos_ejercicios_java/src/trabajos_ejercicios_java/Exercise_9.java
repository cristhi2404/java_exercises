
package trabajos_ejercicios_java;

import java.util.ArrayList;
import java.util.Scanner;


public class Exercise_9 {
    private static double PrecioFinal;
    private static int seleccion;
    private static int metodopago;
    
    public Exercise_9(){
        this.PrecioFinal=0;
        
    }
    public static void Menu(Scanner objscanner){
        ArrayList<String> guardar =new ArrayList();
        double acumulador=0;
        int continuar=0;
        while(continuar==0){
            System.out.println("Bienvenido a mi Fucking Restaurant.\nEl menu es el sigi¿uiente :\n");
            System.out.println("1) HAMBURGUESA MEXICANA.\nPrice: $15\n--------------------------------\n2) HAMBURGUESA ESPAÑOLA.\nPrice: $15\n--------------------------------\n3) HAMBURGUESA MIXTA.\nPrice: $20\n--------------------------------\n4) HAMBURGUESA VEGANA.\nPrice: $17\n--------------------------------\n5) HAMBURGUESA ANTIOQUEÑA.\nPrice: $15\n--------------------------------\n6) HAMBURGUESA CABRONA.\nPrice: $25\n--------------------------------\n7) HAMBURGUESA DE POLLO.\nPrice: $12\n--------------------------------\n8) GASEOSA DE L.\nPrice: $10\n--------------------------------\n9) GASEOSA PERSONAL.\nPrice: $6\n--------------------------------\n10) PORCION PAPAS ADICIONALES.\nPrice: $7\n--------------------------------\n");
            System.out.println("Digite su seleccion");
            seleccion=objscanner.nextShort();
            switch (seleccion){
                case 1:
                    /*burguer mexicana*/
                    guardar.add("Hamburguesa Mexicana");
                    acumulador=15+acumulador;
                    break;
                case 2:
                    /*burguer española*/
                    guardar.add("Hamburguesa Española");
                    acumulador=15+acumulador;
                    break;
                case 3:   
                    /*burguer mixta*/
                    guardar.add("Hamburguesa Mixta");
                    acumulador=20+acumulador;
                    break;
                case 4:
                    /*burguer vegana*/
                    guardar.add("Hamburguesa Vegana");
                    acumulador=17+acumulador;
                    break;
                case 5:
                    /*burguer antioqueña*/
                    guardar.add("Hamburguesa Antioqueña");
                    acumulador=15+acumulador;
                    break;
                case 6:
                    /*burguer cabrona*/
                    guardar.add("Hamburguesa Cabrona");
                    acumulador=25+acumulador;
                    break;
                case 7:
                    /*burguer de pollo*/
                    guardar.add("Hamburguesa de Pollo");
                    acumulador=12+acumulador;
                    break;
                case 8:
                    
                    guardar.add("Gaseosa de Litro");
                    acumulador=10+acumulador;
                    break;
                case 9:
                    
                    guardar.add("Gaseosa Personal");
                    acumulador=6+acumulador;
                    break;
                case 10:
                    
                    guardar.add("Porcion papas");
                    acumulador=7+acumulador;
                    break;
            }
            System.out.println("desea agregar otro producto a su pedido?SI(0)/NO(1).");
            continuar=objscanner.nextShort();  
        }
        System.out.println("Cual sera su metodo de pago?\n1) efectivo.\n2) tarjeta de credito/debito.\n3) Cheque");
        metodopago=objscanner.nextShort();
        double descuento=0;
        switch(metodopago){
            case 1:
                descuento=acumulador*0.05;
                PrecioFinal=acumulador-descuento;
                break;
            case 2:
                descuento=acumulador*0.10;
                PrecioFinal=acumulador-descuento;
                break;
            case 3:
                PrecioFinal=acumulador;
                break;
        }
        
        System.out.println("recibo:");
        System.out.println(guardar);
        System.out.println("el precio total a pagar es "+PrecioFinal);
        
        
    }
}
