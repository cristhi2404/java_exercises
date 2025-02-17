
package trabajos_ejercicios_java;

import java.util.ArrayList;
import java.util.Scanner;


public class Exercise_5 {
    
    
    private static int eleccion;
    private static String Nameproducto;
    private static double Preciototal;
    
    public Exercise_5(){
        this.eleccion=0;
        this.Nameproducto="";
        this.Preciototal=0;
        
        
    }
    public static int Eleccion(){
        Scanner objscanner =new Scanner(System.in);
        System.out.println("Bienvenido a mi tienda, que tipo de compras quires hacer?\n1) Alimentos?\n2) Vestimenta?\n3) Electrodomesticos");
        eleccion=objscanner.nextInt();
        return eleccion;
    }
    public static void Operar(int eleccion, Scanner objscanner){
        ArrayList<String> guardarproductos=new ArrayList();
        int continuar=0;
        double acumulador=0;
        double descuento;
        switch(eleccion){
            case 1:
                System.out.println("Haz elegido compra de Alimentos : ");
                while (continuar==0){
                    System.out.println("Ingrese el nombre del producto a elegir");
                    Nameproducto=objscanner.nextLine();
                    guardarproductos.add(Nameproducto);
                    System.out.println("Digite el precio del producto");
                    double precio=objscanner.nextDouble();
                    acumulador=precio+acumulador;
                    System.out.println("Desea agregar otro producto de alimentos?");
                    continuar=objscanner.nextInt();
                    objscanner.nextLine();
                }
                    descuento=acumulador*0.10;
                    Preciototal=acumulador-descuento;
                    break;
            case 2:
                System.out.println("Haz elegido compra de Vestimenta : ");
                while (continuar==0){
                    System.out.println("Ingrese el nombre del producto a elegir");
                    Nameproducto=objscanner.nextLine();
                    guardarproductos.add(Nameproducto);
                    System.out.println("Digite el precio del producto");
                    double precio=objscanner.nextInt();
                    acumulador=precio+acumulador;
                    System.out.println("Desea agregar otro producto de vetimenta??");
                    continuar=objscanner.nextInt();
                    objscanner.nextLine();
                }
                descuento=acumulador*0.05;
                Preciototal=acumulador-descuento;
                break;
            case 3:
                System.out.println("Haz elegido compra de Electrodomesticos : ");
                while (continuar==0){
                    System.out.println("Ingrese el nombre del producto a elegir");
                    Nameproducto=objscanner.nextLine();
                    guardarproductos.add(Nameproducto);
                    System.out.println("Digite el precio del producto");
                    double precio=objscanner.nextInt();
                    acumulador=precio+acumulador;
                    System.out.println("Desea agregar otro producto de alimentos?");
                    continuar=objscanner.nextInt();
                }
                Preciototal=acumulador;
                break;
                               
        }
        System.out.println("productos :\n"+guardarproductos);
        System.out.println("Pricetotal : "+Preciototal);             
    }
}
