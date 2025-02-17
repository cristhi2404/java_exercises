/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajos_ejercicios_java;

import java.util.Scanner;

/**
 *
 * @author EQUIPO
 */
public class Exercise_7 {
    private static int Userage;
    public Exercise_7(){
        this.Userage=0;
        
    }
    public static void clasificacion(Scanner objscanner){
        System.out.println("Ingresa tu edad para recomedarte las mejores peliculas ");
        Userage=objscanner.nextShort();
        if(Userage<=7){
            System.out.println("Usted es clasificado como niño se le recomendaran peliculas animadas y educativas aptas para todas las edades");
        }else if(Userage>7 && Userage <=17){
            System.out.println("Usted es clasificado como adolescente se le recomendaran peliculas adecuadas para la familia, como animaciones, aventuras y comedias familiares");
        }
        else if(Userage>17 && Userage<=30){
            System.out.println("Usted es clasificado como Adulto se le recomendaran peliculas de géneros, como acción, drama, comedia y ciencia ficcion.");
        }else if(Userage>30){
            System.out.println("Usted es clasificado como Adulto mayor se le recomendaran peliculas clásicas y dramas que puedan ser de su interes");
        }
        
    }
}
