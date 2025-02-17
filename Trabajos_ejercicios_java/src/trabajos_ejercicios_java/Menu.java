package trabajos_ejercicios_java;
import java.util.ArrayList;
import java.util.Scanner;


public class Menu {
    public static int Elecionmenu;
    
    public static void main(String[] args) {
        Scanner objrepetir =new Scanner(System.in);
        int continuar=0;

        while (continuar==0) {
            menu(objrepetir);
            switch (Elecionmenu) {
                case 1:
                    Exercise_1 ejercicio1=new Exercise_1();
                    ArrayList<ArrayList<String>> retorno1= ejercicio1.tomardatos();
                    System.out.println("Cliente : "+retorno1.get(0));
                    System.out.println("Products : "+retorno1.get(1));
                    break ;
                case 2:
                    Excersise_2 ejercicio2=new Excersise_2();
                    ejercicio2.tomadatos();
                    break;
                case 3:
                    Exercise_3 ejercicio3=new Exercise_3();
                    ejercicio3.Registrotemperatura();
                    break;
                case 4:
                    Exercise_4 ejercicio4=new Exercise_4();
                    ejercicio4.tomadatos();
                    break;
                case 5:
                    Exercise_5 ejercicio5=new Exercise_5();
                    int eleccion=ejercicio5.Eleccion();
                    ejercicio5.Operar(eleccion, objrepetir);
                    break;
                case 6:
                    Exercise_6 ejercicio6=new Exercise_6();
                    double IMC=ejercicio6.tomardatos(objrepetir);
                    ejercicio6.clasificar(IMC);
                    break;
                case 7:
                    Exercise_7 ejercicio7=new Exercise_7();
                    ejercicio7.clasificacion(objrepetir);
                    break;
                case 8:
                    Exercise_8 ejercicio8=new Exercise_8();
                    ejercicio8.Analizarmarcador(objrepetir);
                    break;
                case 9:
                    Exercise_9 ejercicio9 =new Exercise_9();
                    ejercicio9.Menu(objrepetir);
                    break;
                case 10:
                    Exercise_10 ejercicio10=new Exercise_10();
                    ejercicio10.cajero(objrepetir);
                    break;
                case 11:    
                    Exercise_11 ejercicio11=new Exercise_11();
                    ejercicio11.Tienda(objrepetir);
                    break;
                case 12:
                    Exercise_12 ejercicio12=new Exercise_12();
                    ejercicio12.Imprimir(objrepetir);
                    break;
                case 13:
                    Exercise_13 ejercicio13=new Exercise_13();
                    double time=ejercicio13.Calculartime(objrepetir);
                    ejercicio13.Mensaje(time);
                    break;
                case 14:
                    Exercise_14 ejercicio14=new Exercise_14();
                    ejercicio14.Cuentaregresiva(objrepetir);
                    break;
                case 15:
                    Exercise_15 ejercicio15=new Exercise_15();
                    ejercicio15.Adivinanza(objrepetir);
                    break;
                case 16:
                    Exercise_16 ejercicio16=new Exercise_16();
                    ejercicio16.Libreria(objrepetir);
                    break;
                case 17:
                    Exercise_17 ejercicio17=new Exercise_17();
                    
                    break;
            }
            System.out.println("Desea escoger un nuevo ejercicio?SI(0)/NO(1)");
            continuar=objrepetir.nextInt();
        }   
        objrepetir.close();
        System.out.println("Finalizamos");
    }
    public Menu(){
        this.Elecionmenu=0;
}
    public static int menu( Scanner objrepetir){
            System.out.println("este menu y codigo es patentado por cristhian ferrer");
            System.out.println("El siguiente es el menu de trabajos\n1. Primer factura.\n2. Ascensor con peso.\n3. Temperatura\n4. Ascensor Temperatura\n5. Tienda 3 options\n6. IMC\n7. Recomendacion de peliculas\n8. Ganador equipos\n9. Menu switch\n10. Cajero\n11. compra por cantidad\n12. Impresora\n13. Viaje en automovil\n14. Cuenta regresiva\n15. Juego Adivinanza\n16. Libreria\n17. Notas de clase\n18\n19\n20\n21\n22\n23\n24\n25\n26\n27\n28\n29\n20\n31\n32");
            System.out.println("Digite el ejercicio que desea seleccionar");
            Elecionmenu=objrepetir.nextShort();
            objrepetir.nextLine();
            return  Elecionmenu;
            
    }
    
}
    
    
    

