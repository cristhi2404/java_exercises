/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajos_ejercicios_java;

import java.util.ArrayList;
import java.util.Scanner;


public class Exercise_16 {
    private static String titulo;
    private static String Autor;
    private static String numeropags;
    public Exercise_16(){
        this.titulo="";
        this.Autor="";
        this.numeropags="";
        
    }
    public static void Libreria(Scanner objscanner){
        ArrayList<String> Libros =new ArrayList();
        System.out.println("Bienvenido a la biblioteca");
        int continuar=0;
        while(continuar==0){
            System.out.println("Agrega un libro mas al stock.\nDigita el titulo.");
            titulo=objscanner.nextLine();
            System.out.println("Digite el nombre del Autor. ");
            Autor=objscanner.nextLine();
            System.out.println("Digite el numero de paginas que tiene el libro");
            numeropags=objscanner.next();
            Libros.add(("Titulo : "+titulo+"\nAutor : "+Autor+"\nNumero de paginas : "+numeropags+"\n"));
            System.out.println("Desea agregar otro libro?SI(0)/NO(1)");
            continuar=objscanner.nextShort();
            objscanner.nextLine();
        }
        System.out.println("Los libros en stock son: ");
        System.out.println(Libros);
    }
}
