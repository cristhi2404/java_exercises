
package trabajos_ejercicios_java;

import java.util.ArrayList;
import java.util.Scanner;
public class Exercise_11 {
    private static String Producto;
    private static int Cantidad;
    private static int Preciofinal;
    public Exercise_11(){
        String Producto="";
        int Cantidad=0;
        int Preciofinal=0;
    }
    public static void Tienda(Scanner objscanner){
        ArrayList<String> productos=new ArrayList();
        int continuar=0;
        int acumulador=0;
        while (continuar==0){
            System.out.println("Ingrese el nombre del producto a comprar");
            Producto=objscanner.nextLine();
            System.out.println("Digite el precio del producto");
            int price=objscanner.nextInt();
            System.out.println("Digite la cantidad del producto elegido");
            Cantidad=objscanner.nextShort();
            productos.add((Producto+" x "+Cantidad));
            int priceacumulado= price*Cantidad;
            acumulador=priceacumulado+acumulador;
            System.out.println("Desea hacer compra de otro producto?SI(0)/NO(1)");
            continuar=objscanner.nextShort();
            objscanner.nextLine();
        }
        Preciofinal=acumulador;
        System.out.println("Su lista de compras es la siguiente");
        System.out.println(productos);
        System.out.println("El total a pagar es : "+Preciofinal);
    }
}
