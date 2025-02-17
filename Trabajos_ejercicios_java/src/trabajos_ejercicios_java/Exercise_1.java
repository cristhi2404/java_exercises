
package trabajos_ejercicios_java;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_1 {
    private static String Name;
    private static String Id;
    private static String correo;
    private static String producto;
    private static String pricetotal;
    public Exercise_1(){
        this.Name="";
        this.Id="";
        this.correo="";
        this.producto="";
        this.pricetotal="";
    }
    public static ArrayList<ArrayList<String>> tomardatos(){
        ArrayList<ArrayList<String>> arraymayor=new ArrayList();
        ArrayList<String> Cliente =new ArrayList<>();
        Scanner tomadatos =new Scanner(System.in);
        System.out.println("Digite su name");
        Name=tomadatos.nextLine();
        Cliente.add(Name);
        
        System.out.println("Digite su ID");
        Id=tomadatos.nextLine();
        Cliente.add(Id);
        
        System.out.println("Es usted estudiante?si/True no/False");
        boolean respuesta =tomadatos.nextBoolean();
        
        System.out.println("Digite su correo");
        correo=tomadatos.nextLine();
        Cliente.add(correo);

        ArrayList<String> productos = new ArrayList<>();
        int agregar=0;
        int acumulador=0;
        while (agregar==0){
            System.out.println("Digite el nombre del producto");
            producto=tomadatos.nextLine();
            productos.add(producto);
            
            System.out.println("Digite el precio del producto");
            int precio=tomadatos.nextInt();
            tomadatos.nextLine();
            acumulador=precio+acumulador;
            
            System.out.println("DESEA AGREGAR OTRO PRODUCTO SI(0)/NO(1)");
            agregar=tomadatos.nextShort();
            tomadatos.nextLine();
        }
        double preciofinal=0;
        
        if(respuesta==true){
            double descuento=acumulador*0.5;
            preciofinal=acumulador+descuento;
            pricetotal=Double.toString(preciofinal);
        }else{
            double descuento=acumulador*0.13;
            preciofinal=acumulador+descuento;
            pricetotal=Double.toString(preciofinal);
        }
        
        productos.add(pricetotal);
        
        arraymayor.add(Cliente);
        arraymayor.add(productos);   
        
        tomadatos.close();
        return arraymayor;
    }    
}
